import java.util.Scanner;

public class Auth{

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        String us="Patikadev";
        String ps="Java";
        System.out.println("Please input your username" );
        String gir=s.nextLine();
        System.out.println("Please input your  Password" );
        String sif=s.nextLine();

        if(us.equals(gir)&&ps.equals(sif)){
            System.out.println("Succeded");

        }else{
            System.out.println("log in failed. Do you want to renew yout password? please input y or n");
            String cvp=s.nextLine();
            if(cvp.equals("y")){

                System.out.println("please input a new password. it must be different then previous");
                String yeni=s.nextLine();
                if(yeni.equals(ps)||yeni.equals(sif)){
                    System.out.println("new password must be different" );
                }else{
                    ps=yeni;
                    System.out.println("new password is: "+ps );
                }
            }
        }
        System.out.println("Good bye");
    }


}
