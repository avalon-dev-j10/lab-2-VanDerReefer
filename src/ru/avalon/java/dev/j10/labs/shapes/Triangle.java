package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;


/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */

public class Triangle implements Polygon{
    int sideA; // Сторона А
    int sideB; // Сторона B
    int sideC; // Сторона B
    
    public Triangle (int sideA, int sideB, int sideC){ 
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    // для будущего использования
    public Triangle(){
        this.sideA = new Random().nextInt(100);
        this.sideB = new Random().nextInt(100);
        this.sideC = new Random().nextInt(100);
    }
    
    @Override
    public float getPerimeter() {
        return sideA + sideB + sideC; // Вычисляем периметр
    }

    /*
     * Вычисляем площадь треугольника
     * По-хорошему надо сделать проверку при создании треугольника,
     * что бы полупериметр был больше самой большой стороны
     * иначе площадь - равна нулю.
     */
    
    @Override
    public float getArea() {          
        float halfPerimetr = getPerimeter() /2;  
  
        return (float) Math.sqrt(halfPerimetr * (halfPerimetr - sideA) * 
                                                (halfPerimetr - sideB) * 
                                                (halfPerimetr - sideC));
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
