import java.util.Scanner;

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


    //определить операцию, ее наличие, заменить на пробел
    public static int command(String arg){

     arg=arg.replaceAll("[a-zA-Z0-9]","");
        if (arg.length()!=1) {
            System.out.println("throws Exception (lost right math operator)");
            return 0; // болььше одного символа

        }
        switch (arg)
        {

            case "+":
                return 1;
            case "-":
                return 2;
            case "*":
                return 3;
            case "/":
                return 4;
            case "^":
                return 5;

            default:
                System.out.println("throws Exception (lost right math operator)");
                return 0;
        }


    }

    //разбить  на эллементы массива: разделение пробелом
    public static double cut(){


    }
    public  static void main(String[] args) {

        int flag_gigachad=0;
        int num_command=0;
         System.out.println("Hello world!");




        while (true) {

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
            }



            if (flag_gigachad==0)
            {
                System.out.println("end");
                break;
            }
        }


    }


}

