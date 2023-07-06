package br.com.elisbjr;

import br.com.elisbjr.dao.ClientMapDAO;
import br.com.elisbjr.dao.IClientDAO;
import br.com.elisbjr.domain.Client;

import javax.swing.*;

public class App {
    private static IClientDAO iClientDAO;
    public static void main(String[] args) {
        iClientDAO = new ClientMapDAO();

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

        while (isValidOption(option)) {
            if(isOptionExit(option)) {
                exit();
            } else if (isRegisterOption(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por virgula",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                registerClient(data);
            } else if (isConsult(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Digite o cpf",
                        "Cansultar", JOptionPane.INFORMATION_MESSAGE);
                consult(data);
            }
            option = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusao, 4 para alteracao ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static void consult(String data){
        Client client = iClientDAO.consult(Long.parseLong(data));
        if (client != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + client.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente nao encontrado!");
        }

    }

    private static boolean isConsult(String option) {
        if("2".equals(option)) {
            return true;
        }
        return false;
    }

    private static void registerClient(String data) {
        String[] dataClient = data.split(",");
        Client client = new Client(dataClient[0], dataClient[1], dataClient[2], dataClient[3], dataClient[4], dataClient[5], dataClient[6]);
        Boolean isRegistered = iClientDAO.register(client);
        if (isRegistered) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente ja cadastrado!");
        }
    }

    private static boolean isOptionExit(String option) {
        return "5".equals(option);
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
