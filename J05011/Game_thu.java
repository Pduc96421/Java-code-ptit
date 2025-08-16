package java_code_ptit.J05011;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Game_thu {
    private String ma, ten, gioVao, gioRa;

    public Game_thu (String ma, String ten, String gioVao, String gioRa){
        this.ma = ma;
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }

    public long so_phut(){
        LocalTime x = LocalTime.parse(this.gioVao, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime y = LocalTime.parse(this.gioRa, DateTimeFormatter.ofPattern("HH:mm"));
        return Duration.between(x, y).toMinutes();
    }

    public String thoi_gian(){
        long m = so_phut();
        long gio = m / 60;
        long phut = m - gio * 60;
        return gio + " gio " + phut + " phut";
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + thoi_gian();
    }
}
