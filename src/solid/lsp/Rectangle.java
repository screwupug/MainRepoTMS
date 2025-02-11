package solid.lsp;

class Rectangle {
    int width, height;

    void setWidth(int width) { this.width = width; }
    void setHeight(int height) { this.height = height; }

    int getArea() { return width * height; }
}

class Square extends Rectangle {
    @Override
    void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Нарушение! Квадрат всегда имеет одинаковую ширину и высоту
    }

    @Override
    void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // Нарушение! То же самое для высоты
    }
}

class Main {

    public static void main(String[] args) {
        Square square = new Square();
        testShapeSize(square);
    }

    // Метод сработает не так как ожидалось
    private static void testShapeSize(Rectangle figure) {
        figure.setWidth(10);
        figure.setHeight(20);
        System.out.println(figure.getArea() == 200);
    }
}


