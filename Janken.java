/** ジャンケンを開始するためのクラス */
public class Janken {
    public static void main(String args[]) {
	try {
	    ThreeJudge judge = new ThreeJudge(); // 審判の作成

	    // プレイヤの作成と審判への登録
	    Player Toi1 = new CustomComputerPlayer("Toi1");
	    judge.registPlayer(Toi1);
		Player jhon = new NormalComputerPlayer("Jhon");
	    judge.registPlayer(jhon);
	    Player paul = new NormalComputerPlayer("Paul");
	    judge.registPlayer(paul);

	    // 3回勝負でジャンケンの開始
	    judge.startJankens(3);
	}
	catch (JankenException e) {
	    System.err.println("Error: " + e.getMessage());
	}
    }
}
