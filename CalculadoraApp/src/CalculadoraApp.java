import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args){
        System.out.println("**** Aplicacion Calculadora ****");
        Scanner consola = new Scanner(System.in);
        //Mostrar Menu
        System.out.println("1.Suma \n2.Resta \n3.Multiplicación \n4.División \n5.Salir");
        System.out.print("Operación a realizar: ");
        var operacion = Integer.parseInt(consola.nextLine());
        if(operacion>=1 && operacion<=4){
            System.out.println("Proporciona el primer valor");
            var num1 = Integer.parseInt(consola.nextLine());
            System.out.println("Proporciona el segundo valor");
            var num2 = Integer.parseInt(consola.nextLine());
            int resultado;

            switch (operacion){
                case 1:
                    resultado = num1+num2;
                    System.out.println("Resultado Suma: "+resultado);
                    break;
                case 2:
                    resultado = num1-num2;
                    System.out.println("Resultado Resta: "+resultado);
                    break;
                case 3:
                    resultado = num1*num2;
                    System.out.println("Resultado Multiplicacion: "+resultado);
                    break;
                case 4:
                    resultado = num1/num2;
                    System.out.println("Resultado Suma: "+resultado);
                    break;
                default:
                    System.out.println("Operación Erronea: "+operacion);
            }

        } else if (operacion== 5) {
            System.out.println("Vuelva pronto...");
        }else { System.out.println("Operación Erronea: "+operacion);}
    }
}
