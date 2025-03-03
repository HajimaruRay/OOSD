public class DemoFactory {
    public static void test() {
        HeroFactory heroFactory = new HeroFactory();
        
        HeroMCU ironman = heroFactory.createHero("Ironman");
        HeroMCU captainAmerica = heroFactory.createHero("CaptainAmerica");
        HeroMCU hulk = heroFactory.createHero("Hulk");
        
        ironman.Display();
        captainAmerica.Display();
        hulk.Display();
    }
}
