public class DemoAbstractFactory{
    HeroMCUandDCFactory marvelFactory = new HeroMCUFactoryMethod();
    HeroMCUandDCFactory dcFactory = new HeroDCFactoryMethod();
    
    HeroMCU ironman = marvelFactory.createHero("Ironman");
    HeroMCU captainAmerica = marvelFactory.createHero("Captain America");
    HeroMCU hulk = marvelFactory.createHero("Hulk");
    
    
}
