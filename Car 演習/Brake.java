public class Brake {
    //ブレーキの踏み込み量
    private int push;


    //コンストラクタ
    public Brake(){
    }

    //ブレーキの踏み込み量を変更するメソッド
    public void movePush(int d_push, Tire t){
        this.push = getPush() + d_push;

        if(15 < this.push) {
            this.push=15;
        }
        if(0 >= this.push) {
            this.push=0;
        }
        t.changeSpeed(-this.push);

    }

    //ブレーキの踏み込み量を0にするメソッド
    public void resetPush(Tire t){
        this.push = 0;
        t.changeSpeed(-(this.push));
    }

    //ブレーキの踏み込み量を最大にするメソッド
    public void fullPush(Tire t){
        this.push = 15;
        t.changeSpeed(-(this.push));
    }

    //ブレーキの踏み込み量を得るメソッド
    public int getPush(){
    return this.push;
    }

    //ブレーキの踏み込み量にしたがって、タイヤの速さを変更するメソッド
    public void renewSpeed(Tire t){
        t.changeSpeed(-(this.push));
    }

}
