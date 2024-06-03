import javax.swing.*;

public class Exemplo {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        int num;

        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
            if (num % 3 == 0) {
                lista.inserirFinal(lista.new No(num));
            }
        }

        lista.mostrarLista();
        System.exit(0);
    }
}

class ListaLigada {

    private No primeiro;
    private No ultimo;

    public ListaLigada() {
        primeiro = null;
        ultimo = null;
    }

    public class No {

        private int elemento;
        private No proximo;

        public No(int elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    public int contarNos() {
        int tamanho = 0;
        No noTemp = primeiro;

        while (noTemp != null) {
            tamanho++;
            noTemp = noTemp.proximo;
        }

        return tamanho;
    }

    public boolean listaVazia() {
        return primeiro == null && ultimo == null;
    }

    public void destruir() {
        primeiro = null;
        ultimo = null;
    }

    public void mostrarLista() {
        int i = 1;
        No noTemp = primeiro;

        while (noTemp != null) {
            System.out.println("Elemento " + noTemp.elemento + " posição " + i);
            noTemp = noTemp.proximo;
            i++;
        }
    }

    public void elementoInicio() {
        if (!listaVazia()) {
            System.out.println("O primeiro elemento é " + primeiro.elemento);
        } else {
            System.out.println("Lista ligada vazia");
        }
    }

    public void elementoFinal() {
        if (!listaVazia()) {
            System.out.println("O último elemento é " + ultimo.elemento);
        } else {
            System.out.println("Lista ligada vazia");
        }
    }

    public void inserirInicio(No novoNo) {
        if (listaVazia()) {
            ultimo = novoNo;
        } else {
            novoNo.proximo = primeiro;
        }
        primeiro = novoNo;
    }

    public void inserirFinal(No novoNo) {
        if (listaVazia()) {
            primeiro = novoNo;
        } else {
            ultimo.proximo = novoNo;
        }
        ultimo = novoNo;
    }

    public void inserirMeio(No novoNo, int posicao) {
        No noTemp = primeiro;
        No noAnt = null;
        int posAux = 1;

        if (posicao <= 1) {
            inserirInicio(novoNo);
        } else if (posicao > contarNos()) {
            inserirFinal(novoNo);
        } else {
            while (posAux < (posicao - 1)) {
                noTemp = noTemp.proximo;
                posAux++;
            }
            novoNo.proximo = noTemp.proximo;
            noTemp.proximo = novoNo;
        }
    }

    public void remover(int elemento) {
        No noTemp = primeiro;
        No noAnt = null;

        if (primeiro.elemento == elemento) {
            primeiro = primeiro.proximo;
        } else {
            while (noTemp != null && noTemp.elemento != elemento) {
                noAnt = noTemp;
                noTemp = noTemp.proximo;
            }
            if (noTemp != null) {
                noAnt.proximo = noTemp.proximo;
            }
            if (noTemp == ultimo) {
                ultimo = noAnt;
            }
        }
    }
    
    public No buscarNo(int elemento) {
        int i = 1;
        No noTemp = primeiro;

        while (noTemp != null) {
            if (noTemp.elemento == elemento) {
                System.out.println("No " + noTemp.elemento + " posição " + i);
                return noTemp;
            }
            i++;
            noTemp = noTemp.proximo;
        }

        System.out.println("Elemento não encontrado!");
        return null;
    }
}