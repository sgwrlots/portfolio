public class Tire {

    private int direction = 0;

    private int speed = 0;

    public Tire(){}
    public void setDirection(int direction){
        this.direction = direction;
        if(this.direction > 45){
           this.direction = 45;
        }
        if(this.direction < -45){
            this.direction = -45;
        }
    }
    public void changeSpeed(int d_speed){
        this.speed = speed + d_speed;
        if (this.speed  < 0){
            this.speed = 0;
        }
    }
    public  int getDirection(){
        return this.direction;
    }
    public int getSpeed(){
        return this.speed;
    }

    }
