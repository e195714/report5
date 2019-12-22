package jp.ac.uryukyu.ie.e195714;

class Hero extends LivingThing{
    public Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        super.wounded(damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
