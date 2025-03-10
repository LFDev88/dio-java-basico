public class Operadores {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b? "Verdadeiro" : "Falso";
        
        System.out.println(resultado);

        if(a!=b)
            System.out.println("Verdadeiro");
        else
            System.out.println("Falso");
    }
}