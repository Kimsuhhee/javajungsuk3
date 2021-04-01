package basic_practiceCH7.Exercise7_1;

public class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;

    }

    @Override
    public String toString() {
        return num +(isKwang ? "K":"" );
    }
}
