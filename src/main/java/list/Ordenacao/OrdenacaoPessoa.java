package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoa
        OrdenacaoPessoa OrdenacaoPessoa = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        OrdenacaoPessoa.adicionarPessoa("Alice", 20, 1.56);
        OrdenacaoPessoa.adicionarPessoa("Bob", 30, 1.80);
        OrdenacaoPessoa.adicionarPessoa("Charlie", 25, 1.70);
        OrdenacaoPessoa.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(OrdenacaoPessoa.pessoaList);

        // Ordenando e exibindo por idade
        System.out.println(OrdenacaoPessoa.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(OrdenacaoPessoa.ordenarPorAltura());
    }

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        // método .sort() entende que precisa comparar as idades por causa da interface Comparable na classe Pessoa
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

}
