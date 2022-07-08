/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oscarblancarte.ipd.flyweight.impl;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author frnk_
 */
public class PlayItemFactory {
    public static boolean enableFlyweight = true;
    private static final Map<String,PlayItem> PLAY_ITEMS = new HashMap<>();
    private static Long idSequence = 0L;
    public static PlayItem createPlayItem(String songName){
        if(enableFlyweight && PLAY_ITEMS.containsKey(songName)){
            return PLAY_ITEMS.get(songName);
        }else{
            PlayItem playItem = new PlayItem(++idSequence, songName);
            PLAY_ITEMS.put(songName, playItem);
            return playItem;
        }
    }
}
