class BatmanFactory extends HeroDCFactoryMethod {
    @Override
    public HeroDC createHeroDC() {
        return new  Batman();
    }
}