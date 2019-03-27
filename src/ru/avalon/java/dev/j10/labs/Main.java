package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;


public class Main {
    
    public static Shape[] shapes = new Shape[10];

    public static void main(String[] args) {
       
        shapes[0] = new Circle(5);
        shapes[1] = new Circle(66);
        shapes[2] = new Circle(123);
        shapes[3] = new Triangle(32, 33, 56);
        shapes[4] = new Triangle(34, 12, 34);
        shapes[5] = new Triangle(45, 51, 67);
        shapes[6] = new Rectangle(74, 75);
        shapes[7] = new Rectangle(76, 344);
        shapes[8] = new Rectangle(64, 88);
        shapes[9] = new Rectangle(3,5);
        
        getMaxArea();
    }
        
        public static void getMaxArea(){
        
        float maxArea = 0;
        int item = 0;
        
        for (int i = 0; i < 10; i++){
            if (maxArea < shapes[i].getArea()){
                
                maxArea = shapes[i].getArea();
                
                item = i;
                
            }
        }
        
        System.out.println("Наибольная площадь " + maxArea + 
                    " у элемента " + item);
                        
        }
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
        
}
