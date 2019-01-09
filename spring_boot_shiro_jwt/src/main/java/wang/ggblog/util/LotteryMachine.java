package wang.ggblog.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wanghuan
 */
public class LotteryMachine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入最大的球");
    int max = scanner.nextInt();
    System.out.println("生成摇奖机");
    ArrayList<Integer> balls = new ArrayList<>();
    for (int i = 1; i < max + 1; i++) {
      balls.add(i);
    }
    System.out.println("生成摇奖机完成");
    System.out.println("需要摇出几个球?");
    int number = scanner.nextInt();
    for (int i = 1; i < number + 1; i++) {
      System.out.println("开始生成第" + i + "个球" + getRandomBall(balls));
    }
    System.out.println("生成完成!祝您中奖");
  }

  private static Integer getRandomBall(List<Integer> balls) {
    int index = (int) (Math.random() * (balls.size() - 1));
    Integer result = balls.get(index);
    balls.remove(index);
    return result;
  }
}
