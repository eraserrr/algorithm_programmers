import java.util.*;
class Player implements Comparable<Player> {
    int num = 0;
    public Player(int num) {
        this.num = num;
    }
    public int compareTo(Player o) {
        return num - o.num;
    }
    public String toString() {
        return this.num + "";
    }
}
public class Sort {
    public static void main(String[] args) {
        int arr[] = {4,5,1,6,32};

        // 일반적인 배열 sort
//        Arrays.sort(arr);
//        for (int i :arr){
//            System.out.println(i);
//        }

        //Comparable 인터페이스 : 객체의 정렬 기준을 정해준다
        List<Player> players = new ArrayList<>();
        players.add(new Player(3));
        players.add(new Player(1));
        players.add(new Player(2));

        Collections.sort(players);
        System.out.println(players.toString());

        //Comparator 객체 사용 : 정렬 대상 클래스의 코드를 직접 수정할 수 없는 경우
        //                      혹은 정렬 기준을 변경하고 싶을 때에
        //Comparator 인터페이스의 구현체를 Arrays.sort()나 Collections.sort()
        // 와 같은 정렬 메서드에 추가하는 방식

        Comparator<Player> comparator = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.num - o1.num;
            }
        };

        Collections.sort(players, comparator);
        System.out.println(players.toString());

        // Comparator 객체는 메서드가 하나뿐인 함수형 인터페이스를 구현
        // 한 것이기 때문에 람다함수로 대체가 가능하다

        Collections.sort(players, (a, b) -> {
            if (a.num > b.num) {
                return 1;
            }
            if (a.num == b.num) {
                return 0;
            }
            return -1;
        });

    }
}
