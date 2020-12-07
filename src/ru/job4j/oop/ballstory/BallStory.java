package ru.job4j.oop.ballstory;

public class BallStory {
    public static void main(String[] args) {

        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.walck();
        hare.eat(ball);
        ball.walck();
        wolf.eat(ball);
        ball.walck();
        fox.eat(ball);
    }
}
