package ru.netology.javaqa.javaqamvn.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {
    @Test
    public void findAllMovies (){
        Afisha afisha = new Afisha();
        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");
        afisha.add("Movie7");
        afisha.add("Movie8");
        afisha.add("Movie9");
        afisha.add("Movie10");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7", "Movie8", "Movie9", "Movie10",};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastMovies(){
        Afisha afisha = new Afisha();
        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");
        afisha.add("Movie7");
        afisha.add("Movie8");
        afisha.add("Movie9");
        afisha.add("Movie10");

        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1",};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastFiveMovies(){
        Afisha afisha = new Afisha(5);
        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");
        afisha.add("Movie7");
        afisha.add("Movie8");
        afisha.add("Movie9");
        afisha.add("Movie10");

        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testIfMoviesLessThanLimit (){
        Afisha afisha = new Afisha(5);
        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastLessThanFiveMovies(){
        Afisha afisha = new Afisha(5);
        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");

        String[] expected = {"Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }



}
