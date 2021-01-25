/** ジャンケン の通常のコンピュータ プレイヤ */
public class NormalComputerPlayer extends Player {
    protected Hand  goo, choki, par;
    protected java.util.Random random; // 手を決めるときに使う乱数

    /** コンストラクタ, プレイヤの名前を指定する */
    public NormalComputerPlayer(String name) {
	super(name);
	// 手を設定する
	goo = new Goo();
	choki = new Choki();
	par = new Par();
	random = new java.util.Random();
    }

    /** match回目の勝負のnum回目のプレイヤの手を出す
     *  Player の showHand をオーバーライド
     */
    public Hand showHand(int match, int num) {
	int hand = random.nextInt(3);
	if (hand == 0) {
	    return goo;
	} else if (hand == 1) {
	    return choki;
	} else {
	    return par;
	}
    }
}
