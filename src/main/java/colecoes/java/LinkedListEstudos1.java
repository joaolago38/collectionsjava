package colecoes.java;

import colecoes.java.model.Cliente;

import java.util.LinkedList;
import java.util.Spliterator;

public class LinkedListEstudos1 {
    public static void main(String[] args) {
        var cliente1 = Cliente.builder().uf("MG").documento("122332323").endereço("rua jau").nome("dulce").build();
        var cliente2 = Cliente.builder().uf("SP").documento("122332323").endereço("rua jupiter").nome("katia").build();
        var cliente3 = Cliente.builder().uf("MS").documento("122332323").endereço("rua das amorerias").nome("jose").build();
        var cliente4 = Cliente.builder().uf("MG").documento("1223dfdfd3").endereço("rua sol").nome("isaias").build();
        var cliente5 = Cliente.builder().uf("RJ").documento("122332323").endereço("rua netuno").nome("maria jose").build();
        var cliente6 = Cliente.builder().uf("MG").documento("122332323").endereço("rua caldas novas").nome("maria").build();
        var cliente7 = Cliente.builder().uf("SC").documento("122332323").endereço("rua juis novas").nome("tereza").build();
        var cliente8 = Cliente.builder().uf("PR").documento("sdfsdfs").endereço("rua tuitis").nome("Mario").build();
        LinkedList<Cliente> clientes = new LinkedList<>();
        clientes.add(0,cliente1);
        clientes.add(1,cliente2);
        clientes.add(2,cliente3);
        clientes.add(3,cliente4);
        clientes.add(4,cliente5);
   //     clientes.clear();
        clientes.addFirst(cliente7);
        clientes.addLast(cliente8);
        clientes.descendingIterator();
        System.out.println("===================================================================================");
        System.out.println(clientes.stream().spliterator());

        System.out.println("===================================================================================");
        System.out.println("===================================================================================");
        clientes.stream().forEach(System.out::println);
        if(clientes.contains(Cliente.builder().uf("PR").documento("sdfsdfs").endereço("rua tuitis").nome("Mario").build())){
            System.out.println("Existe Contains");
        }
        System.out.println("===================================================================================");
        System.out.println("================================Spliterator===================================================");
        Spliterator<Cliente> namesSpliterator = clientes.spliterator();
        System.out.println(namesSpliterator.estimateSize());
        namesSpliterator.forEachRemaining(System.out::println);
        System.out.println("===================================================================================");

        System.out.println("===================================================================================");
        System.out.println("o numero de clients eh =+++++++++++++++++++++++++++++++++++++++++++++++++++++++> " +  clientes.size());
        System.out.println("===================================================================================");

    }

}
