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
    
  //0325課題
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

  //0326課題
  @Test
  public void mondai4(){
    for(int i =0; i< 5; i++){
      for (int j=0; j<5; j++){
        if (i==j){
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
  @Test
  public void mondai5(){
    for(int i =0; i< 8; i++){
      for (int j=0; j<4; j++){
        if (i % 2 != 0){
          System.out.print("  *");
        } else {
          System.out.print("*  ");
        }
      }
      System.out.println();
    }
  }

  @Test
  public void mondai6(){
    for(int i =0; i< 5; i++){
      for (int j=0; j<5; j++){
        if (i == 5/2 | j == 5/2){
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  //0327課題
  @Test
  public void mondai7(){
    for(int i =0; i< 5; i++){
      for (int j=0; j<5; j++){
        if (i == j || i + j == 5 - 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
    }
      System.out.println();
    } 
  }

  @Test
  public void mondai8() {
    int columns = 5 * 2 - 1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < columns; j++) {
        if (j >= 5 - 1 - i && j <= 5 - 1 + i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  @Test
  public void mondai9() {
    int columns = 4 * 2 - 1;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < columns; j++) {
        if (j == i || j == columns - 1 - i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

}

