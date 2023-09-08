public class Variables {
    public static void main(String[] args){

        System.out.println("My name is Julian");
        String name = "Julian";
        System.out.println(name);
        System.out.println("My name is " + name.toUpperCase());

        int number = 10; //no methods because it is a primitive value//
        Integer number2 = 10; //objects methods because is a reference variable//
        number2.shortValue(); //for example//

        boolean valor = true;

        if(valor){
            System.out.println("valor = " + valor);
        }

        var technology = 10; //implicit value in primitives and references with var word//
        var Tech = 10;

        // avoid ñ and ´ in variable names

        //PRIMITIVES:
    //booleans
        boolean a = true;
        boolean b = false;
    // char = one only character or unicode reference:
        char c = 'a';
        char d = '1';
        char e = '\u0021'; // this equals the "!" symbol in the unicode
    // enteros
        byte f = 120; //between -128 - 127
        short g = 32767; //between -32768 - 32767
        int h = 1387483822;
        long i = 217974793;

    // reales = con coma
        // float (debeen terminar con la letra "f" para menos rando y double para mas rango, se pueden escribir como potencias.
    }
}
