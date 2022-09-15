public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int lengthParam, int widthParam){
        length = lengthParam;
        width = widthParam;
        if (lengthParam < 0){
            length = 0;
        }
        if (widthParam < 0){
            width = 0;
        }
    }

    public boolean setLength(int lengthNew){
        if (lengthNew <0){
            length = length + 0;
            System.out.println("Change in Width: False");
        } else if (lengthNew >0){
            length = lengthNew;
            System.out.println("Change in Width: True");
        }
        boolean changed = lengthNew > 0;
        return changed;
    }

    public boolean setWidth(int widthNew){
        if (widthNew <0){
            width = width + 0;
            System.out.println("Change in Length: False");
        } else if (widthNew >0){
            width = widthNew;
            System.out.println("Change in Length: True");
        }
        boolean changed = widthNew > 0;
        return changed;
    }


}
