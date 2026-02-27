
package pkg6nb_aula01;


public class Main {


    public static void main(String[] args) {
        Item leite = new Item("bx0001","pacote de leite Itambé 500g",2, 5.50f);
        Item pao = new Item("PX000222","pct Pão de Forma",2,10.0f);
        
        pao.setDesconto(0.5f);
        float paoPreco = pao.getTotalAjustado();
        System.out.println(pao.getDescricao()+" \t $"+paoPreco);
        System.out.println(leite.getDescricao()+"\t $"+leite.getTotalAjustado());
        
       
    }
    
}
