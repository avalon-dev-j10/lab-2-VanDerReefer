package ru.avalon.java.dev.j10.labs;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.*;


public class Main {
    
    public static Shape[] shapes = new Shape[10];

    public static void main(String[] args) {
       
        for (int i = 0; i < shapes.length; i++){
            
            int temp = new Random().nextInt(2);
            
            switch (temp) {
                
                case 0: shapes[i] = new Circle();
                
                case 1: shapes[i] = new Rectangle();
                
                case 2: shapes[i] = new Triangle();
            }
            
        }
        
                
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
