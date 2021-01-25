import javax.swing.*;

/** じゃんけん の審判のクラス */
public class ThreeJudge extends Judge {
   

    /** コンストラクタ */
    public ThreeJudge() {
        // 3人のプレイヤの配列を作成し、各要素はnullに初期化
        players = new Player[3];
        players[0] = players[1] = players[2] = null;

        // プレイヤの数は0に初期化
        numOfPlayers = 0;  

        // 3人の勝ち星数の配列を作成し、各要素を0に初期化
        wins = new int[3];
        wins[0] = wins[1] = wins[2] = 0;
    }

    /** ジャンケンの勝負を判定をする。
     *   勝負がついた場合は 勝者のPlayerの配列を返す。
     *   あいこの場合は null を返す。
    */
    protected Player[] judge(Hand hands[]) {
	
    Player[] winner;
     if ((hands[0] instanceof Goo  && hands[1] instanceof Choki && hands[2] instanceof Choki)
	    || (hands[0] instanceof Choki  && hands[1] instanceof Par && hands[2] instanceof Par)
	    || (hands[0] instanceof Par && hands[1] instanceof Goo && hands[2] instanceof Goo)){
        winner  = new Player[1];
        winner[0] = players[0];
        wins[0]++;
        } else if ((hands[0] instanceof Goo  && hands[1] instanceof Goo && hands[2] instanceof Choki)
        || (hands[0] instanceof Choki  && hands[1] instanceof Choki && hands[2] instanceof Par)
	    || (hands[0] instanceof Par && hands[1] instanceof Par && hands[2] instanceof Goo)){
        winner  = new Player[2];
        winner[0] = players[0];
        winner[1] = players[1];
        wins[0]++;
        wins[1]++;   
        } else if((hands[0] instanceof Choki  && hands[1] instanceof Par && hands[2] instanceof Choki)
	    || (hands[0] instanceof Par && hands[1] instanceof Goo && hands[2] instanceof Par)
	    || (hands[0] instanceof Goo && hands[1] instanceof Choki && hands[2] instanceof Goo)){
        winner  = new Player[2];
        winner[0] = players[0];
        winner[1] = players[2];
        wins[0]++;
        wins[2]++;   
        } else if ((hands[1] instanceof Goo  && hands[0] instanceof Choki && hands[2] instanceof Choki)
	    || (hands[1] instanceof Choki  && hands[0] instanceof Par && hands[2] instanceof Par)
	    || (hands[1] instanceof Par && hands[0] instanceof Goo && hands[2] instanceof Goo)){
        winner  = new Player[1];
        winner[0] = players[1];
        wins[1]++;    
        } else if((hands[1] instanceof Choki  && hands[0] instanceof Par && hands[2] instanceof Choki)
	    || (hands[1] instanceof Par && hands[0] instanceof Goo && hands[2] instanceof Par)
	    || (hands[1] instanceof Goo && hands[0] instanceof Choki && hands[2] instanceof Goo)){
	    winner  = new Player[2];
        winner[0] = players[1];
        winner[1] = players[2];
        wins[1]++;
        wins[2]++;   
        } else if ((hands[2] instanceof Goo  && hands[1] instanceof Choki && hands[0] instanceof Choki)
	    || (hands[2] instanceof Choki  && hands[1] instanceof Par && hands[0] instanceof Par)
	    || (hands[2] instanceof Par && hands[1] instanceof Goo && hands[0] instanceof Goo)){
        winner  = new Player[1];
        winner[0] = players[2];
        wins[2]++; 
        } else {
	    winner = null;
        }
    return winner;
    }
}
