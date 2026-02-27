
package pkg6nb_aula01;

public class Item {
    
    private float precoUnitario;
    private float desconto;
    private int quantidade;
    private String descricao;
    private String id;
    
    public Item(String id, String descricao, int quantidade, float preco){
        this.id = id;
        precoUnitario = preco;
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }else{
        this.quantidade =0;
        }
    } // Fim do método construtor
    public float getTotalAjustado(){
        float total = precoUnitario * quantidade;
        float descontoTotal = total * desconto;
        float totalAjustado = total - descontoTotal;
        
        return totalAjustado;
    }
    public void setDesconto(float desconto){
        if( desconto > 0 && desconto <= 1.00){
            this.desconto = desconto;
        }else if(desconto < 0){
            this.desconto = 0;
            
        }else{
            this.desconto = 1;
        }
    
    }
    
    public float getDesconto(){
        return desconto;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        
         if(quantidade >= 0){
            this.quantidade = quantidade;
        }else{
        this.quantidade =0;
        }
        
    }
    public String getIDproduto(){
        return id;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
















