//import org.w3c.dom.ElementTraversal;

public class FilaCircular{
  private int[] fila;
  private int tamanho;
  private int atual;
  private int fim;
  //construtores
  /**
   * @param tamanho
   * @param elemento
   */
  public FilaCircular(int tamanho, int elemento){
    this.tamanho=tamanho;
    fila=new int[tamanho];
    for(int i=0;i<tamanho;i++)
      fila[i]=0;
    atual=0;
    fim=0;
    fila[fim]=elemento;
    fim++;
  }
  public FilaCircular(int tamanho){
    this.tamanho=tamanho;
    fila=new int[tamanho];
  }
  //retirar elemento da fila
  public int retirarElemento(){
    int elemento;
    if(fila[atual]==0)
      return 0;
    elemento=fila[atual];
    fila[atual]=0;
    atual++;
    if(atual>=tamanho)
      atual=0;
    return elemento;
  }
  //inserir elemento na fila
  public boolean inserirElemento(int elemento){
    if(fila[fim]!=0)
      return false;
    fila[fim]=elemento;
    fim++;
    if(fim>=tamanho)
      fim=0;
    return true;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString(){
    String mensagem="";
    for(int valor:fila){
      if(valor==0)
        mensagem=mensagem+"VAZIO ";
      else
        mensagem=mensagem+valor+" ";
    }
    return mensagem;
  }

  public static void main(String [] args){
    var umaFila=new FilaCircular(5);
    System.out.println(umaFila);
    for(int i=1;i<6;i++)
      System.out.println(umaFila.inserirElemento(i));
    
    System.out.println(umaFila);
    System.out.println(umaFila.retirarElemento());
    System.out.println(umaFila.retirarElemento());
    System.out.println(umaFila.retirarElemento());
    System.out.println(umaFila.inserirElemento(44));
    System.out.println(umaFila.inserirElemento(55));
    System.out.println(umaFila.retirarElemento());
    System.out.println(umaFila.retirarElemento());
    System.out.println(umaFila.inserirElemento(66));
    System.out.println(umaFila.retirarElemento());
    System.out.println(umaFila);

  }

}