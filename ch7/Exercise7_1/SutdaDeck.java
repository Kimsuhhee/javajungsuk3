package basic_practiceCH7.Exercise7_1;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    
    SutdaDeck(){
        //배열 SutdaCard를 적절히 초기화 하시오
        for(int i=0;i<cards.length;i++){
            int num = i%10+1;
            boolean isKwang = ((i<10) && (num==1||num==3||num==8));
            cards[i]=new SutdaCard(num,isKwang);
        }
    }

    public void shuffle(){
        //배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
        for(int i=0;i<cards.length*2;i++){
            int j =(int)(Math.random()*cards.length);
            int k =(int)(Math.random()*cards.length);

            SutdaCard tmp = cards[j];
            cards[j]=cards[k];
            cards[k]=tmp;
        }
    }
    public SutdaCard pick(int index){
        //배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
        return cards[index];
    }
    public SutdaCard pick(){
        //배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
        int index = (int)(Math.random()*cards.length);
        return pick(index);
    }
}
