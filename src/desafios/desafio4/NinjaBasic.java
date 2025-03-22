package desafios.desafio4;

public class NinjaBasic implements Ninja {
    String name;
    int age;
    Enum hability;

    public NinjaBasic(){
    }

    public NinjaBasic(String name, int age, Enum hability) {
        this.name = name;
        this.age = age;
        this.hability = hability;
    }

    @Override
    public void showInformations() {
        System.out.println("Sou um ninja básico");
        System.out.println("Meu nome é: " + name);
        System.out.println("Minha idade é: " + age);
        System.out.println("Minha habilidade é: " + hability);
    }

    @Override
    public void executeHability() {
        if (hability != null) {
        System.out.println("Minha habilidade é: " + hability);
        }
    }
}





