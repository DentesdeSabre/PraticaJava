package Pilha;
public class Principal {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        System.out.println("Pilha criada!\n");

        System.out.println("Inserindo:");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        System.out.println();

        System.out.println("Exibindo:");
        pilha.print();
        System.out.println();

        System.out.println("Consultando topo:");
        pilha.peek();
        System.out.println();

        System.out.println("Removendo:");
        pilha.pop();
        pilha.pop();
        System.out.println();

        System.out.println("Exibindo depois:");
        pilha.print();
        System.out.println();

        System.out.println("Quantidade: " + pilha.size());
        System.out.println();

        System.out.println("Testando pilha cheia:");
        pilha.push(60);
        pilha.push(70);
        pilha.push(80);
        System.out.println();

        System.out.println("Esvaziando:");
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println();

        System.out.println("Testando vazia:");
        System.out.println("Esta vazia? " + pilha.isEmpty());
        System.out.println("Esta cheia? " + pilha.isFull());
        pilha.peek();
        pilha.pop();

    }
}