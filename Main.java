package UDT3;

public class Main {

final static Integer A = 2;
final static Integer N = 3;
final static Float A_Decimal = 2.5F;
final static Float B_Decimal = 3.0F;
    emum Operacion{
SUMA, RESTA, MULTI, DIV
    }

        CalculadoraBasica basica = new CalculadoraBasica();
        Operacion operacionSeleccionada = Operacion.SUMA;
        int a = 2;
        int b = 3;
        int c = 4;

        basica.suma(a,c);

        basica.suma(a:2, b:2, c:2)
        switch (operacionSeleccionada)
        case SUMA:
        System.out.println("La suma de "+ A "+" + B + "=" + basica.suma(A,B));

    }

