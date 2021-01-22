import java.lang.String;
import java.util.Scanner;

public class Oven
{
    private int length;
    private int height;
    private String depth;
    private String brand;
    private int devname;
    private String typedev;
    private int katen;
    private int xwrhthkothta;
    private int add;
    private int enklash;
    private int xrwma;


    public void Setlength(int length){this.length = length;}
    public void Setheight(int height){this.height = height;}
    public void Setdepth(String depth){this.depth = depth;}
    public void Setbrand(String brand){this.brand = brand;}
    public void Setdevname(int devname){this.devname = devname;}
    public void Settypedev(String typedev){this.typedev = typedev;}
    public void Setkaten(int katen){this.katen = katen;}
    public void Setxwrhthkothta(int xwrhthkothta){this.xwrhthkothta = xwrhthkothta;}
    public void Setadd(int add){this.add = add;}
    public void Setenklash(int enklash){this.enklash=enklash;}
    public void Setxrwma(int xrwma){this.xrwma=xrwma;}


    public int Getlength(){return length;}
    public int Getheight(){return height;}
    public String Getdepth(){return depth;}
    public String Getbrand(){return brand;}
    public int Getdevname(){return devname;}
    public String Gettypedev(){return typedev;}
    public int Getkaten(){return katen;}
    public int Getxwrhthkothta(){return xwrhthkothta;}
    public int Getadd(){return add;}
    public int Getenklash(){return enklash;}
    public int Getxrwma(){return xrwma;}
    static int OvenCounter = 0;


    public int OvenCounter()
    {
        System.out.printf("Ovens: ");
        return OvenCounter;
    }
    Oven(int length,int height,int devname,int katen,int xwrhthkothta,int add,int enklash,int xrwma,String typedev,String depth,String brand)
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
            Setxwrhthkothta(xwrhthkothta);
            Setadd(add);;
            Setenklash(enklash);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        OvenCounter = OvenCounter + 1;
        Display();
    }
    public void Display()
    {
        System.out.printf("Typos: %s\n");
        System.out.printf("Kataskeuasths: %s\n" , Getdepth());
        System.out.printf("%s - height:%dcm, length:%dcm, depth:%dcm\ndevname(ethsia): %dkW/h katen: %d€\n",Getbrand(),Getheight(),Getlength(),Getdevname(),Getkaten());
        System.out.printf("Enklash: %d, Xwritikothta: %dlt\ntypedev: %s Megisth add: %dC\n\n",Getxwrhthkothta(),Gettypedev(),Getadd());
    }
    private void periodicMantainance(){}

}