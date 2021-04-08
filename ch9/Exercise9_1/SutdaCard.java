package Exercise9_1;

public class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1,true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object obj) {
        //매개변수로 넘겨진 객체의 num, isKwang과
        //멤버변수 num, isKwang을 비교하도록 오버라이딩하시오
        SutdaCard temp = (SutdaCard)obj;
        if((temp.num == this.num) && (temp.isKwang == this.isKwang))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return num+(isKwang?"K":"");
    }
}
