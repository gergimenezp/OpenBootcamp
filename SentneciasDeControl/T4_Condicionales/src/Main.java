public class Main {
    public static void main(String[] args) {

        //if
        int numeroIf = 3;
        if (numeroIf < 0){
            System.out.println("El número es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es cero");
        }

        //while
        int numeroWhile = -3;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //do while
        int numeroDoWhile = 27;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile--;
        } while (numeroDoWhile < 3);

        //For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //switch
        var estacion = "primavera";
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Esto no es una estación del año");
        }
    }
}