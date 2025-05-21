package FADLI;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Stack;

public class LatihanStack {
    String str;
    int num;

    public static void main(String[] args) {
        LatihanStack s = new LatihanStack();
    }

    public LatihanStack() {
        try {
            Stack<Integer> stack = new Stack<Integer>();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Jumlah Data : ");
            str = bf.readLine();
            if ((num = Integer.parseInt(str)) == 1) {
                System.out.println("Anda menekan angka satu");
                System.exit(0);
            } else {
                for (int i = 1; i <= num; i++) {
                    System.out.print("Masukkan Elemen " + i + " : ");
                    str = bf.readLine();
                    int n = Integer.parseInt(str);
                    stack.push(n);
                }
            }
            System.out.println("Isi queue: " + stack);
            System.out.println("Elemen Pertama: " + stack.pop());
            System.out.print("Elemen Tengah: " + stack);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "adalah string");
        }
    }
}