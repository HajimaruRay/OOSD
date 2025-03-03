class HulkFactory extends HeroFactoryMethod {
    @Override
    public Hero createHero() {
        return new Hulk();
    }
}