public class Eve {
    private String tipo; 
    private Double peso;
    private Integer altura;
    private Integer hp;

    public Eve(Integer altura, Integer hp, Double peso, String tipo) {
        this.altura = altura;
        this.hp = hp;
        this.peso = peso;
        this.tipo = tipo;
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String ataque (Eve eve){
    int ataque=12;
    eve.setHp(this.hp-ataque);
    return eve.getHp().toString();


    }
    public String especial (Eve eve){
    int especial=19;
        eve.setHp(this.hp-especial);
        return eve.getHp().toString();
    
    
        
        }

        public String defesa (Eve eve){
            int defesa=10;
            eve.setHp(this.hp+defesa);
            return eve.getHp().toString();
        
    
            }



        @Override
        public String toString() {
            return "Eve [tipo=" + tipo + ", peso=" + peso + ", altura=" + altura + ", hp=" + hp + "]";
        }
        
    

    
}