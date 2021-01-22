    import java.lang.String;
    import java.util.Scanner;

    public class homeappliancesstore
    {

        public static String onet ;
        public static String dietair ;
        public static int plypal;

        public static void main(String[] args)
        {
            try {
                Scanner myObj = new Scanner(System.in);
                System.out.println("Dose onoma etairias: ");
                String Namecomp = myObj.nextLine();
                if (Namecomp.equals(" "))
                {
                    System.out.println("Error ");
                }

                {
                    Scanner myObj2 = new Scanner(System.in);
                    System.out.println("Dwse thn dieuthinsh ths etairias: ");
                    String Idcomp = myObj2.nextLine();
                    if (Idcomp.equals(" "))
                    {
                        System.out.println("Error");
                    }
                }

                {
                    Scanner myObj3 = new Scanner(System.in);
                    System.out.println("Posoi yparxoun sthn etairia : ");
                    int Stuffcomp = Integer.parseInt(myObj3.nextLine());
                    if (Stuffcomp == 0 || Stuffcomp < 0 )
                    {
                        System.out.println("Error");
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(onet);
                System.out.println(dietair);
                System.out.println(plypal);
            }
        }
    }