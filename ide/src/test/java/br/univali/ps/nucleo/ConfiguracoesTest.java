package br.univali.ps.nucleo;

import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.assertEquals;

public class ConfiguracoesTest
{
    @Rule
    public TemporaryFolder temporario = new TemporaryFolder();

    @Test
    public void resolveDiretorioAplicacaoDoJpackage() throws IOException
    {
        File instalacao = temporario.newFolder("app");
        new File(instalacao, "lib").mkdirs();
        new File(instalacao, "portugol-studio.jar").createNewFile();

        assertEquals(instalacao.getCanonicalFile(),
                Configuracoes.resolverDiretorioAplicacao(instalacao).getCanonicalFile());
    }

    @Test
    public void preservaLayoutDoInstaladorLegado() throws IOException
    {
        File instalacao = temporario.newFolder("instalacao");

        assertEquals(new File(instalacao, "aplicacao").getCanonicalFile(),
                Configuracoes.resolverDiretorioAplicacao(instalacao).getCanonicalFile());
    }
}
