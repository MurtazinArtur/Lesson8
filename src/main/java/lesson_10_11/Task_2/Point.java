package lesson_10_11.Task_2;

interface Colorable {
    void setColor(int color);
    int getColor();
}
class Point { int x, y; }
class ColoredPoint extends Point implements Colorable {
    int color;

    @Override
    public void setColor(int color) {

    }

    @Override
    public int getColor() {
        return 0;
    }
}

