package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")//Test를 실행하였을때
    void vip_o(){
        //given
        Member member = new Member(1L,"memberVIP", Grade.VIP);

        //when
        int discount = rateDiscountPolicy.discount(member,10000);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    //직접 작성해보기
    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 ㅎ나다.")
    void vip_x(){
        //given
        Member member = new Member(2L,"memverBasic",Grade.BASIC); //값을 가지고 온다음

        //when
        int discount = rateDiscountPolicy.discount(member,10000);

        //then
        Assertions.assertThat(discount).isEqualTo(0);
    }
}