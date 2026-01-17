import java.util.Scanner;
class Test
{
    public static void main(String[] args)
    {
        String a="Ciao Pasquale";
        String b="Ciao Nicola !";
        String c="Ciao Maria come Stai ?";
        Stringhe st=new Stringhe (a,b,c);
        st.OrdinaStringhe();
        System.out.println(st.toString());
        System.out.println("***********************************************");
        System.out.println("Richiesta inserimento dati:");
        System.out.println("***********************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci tre testi separati da un invio:");
        a=sc.nextLine();
        b=sc.nextLine();
        c=sc.nextLine();
        Stringhe st1= new Stringhe(a,b,c);
        st1.OrdinaStringhe();
        System.out.println("Arrivederci !");
    }

}
