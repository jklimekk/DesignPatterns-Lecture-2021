package chainOfResponsibility;

public interface Handler {
    void handle(Money money);
    void setNextHandler(Handler nextHandler);
}

class Withdraw5 implements Handler{
    private Handler nextHandler;
    @Override
    public void handle(Money money) {
        if(money.getValue() >= 5){
            int noteNumber = money.getValue()/5;
            int change = money.getValue()%5;
            System.out.println("banknoty 5 = " + noteNumber);
            if (change > 0){
                System.out.println("bankomat nie ma takiej gotówki");
            }
        }
        else{
            System.out.println("bankomat nie ma takiej gotówki");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

class Withdraw10 implements Handler{
    private Handler nextHandler;
    @Override
    public void handle(Money money) {
        if(money.getValue() >= 10){
            int noteNumber = money.getValue()/10;
            int change = money.getValue()%10;
            System.out.println("banknoty 10 = " + noteNumber);
            if (change > 0){
                nextHandler.handle(new Money(change));
            }
        }
        else{
            nextHandler.handle(money);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}


