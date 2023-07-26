package br.com.elisbjr.teste;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeiroTesteTest {
    @Test
    public void primeiroTest() {
        String nome = "Elisberto";
        Assert.assertEquals("Elisberto", nome);
    }

    @Test
    public void testeNotEquals() {
        String nome = "Elisberto";
        Assert.assertNotEquals("Elisberto1", nome);
    }
}