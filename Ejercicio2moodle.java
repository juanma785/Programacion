public class Ejercicio2moodle{
public static boolean esPrimo(int randomNumber) {
    // El 0, 1 y 4 no son primos
    System.out.print("no es primo");{
    if (randomNumber == 0 || randomNumber == 1 || randomNumber == 4) {
      return false;
    }
    }
    System.out.print("no es primo");{
    for (int x = 2; x < randomNumber / 2; x++) {
      // Si es divisible por cualquiera de estos números, no
      // es primo
      if (randomNumber % x == 0)
        return false;
    }
    }
    System.out.print("es primo");{
    // Si no puedo dividir por ninguno de los de antes, sí es primo
    return true;
    }
}
}