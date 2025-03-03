class CaptainAmericaFactory extends HeroFactoryMethod {
    @Override
    public Hero createHero() {
        return new CaptainAmerica();
    }
}