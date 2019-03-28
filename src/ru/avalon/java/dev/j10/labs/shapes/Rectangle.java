package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;


/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */

public class Rectangle implements Polygon{
    private final int sideA; // Сторона А
    private final int sideB; // Сторона B

    public Rectangle (int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    // для будущего использования
    public Rectangle (){
        this.sideA = new Random().nextInt(100);
        this.sideB = new Random().nextInt(100);
    }
    
    
    @Override
    public float getPerimeter() {
        return 2 * (sideA + sideB); // Вычисление приметра
    }

    @Override
    public float getArea() {
        return sideA * sideB; // Вычисление площади
    }

    
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
