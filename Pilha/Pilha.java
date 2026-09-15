package Pilha;

public class Pilha {
    private int[] vetor;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.vetor = new int[capacidade];
        this.topo = -1;
    }

    public void push(int elemento) {
        if (topo == capacidade - 1) {
            System.out.println("Erro: Pilha cheia!");
            return;
        }
        topo = topo + 1;
        vetor[topo] = elemento;
        System.out.println("Inseriu: " + elemento);
    }

    public int pop() {
        if (topo == -1) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        int removido = vetor[topo];
        topo = topo - 1;
        System.out.println("Removeu: " + removido);
        return removido;
    }

    public int peek() {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        System.out.println("Topo: " + vetor[topo]);
        return vetor[topo];
    }

    public boolean isEmpty() {
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (topo == capacidade - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return topo + 1;
    }

    public void print() {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println("TOPO");
        for (int i = topo; i >= 0; i = i - 1) {
            System.out.println(vetor[i]);
        }
        System.out.println("BASE");
    }
}