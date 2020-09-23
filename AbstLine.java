public abstract class AbstLine extends Shape{

    /**
     * 직선의 길이를 나타내는 int형 필드
     */
    private int length;

    /**
     * 직선을 생성하는 생성자이다.
     * 길이를 인수로 받는다.
     * @param length 생성할 직선의 길이
     */
    public AbstLine(int length){
        setLength(length);
    }
    public int getLength() {return length;}

    public void setLength(int length) {
        this.length = length;
    }
    public String toString() {
        return "AbstLine(length:"+length+")";
    }
}
