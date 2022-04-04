package pl.imiajd.Mingielewicz;

import pl.imiajd.Mingielewicz.Instrument;
import java.time.LocalDate;

class Flet extends pl.imiajd.Mingielewicz.Instrument {
    public Flet(String producent, LocalDate rokProdukcji) {
        super(producent,rokProdukcji);
    }

    public String getDzwiek() {
        return String.format("siup");
    }

}
