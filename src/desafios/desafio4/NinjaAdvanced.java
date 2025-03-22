package desafios.desafio4;

public class NinjaAdvanced implements Ninja{

    String name;
    int age;
    Enum hability;
    String specialty;

    public NinjaAdvanced() {

    }

    public NinjaAdvanced(String name, int age, Enum hability, String specialty) {
        this.name = name;
        this.age = age;
        this.hability = hability;
        this.specialty = specialty;
    }

    @Override
    public void showInformations() {
        System.out.println("Sou um ninja básico");
        System.out.println("Meu nome é: " + name);
        System.out.println("Minha idade é: " + age);
        System.out.println("Minha habilidade é: " + hability);
        System.out.println("Minha especialidade é: " + specialty);
    }

    @Override
    public void executeHability() {
        if (hability != null) {
            System.out.println("Minha habilidade é: " + hability);
        }
    }
}
