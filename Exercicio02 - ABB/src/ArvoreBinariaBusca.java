import javax.swing.*;

public class ArvoreBinariaBusca {

    public static void main(String[] args) {

        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.inserir(Double.parseDouble(JOptionPane.showInputDialog("Digite um Numero: ")));
        arvore.inserir(Double.parseDouble(JOptionPane.showInputDialog("Digite um Numero: ")));
        arvore.inserir(Double.parseDouble(JOptionPane.showInputDialog("Digite um Numero: ")));
        arvore.inserir(Double.parseDouble(JOptionPane.showInputDialog("Digite um Numero: ")));
        arvore.inserir(Double.parseDouble(JOptionPane.showInputDialog("Digite um Numero: ")));
       

        arvore.exibirEsquerdo();
        arvore.exibirRaiz();
        arvore.exibirDireito();

        System.out.println();



        arvore.exibirEsquerdo();
        arvore.exibirRaiz();
        arvore.exibirDireito();
    }



    private No raiz;

    public ArvoreBinariaBusca() {
        this.raiz = null;
    }

    // Módulo Inserir
    public void inserir(double novoValor) {
        raiz = inserir(raiz, novoValor);
    }

    private No inserir(No no, double novoValor) {
        if (no == null) {
            return new No(novoValor);
        } else if (novoValor < no.getValor()) {
            no.setEsq(inserir(no.getEsq(), novoValor));
        } else {
            no.setDir(inserir(no.getDir(), novoValor));
        }
        return no;
    }

    // Módulo Exibir Esquerdo
    public void exibirEsquerdo() {
        exibirEsquerdo(raiz);
    }

    private void exibirEsquerdo(No arv) {
        if (arv != null) {
            exibirEsquerdo(arv.getEsq());
            System.out.print(arv.getValor() + " ");
        }
    }

    // Módulo Exibir Direito
    public void exibirDireito() {
        exibirDireito(raiz);
    }

    private void exibirDireito(No arv) {
        if (arv != null) {
            exibirDireito(arv.getDir());
            System.out.print(arv.getValor() + " ");
        }
    }

    // Módulo Exibir Raiz
    public void exibirRaiz() {
        System.out.print("raiz " + raiz.getValor() + " ");
    }

    // Módulo Remover
    public void remover(double item) {
        raiz = remover(raiz, item);
    }

    private No remover(No no, double item) {
        if (no == null) {
            return null;
        } else if (item < no.getValor()) {
            no.setEsq(remover(no.getEsq(), item));
        } else if (item > no.getValor()) {
            no.setDir(remover(no.getDir(), item));
        } else {
            if (no.getEsq() == null) {
                return no.getDir();
            } else if (no.getDir() == null) {
                return no.getEsq();
            } else {
                No sucessor = no.getDir();
                while (sucessor.getEsq() != null) {
                    sucessor = sucessor.getEsq();
                }
                no.setValor(sucessor.getValor());
                no.setDir(remover(no.getDir(), sucessor.getValor()));
            }
        }
        return no;
    }

public class No {

    private double valor;
    private No esq;
    private No dir;

    public No(double valor) {
        this.valor = valor;
        this.esq = null;
        this.dir = null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }
    
    public void setDir(No esq) {
        this.dir = dir;
    }

    public No getDir() {
        return dir;
}
}
}