// 担当：渡邊 恭宏
public class Car{
    // Carクラスのフィールド（変数）
    private double x = 0; // Carのx座標
    private double y = 0; // Carのy座標
    private int direction = 0; // Carの向き
    private String name = null;

    // 他クラス
    // ハンドル型（クラス）のフィールド（変数）
    private Handle handle;
    // タイヤ型（クラス）のフィールド（変数）
    private Tire tire;
    // アクセル型（クラス）のフィールド（変数）
    private Accel accel;
    // ブレーキ型（クラス）のフィールド（変数）
    private Brake brake;

    // Carクラスのコンストラクタを宣言する
    //引数なしコンストラクタ 車の名称を指定しないコンストラクタ
    public Car(){
        this.handle = new Handle();
        this.tire = new Tire();
        this.accel = new Accel();
        this.brake = new Brake();
    }

    // 車の名前を指定する 引数として名前を受け取り、コンストラクタでnameフィールドを初期化
    public Car(String name){
        this();
        this.name = name;
    }

    // 車を移動および回転させるメソッド
    public void move(){
        // 1. ブレーキオブジェクトに対してタイヤの速度の更新を要求
        brake.renewSpeed(tire);
        // アクセルオブジェクトに対してタイヤの速度更新を要求
        accel.renewSpeed(tire);
        // 2. タイヤオブジェクトのgetSpeedメソッドを利用してタイヤの速度を得る。
        // 車の速さ ＝ タイヤの速さ
        int speed = tire.getSpeed();

        // 3. タイヤの向きから車の向きを更新する
        // 新しい車の向き ＝ 現在の車の向き + タイヤの向き
        this.direction = this.getDirection() + tire.getDirection();
        if(this.direction > 179){
            this.direction =  this.direction - 360;
        }
        if(this.direction < -180){
            this.direction =  this.direction + 360;
        }
        // 座標更新 x,y
        this.x = getX() + (double)speed * Math.sin( (double)direction * Math.PI / 180.0) * 5.0 / 18.0;
        this.y = getY() + (double)speed * Math.cos( (double)direction * Math.PI / 180.0) * 5.0 / 18.0;

    }

    // 車を移動および回転、ブレーキ、アクセル、ハンドル操作をするメソッド
    public void move(int brake_d_push, int accel_d_push, int handle_d_rotate) {
            brake.movePush(brake_d_push,tire);
            accel.movePush(accel_d_push,tire);
            handle.moveDirection(handle_d_rotate,tire);



        int speed = tire.getSpeed();

        // 3. タイヤの向きから車の向きを更新する
        // 新しい車の向き ＝ 現在の車の向き + タイヤの向き
        this.direction = this.getDirection() + tire.getDirection();
        if(this.direction > 179){
            this.direction =  this.direction - 360;
        }
        if(this.direction < -180){
            this.direction =  this.direction + 360;
        }
        // 座標更新 x,y
        this.x = getX() + (double)speed * Math.sin( (double)direction * Math.PI / 180.0) * 5.0 / 18.0;
        this.y = getY() + (double)speed * Math.cos( (double)direction * Math.PI / 180.0) * 5.0 / 18.0;



        }

    // 車の名称をセットするメソッド。
    public void setName(String name){
        this.name = name;
    }

    // 車のx座標を得る
    public double getX(){
        return this.x;
    }
    // 車のy座標を得る
    public double getY(){
        return this.y;
    }
    // 車の向きを得る
    public int getDirection(){
        return this.direction;
    }
}