package com.jobsheet11.tugas;
import java.util.Scanner;
public class ScavengerHunt {
    private Point head;
    private Point tail;
    public void addPoint(int pointId, String question, String answer, Point nextPoint) {
        Point newPoint = new Point(pointId, question, answer);
        newPoint.setNextPoint(nextPoint);
        if (head == null) {
            head = newPoint;
            tail = newPoint;
        } else {
            tail.setNextPoint(newPoint);
            tail = newPoint;
        }
    }
    public void startGame() {
        Point currentPoint = head;
        while (currentPoint != null) {
            System.out.println("=========================================");
            System.out.println("Point " + currentPoint.getPointId());
            System.out.println("Pertanyaan: " + currentPoint.getQuestion());
            String userAnswer = getUserInput();
            if (userAnswer.equalsIgnoreCase(currentPoint.getAnswer())) {
                System.out.println("Jawaban Benar!");
                System.out.println("=========================================");
                currentPoint = currentPoint.getNextPoint();
            } else {
                System.out.println("Jawaban Salah.");
                System.out.println("Game Over!");
                break;
            }
        }
        if (currentPoint == null) {
            System.out.println("Selamat! Anda telah menemukan harta karun!");
        }
    }
    private String getUserInput() {
        System.out.print("Masukkan Jawaban: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        ScavengerHunt scavengerHunt = new ScavengerHunt();
        Point point2 = new Point(2, "Siapa presiden pertama Indonesia?", "Soekarno");
        Point point3 = new Point(3, "Apa ibukota Indonesia?", "Jakarta");
        scavengerHunt.addPoint(1, "Berapa jumlah pulau di Indonesia?", "17.508", point2);
        scavengerHunt.addPoint(2, "Siapa presiden pertama Indonesia?", "Soekarno", point3); 
        scavengerHunt.startGame();
    }
}