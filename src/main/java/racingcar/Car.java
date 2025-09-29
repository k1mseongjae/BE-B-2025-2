package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name){
        if(name.length() <= 5) { // 길이에 대한 예외처리
            this.name = name;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public void move(){
        if(Randoms.pickNumberInRange(0, 9) >= 4){
            this.position++;
        }
    }
    public String getName() {
        return name;
    }
    public int getPosition() {
        return position;
    }
}
