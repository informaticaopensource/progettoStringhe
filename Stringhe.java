public class Stringhe
{
    private String strA;
    private String strB;
    private String strC;
    public Stringhe(String x, String y, String z)
    {

        strA=x;
        strB=y;
        strC=z;
    }
    public String getstrA(){return strA;}
    public void setstrA(String x){ strA=x;}
    public String getstrB(){return strB;}
    public void setstrB(String x){ strB=x;}
    public String getstrC(){return strC;}
    public void setstrC(String x){ strC=x;}
    public void OrdinaStringhe()
    {  
        if (strA.compareToIgnoreCase(strB)<0)
            if (strA.compareToIgnoreCase(strC)<0)
                if (strB.compareToIgnoreCase(strC)<0)
                    System.out.println(strA+","+strB+","+strC);
                else
                        System.out.println(strA+","+strC+","+strB);
            else   
                if (strB.compareToIgnoreCase(strC)<0)
                    if (strA.compareToIgnoreCase(strC)<0)
                        System.out.println(strB+","+strA+","+strC);
                    else
                        System.out.println(strB+","+strC+","+strA);
                else   
                    if (strB.compareToIgnoreCase(strA)<0)
                        System.out.println(strC+","+strB+","+strA);
                    else
                        System.out.println(strC+","+strA+","+strB);
    }
public String toString()
{
    return strA+","+strB+","+strC+"\n";
}
    
}


