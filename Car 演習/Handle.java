//担当：菅原　蓮

public class Handle  {

    private int direction = 0;

    public Handle(){}

    //ハンドルを回転させるメソッド
    public void moveDirection(int d_direction,Tire t){
        direction=direction + d_direction;
        if(direction>90){
            direction=90;
        }
        if(direction<-90){
            direction=-90;
        }

        t.setDirection(direction/2);


    }
    public  int getDirection(){

        return direction;
    }
    public void resetDirection(Tire t){
        direction = 0;
        t.setDirection(direction/2);

    }
}
