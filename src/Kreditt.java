import java.util.Scanner;
//дійсно цікава задача :)
public class Kreditt {


    static void bank(int k) {
        int b = 0;
        int a=0;
        int kre=0;

        Scanner sca=new Scanner(System.in);
        System.out.println("Ваш внесок на наступний місяць ");
        do{

            a= sca.nextInt();

            a = kre + a;
            if (a == k) {
                System.out.println("ВІТАЄМО! \nВи закрили кредит");
            } else if (a > k) {
                int i = a - k;

                System.out.println("Ви переплатили "+i+" Ці кошти будуть надіслані на ЗСУ\n ДЯКУЮ , ЩО ВИ З НАМИ\n Гарного дня! ");
            } else {
                System.out.println("Ви ще не закрили кредит");
                b = k - a;
                kre=a;
                System.out.println("Вам потрібно ще заплатити " + b);

            }
        }while (k!=0);
    }





    public static void main(String[] args) {
        bank(700);


    }
}



