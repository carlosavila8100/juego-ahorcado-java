import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //Primero tenemos que crear una instanciade Scanner 
        Scanner nc = new Scanner(System.in);

        //Palabra a adivinar 
        String palabraSecreta = "chichis";
        //intentos maximos debe de ser un entero puesto que van hacer las oportunidades que tenemos
        int intentosMaximos = 5;
        //Vamos a poner en que intento esta el usuario
        int intento = 0; //Lo vamos a inicializar en cero 
        //Vamos a hacer un booleano que nos va a decir si la palabra fue adivinada
        boolean palabraAdivinada = false;

        //Arreglo, el arreglo va a ser sobre lo que va iterar nuestro ciclo para poder adivinar la palabra
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Bucle for que va imprimir la cantidad de caracteres que tiene la palabra
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '*';
            
        }

        //
        while(!palabraAdivinada && intento < intentosMaximos){
            System.out.println("Palabra a adivinar " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra, por favor: ");
            char letra = Character.toLowerCase(nc.nextLine().charAt(0)); //El ultimo metodo sirve para que si una persona escribe una palabra entera solo tome la primera letra

            //Verificar si le letra es correcta
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }
            if(!letraCorrecta){
                intento++;
                System.out.println("Letra incorrecta, te quedan " + (intentosMaximos - intento) + " intentos");
            }
            //equals se usa para comparar cosas es un metodo
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades has acertado la palabra correcta " + palabraSecreta);

            }
        }
        if(!palabraAdivinada){
            System.out.println("Que pana te has quedado sin intentos");
        }
        nc.close();


    }
}
