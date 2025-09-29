package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        // 1. 자동차 객체 생성
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] names = Console.readLine().split(",");
        ArrayList<Car> cars = new ArrayList<>(); // cars -> List
        for (String name : names) {
            cars.add(new Car(name)); // Car 객체 생성 후 arraylist에 담음
        }

        // 2. 횟수만큼 반복
        System.out.println("시도할 회수는 몇회인가요?");
        int attemps = Integer.parseInt(Console.readLine());

        for (int i = 0; i < attemps; i++){
            for(Car car : cars){ // car -> Car 객체
                car.move();
                System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
            }
        }

        // 3. 결과 출력
       int max_position = 0;
        for(Car car : cars){
            if(car.getPosition() > max_position){
                max_position = car.getPosition();
            }
        } // max position 갱신 완료

        ArrayList<String> winners = new ArrayList<>();

        for(Car car : cars){
            if(car.getPosition() == max_position){
                winners.add(car.getName());
            }
        } // winners에 갱신 완료

        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}