package basic_practiceCH6.Exercise6_2;

public class SutdaCard {
    private int num;
    private boolean isKwang;

    public SutdaCard(){
        this(1,true);
    }

    public SutdaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }

    public String info(){
        if(this.isKwang){
            return num+"K";
        }
        else return num+"";
    }
}
