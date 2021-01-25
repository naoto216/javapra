/** ジャンケン プレイヤの抽象クラス */
public abstract class Player {
    protected String name;     // プレイヤの名前
    protected int    matches;  // matches回勝負(matches回先に勝った方が勝ち)
    protected int    wins;     // プレイヤの勝利数
    protected int    losts;    // プレイヤの負け数

    /** コンストラクタ, プレイヤの名前を指定する */
    public Player(String name) {
	this.name = name;   // プレイヤの名前
	wins = losts = 0;   // 勝敗を初期化
    }

    /** プレイヤの名前を返す */
    public String getName() {
	return name;
    }

    /** 何回勝負か設定するメソッド
     */
    public void setMatches(int matches) {
	this.matches = matches;
    }

    /** 
     *   勝ったことを知らされるメソッド
     */
    public void youWon() {
	wins++;
    }

    /** 
     *   負けたことを知らされるメソッド
     */
    public void youLost() {
	losts++;
    }


    /** match回目の勝負のnum回目のプレイヤの手を出す
     *   抽象メソッドなので，サブクラスでオーバーライドする
     */
    public abstract Hand showHand(int match, int num);
}
