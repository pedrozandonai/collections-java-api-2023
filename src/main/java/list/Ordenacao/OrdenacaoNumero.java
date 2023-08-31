package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    public static void main(String[] args) {
        OrdenacaoNumero numeros = new OrdenacaoNumero();

        int randomAmmount = (int) (Math.random()*50)+1;

        for (int i = 0; i < randomAmmount; i++){
            int randomNumber = (int) (Math.random()*100);
            numeros.adicionarNumero(randomNumber);
        }

        System.out.println("Exibe números adicionados na lista");
        numeros.exibirNumeros();

        System.out.println("Exibe números ordenados ascendentes na lista");
        System.out.println(numeros.ordenarAscendente());

        System.out.println("Exibe números ordenados descendentes na lista");
        System.out.println(numeros.ordenarDescendente());
    }
    private List<Integer> listaNumeros;

    public OrdenacaoNumero() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }



    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
