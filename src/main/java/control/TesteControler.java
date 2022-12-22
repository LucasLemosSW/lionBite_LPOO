package control;

import DAO.UsuarioDAO;

import java.util.Scanner;

import java.util.List;
import java.util.Scanner;

public class TesteControler {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        selectClientes();

    }

    private static void selectClientes() {
        System.out.println("\nLista de clientes cadastrados no banco de dados:\n" + UsuarioDAO.selectUser());
    }

}