package baseball;

import utils.OutputView;
import java.util.Scanner;
import static utils.Constant.*;

public class BaseballGame {

    private Player player;
    private Computer computer;
    private int strike;
    private int ball;

    public BaseballGame(Scanner scanner) {
        computer = new Computer();
        computer.setBalls();
        player = new Player(scanner);
        strike = 0;
        ball = 0;
    }

    public void inputPlayerBalls(){
        player.inputBalls();
    }

    public void getHint(){
        compareBalls();
        OutputView.printHint(strike, ball);
    }

    public void compareBalls(){
        strike = CompareBalls.getStrikeCount(computer.getBalls(), player.getBalls());
        ball = CompareBalls.getBallCount(computer.getBalls(), player.getBalls());
    }

}
