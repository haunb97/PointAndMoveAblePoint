public class Movetest {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint);
        moveAblePoint = new MoveAblePoint(1,1);
        System.out.println(moveAblePoint);
        moveAblePoint = new MoveAblePoint(10,10,5,6);
        System.out.println(moveAblePoint);
    }
}
