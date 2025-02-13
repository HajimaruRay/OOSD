package javaapplication1;

import java.util.ArrayList;

class Country {

    private String code;
    private String name;
    private double gdp;

    public Country(String code, String name, double gdp) {
        this.code = code;
        this.name = name;
        this.gdp = gdp;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGDP(double gdp) {
        this.gdp = gdp;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getGDP() {
        return gdp;
    }

    @Override
    public String toString() {
        return "Code:" + code + ",Country:" + name + ",gdp:" + gdp;
    }

}

class DB {

    ArrayList<Country> storage = new ArrayList<Country>();

    public void add(Country country) {
        storage.add(country);
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(storage.get(i).toString());
        }
    }

    public void print() {
        for (int i = 0; i < storage.size(); i++) {
            System.out.println(storage.get(i).toString());
        }
    }

    public void topPollution() {
        double max = -1;
        String topPollutionCountry = "";
        for (int i = 0; i < storage.size(); i++) {
            Country country = storage.get(i);
            if (country instanceof DevelopingCountry) {  // Check if it's a DevelopingCountry
                DevelopingCountry developingCountry = (DevelopingCountry) country;
                if (developingCountry.getPollution() > max) {
                    max = developingCountry.getPollution();
                    topPollutionCountry = developingCountry.getName();
                }
            }
        }
        System.out.println("Top pollution country:" + topPollutionCountry);
    }

    public void topCorruption() {
        double max = -1;
        String topCorruptionCountry = "";
        for (int i = 0; i < storage.size(); i++) {
            Country country = storage.get(i);
            if (country instanceof DevelopingCountry) {  // Check if it's a DevelopingCountry
                DevelopingCountry developingCountry = (DevelopingCountry) country;
                if (developingCountry.getCorruption() > max) {
                    max = developingCountry.getCorruption();
                    topCorruptionCountry = developingCountry.getName();
                }
            }
        }
        System.out.println("Top corruption country:" + topCorruptionCountry);
    }

    public void topInnovation() {
        double max = -1;
        String topInnovationCountry = "";
        for (int i = 0; i < storage.size(); i++) {
            Country country = storage.get(i);
            if (country instanceof DevelopedCountry) {  // Check if it's a DevelopedCountry
                DevelopedCountry developedCountry = (DevelopedCountry) country;
                if (developedCountry.getInnovation() > max) {
                    max = developedCountry.getInnovation();
                    topInnovationCountry = developedCountry.getName();
                }
            }
        }
        System.out.println("Top innvation country:" + topInnovationCountry);
    }

    public void topHappynessScore() {
        double max = -1;
        String topHappynessScoreCountry = "";
        for (int i = 0; i < storage.size(); i++) {
            Country country = storage.get(i);
            if (country instanceof DevelopedCountry) {  // Check if it's a DevelopedCountry
                DevelopedCountry developedCountry = (DevelopedCountry) country;
                if (developedCountry.getHappynessScore() > max) {
                    max = developedCountry.getHappynessScore();
                    topHappynessScoreCountry = developedCountry.getName();
                }
            }
        }
        System.out.println("Top happyness country:" + topHappynessScoreCountry);
    }
}

class DevelopingCountry extends Country {

    private double pollution;
    private double corruption;

    public DevelopingCountry(String code, String name, double gdp, double pollution, double corruption) {
        super(code, name, gdp);
        this.pollution = pollution;
        this.corruption = corruption;
    }

    public void factoryBase(double n) {
        pollution += (n * 0.5);
        setGDP(getGDP() + (n * 0.5));
    }

    public void importTechnology(double n) {
        setGDP(getGDP() + (n * 0.10));
    }

    public void governmentProjects(double n) {
        corruption += (n * 0.15);
    }

    public double getPollution() {
        return pollution;
    }

    public double getCorruption() {
        return corruption;
    }

    @Override
    public String toString() {
        return "Code:" + getCode() + ",Country:" + getName() + ",gdp:" + getGDP() + ",pollution:" + pollution + ",corruption:" + corruption;
    }

}

class DevelopedCountry extends Country {

    private double innovation;
    private double happynessScore;

    public DevelopedCountry(String code, String name, double gdp, double innovation, double happynessScore) {
        super(code, name, gdp);
        this.innovation = innovation;
        this.happynessScore = happynessScore;
    }

    public void education(double n) {
        innovation += (n * 0.10);
    }

    public void publicService(double n) {
        happynessScore += (n * 0.25);
        setGDP(getGDP() - (n * 0.1));
    }

    public void exportTechnology(double n) {
        setGDP(getGDP() + (n * 0.10));
    }

    public double getInnovation() {
        return innovation;
    }

    public double getHappynessScore() {
        return happynessScore;
    }

    @Override
    public String toString() {
        return "Code:" + getCode() + ",Country:" + getName() + ",gdp:" + getGDP() + ",innovation:" + innovation + ",happynessScore:" + happynessScore;
    }
}

/*class Demo1 {

    public void test() {
        Country c1 = new Country("001", "Thailand", 3);
        Country c2 = new Country("002", "Philippines", 6.2);
        Country c3 = new Country("003", "Cambodia", 6.8);
        Country c4 = new Country("004", "Bangladesh", 7.4);
        Country c5 = new Country("005", "Greece", 2.2);
        DB db = new DB();

        db.add(c1);
        db.add(c2);
        db.add(c3);
        db.add(c4);
        db.add(c5);
        db.print();
        System.out.println("-----");
        db.print(2);
    }
}*/
class Demo2 {

    public void test() {
        DevelopingCountry A = new DevelopingCountry("001", "Thailand", 3, 6, 9);
        DevelopingCountry B = new DevelopingCountry("002", "Philippines", 6.2, 5, 8);
        DevelopingCountry C = new DevelopingCountry("003", "Cambodia", 6.8, 8, 8);

        A.factoryBase(5);
        A.importTechnology(6);
        A.governmentProjects(8);

        B.factoryBase(4);
        B.importTechnology(5);
        B.governmentProjects(5);

        C.factoryBase(4);
        C.importTechnology(3);
        C.governmentProjects(4);

        DevelopedCountry D = new DevelopedCountry("008", "Korea", 2.2, 5, 4);
        DevelopedCountry E = new DevelopedCountry("009", "USA", 2.1, 10, 5);
        DevelopedCountry F = new DevelopedCountry("010", "UK", 1.4, 6, 7);

        D.education(8);
        D.publicService(7);
        D.exportTechnology(6);

        E.education(6);
        E.publicService(6);
        E.exportTechnology(10);

        F.education(7);
        F.publicService(8);
        F.exportTechnology(5);

        DB db = new DB();

        db.add(A);
        db.add(B);
        db.add(C);
        db.add(D);
        db.add(E);
        db.add(F);
        db.print();
        db.topPollution();
        db.topInnovation();
        db.topHappynessScore();
    }
}

public class JavaApplication1 {

    public static void main(String[] args) {
        // new Demo1().test();
        new Demo2().test();

    }

}