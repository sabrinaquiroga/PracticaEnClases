import org.junit.Assert;
import org.junit.Test;

public class TestOperaciones {

    @Test

    public void verificarSuma(){
        int resultadoA = OperacionesAritmeticas.sumar(30,40);
        int resultado =70;
        Assert.assertEquals("Esta Mal", resultadoA, resultado);

    }

}
