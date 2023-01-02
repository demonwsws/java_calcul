import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    //получить линию ввода
        public static String input_line(){
            System.out.println("print math or login root");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    };

        //giga_chad-mode inspector
        public static  int check_super_mod(String arg){

            if (arg.equals("root")){
                System.out.println("isroot=true\nprint password root");
                Scanner in = new Scanner(System.in);
                String password = in.nextLine();

                if (password.equals("toor")){
                    System.out.println("hi bro");
                    // коненчо, тут бы запустить функцию получения новой строки раз прошли авторизацию но...
                    // мы не лохи и не будем исользовать массивы и покажем влю мощь функци!
                    return 1;
                }
                System.out.println("no");
            }
            return 0;
        }

    public static  String  post_flag_gigachad(String arg){
        if (arg.equals("root")){

            arg=input_line();
        }
        return arg;

    }


    //убрать пробелы
    public static String delete_space(String arg){

        arg=arg.replaceAll(" ","");
        return arg;
    }


    //определить операцию, ее наличие
    public static int command(String arg){

     arg=arg.replaceAll("[a-zA-Z0-9]","");
        if (arg.length()!=1) {
            System.out.println("throws Exception (lost right math operator)");
            return 0; // болььше одного символа

        }
        switch (arg)         {

            case "+":
                return 1;
            case "-":
                return 2;
            case "*":
                return 3;
            case "/":
                return 4;


            default:
                System.out.println("throws Exception (lost right math operator)");
                return 0;
        }


    }

    //разбить  на эллементы массива: разделение пробелом
    public static String[] cut(String arg){

       arg=arg.replaceAll("[^a-zA-Z0-9]"," ");
        String[] str=arg.split(" ");

       return str;
    }

    public static int we_loozy(String[] arg){
            if (arg[0].equals(arg[0].replaceAll("[^0-9]",""))&arg[1].equals(arg[1].replaceAll("[^0-9]",""))
            |  arg[0].equals(arg[0].replaceAll("[^IVXLCDM]",""))&arg[1].equals(arg[1].replaceAll("[^IVXLCDM]",""))
            ){
                return 0;
            }
            return 1;
    }

    public static double math(String[] arg,int num_command,int flag_gigachad){

            double x=0;
            double y=0;
            double sum=0;
            double temp;
           if (!arg[0].equals(arg[0].replaceAll("[^0-9]","")))
           {
               temp=romanToDecimal(arg[0]);
               if(temp>10&flag_gigachad==0){
                   System.out.println("throws Exception //yu now de wey (less or equal 10 of number)");
                   System.exit(0);
               }
               x=x+temp;

           }
           else
           {
               temp=new Integer(arg[0]);
               if(temp>10&flag_gigachad==0){
                   System.out.println("throws Exception //yu now de wey (less or equal 10 of number)");
                   System.exit(0);
               }
               x=x+temp ;
           }
           ;
        if (!arg[1].equals(arg[1].replaceAll("[^0-9]","")))
        {
            temp=romanToDecimal(arg[1]);
            if(temp>10&flag_gigachad==0){
                System.out.println("throws Exception //yu now de wey (less or equal 10 of number)");
                System.exit(0);
            }
            y=y+temp;
        }
        else
        {
            temp=new Integer(arg[1]);
            if(temp>10&flag_gigachad==0){
                System.out.println("throws Exception //yu now de wey (less or equal 10 of number)");
                System.exit(0);
            }
            y=y+temp ;
        };

        switch (num_command)
        {
            case 1://+
                sum=x+y;
                break;
            case 2://-
                sum=x-y;
                break;
            case 3://*
                sum=x*y;
                break;
            case 4:///
                sum=x/y;
                break;

        }

        return sum;
    }



    public  static void main(String[] args) {

        int flag_gigachad=0;
        int num_command=0;
        int flag_not_arabic_for_loozy=0;
         System.out.println("Hello world!");
        double x=0;


        while (true) {
            num_command=0;
            String str = input_line();
            if (str.equals("exit")&flag_gigachad==1)
            {
                System.out.println("goodbye bro");
                break;
            }
                if (str.equals("root")&flag_gigachad==0) {
                    flag_gigachad = check_super_mod(str);
                    continue;
                }

            str = delete_space(str);

            if (num_command == 0) {
                num_command = command(str);
                if (num_command == 0&flag_gigachad==1) {continue;}
                if (num_command == 0&flag_gigachad==0){break;}
            }

            String[] strr =cut(str);
            if (flag_gigachad==0) {
                int flag_loozy=we_loozy(strr);
                if (flag_loozy==1) {System.out.println("throws Exception (only arabic or only rimicus cifrus)"); break;}
                if (!strr[0].equals(strr[0].replaceAll("[^0-9]",""))|!strr[1].equals(strr[1].replaceAll("[^0-9]",""))) {
                    flag_not_arabic_for_loozy=1;
                };
                };

            x=math(strr,num_command,flag_gigachad);
            if (flag_not_arabic_for_loozy==1)
            {
                if (x<1)
                {
                    System.out.println("throws Exception //romus not degree 0");
                    break;
                }
                double tmp=new BigDecimal(x).setScale(0, RoundingMode.DOWN).doubleValue();
                int y=(int)tmp;
                str=RomanNumber.toRoman(y);
                System.out.println(str);
                break;
            }




            if (flag_gigachad==0)
            {
                System.out.println((int)x);
                break;
            }

            System.out.println(x);
        }


    }




    public static int romanToDecimal(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
       // String romanNumeral = romanNumber.toUpperCase();
    /* operation to be performed on upper cases even if user
       enters roman values in lower case chars */
        for (int x = romanNumber.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumber.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        return decimal;
    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

    public static class RomanNumber {

        private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        static {

            map.put(1000, "M");
            map.put(900, "CM");
            map.put(500, "D");
            map.put(400, "CD");
            map.put(100, "C");
            map.put(90, "XC");
            map.put(50, "L");
            map.put(40, "XL");
            map.put(10, "X");
            map.put(9, "IX");
            map.put(5, "V");
            map.put(4, "IV");
            map.put(1, "I");

        }

        public final static String toRoman(int number) {
            int l =  map.floorKey(number);
            if ( number == l ) {
                return map.get(number);
            }
            return map.get(l) + toRoman(number-l);
        }

    }


}

