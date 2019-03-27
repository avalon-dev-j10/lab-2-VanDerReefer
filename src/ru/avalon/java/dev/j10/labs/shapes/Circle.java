package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
      
    public Circle() {
        this.radius = new Random().nextInt(100);
    }
   
    @Override
    public float getLength() {
        return 2f * radius * (float) Math.PI; // Вычисляем длину окружности
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius; // Вычисляем площадь
    }

    
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
