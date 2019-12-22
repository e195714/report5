package jp.ac.uryukyu.ie.e195714;

class Enemy extends LivingThing{
    public Enemy(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        super.wounded(damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
