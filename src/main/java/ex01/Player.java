package ex01;

import javax.swing.*;

public class Player extends JLabel {
    // 게임 캐릭터
    private int x;
    private int y;
    private ImageIcon playerR;  // 플레이어의 오른쪽 면
    private ImageIcon playerL;  // 플레이어의 왼쪽 면
    public Player(){
        initObject();
        initSetting();
    }
    private void initObject(){
        playerR = new ImageIcon("image/playerR.png");
        playerL = new ImageIcon("image/playerL.png");
    }
    private void initSetting(){
        x = 55;
        y = 535;

        setIcon(playerR);
        setSize(50,50);
        setLocation(x,y);
    }
}
