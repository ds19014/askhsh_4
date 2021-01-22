import java.lang.String;
import java.util.Scanner;
public class Fridge
{
    private int length;
    private int height;
    private String depth;
    private String brand;
    private String devname;
    private String typedev ;
    private int katen;
    private String ecofun;
    private int manweb;
    private int add;
    private int programms;


    public void Setlength(int length){this.length = length;}
    public void Setheight(int height){this.height = height;}
    public void Setbrand(String brand){this.brand = brand;}
    public void Setdevname(String devname){this.devname = devname;}
    public void Settypedev (String typedev ){this.typedev  = typedev ;}
    public void Setkaten(int katen){this.katen = katen;}
    public void Setecofun(String ecofun){this.ecofun = ecofun;}
    public void Setmanweb(int manweb){this.manweb = manweb;}
    public void Setprogramms(int programms){this.programms = programms;}
    public void Setadd(int add){this.add = add;}


    public int Getlength(){return length;}
    public int Getheight(){return height;}
    public String Getbrand(){return brand;}
    public String Getdevname(){return devname;}
    public String Gettypedev (){return typedev ;}
    public int Getkaten(){return katen;}
    public String Getecofun(){return ecofun;}
    public int Getmanweb(){return manweb;}
    public int Getprogramms(){return programms;}
    public int Getadd(){return add;}
    static int FridgeCounter = 0;


    public int FridgeCounter()
    {
        System.out.printf("Fridges: ");
        return FridgeCounter;
    }
    Fridge( int length,int height,int katen,int manweb,int add,int programms,String depth,String brand ,String devname,String typedev, String ecofun)
    {
        try
        {
            Setlength(length);
            Setheight(height);
            Setkaten(katen);
            Setmanweb(manweb);
            Setprogramms(programms);
            Setadd(add);
            Settypedev (typedev );
            Setecofun(ecofun);
            Setbrand(brand);
            Setdevname(devname);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        FridgeCounter = FridgeCounter + 1;
        Display();
    }
    public void Display()
    {
        System.out.printf("typedev : %s\n",Gettypedev ());
        System.out.printf("brand: %s\n" , Getbrand());
        System.out.printf("%s - height:%dcm, length:%dcm, depth:%dcm\nkaten(ethsia): %dkW/h manweb: %d€\n",Getdevname(),Getheight(),Getlength(),Getkaten(),Getmanweb());
        System.out.printf("add: %ddb programms: %dlt\necofun: %s add: %d\n\n",Getprogramms(),Getecofun(),Getadd());
    }
    private void periodicMantainance(){ }
}
