public class Rectangle {
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){
        return 2*width+2*width;
    }

    public int getArea(){
        return length*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length>0)
        this.length = length;
        else
            throw new IllegalArgumentException("length must be greater than 0");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width>0)
            this.width = width;
        else
            throw new IllegalCallerException("width must be greater than 0");
    }
}