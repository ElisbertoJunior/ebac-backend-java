package br.com.elisbjr.teste;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {
    @Test
    public void segundoTeste() {
        String nome = "Junior";
        Assert.assertEquals("Junior", nome);
    }
}
