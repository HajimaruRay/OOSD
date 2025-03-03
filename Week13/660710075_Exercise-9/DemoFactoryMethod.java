public class DemoFactoryMethod {
    public static void test() {
        HeroFactoryMethod ironmanFactory = new IronmanFactory();
        HeroFactoryMethod captainAmericaFactory = new CaptainAmericaFactory();
        HeroFactoryMethod hulkFactory = new HulkFactory();

        Hero ironman = ironmanFactory.createHero();
        Hero captainAmerica = captainAmericaFactory.createHero();
        Hero hulk = hulkFactory.createHero();

        ironman.Display();
        captainAmerica.Display();
        hulk.Display();
    }
}
