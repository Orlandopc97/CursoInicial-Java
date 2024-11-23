import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "Hola mundo!";

        int largoText = text.length();
        System.out.println(text.length());
        System.out.println(largoText);
        //Argumentos
        String texto = text.replace("Hola", "Chao");
        System.out.println(texto);//Los Strings son inmutables
        System.out.println(text);
        //Si el string termina con esta cadena de texto
        System.out.println(text.endsWith("ndo!"));
        //Si el string inicia con hola
        System.out.println(text.startsWith("Hola"));
        System.out.println(text.toLowerCase().startsWith("hola"));
        //Si contiene esta cadena en el string
        System.out.println(text.contains("ndo"));
        //A partit de que posicionamiento en la cadena de texto esta este texto
        System.out.println(text.indexOf("mund"));

        //Pasar todo el string a minusculas y mayusculas
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        //Quita los espacios de inicio y final
        String error = "   texto mal escrito ";
        System.out.println(error.trim());
        System.out.println(error);

        //Caracteres de escape // \backslash
        String t = "Hola \"mundo\"";
        System.out.println(t);
        String t1 = "C:\\Hola\"Mundo\">";
        System.out.println(t1);
        //Salto de linea
        String tex = "Hola \nMundo";
        System.out.println(tex);
        //tabulación //salto de varios espacios
        String t3 = "Hola \tMundo";
        System.out.println(t3);


        //Arrays
        //Guardar elementos del mismo tipo de dato
        //Tipo de dato del array
        //Indicar que es un array[]
        //Nombre
        //Definir nuevo array
        //Longitud del array
        int[] arrayNumeros = new int[5];
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayNumeros[0] = 5; //Asiganacion de valor al indice 0
        arrayNumeros[4] = 8;
        arrayNumeros[2] = 15;
        //arrayNumeros[8] = 56;  no se puede no esa dentro de los limites definidos del array
        //Se utiliza la clase Arrays para poder usar los metodos para arreglos
        System.out.println(Arrays.toString(arrayNumeros));
        //Los array tiene la cantidad de espacios fija no se puede alterar, no se pueden agregar o eliminar elementos
        //Para poder hacer eso son las COLECCIONES

        //PROPIEDAD ya que no es una funcion, no tiene los parentesis, y va a devolver un valor
        System.out.println(arrayNumeros.length);
        Arrays.sort(arrayNumeros); //Ordenar de menor a mayor los valores del array
        System.out.println(Arrays.toString(arrayNumeros));


        //Arreglo "Array" de multiples dimensiones
        int[][] num = {{0, 1}, {2, 3}}; //Matriz
        System.out.println(Arrays.toString(num));//Se ven los bloques de memoria
        System.out.println(Arrays.deepToString(num));
        int num1[][] = new int[3][2];
        num1[0][1] = 2;
        num1[2][1] = 5;
        System.out.println(Arrays.deepToString(num1));
        int[][][] num2 = new int[3][2][4];
        num2[1][1][3] = 20;
        System.out.println(Arrays.deepToString(num2));


        //CONSTANTES
        //Se agrega la palabra final antes del tipo de dato de la variable
        final String empresa = "CanWorld";
        //Y no se le puede asiganar un valor distinto
        //empresa = "Bad world";


        /*
        Orden de operaciones PEMDAS
            -parentesis
            -potencias
            -multiplicacion
            -division
            -suma
            -resta

            Si se quiere cambiar el orden de las operaciones se agregan parentesis como en r1
         */
        int r = 5 + 3 * 2;
        int r1 = (5 + 3) * 2;
        System.out.println(r);
        System.out.println(r1);


        //CONVERSION DE TIPOS DE DATOS
        //Conversión implicita
        //Dato mas pequeño a mas grande
        //byte -> short ->int ->long ->float ->double
        byte a = 1;
        double b = 7.4;
        double c = a + b;
        System.out.println(c);

        //Conversion explicita
        int d = 13;
        double e = 12.4;
        int f = (int) (d + e); //Toda la operacion
        f = d + (int) e; //Solo un valor
        System.out.println(f);


        //String a un numero entero
        //Existen clases en java para pasar string a otro tipo de dato
        //Metodo parse
        String g = "1.1";
        int h = 5;
        double i = Double.parseDouble(g) + h; // 6.1
        //double i = Double.parseDouble(g + h); // 1.15
        System.out.println(i);

        //CLASE MATH
        //Valor absoluto
        //Mismo metodo con diferentes tipos de datos
        System.out.println(Math.abs(-15));
        System.out.println(Math.ceil(20.11111));//Redondear hacia arriba
        System.out.println(Math.floor(11.9997));//Redondear hacia abajo
        System.out.println(Math.max(25, 18));//Cual numero de los dos es mayor
        System.out.println(Math.min(12, 45));//Cual numero de los dos es menor
        System.out.println(Math.round(13.5));//Redondea al numero mas cercano
        System.out.println(Math.random());//Numero random entre 0 y 1
        System.out.println(Math.random() * 100);//Numero random entre 1 y 100
        System.out.println(Math.random() * 1000);
        System.out.println(Math.round(Math.random() * 1000));
        double random = Math.random();
        //Para convertir el dato completo a entero es mejor encerrarlo entre parentesis (random * 1000)
        System.out.println((int) (random * 1000));

        //Formato a los numeros "porcentaje o moneda"
        //Clase NumberFormat "es una clase abstracta", lo cual no se puede crear instancias de objeto directamente con la palabra reservada new
        //Instancia de la clase NumberFormat
        //Para cambiar la local de pais es:  Google mexico locale code "es-Mx , es-CO (colombia" //Pasar "locale" a NuberFormat.getCurrencyInstance(locale)
        Locale locale = Locale.forLanguageTag("es-MX");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);//Obtener un objeto con el cual se podra trabajar con tipos de monedas
        String nf = numberFormat.format(1099.90); //Pesos mexicanos
        System.out.println(nf);

        //Porcentaje                            //Se puede agregar locale
        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.println(porcentaje.format(0.15));
        System.out.println(porcentaje.format(1));
        System.out.println(porcentaje.format(.1));


        //SCANNER
        //Para crear una instancia de una clase es: "clase" "nombre de la variable"
        //Scanner scanner = new Scanner(System.in);
        //Objeto scanner         //El metodo de next evalua cada una de las palabras de la cadena de texto como una llave "token", solo toma el primer token
        //String escaner = scanner.next();
        //String escaner1 = scanner.nextLine();//El metodo next line toma toda la cadena de texto
        //System.out.println(escaner1);
        //System.out.println("Ingresa tu edad: ");
        //int escaner2 = scanner.nextInt();//Existen metodos para cada tipo de dato
        //System.out.println("Tu edad es: " + escaner2);


        //TIPOS POR REFERENCIA Y PRIMITIVOS
        //Primitivos
        int j = 56;
        int j1 = j;
        System.out.println(j); //no el lugar en la memoria en la que se almacena

        //Referencia
        Point point1 = new Point();
        Point point2 = point1;
        point2.x = 15; //Propiedad x //para acceder a ella es con . = .x
        System.out.println(point1);//Es por que la variable pasa al mismo lugar de la memoria ram que la otra variable
        //Es por que es un objeto y esa es una propiedad de ese objeto, no solo ocupa un solo lugar en la memoria es por propiedad

        String ref = new String("Hola mundo!"); //String son tipos de datos por referencia
        String refer = ref;
        String referencia = ref.toUpperCase();//El metodo touppercase no esta modificando la variable de ref, sino que devuelve un nuevo string que se le asigna a la variable referencia
        System.out.println(ref);
        //Depende si el metodo que se utiliza es inmutable o no altera el objeto, se puede comprobar almacenandola en otra variable como este ejercicio


        //PALABRA RESERVADA VAR
        var k = "Hola"; //Infiere el tipo de dato con el valor asignado (int, double, String... etc)
        var k1 = 49;

        //Operadores de comparación

        int k2 = 23;
        int k3 = 30;  //Todos los operadores de comparacion arrojan un tipo Bolean
        System.out.println(k2 == k3);//Igual a
        System.out.println(k2 != k3);//distinto a
        System.out.println(k2 > k3);// mayor a
        System.out.println(k2 < k3);//menor a
        System.out.println(k2 <= k3);//menor o igual a
        System.out.println(k2 >= k3);//mayor o igual a

        //Operadores logicos
        boolean l = true;
        boolean l1 = false;
        boolean l2 = l || l1; // OR Nueva variable o evaluar en algo //Con que alguno sea verdadero sera True
        boolean l3 = l || l1 || false || false || true || false || true;
        boolean l4 = l && l1;// AND Si alguno de los valores es false sera false
        //NOT Invierte un operador logico declarado true -> false y false -> true
        boolean l5 = !l; //false
        boolean l6 = !l1; //true
        System.out.println(l5);
        System.out.println(l6);

        //Ejemplo Usuario
        boolean isAdult = true;
        boolean isActive = false;
        boolean isPremium = true;
        boolean isOn = true;

        String coupon = "chanchito feliz";
        Boolean promo = coupon.equals("ultimate java") || coupon.equals("chanchito feliz");//Tiene alguno de los dos cupones
        System.out.println(promo);//true
        //Usuario puede comprar si es adulto "y" es activo "y" si tiene fondos
        boolean hasFund = true;
        boolean canPurchase = isAdult && isActive && hasFund;
        System.out.println(canPurchase);//false


        //If
        int edad = 18;//edades
        String movieClassification = "RP18";
        boolean isWithAdult = true;

        boolean isRestricted = movieClassification.contains("R");

        if (!isRestricted) { //Si no es restringida por clasificacion
            System.out.println("Puedes ver la pelicula");

        } else if (edad > 17) { //si eres mayor de edad
            System.out.println("Puedes ver la pelicula igual");

        } else if (isWithAdult && movieClassification.contains("RP")) {//si te acompaña um adulto
            System.out.println("Si viene con un adulto puede ver la pelicula");

        } else {//si no es restringida y aunque no seas mayor de edad
            System.out.println("No puedes ver la pelicula");

        }


        //ALCANCE DENTRO DE JAVA
        String mensaje = "Seco para programar";//Se declara e inicializa

        if (true) {
            String txt = "Hola Mundo";
            mensaje = "HOLA MUNDOS"; //SE UTILIZA Y CAMBIA VALOR
            System.out.println(txt);
            System.out.println(mensaje);
            if (true) {
                System.out.println(txt);
            }
        }
        //System.out.println(txt);//EL alcance de las variables es de izquierda a derecha hacia abajo hasta donde cierre el corchete
        System.out.println("fin de aplicacion");
        System.out.println(mensaje); //Se puede seguir utilizando con los cambios ya hecho "nuevo valor obtenido"


        //OPERADOR TERNARIO
        int edads = 25;
        if (edads > 17) {
            System.out.println("Esta persona puede votar");
        } else {
            System.out.println("Esta persona no puede votar");
        }
        /////
        String message = "";
        if (edads > 17) {
            message = "ESTA PERSONA PUEDE VOTAR";
        } else {
            message = "ESTA PERSONA NO PUEDE VOTAR";
        }
        System.out.println(message);
        //////
        message = "Esta persona no puede votar";
        if (edads > 17) {
            message = "Esta persona puede votar";
        }
        System.out.println(message);
        ////////
        message = edads > 17 ? "Puede votar" : "NO puede votar";
        System.out.println(message);


        //SWITCH //Similar a if pero mas concizo

        /*
        String action = "agregar";
                //TIpo de valor que recibe el switch
        switch (action){
            case "agregar":
                System.out.println("Agregando");
                break;
            case "eliminar":
                System.out.println("Eliminando recurso");
                break;
            default:
                System.out.println("Accion por defecto");
        }
         */

        //EJERCICIO
        /*
            //Primer solucion
        System.out.println("Ingresa un numero");
        Scanner scann = new Scanner(System.in);
        int tipoParImpar  = scann.nextInt();

        if (tipoParImpar % 2 == 0) {
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
        if(tipoParImpar % 3 == 0 && tipoParImpar % 4 == 0 ){
            System.out.println("El numero es divisible por 3 y 4");
        } else if (tipoParImpar % 3 == 0) {
            System.out.println("El numero es divisible por 3");
        } else if (tipoParImpar % 4 == 0) {
            System.out.println("El numero es divisible por 4");
        }
        */

        /*
        //Segunda solucion
        String parImpar = tipoParImpar % 2 == 0 ? "Es par " : "Es impar ";
        String divisible3 = tipoParImpar % 3 == 0 ? "\nEs divisible entre 3 ": "";
        String divisible4 = tipoParImpar % 4 ==0 ? "\nEs divisible entre 4 " : "";
        System.out.println(parImpar + divisible3 + divisible4);
        */

        //FOR
        String[] textos = {"Hola Mundo", "Usuario 1", "Bad Omens"};
        //variable a iterar
        //Condicion que cumple
        //
        for (int m = 0; m < 5; m++) {
            System.out.println("Hola mundo" + m);
        }
        for (int m1 = 0; m1 < textos.length; m1++) {
            System.out.println(textos[m1]);
        }


        //WHILE
        int m2 = 0;

        while (m2 < 5) {
            System.out.println("MALOS AUGURIOS " + m2);
            m2++;
        }

        /*
        //Ejercicio
        Scanner sca = new Scanner(System.in);
        String input = "";

        while (!input.equals("salir")){
            System.out.println("Ingresa comando: ");
            input = sca.next().toLowerCase();
            System.out.println(input);
        }
         */


        int dod = 2;

        do {            //Primero ejecuta el codigo y despues hace la evaluación
            //Siempre ejecutara el codigo del do no importa si la condicion no la cumple hasta que evalua pra la siguiente vez
            System.out.println(dod);
            dod++;
        } while (dod < 5);


        //BREAK Y CONTINUE

        /*
        Scanner sc = new Scanner(System.in);
        String intp = "";
        while (true) {
            System.out.println("Ingrese un comando: ");
            intp = sc.next().toLowerCase();
            if (intp.equals("salir")) {
                break;                                      //BREAK y CONTINUE solo se DEBEN colocar dentro de un LOOP o switch "break"
            }
            if (intp.equals("continuar")) {
                continue;
            }
            System.out.println("Esta linea no se deberia ejecutar si se escribe 'salir'");
        }
        System.out.println("fuera del loop");


         */
        //FOR EACH //Esta instruccion se hizo para ITERAR en ARRAYS y COLECCIONES

        String[] personajes = {"Goku", "Vegeta", "Trunks", "Gohan", "Gotens"};
        //for
        /*
        for (int in = 0;in < personajes.length ;in ++){
            System.out.println(personajes[in]);
        }
         */

        //for each
        //Se crea una variable a partir del array y va ir iterando cada elemento en esa variable
        for (String personaje : personajes) {
            System.out.println(personaje);
        }

        //Ejercicio
        /*
        int opcion = 0;

        while (opcion !=3){
            Scanner scan = new Scanner(System.in);
            System.out.println("ELIGE UNA OPCION:");
            System.out.println("1 Calculadora\n2 Hackear la nasa\n3 Salir");

            opcion = scan.nextInt();

            switch (opcion){
                case 1:
                    int number1, number2,result;
                    System.out.println("Ingresa el primer valor");
                    number1  =scan.nextInt();
                    System.out.println("Ingresa el segundo valor");
                    number2 = scan.nextInt();
                    result = number1 + number2;
                    System.out.println("El resultado es: " + result + "\n");
                    continue;

                case 2:
                    System.out.println("Hackeando la nasa \n# \n## \n### \n### \nListo, eres hackerman!\n");
                    continue;
                case 3:
                    System.out.println("Has salido del sistema :(");
                    break;
            }

        }

         */

        /*
        Scanner scanner = new Scanner(System.in);
        String input = "";

        //Etiqueta "terminal"
        terminal: while(true){
            System.out.println("Ingresa una opción");
            System.out.println("1. Calculadora");
            System.out.println("2. Hackear la nasa");
            System.out.println("3. Salir");
                            //nextLine problema por enter guardado en el buffer
            input = scanner.next().toLowerCase();

        */
            /*
            *Problema cuando se utiliza nextLine y depues algun nextint o para otro tipo de dato

             llamada a nextint()  numero->  "15"  y ("enter" = \n) este \n lo manda a buffer = se encarga de almacenar todos los datos que se ingresan dentro la terminal
                                   el siguiente nextline encontrara "\n" en el buffer y lo toma como caracter valido
                                   por eso lo toma evalua en el switch no encuentra ningun case con ese valor "\n" y vuelve hasta arriba por el bucle while
            Se recomienda usar next y esos caracteres seran ignorados "\n"
            * */
           /*
            switch (input){
                case "1":
                    System.out.println("Ingresa un numero: ");
                    int ai = scanner.nextInt();
                    System.out.println("Ingresa otro numero: ");
                    int ai2 = scanner.nextInt();
                    System.out.println("El resultado es: " + (ai + ai2));
                    break;
                case "2":
                    System.out.println("Hackeando la nasa :)\n#\n##\n###\n####\nListo, eres hackerman");
                    break;
                case "3":
                    System.out.println("Chao Mundo!");
                    break terminal; //Etiqueta

                    //Se denominan etiquetas, sirven para poder controlar a qué bucle deseas hacerle break o continue
                    //cuando están anidados.
            }
        }
        */


        //METODOS
        //Llamada al metodo, se puede llamar las veces que se quiera
        String nombre = "Orlando", apellido  = "cano";

        miMetodo();
        miMetodo();
        otroMetodo();
        otroMetodo();

        //ARGUMENTOS Y PARAMETROS
                    //Argumento cuando se le pasa el valor al llamarlo
        tercerMetodo("Jesus","perez");
        tercerMetodo(nombre, "link");
        tercerMetodo("Canzoo", apellido);

        //VALOR DE RETORNO //Return
                    //Llamada al metodo suma y almacenamiento de valor de retorno en variable tipo entero "int"
        int result = suma(13, 24);
        System.out.println(result);

        //OVERLOADING //Definir el mismo metodo multiples veces pero cambia la cantidad de argumentos que este tiene
        //o el tipo de argumento que se esta pasando
        int resultSumar = suma(12,25,30);
        System.out.println(resultSumar);

        //Metodo que se llama igual pero es diferente
        String msg = suma(); //Sin ningun argumento, pero retorna un valor
        System.out.println(msg);


        //Metodo con parametro como ARRAY
        //Pasar multiples argumentos y se comporte de la misma manera
                              //Le puede agregar al array los valores que quieras
                                //creas un nuevo array para poder pasarle la cantidad de valores que quiera
        int resArrSuma = suma(new int[] {32,42,5,677,3,2,355,7,8,76,59});
        System.out.println(resArrSuma);


        //ALCANCE DE LOS METODOS
        //El alcance del metodo esta definido por corchetes {}, se puede acceder las variables definidas dentro del metodo
        //no se pueden utilizar fuera del rango de ese metodo
        //No hacer cicularidad con metodos
        /*Ejemplo
        static int suma (int a, int b){
            lala();                         //No llamar un metodo dentro de otro metodo y despues llamar al metodo dentro del otro metodo
            return a + b;
        }

        static void lala(){
            suma(1,2);
        }
         */

                                                                /////////////////////////////////*****

        //REFACTORIZACION DE EJERCICIO
        //REFACTORIZACION: Cambiar el codigo interno pero que la aplicación siga funcionando de la misma manera

        //Ejercicio SIN REFACTORIZAR
        /*
        Scanner scanner = new Scanner(System.in);
        String input = "";

        //Etiqueta "terminal"
        terminal: while(true){
            System.out.println("Ingresa una opción");
            System.out.println("1. Calculadora");
            System.out.println("2. Hackear la nasa");
            System.out.println("3. Salir");
            //nextLine problema por enter guardado en el buffer
            input = scanner.next().toLowerCase();
         */
            /*
            *Problema cuando se utiliza nextLine y depues algun nextint o para otro tipo de dato

             llamada a nextint()  numero->  "15"  y ("enter" = \n) este \n lo manda a buffer = se encarga de almacenar todos los datos que se ingresan dentro la terminal
                                   el siguiente nextline encontrara "\n" en el buffer y lo toma como caracter valido
                                   por eso lo toma evalua en el switch no encuentra ningun case con ese valor "\n" y vuelve hasta arriba por el bucle while
            Se recomienda usar next y esos caracteres seran ignorados "\n"
            */
            /*
            switch (input){
                case "1":
                    System.out.println("Ingresa un numero: ");
                    int ai = scanner.nextInt();
                    System.out.println("Ingresa otro numero: ");
                    int ai2 = scanner.nextInt();
                    System.out.println("El resultado es: " + (ai + ai2));
                    break;
                case "2":
                    System.out.println("Hackeando la nasa :)\n#\n##\n###\n####\nListo, eres hackerman");
                    break;
                case "3":
                    System.out.println("Chao Mundo!");
                    break terminal; //Etiqueta

                    //Se denominan etiquetas, sirven para poder controlar a qué bucle deseas hacerle break o continue
                    //cuando están anidados.
            }
        }
        */

        ////////////////////////Ejercicio REFACTORIZACION


        Scanner scanner = new Scanner(System.in);
        String input = "";

        //Etiqueta "terminal"
        terminal: while(true){
            //metodo que muestra opciones de la plicacion
            mostrarOpciones();
            //nextLine problema por enter guardado en el buffer
            input = scanner.next().toLowerCase();
            switch (input){
                case "1":
                    int resulCal = calculadora(scanner);//Se le pasa la instancia de scanner
                    System.out.println("El resultado es: " + resulCal);
                    break;
                case "2":
                    hackearNasa();//LLamada de metodo
                    break;
                case "3":
                    System.out.println("Chao Mundo!");
                    break terminal; //Etiqueta

                //Se denominan etiquetas, sirven para poder controlar a qué bucle deseas hacerle break o continue
                //cuando están anidados.
            }
        }









    }

                                        //Definicion de metodos
    //los metodos static
    /* El modificador static permite acceder a las variables y
    métodos aunque no tengamos una instancia del objeto que los contiene.
     */
    //No retorna nada
    //Nombre del metodo
    static void miMetodo() {
        System.out.println("Hola mundo");
    }

    //Segundo metodo
    static void  otroMetodo(){
        System.out.println("Bad omens");
    }

    //Tercer metodo //Pasarle variables, Los parametros son las variables que se pueden utilizar dentro del metodo
    //Los argumentos son los valores que se le pasan cuando llamemos al metodo
                            //Parametros
    static void tercerMetodo(String name, String apellido){//Parametro cuando se define el metodo
        System.out.println("HOLA " + name + " " + apellido) ;

    }

    //Metodo con valor de retorno suma
         //Retorna algo valor"int" entero
    static int suma(int val1, int val2){
         return val1 + val2;
    }
                                            //Son diferentes metodos aunque se llamen igual

    //Metodo con valor de retorno suma //Overloading //Se puede redefinir el metodo con mas parametros
    static int suma(int val1, int val2, int val3){
        return val1 + val2 + val3;
    }

    //Otro metodo que se llama igual pero es diferente de los otros
    static String suma(){
        return "Holla mundo";
    }

    //Metodo con array de parametro
    static int suma(int[] numeros){
        int resu = 0;
        for (int numero: numeros){//For each
            //Resultado va a ser igual a asi mismo mas el numero que viene en el array en la posicion
            //resu = resu + numero //numero "valor en el array en la posicion []" y reu = 0 y pasa a resu y se va sobrescribiendo
            resu += numero;
        }
        return resu;
    }



    ///Metodos para ejercicio refactorización
    static void mostrarOpciones(){
        System.out.println("Ingresa opción: \n1-Calculadora\n2-Hackear la nasa\n3-Salir");
    }
    static void hackearNasa(){
        System.out.println("Hackeando la nasa :)\n#\n##\n###\n####\nListo, eres hackerman!");
    }
                         //Es preferible pasarle la instancia de scanner
    static int calculadora(Scanner scanner){
        System.out.println("Ingresa un numero: ");
        int ai = scanner.nextInt();
        System.out.println("Ingresa otro numero: ");
        int ai2 = scanner.nextInt();
        return ai + ai2;
    }




}

