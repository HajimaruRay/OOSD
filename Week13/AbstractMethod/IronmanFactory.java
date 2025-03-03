class IronmanFactory extends HeroMCUFactoryMethod {
    @Override
    public HeroMCU createHeroMCU() {
        return new Ironman();
    }
}