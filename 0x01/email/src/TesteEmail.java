import static org.junit.Assert.*;
import org.junit.Test;

public class TesteEmail {
    @Test
    public void testar_email_com_arroba() {
        boolean isValid =  Pessoa.emailValid("email_teste@dominio.com.br");
        assertTrue(isValid);
    }

    @Test
    public void testar_email_sem_arroba() {
        boolean isValid = Pessoa.emailValid("email_testedominio.com.br");
        assertTrue(isValid);
    }

    @Test
    public void testar_email_mais_50_caracteres() {
        boolean isValid = Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
        assertEquals(true, isValid);
    }

}