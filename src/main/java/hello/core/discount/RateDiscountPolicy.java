package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

//조건에 맞게 내가 직접 작성해본 코드
public class RateDiscountPolicy implements DiscountPolicy{

    private int Percent = 10; //10%

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return price*Percent/100;
        }else{
            return 0;
        }
    }
}
