package br.com.elisbjr;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testClient() {
        Client client = new Client();
        client.addName("Elisberto");

        Assert.assertEquals("Elisberto", client.getNome());
    }

}
