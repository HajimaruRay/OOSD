class IronmanFactory extends HeroFactoryMethod {
    @Override
    public Hero createHero() {
        return new Ironman();
    }
}