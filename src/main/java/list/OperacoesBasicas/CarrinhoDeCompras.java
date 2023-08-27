package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }

        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : itemList){
            valorTotal+= i.getQuantidade() * i.getPreco();
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Batata", 9.20, 5);
        carrinhoDeCompras.adicionarItem("Tilapia", 8.76, 10);
        carrinhoDeCompras.adicionarItem("Cheetos", 12.23, 12);
        carrinhoDeCompras.adicionarItem("Monster", 6.54, 20);
        carrinhoDeCompras.adicionarItem("Monster", 6.54, 20);
        carrinhoDeCompras.adicionarItem("Monster", 6.54, 20);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Monster");

        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());

    }
}
