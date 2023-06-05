package ex04;

// 스택에서 사라질 데이터를 소중하게 들고 오려면 return을 해야한다.
class Account {
    // 입금(입금할 금액, 계좌 잔액)
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        return restMoney; // 메서드를 호출한 라인으로 값 반환
    }

    // 출금(출금할 금액 300, 계좌 잔액 money)
    int withdraw(int amount, int money) {
        int restMoney = money - amount;
        return restMoney; // 메서드를 호출한 라인으로 값 반환
    }

    // 이체 (보낼금액 : amount, 받는사람잔액 : receiverMoney, 보내는사람잔액 : senderMoney)
    void transfer(int amount, int receiverMoney, int senderMoney) {
        System.out.println(receiverMoney + amount);
        System.out.println(senderMoney - amount);
    }

}

public class Meth03 {
    public static void main(String[] args) {
        // 홍길동의 잔액
        int hMoney = 1000;

        // 임꺽정의 잔액
        int iMoney = 1000;

        // 홍길동이 입금을 2번하고, 출금 1번하기
        Account hAccount1 = new Account();
        hMoney = hAccount1.deposit(100, hMoney);
        System.out.println("홍길동님의 남은 금액 : " + hMoney);
        hMoney = hAccount1.deposit(500, hMoney);
        System.out.println("홍길동님의 남은 금액 : " + hMoney);
        hMoney = hAccount1.withdraw(300, hMoney);
        System.out.println("홍길동님의 남은 금액 : " + hMoney);

        System.out.println("--------------------------------------------------");

        // 임꺽정이 입금을 1번(100원)하고, 출금을 2번(300, 500)하기
        Account iAccount = new Account(); // 힙에 공간이 2개 생겼다 홍길동의 어카운트와 임꺽정의 어카운트
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("임쩍정님의 남은 금액 : " + iMoney);
        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("임쩍정님의 남은 금액 : " + iMoney);
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("임쩍정님의 남은 금액 : " + iMoney);

        System.out.println("--------------------------------------------------");

        // 이체하기
        iAccount.transfer(300, hMoney, iMoney);

    }
}
