package basic_practiceCH7.Exercise7_19;

import java.util.Arrays;

public class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p){
        //가진돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
         if(p.price>this.money){
             System.out.println("잔액이 부족하여 "+p.toString()+"을 살수 없습니다.");
             return;
         }
        //가진돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
        //장바구니에 구입한 물건을 담는다.(add메서드 호출)
        money-=p.price;
        add(p);

    }

    void add(Product p){
        //i의 값이 장바구니의 크기보다 같거나 크면
        //기존의 장바구니보다 2배 큰 새로운 배열 을 생성한다.
        //기존의 장바구니의 내용을 새로운 배열에 복사한다.
        //새로운 장바구니와 기존의 장바구니를 바꾼다.
        //물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.

        if(i>=cart.length){
            Product[]temp = new Product[cart.length*2];
            System.arraycopy(cart,0,temp,0,cart.length);
            cart=temp;
        }
        cart[i++]=p;

    }

    void summary(){
        String list = "";
        int sum = 0;
        //장바구니에 담긴 물건들의 목록을 만들어 출력한다.
        //장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
        for(int i=0;i<cart.length;i++){
            list+=cart[i].toString();
            list+=",";
            sum+=cart[i].price;
        }
        System.out.println("구입한 물건: "+list);
        System.out.println("사용한 금액: "+sum);

        //물건을 사고 남은 금액(money)을 출력한다.
        System.out.println("남은 금액: "+ money);

    }
}
