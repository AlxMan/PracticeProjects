package model3.task5;

import java.util.*;

public class PlayCard {
    public static void main(String[] args) {
        //1. 声明列表
        List<OneCard> card = new LinkedList<>();
        //2. 因大王、小王没有花色且值最大，先单独插入列表 ，保证权重递减
        card.add(new OneCard(null, CardNumberEnum.CARD_DW, 54));
        card.add(new OneCard(null, CardNumberEnum.CARD_XW,53));
        int i = 0;
        //3. 初始化Card列表， 根据牌型大小插牌 权重依次递减
        for(CardNumberEnum number : CardNumberEnum.values()) { //牌面值
            if(number == CardNumberEnum.CARD_XW || number == CardNumberEnum.CARD_DW) continue; //跳过大王、小王
            for(CardColorEnum color : CardColorEnum.values()) { //牌花色
                card.add(new OneCard(color, number,52 - i++));
            }
        }
        //声明四个ArrayList集合
        List<OneCard> lA = new LinkedList<>();  //玩家1
        List<OneCard> lB = new LinkedList<>();  //玩家2
        List<OneCard> lC = new LinkedList<>();  //玩家3
        List<OneCard> lDP = new LinkedList<>(); //底牌

        int tmp = 0;
        Collections.shuffle(card);

        for(OneCard oc : card) {
            if(tmp >= 51) {
                lDP.add(oc);
                continue;
            };
            if(tmp%3 == 0) {
                lA.add(oc);
            } else if(tmp%3 == 1){
                lB.add(oc);
            } else {
                lC.add(oc);
            }
            tmp++;
        }
        //构造比较器对指定列表进行排序
        Comparator<OneCard> comparator = (OneCard o2, OneCard o1) -> {return o1.getValue() - o2.getValue();};
        Collections.sort(lDP, comparator);
        Collections.sort(lA, comparator);
        Collections.sort(lB, comparator);
        Collections.sort(lC, comparator);

        System.out.println("底牌:" + Arrays.toString(lDP.toArray()));
        System.out.println("玩家-1的牌型如下:" + Arrays.toString(lA.toArray()));
        System.out.println("玩家-2的牌型如下:" + Arrays.toString(lB.toArray()));
        System.out.println("玩家-3的牌型如下:" + Arrays.toString(lC.toArray()));
    }
}
