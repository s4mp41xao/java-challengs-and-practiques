package desafios.desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasic newNinja01 = new NinjaBasic("Naruto Uzumaki", 20, HabilityType.NINJUTSU);
        newNinja01.showInformations();
        newNinja01.executeHability();

        NinjaAdvanced newNinja02 = new NinjaAdvanced("Kakashi Hatake", 35, HabilityType.GENJUTSU, "Clone das Sombras");
        newNinja02.showInformations();
        newNinja02.executeHability();
    }
}
