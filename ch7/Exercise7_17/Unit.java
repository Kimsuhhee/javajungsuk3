package basic_practiceCH7.Exercise7_17;

public abstract class Unit {
    int x, y;
    abstract void move(int x, int y);/* 지정된 위치로 이동 */

    void stop(){
        /* 현재 위치에서 정지 */
    }
}
