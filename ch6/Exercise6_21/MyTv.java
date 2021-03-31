package basic_practiceCH6.Exercise6_21;

public class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    
    void turnOnOff(){
        isPowerOn= !isPowerOn;
        //isPowerOn의 값이 true면 false로 false면 true로 바꿈
    }
    void volumeUp(){
        //volume의 값이 MAX_VOLUME보다 작을때만 값을 1증가
        if(this.volume<MAX_VOLUME)this.volume++;
    }
    void volumeDown(){
        //volume의 값이 MIN_VOLUME보다 클때만 값을 1감소
        if(this.volume>MIN_VOLUME)this.volume--;
    }
    void channelUp(){
        //channel이 MAX_CHANNEL이면, channel값을 MIN_CHANNEL로 바꿈
        if(this.channel==MAX_CHANNEL)
            this.channel=MIN_CHANNEL;
        else//channel의 값을 1증가
            this.channel++;

    }
    void channelDown(){
        //channel이 MIN_CHANNEL이면, channel값을 MAX_CHANNEL로 바꿈
        if(this.channel==MIN_CHANNEL)
            this.channel=MAX_CHANNEL;
        else //channel의 값을 1감소
            this.channel--;

    }
}
