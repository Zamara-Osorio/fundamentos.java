import java.util.Scanner;
public class Solve {
    public static void main(String[] args) {
      

        
                Scanner scanner = new Scanner(System.in);
                int choice;
                
                do {
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Casteo1");
                    System.out.println("2. Casteo2");
                    System.out.println("3. Casteo3");
                    System.out.println("4. Casteo4");
                    System.out.println("5. Casteo5");
                    System.out.println("6. Casteo6");
                    System.out.println("7. Casteo7");
                    System.out.println("8. Casteo8");
                    System.out.println("9. Casteo9");
                    System.out.println("10. Casteo10");
                    System.out.println("11. Operadores1");
                    System.out.println("12. Operadores2");
                    System.out.println("13. Operadores3");
                    System.out.println("14. Operadores4");
                    System.out.println("15. Operadores5");
                    System.out.println("16. OperadoresdeIncrementoyDecremento1");
                    System.out.println("17. OperadoresdeIncrementoyDecremento2");
                    System.out.println("18. OperadoresdeIncrementoyDecremento3");
                    System.out.println("19. OperadoresdeIncrementoyDecremento4");
                    System.out.println("20. OperadoresdeIncrementoyDecremento5");
                    System.out.println("21. EjerciciosCombinados1");
                    System.out.println("22. EjerciciosCombinados2");
                    System.out.println("23. EjerciciosCombinados3");
                    System.out.println("24. EjerciciosCombinados4");
                    System.out.println("25. EjerciciosCombinados5");
                    System.out.println("26. EjerciciosCombinados6");
                    System.out.println("27. EjerciciosCombinados7");
                    System.out.println("28. EjerciciosCombinados8");
                    System.out.println("29. EjerciciosCombinados9");
                    System.out.println("30. EjerciciosCombinados10");
                    System.out.println("0. Salir");
        
                    choice = scanner.nextInt();
        
                    switch (choice) {
                        case 1:
                            System.out.println("Casteo1: " + Casteo1());
                            break;
                        case 2:
                            System.out.println("Casteo2: " + Casteo2());
                            break;
                        case 3:
                            System.out.println("Casteo3: " + Casteo3());
                            break;
                        case 4:
                            System.out.println("Casteo4: " + Casteo4());
                            break;
                        case 5:
                            System.out.println("Casteo5: " + Casteo5());
                            break;
                        case 6:
                            System.out.println("Casteo6: " + Casteo6());
                            break;
                        case 7:
                            System.out.println("Casteo7: " + Casteo7());
                            break;
                        case 8:
                            System.out.println("Casteo8: " + Casteo8());
                            break;
                        case 9:
                            System.out.println("Casteo9: " + Casteo9());
                            break;
                        case 10:
                            System.out.println("Casteo10: " + Casteo10());
                            break;
                        case 11:
                            System.out.println("Operadores1: " + Operadores1(5)); 
                            break;
                        case 12:
                            System.out.println("Operadores2: " + Operadores2(3, 4)); 
                            break;
                        case 13:
                            System.out.println("Operadores3: " + Operadores3(10)); 
                            break;
                        case 14:
                            System.out.println("Operadores4: " + Operadores4(5, 10)); 
                        case 15:
                            System.out.println("Operadores5: " + Operadores5(8));
                        case 16:
                            System.out.println("OperadoresdeIncrementoyDecremento1: " + OperadoresdeIncrementoyDecremento1());
                            break;
                        case 17:
                            System.out.println("OperadoresdeIncrementoyDecremento2: " + OperadoresdeIncrementoyDecremento2());
                            break;
                        case 18:
                            System.out.println("OperadoresdeIncrementoyDecremento3: " + OperadoresdeIncrementoyDecremento3());
                            break;
                        case 19:
                            System.out.println("OperadoresdeIncrementoyDecremento4: " + OperadoresdeIncrementoyDecremento4());
                            break;
                        case 20:
                            System.out.println("OperadoresdeIncrementoyDecremento5: " + OperadoresdeIncrementoyDecremento5());
                            break;
                        case 21:
                            System.out.println("EjerciciosCombinados1: " + EjerciciosCombinados1());
                            break;
                        case 22:
                            System.out.println("EjerciciosCombinados2: " + EjerciciosCombinados2(7.5)); 
                            break;
                        case 23:
                            System.out.println("EjerciciosCombinados3: " + EjerciciosCombinados3());
                            break;
                        case 24:
                            System.out.println("EjerciciosCombinados4: " + EjerciciosCombinados4());
                            break;
                        case 25:
                            System.out.println("EjerciciosCombinados5: " + EjerciciosCombinados5());
                            break;
                        case 26:
                            System.out.println("EjerciciosCombinados6: " + EjerciciosCombinados6());
                            break;
                        case 27:
                            System.out.println("EjerciciosCombinados7: " + EjerciciosCombinados7());
                            break;
                        case 28:
                            System.out.println("EjerciciosCombinados8: " + EjerciciosCombinados8(2.5f)); 
                            break;
                        case 29:
                            System.out.println("EjerciciosCombinados9: " + EjerciciosCombinados9());
                            break;
                        case 30:
                            System.out.println("EjerciciosCombinados10: " + EjerciciosCombinados10(3.5)); 
                        case 0:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                } while (choice != 0);
                
                scanner.close();
            }
        
        
     
        static double Casteo1() {
                double x = (double) 5.89 + (double) 3.45;
                return x;
  
            }
  
            static int Casteo2() {
  
                char c = 'A';
                int cValue = (int) c;
                System.out.println(c);
                return cValue;
            }
  
            static int Casteo3() {
                double d = 100.04;
                long l = (long) d;
                int i = (int) l;
  
                return i;
            }
  
            static int Casteo4() {
                String B = "12";
                return Integer.parseInt(B);
            }
  
            static int Casteo5() {
  
                int a = (int) (char) (byte) -1;
                return a;
            }
  
            static char Casteo6() {

                //Casteo Convierte el número 65 a un char
                int A = 65;
                char AValue = (char) A;
                System.out.println(A);
  
                return AValue;
  
  
            }
  
            static long Casteo7() {

                //Casteo
                int log = 65;
                long logValue = (long) log;
                System.out.println(logValue);
                return logValue;
            }
   
            static String Casteo8() {  

                //Casteo 
  
                float Floatx = 1.35f;
                System.out.println(Floatx);
  
                return String.valueOf(Floatx);
            }
  
            static int Casteo9() { 

                //Casteo
                int round = (int) Math.round(2.7);
                return round;
            }
  
            static short Casteo10() {
  
                byte b = 50;
                short bValue = (short) b;
                System.out.println(b);
                return bValue;
            }
  
        //Operadores de Asignación
  
            static int Operadores1(int x) {
  
                x = 10;
                x += 5;
                return x;
            }
  
            static int Operadores2(int y, int x) {

                //Operadores
                y *= x + 5;
                return y;
            }
  
            static int Operadores3(int a) {

                //Operadores
                a %= 4;
                return a;
            }
  
            static int Operadores4(int x, int y) { 

                //Operadores
  
                x += y;
                return x;
            }
  
            static int Operadores5(int x) {
  
                //Operadores
  
                x ^= 2;
                return x;
            }
  
                //Operador de Incremento y el Decremento
  
          static  int  OperadoresdeIncrementoyDecremento1() {
  
                //1.  valor de x y después de la operacion
  
              int x = 5;
               int y = ++x;
               return y;
            }
  
          static  int   OperadoresdeIncrementoyDecremento2() {
              //2. imprimira en consola
             int a = 5;
              System.out.println(a++);
              System.out.println(a) ;
  
              System.out.println("retorno a") ;
  
              return a;
          }
  
          static int  OperadoresdeIncrementoyDecremento3() {
  
          //3.  operador de decremento para disminuir en 1
              int count = 10;
  
              System.out.println("Valor de count antes de decrementar: " + count);
  
              count--;
  
              System.out.println("Valor de count después de decrementar: " );
              return count;
  
          }
  
          static int  OperadoresdeIncrementoyDecremento4(){
           
                //4. ¿Cuál es la diferencia entre ++i y i++?
            int i = 5;
            int a = ++i; 
  
            int j = 5;
            int b = j++; 
  
            System.out.println("En Java, ++i y i++ son formas de incrementar el valor de la variable i en 1, pero se diferencian en el momento en que se realiza la operación de incremento respecto al uso de la variable " );
            System.out.println("asi se ve sin ++i "+i +"asi se ve con ++i "+a +"a será 6, i será 6 porque modifica las variables");
            System.out.println("asi se ve sin i++ "+j +"asi se ve con i++ ");
            return b;
          }
  
          static int  OperadoresdeIncrementoyDecremento5(){
                
                //5. ¿Qué valor tendrá x después de esta operación?
          int x = 3; x = x++;
          return x;
          }


                //Ejercicios de Combinación
  
          static int EjerciciosCombinados1(){
            int i = 5;
            i += ++i + i++ + ++i;
            return i;
          }
          static int EjerciciosCombinados2( double doubleVar){
            int num = (int) doubleVar;
           return num++;
  
          }
          static double EjerciciosCombinados3(){
          double d = 5.7;
          int i = (int)d;
          i *= 2;
          System.out.println("esto imprime i con i-- en consola" +i--);
          System.out.println("esto  valia i");
          return d;
          }
          static double EjerciciosCombinados4(){
  
            double result = 0.0;
            int intVar = 10;
  
            result += (double) intVar / 2.0;
            return  result ;
          }
          static char EjerciciosCombinados5(){
            char c = 'X';
            c += 32;
            System.out.println(c);
            return c;
          }
          static short EjerciciosCombinados6(){
           long longVar = 100L;
           short shortVar = (short) longVar;
           shortVar *= 3;
           return  shortVar;
          }
          static int EjerciciosCombinados7(){
            int x = 10;
            x += (x++) + (++x);
            return x;
          }
          static byte EjerciciosCombinados8( float floatVar){
            byte result = (byte) floatVar;
            return --result;
          }
          static byte EjerciciosCombinados9(){
            int i = 257;
            byte b = (byte)i;
            System.out.println("i a pasar a byte es : ");
            return b;
          }
          static int EjerciciosCombinados10(double doubleVar){
            int num = (int) doubleVar;
            num += 5;
            num++;
            return num;
          }


        }


