public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Eve eve = new Eve(123, 1233, 13.2, "Pokémon normal");
        Glaceon glaceon = new Glaceon(145, 343, 43.2, "pokémon gelo");
        
        System.out.println("HP antes do ataque: " + eve.getHp());
        System.out.println("HP depois do ataque: " + eve.ataque(glaceon));
        
        System.out.println("HP antes do especial: " + eve.getHp());
        System.out.println("HP depois do especial: " + eve.especial(glaceon));
        
        System.out.println("HP antes da defesa: " + eve.getHp());
        System.out.println("HP depois da defesa: " + eve.defesa(glaceon));
        
        System.out.println(eve); // Imprime os detalhes de Eve após todas as ações
        System.out.println(glaceon); // Imprime os detalhes de Glaceon
    }
}
