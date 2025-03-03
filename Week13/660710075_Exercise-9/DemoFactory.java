public class DemoFactory {
    public static void test() {
        HeroFactory heroFactory = new HeroFactory();
        
        Hero ironman = heroFactory.createHero("Ironman");
        Hero captainAmerica = heroFactory.createHero("CaptainAmerica");
        Hero hulk = heroFactory.createHero("Hulk");
        
        ironman.Display();
        captainAmerica.Display();
        hulk.Display();
    }
}
