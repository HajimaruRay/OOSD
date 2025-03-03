class CaptainAmericaFactory extends HeroMCUFactoryMethod {
    @Override
    public HeroMCU createHeroMCU() {
        return new CaptainAmerica();
    }
}