package br.com.elisbjr.exeptions;

import javax.swing.*;

public class AppCliente {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o codigo do cliente",
                "", JOptionPane.INFORMATION_MESSAGE);


        try {
            ClienteService.consultarCliente(opcao);
        } catch (ClienteNaoEncontrado2Exception e) {
            e.printStackTrace();
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
