public class Glaceon extends Eve{

    public Glaceon(Integer altura, Integer hp, Double peso, String tipo) {
        super(altura, hp, peso, tipo);
    }
    @Override
    public String ataque (Eve eve){
        int ataque=14;
        eve.setHp(eve.getHp()-ataque);
        return eve.getHp().toString();
    
    
        }
        @Override
        public String especial (Eve eve){
        int especial=23;
            eve.setHp(eve.getHp()-especial);
            return eve.getHp().toString();
        
        
            
            }
            @Override
            public String defesa (Eve eve){
                int defesa=13;
                eve.setHp(eve.getHp()+defesa);
                return eve.getHp().toString();
            }
        

}
