package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeonTest {

    @Test
    public void test() {
        Peon p = new Peon(Color.BLANCO);
        assertTrue(p.y == 7);
    }

    @Test
    public void test2() {
        Peon p = new Peon(Color.BLANCO);
        assertTrue(p.getColor() == Color.BLANCO );
    }

    @Test
    public void test3() {
        Peon p = new Peon(Color.NEGRO);
        assertTrue(p.y == 2);
    }

    @Test
    public void test4() {
        Peon p = new Peon(Color.NEGRO);
        p.mover();
        assertTrue(p.y == 3);
    }

    @Test
    public void test5() {
        Peon p = new Peon(Color.BLANCO);
        p.mover();
        assertTrue(p.y == 6);
    }
}
