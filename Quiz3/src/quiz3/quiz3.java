/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz3;
/**
 *
 * @author rodri
 */

public class quiz3 {
    public static void main(String[] args) {
        
        Cancion[] top10 = new Cancion[10];

        top10[0] = new Cancion(1, "Respect", "Aretha Franklin", 180, 1967);
        top10[1] = new Cancion(2, "Fight the power", "Public Enemy", 210, 1989);
        top10[2] = new Cancion(3, "The real Slim Shady", "Eminem", 120, 2000);
        top10[3] = new Cancion(4, "Last Nite", "The Strokes", 190, 2001);
        top10[4] = new Cancion(5, "Yellow", "Coldplay", 167, 2000);
        top10[5] = new Cancion(6, "Bad Romance", "Lady Gaga", 163, 2008);
        top10[6] = new Cancion(7, "Hey Ya!", "OutKast", 220, 2003);
        top10[7] = new Cancion(8, "Seven Nation Army", "The White Stripes", 140, 2003);
        top10[8] = new Cancion(9, "Stronger", "Kanye West", 150, 2007);
        top10[9] = new Cancion(10, "Hotling Bling", "Drake", 171, 2016);
        
        
        int añoActual = 2023;

        cancionesAnteriores(top10, añoActual);
        cancionesDelAñoActual(top10, añoActual);
        cancionesPosteriores(top10, añoActual);
        cancionMayorDuracion(top10);
        autorPrimeraPosicion(top10);
        mostrarTodasCanciones(top10);
    }

    public static void cancionesAnteriores(Cancion[] canciones, int añoActual) {
        for (Cancion cancion : canciones) {
            if (cancion.getAño() < añoActual) {
                System.out.println("Canción anterior al año actual: " + cancion.getTitulo());
            }
        }
    }

    public static void cancionesDelAñoActual(Cancion[] canciones, int añoActual) {
        for (Cancion cancion : canciones) {
            if (cancion.getAño() == añoActual) {
                System.out.println("Canción del año actual: " + cancion.getTitulo());
            }
        }
    }

    public static void cancionesPosteriores(Cancion[] canciones, int añoActual) {
        for (Cancion cancion : canciones) {
            if (cancion.getAño() > añoActual) {
                System.out.println("Canción posterior al año actual: " + cancion.getTitulo());
            }
        }
    }

    public static void cancionMayorDuracion(Cancion[] canciones) {
        Cancion mayorDuracion = canciones[0];
        for (Cancion cancion : canciones) {
            if (cancion.getDuracion() > mayorDuracion.getDuracion()) {
                mayorDuracion = cancion;
            }
        }
        System.out.println("Canción de mayor duración: " + mayorDuracion.getTitulo());
    }

    public static void autorPrimeraPosicion(Cancion[] canciones) {
        System.out.println("Autor de la canción en la primera posición: " + canciones[0].getAutor());
    }

    public static void mostrarTodasCanciones(Cancion[] canciones) {
        System.out.println("Todas las canciones:");
        for (Cancion cancion : canciones) {
            System.out.println("ID: " + cancion.getIdCancion() + ", Título: " + cancion.getTitulo() + ", Autor: " + cancion.getAutor() + ", Duración: " + cancion.getDuracion() + ", Año: " + cancion.getAño());
        }
    }
}
