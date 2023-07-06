package br.com.elisbjr;

import br.com.elisbjr.dao.ClientMapDAO;
import br.com.elisbjr.dao.IClientDAO;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        IClientDAO iClientDAO = new ClientMapDAO();

        String option = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusao, 4 para alteracao ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while(!isValidOption(option)) {
            if("".equals(option)) {
                exit();
            }
            option = JOptionPane.showInputDialog(null,
                    "Opcao invalida digite 1 para cadastro, 2 para consultar, 3 para exclusao, 4 para alteracao ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }


    }

    private static void exit() {
        JOptionPane.showMessageDialog(null, "Ate logo!");
        System.exit(0);
    }

    private static Boolean isValidOption(String option) {
        if("1".equals(option) || "2".equals(option)
                || "3".equals(option) || "4".equals(option) || "5".equals(option)) {
            return true;
        }
        return false;
    }

    private static Boolean isRegisterOption(String option) {
        return "1".equals(option);
    }
}
