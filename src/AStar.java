//package tnm096lab1;
import java.util.*;

public class AStar {

    //public Vector<Tile> OPEN;
    //public Vector<Tile> CLOSED;


    public static void main(String[] args) {
        List<Integer> wrongTiles = new ArrayList<Integer>();

        int initarray[] = { 1, 2, 3, 4, 0, 8, 7, 6, 5 };
        int goalarray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 0 };

        for(int i = 0; i < initarray.length; i++)
        {
            if (initarray[i] != goalarray[i]){
                wrongTiles.add(initarray[i]);
            }
        }

        System.out.println("Nr of wrong tiles: " + wrongTiles.size());
    }}
