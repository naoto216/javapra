public class CustomComputerPlayer extends Player {
    protected Hand  goo, choki, par;
    protected java.util.Random random; // 手を決めるときに使う乱数

    /** コンストラクタ, プレイヤの名前を指定する */
    public CustomComputerPlayer(String name) {
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
        int hand = random.nextInt(10);
        if (0 <= hand && hand <= 2) {
            return par;
        } else if (3 <= hand && hand <= 5 ) {
            return choki;
        } else {
            return goo;
        }
    }
}
