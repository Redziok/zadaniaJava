package pl.imiajd.Mingielewicz;

import pl.imiajd.Mingielewicz.Instrument;
import java.time.LocalDate;

class Fortepian extends pl.imiajd.Mingielewicz.Instrument {
    public Fortepian(String producent, LocalDate rokProdukcji) {
        super(producent,rokProdukcji);
    }

    public String getDzwiek() {
        return String.format("trah");
    }

}