package Pilha_dinamica;

public class Pilha {
    No topo;
    int qtd;
    No elemento;

    public void inserir(int n){
        elemento = new No(n);
        elemento.proximo=topo;
        topo=elemento;
        qtd++;
    }

    public void mostrar(){
        No atual = topo;

        while (topo!=null){
            System.out.println(topo.valor);
            topo = topo.proximo;
        }
    }
    public void remover(){
        if (topo!=null){
            No aux;
            aux=topo;
            
            topo=topo.proximo;
            qtd--;
        }
    }
}
