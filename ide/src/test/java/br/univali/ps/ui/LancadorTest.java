package br.univali.ps.ui;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LancadorTest
{
    @Test
    public void configuraAparenciaParaSeguirOTemaDoSistema()
    {
        String valorAnterior = System.getProperty("apple.awt.application.appearance");

        try
        {
            System.clearProperty("apple.awt.application.appearance");
            Lancador.setarPropriedadesDoSistema();
            assertEquals("system", System.getProperty("apple.awt.application.appearance"));
        }
        finally
        {
            if (valorAnterior == null)
            {
                System.clearProperty("apple.awt.application.appearance");
            }
            else
            {
                System.setProperty("apple.awt.application.appearance", valorAnterior);
            }
        }
    }
}
