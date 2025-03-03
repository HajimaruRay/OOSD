class SupermanFactory extends HeroDCFactoryMethod {
    @Override
    public HeroDC createHeroDC() {
        return new Superman();
    }
}