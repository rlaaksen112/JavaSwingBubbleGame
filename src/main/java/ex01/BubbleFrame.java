package ex01;

import javax.swing.*;
//  1. 윈도우 창이 되었음
//  2. 윈도우 창은 내부에 패널을 하나 가지고 있다.
public class BubbleFrame extends JFrame {
    private JLabel backgroundMap;
    private Player player;
    public BubbleFrame(){
        initSetting();
        initObject();
        setVisible(true);   // 그림을 그려라
    }
    private void initObject(){
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));   // 라벨에 이미지 담기
        setContentPane(backgroundMap);  // pane를 배경으화면으로 바꿔버리기

        player = new Player();
        add(player);    // 덫 붙히기
    }
    private void initSetting(){
        setSize(1000,640);  // 크기
        setLayout(null);    // absoulte(자유롭게 그림 그리기 가능)
        setLocationRelativeTo(null);    // JFrame을 가운데로 위치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 창을 끌 때 JVM같이 종료하기
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
