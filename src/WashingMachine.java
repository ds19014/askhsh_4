import java.lang.String;
import java.util.Scanner;

public class WashingMachine
{
    private int length;
    private int height;
    private int depth;
    private String brand;
    private String devname;
    private int typedev;
    private String katen;
    private int ecofun;
    private int manweb;
    private int add;
    private int programms;


    public void Setlength(int length){this.length = length;}
    public void Setheight(int height){this.height = height;}
    public void Setdepth(int depth){this.depth = depth;}
    public void Setbrand(String brand){this.brand = brand;}
    public void Setdevname(String devname){this.devname = devname;}
    public void Settypedev(int typedev){this.typedev = typedev;}
    public void Setkaten(String katen){this.katen = katen;}
    public void Setecofun(int ecofun){this.ecofun = ecofun;}
    public void Setmanweb(int manweb){this.manweb = manweb;}
    public void Setadd(int add){this.add = add;}
    public void Setprogramms(int programms){this.programms = programms;}


    public int Getlength(){return length;}
    public int Getheight(){return height;}
    public int Getdepth(){return depth;}
    public String Getbrand(){return brand;}
    public String Getdevname(){return devname;}
    public int Gettypedev(){return typedev;}
    public String Getkaten(){return katen;}
    public int Getecofun(){return ecofun;}
    public int Getmanweb(){return manweb;}
    public int Getadd(){return add;}
    public int Getprogramms(){return programms;}
    static int MachineCounter = 0;


    public int MachineCounter()
    {
        System.out.printf("WashineMashines: ");
        return MachineCounter;
    }
    WashingMachine(int length,int height,int depth,int typedev,int ecofun,int manweb,int programms,String katen,String brand,String devname)
    {
        try
        {
            Setlength(length);
            Setheight(height);
            Setdepth(depth);
            Settypedev(typedev);
            Setecofun(ecofun);
            Setmanweb(manweb);
            Setadd(add);
            Setkaten(katen);
            Setbrand(brand);
            Setdevname(devname);
            Setprogramms(programms);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        MachineCounter = MachineCounter + 1;
        Display();
    }
    public void Display()
    {
        System.out.printf("Brand: %s\n" , Getbrand());
        System.out.printf("%s - height:%dcm, length:%dcm, depth:%dcm\ntypedev(ethsia): %dkW/h ecofun: %d€\n",Getdevname(),Getheight(),Getlength(),Getdepth(),Gettypedev(),Getecofun());
        System.out.printf("manweb: %d/Min, Programms: %d\nkaten: %s add: %dkg\n\n",Getmanweb(),Getkaten(),Getadd(),Getprogramms());
    }
    private void periodicMantainance(){}
}
