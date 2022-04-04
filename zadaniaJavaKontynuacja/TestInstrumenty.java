package pl.imiajd.Mingielewicz;

import pl.imiajd.Mingielewicz.Instrument;
import pl.imiajd.Mingielewicz.Flet;
import pl.imiajd.Mingielewicz.Fortepian;
import pl.imiajd.Mingielewicz.Skrzypce;
import java.util.*;
import java.time.LocalDate;

public class TestInstrumenty {
    public static void main(String[] args) {
        pl.imiajd.Mingielewicz.Instrument[] orkiestra = new pl.imiajd.Mingielewicz.Instrument[5];

        orkiestra[0] = new pl.imiajd.Mingielewicz.Flet("Gibson", LocalDate.parse("1991-01-01"));
        orkiestra[1] = new pl.imiajd.Mingielewicz.Fortepian("Shure",  LocalDate.parse("1996-02-06"));
        orkiestra[2] = new pl.imiajd.Mingielewicz.Skrzypce("Roland",  LocalDate.parse("2001-03-11"));
        orkiestra[3] = new pl.imiajd.Mingielewicz.Flet("Senheiser",  LocalDate.parse("2006-04-16"));
        orkiestra[4] = new pl.imiajd.Mingielewicz.Skrzypce("Yamaha",  LocalDate.parse("2011-05-21"));

        for (pl.imiajd.Mingielewicz.Instrument p : orkiestra) {
            System.out.print(p.toString() + ", producent: " + p.getProducent() + ", stworzony: " + p.getRokProdukcji() + ", dźwięk: " + p.getDzwiek());
            System.out.println();
        }
    }
}
