package com.example.lesson6.ui.data;

import java.util.ArrayList;
import java.util.List;

public class GameClient {
    public static List<GameModel> gameList = new ArrayList<>();

    public static List <GameModel> getGameList() {
        gameList.add( new GameModel( "One " , "В каком году началась столетняя война?" , "1941 году" , "711 году" , "1211 году" , "1337год"));
        gameList.add( new GameModel( "Two " , " 2 + 2 * 2?" , "0" , "4" , "8" , "6"));
        gameList.add( new GameModel( "Three " , "У кого 7 золотых мячей?" , "Ronaldo" , "Mbappe" , "Neymar" , "Messi"));
    return gameList;
    }
}
