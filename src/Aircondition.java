import java.lang.String;
import java.util.Scanner;

public class Aircondition
{
    private int length, height , depth;
    private String brand;
    private String devname;
    private String typedev;
    private int katen;
    private String typosleit;
    private int guar , onomaapod , energklash , add;

    /** me to set arxikopoioume tis parapanw times */


    public void Setlength(int length){this.length = length;}
    public void Setheight(int height){this.height = height;}
    public void Setdepth(int depth){this.depth = depth;}
    public void Setbrand(String brand){this.brand = brand;}
    public void Setdevname(String devname){this.devname = devname;}
    public void Settypedev(String typedev){this.typedev = typedev;}
    public void Setkaten(int katen){this.katen = katen;}
    public void Settyposleit(String typosleit){this.typosleit = typosleit;}
    public void Setguar(int guar){this.guar = guar;}
    public void Setonomaapod(int onomaapod){this.onomaapod = onomaapod ;}
    public void Setenergklash (int energklash){this. energklash = energklash;}
    public void Setadd (int add){this.add =add ;}

    /** me to get tha epistrefoume autes tis times */

    public int Getlength(){return length;}
    public int Getheight(){return height;}
    public int Getdepth(){return depth;}
    public String Getbrand(){return brand;}
    public String Getdevname(){return devname;}
    public String Gettypedev(){return typedev;}
    public int Getkaten(){return katen;}
    public String Gettyposleit(){return typosleit;}
    public int Getguar(){return guar;}
    public int Getonomaapod(){return onomaapod;}
    public int Getenergklash(){return energklash;}
    public int Getadd(){return add;}
    static int AirCounter = 0;
    /** epistrefoume to plhthos twn suskeuwn */

    public int AirCounter()
    {
        System.out.printf("AirConditions: ");
        return AirCounter;
    }
    Aircondition(int length, int height, int depth, int katen, int guar, int onomaapod, int energklash, int add, String typosleit, String typedev, String brand, String devname)
    {
        try
        {
            Setlength(length);
            Setheight(height);
            Setdepth(depth);
            Setbrand(brand);
            Setdevname(devname);
            Settypedev(typedev);
            Setkaten(katen);
            Settyposleit(typosleit);
            Setguar(guar);
            Setonomaapod(onomaapod);
            Setenergklash(energklash);
            Setadd(add);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        AirCounter = AirCounter + 1;
        Display();
    }
    public void Display()
    {
        System.out.printf("typedev: %s\n",Gettypedev());
        System.out.printf("Kataskeuasths: %s\n" , Getbrand());
        System.out.printf("%s - height:%dcm, length:%dcm, depth:%dcm\nkaten(ethsia): %dkW/h guar: %d€\n",Getdevname(),Getheight(),Getlength(),Getdepth(),Getkaten(),Getguar());
        System.out.printf("Onoma apodoshs: %dW/W, Typos leitourgias: %dW/W\ntyposleit: %s onomaapod: %ddb\n\n",Getonomaapod(),Getenergklash(),Gettyposleit(),Getonomaapod());
    }
    private void periodicMantainance(){}
}
