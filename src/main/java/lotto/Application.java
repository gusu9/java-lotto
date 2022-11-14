package lotto;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import lotto.Lotto;

public class Application {
    public static void main(String[] args) {

        Lotto lotto = new Lotto(Randoms.pickUniqueNumbersInRange(1, 45, 6));
//        Buyer buyer = new Buyer();
        List<Integer> lottoNumbers = null;

        System.out.println("구입금액을 입력해주세요: ");
        int money = Integer.parseInt(Console.readLine());

        int quantity = money/1000;

        for (int i = 0; i<quantity; i++) {
            lottoNumbers = lotto.numbers();
            Collections.sort(lottoNumbers);
            System.out.println(lottoNumbers);
        }
        System.out.println(lottoNumbers);

        System.out.println("당첨번호를 입력해주세요: ");
        String buyerNum = Console.readLine();
        int[] digits = Stream.of(buyerNum.split(",")).mapToInt(Integer::parseInt).toArray();
        List<Integer> buyer = new ArrayList<>(6);
        for (int order = 0; order < digits.length; order++) {
            buyer.add(digits[order]);
        }

        Collections.sort(buyer);
        System.out.println(buyer);

//        List<String> compare = lottoNumbers.stream().filter(old -> buyer.stream().anyMatch(Predicate.isEqual(old)));
        lottoNumbers.removeAll(buyer);
        System.out.println(lottoNumbers);





    }
//        lotto.getNumbers();
//        System.out.println(lotto.getNumbers());
////        while (bonus.getBonusNum().contains(lotto)) {
////            bonus.getBonusNum();
////        }
//        System.out.println(lotto.getNumbers());
////        System.out.println(bonus.getBonusNum());
////
////        if (lotto.getNewNumbers().contains(bonus.getBonusNum())) {
////            System.out.println("Redundant");
////        } else {
////            System.out.println("Independent");
////        }
//
//    }
//List<Integer> bonusNum = new ArrayList<>();
//
//    while (bonusNum.size()<1){
//        int bonus = Randoms.pickNumberInRange(1,45);
//        if(!bonusNum.contains(lottoNumbers)){
//            bonusNum.add(bonus);
//            System.out.println(bonusNum);
//
//        }
//    }
}
