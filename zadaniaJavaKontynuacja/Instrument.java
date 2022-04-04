package pl.imiajd.Mingielewicz;

import java.util.*;
import java.time.LocalDate;

abstract class Instrument {
    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String toString(Object o) {
        return "tarara";
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;

        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        Instrument instrument = (Instrument) obj;
        return (instrument.producent == this.producent && instrument.rokProdukcji == this.rokProdukcji);
    }

    public abstract String getDzwiek();

    public String getProducent() { return producent; }

    public LocalDate getRokProdukcji() { return rokProdukcji; }

    private String producent ;

    private LocalDate rokProdukcji;
}
