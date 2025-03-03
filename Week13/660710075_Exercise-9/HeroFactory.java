public class HeroFactory {
    public Hero createHero(String heroType) {
        if (heroType.equalsIgnoreCase("Ironman")) {
            return new Ironman();
        } else if (heroType.equalsIgnoreCase("CaptainAmerica")) {
            return new CaptainAmerica();
        } else if (heroType.equalsIgnoreCase("Hulk")) {
            return new Hulk();
        }
        return null;
    }
}
