package com.example;

import org.junit.jupiter.api.Test;

public class LoopTest {

    @Test
    public void ex() {
      for (int row = 0; row < 5; row++) {
        // 内側のループ：各行における列（5列）を表現
        for (int col = 0; col < 5; col++) {
            // セルを表すシンボルとスペースを出力
            System.out.print("* ");
        }
        // 一行分の出力が終わったら改行する
        System.out.println();
    }
    }
    

    @Test
    public void mondai1(){
      for (int i = 0; i <= 5; i++){
        for (int j = 0; j<=i; j++){
          System.out.print("* ");
        }
      System.out.println();
      }
    }

    @Test
    public void mondai2(){
      for (int i = 1; i <= 5; i++){
        for (int j = 5; j>=i; j--){
          System.out.print("* ");
        }
      System.out.println();
      }
    }

    @Test
    public void mondai3(){
      for (int i = 0; i< 5; i++){
        for(int j = 0; j<5; j++){
          if (i == 0 || i== 5 - 1 || j ==0 || j == 5 - 1){
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }
}
