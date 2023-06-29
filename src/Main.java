// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// completado...
public class Main {
    public static void main(String[] args) {
        Serie serie[] = new Serie[5];
        Videojuego videojuego[] = new Videojuego[5];

        serie[0] = new Serie("rocky",12,"comedia","yonaldo");
        serie[1] = new Serie("juego de tronos","manuel");
        serie[2] = new Serie("el campeon",2,"accion","david");
        serie[3] = new Serie();
        serie[4] = new Serie("end game","petro");

        videojuego[0]=new Videojuego("maria kart",14);
        videojuego[1]=new Videojuego("fornite",22,"combate","la mia");
        videojuego[2]=new Videojuego("otro",3,"otra","otrica");
        videojuego[3]=new Videojuego("comosea",7,"x","mayor");
        videojuego[4]=new Videojuego("hubgames",5,"fes","ddr");

        serie[1].entregar();
        serie[3].entregar();
        serie[4].entregar();

        videojuego[0].entregar();
        videojuego[2].entregar();

        int cant_series_entregadas=0;
        int cant_videojuegos_entregados=0;

        for (int i = 0; i < serie.length; i++) {
            if (serie[i].isEntegado()) {
                cant_series_entregadas+=1;
                serie[i].devolver();
            }
        }
        for (int i = 0; i < videojuego.length; i++) {
            if (videojuego[i].isEntegado()) {
                cant_videojuegos_entregados+=1;
                videojuego[i].devolver();
            }
        }

        System.out.println("cantidad series entregadas es: "+cant_series_entregadas);
        System.out.println("cantidad video juegos entregadas es: "+cant_videojuegos_entregados);

    }
/*5) Crearemos una clase llamada Serie con las siguientes características:
Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el titulo y creador. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:
Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.
Crearemos una clase Videojuego con las siguientes características:

Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el titulo y horas estimadas. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:
Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.
Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:

entregar(): cambia el atributo prestado a true.
devolver(): cambia el atributo prestado a false.
isEntregado(): devuelve el estado del atributo prestado.
Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas. Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.
Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo siguiente:

Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
Entrega algunos Videojuegos y Series con el método entregar().
Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muestralos en pantalla con toda su información (usa el método toString()).
*
* */

}
