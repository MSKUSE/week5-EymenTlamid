public class rectangle {
}
public class rectangle {

    private point topleft;
    private int sideA,sideB ;

    public rectangle(point topleft, int sideA, int sideB) {
        this.topleft = topleft;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public rectangle(point topleft, int sideA) {
        this.topleft = topleft;
        this.sideA = sideA;
        this,sideB = sideA;


    }

    public point getTopleft() {
        return topleft;
    }

    public void setTopleft(point topleft) {
        this.topleft = topleft;
        setSideA(sideA);
        setSideB();
        public int getSideA() {
            if (sideA<0) {
                this.sideA = 0;
                System.out.println("side A CAN NOT BE NEGATIVE ");
            }else {
                this.sideB = sideB;
            }
        }
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
public int perimeter (){
    return (2*this.sideA)+(2*sideB);
}
public int area(){
}