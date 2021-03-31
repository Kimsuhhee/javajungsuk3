package basic_practiceCH6.Exercise6_3;

public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }

    public String info(){
        return name +","+ this.ban +","+this.no+","+this.kor+","+this.eng+","+this.math+","+getTotal()+","+getAverage();
    }
    public int getTotal(){
        return this.kor+this.eng+this.math;
    }

    public float getAverage(){
        return (int)(getTotal()/3f*10+0.5f)/10f;
    }
}
