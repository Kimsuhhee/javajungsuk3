package basic_practiceCH7.Exercise7_10;

public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 t =new MyTv2();

        t.setChannel(10);
        System.out.println("CH: "+t.getChannel());
        t.setChannel(20);
        System.out.println("CH: "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: "+t.getChannel());

    }
}
