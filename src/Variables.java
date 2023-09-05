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
    }
}
