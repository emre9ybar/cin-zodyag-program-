    import java.util.Scanner ;

    public class uçakBileti {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
        //
        //Çin Zodyağı nedir?
        //
        //4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
        //
        //Çin Zodyağı nasıl hesaplanır?
        //
        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        int doğumtarihi;
        int bölüm = 12;

        System.out.print("Doğum Tarihinizi Giriniz : ");
        doğumtarihi = scan.nextInt();

        int kalan = doğumtarihi % bölüm;
        System.out.println("Doğum Tarihinizin Kalanı : " + kalan + " Sayıyısıdır. ");

        if (kalan == 1)
        {System.out.println("Horoz") ;} else {

        }if  (kalan==2){
            System.out.println("köpek");}else {

        }if (kalan==3){
            System.out.println("domuz");}else {

        } if (kalan==4){
            System.out.println("fare");}else {

        } if (kalan==5) {
            System.out.println("öküz");}else {


        } if (kalan==6) {
            System.out.println("kaplan");}else {


        }if (kalan==7){
            System.out.println("tavşan");}else {


        }if (kalan==8){
            System.out.println("yılan");}else {


        } if (kalan==9) {
            System.out.println("yılan");}else {


        if (kalan==10){
            System.out.println("at");}else {


        if (kalan==11){
            System.out.println("koyun");}else {


        }


            }
        }











        }}





















