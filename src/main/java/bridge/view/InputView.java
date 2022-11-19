package bridge.view;

import camp.nextstep.edu.missionutils.Console;

import static bridge.config.BaseException.INVALID_INPUT;
import static bridge.config.Constant.QUIT;
import static bridge.config.Constant.RETRY;
import static bridge.config.Message.SELECT_GAME_RETRY;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return 0;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println(SELECT_GAME_RETRY);
        String result = Console.readLine();
        if (!(result.equals(RETRY)) | !(result.equals(QUIT))) {
            throw new IllegalArgumentException(INVALID_INPUT.getMessage());
        }
        return result;
    }

}
