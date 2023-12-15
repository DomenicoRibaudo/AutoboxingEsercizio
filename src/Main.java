//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//        Scrivere una funzione che accetti in input 1 char lo stampi
//        Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//        Scrivere una funzione che accetti in input 1 Character lo stampi
//        Scrivere un un valore primitivo per int, double e char e fare autoboxing
//        Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//        Usare le funzioni scritte con i valori creati
public class Main {
    public static void main(String[] args) {

//        Autoboxing per int, double e char

        // Esempi di autoboxing per int, double e char
        int valorePrimitivoInt = 42;
        Integer intAutoboxing = valorePrimitivoInt;

        double valorePrimitivoDouble = 3.14;
        Double doubleAutoboxing = valorePrimitivoDouble;

        char valorePrimitivoChar = 'C';
        Character charAutoboxing = valorePrimitivoChar;

//        Unboxing per Integer, Double e Character

        int unboxingInt = intAutoboxing;
        double unboxingDouble = doubleAutoboxing;
        char unboxingChar = charAutoboxing;


        //Utilizzo delle funzioni con i valori creati
        stampaSommaInteri(valorePrimitivoInt, unboxingInt);
        stampaCarattere(unboxingChar);
        stampaSommaInteger(intAutoboxing, unboxingInt);

        char caratterePrimitivo = 'B';
        Character carattereAutoboxing = caratterePrimitivo;
        stampaCharacter(carattereAutoboxing);
    }


    public static void stampaSommaInteri(int numero1, int numero2) {
        int somma = numero1 + numero2;
        System.out.println("La somma è = " + somma);
    }

    public static void stampaCarattere(char carattere) {
        System.out.println("Carattere: " + carattere);
    }

    public static void stampaSommaInteger(Integer a, Integer b) {
        System.out.println("Somma Integer: " + (a + b));
    }

    // Funzione che accetta un Character e lo stampa
    public static void stampaCharacter(Character carattere) {
        System.out.println("Carattere: " + carattere);

    }
}
