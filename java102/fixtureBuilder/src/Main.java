public class Main {
    public static void main(String[] args) {
        Fixture fixture = new Fixture();

        fixture.teamList.add("Galatasaray");
        fixture.teamList.add("FenerBahce");
        fixture.teamList.add("Besiktas");
        fixture.teamList.add("Bursaspor");
        fixture.teamList.add("Hatayspor");
        fixture.teamList.add("Trabzonspor");
        fixture.teamList.add("Boluspor");


        fixture.ligFixturePrint();
    }
}