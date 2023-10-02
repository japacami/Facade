class Combo {
   private Burguer burguer = new Burguer();
   private Sobremesa sobremesa = new Sobremesa();
   private Bebida bebida = new Bebida();
   private int tp;

   public void CriarCombo(int tipo) {
       tp = tipo;
       
       if(tipo == 1 ) {
    	   burguer.setGramas(200);
    	   burguer.setDescricao("X-Salada");
    	   burguer.setPreco(20.00);
    	   
    	   sobremesa.setTamanho("M");
    	   sobremesa.setDescricao("Bolo de Cenoura");
    	   sobremesa.setPreco(6.00);
    	   
    	   bebida.setMl(500);
    	   bebida.setDescricao("Coca Cola");
    	   bebida.setPreco(6.00);
       } else {
    	   burguer.setGramas(450);
    	   burguer.setDescricao("X-Bacon");
    	   burguer.setPreco(30.00);
    	   
    	   sobremesa.setTamanho("M");
    	   sobremesa.setDescricao("Bolo de Morango");
    	   sobremesa.setPreco(8.00);
    	   
    	   bebida.setMl(750);
    	   bebida.setDescricao("Lipton");
    	   bebida.setPreco(8.00);
       }
   }

   @Override
   public String toString() {
       return "Combo: " + tp + "\n" +
               "Burguer: " + burguer.getDescricao() + "; Gramas: " + burguer.getGramas() + "g" + 
               "\nSobremesa: " + sobremesa.getDescricao() + "; Tamanho: " + sobremesa.getTamanho() +
               "\nBebida: " + bebida.getDescricao() + "; Tamanho: " + bebida.getMl() + "ml" +
               "\nValor do combo: R$" + (sobremesa.getPreco() + burguer.getPreco() + bebida.getPreco());
   }
}
