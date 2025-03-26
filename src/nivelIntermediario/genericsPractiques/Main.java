package nivelIntermediario.genericsPractiques;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja kunaiDeFerro = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja equipamentosNinja = new EquipamentosNinja("Shuriken de ferro");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");
        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunaiDeFerro);
        System.out.println(bolsaGenerica);
    }
}
