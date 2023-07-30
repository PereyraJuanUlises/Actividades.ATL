package primer.api.primerApi.validators;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmailValidatorTest {
    @Test
    public void elEmailTieneQueTenerArroba(){
    EmailValidator validado = new EmailValidator();
    boolean resultado = validado.esValidoPregunta("asds");
    assertFalse(resultado);
    }
    @Test
    public void elEmailTieneQueTenerPunto(){
        EmailValidator validado = new EmailValidator();
        boolean resultado = validado.esValidoPregunta("ulises@pereyra");
        assertFalse(resultado);
    }
    @Test
    public  void elArrobaNoSeaLaUltimaLetra(){
        EmailValidator validado = new EmailValidator();
        boolean resultado = validado.esValidoPregunta("asdsada@");
        assertFalse(resultado);
    }
    @Test
    public void queNoTengaEspacios(){
        EmailValidator validado = new EmailValidator();
        boolean resultado = validado.esValidoPregunta("ulises @gmail.com");
        assertFalse(resultado);
    }
    @Test
    public void elEmailNoContegaMasDe255Caracteres(){
        EmailValidator validado = new EmailValidator();
        boolean resultado = validado.esValidoPregunta("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss@gmail.com");
        assertFalse(resultado);
    }
    
}
