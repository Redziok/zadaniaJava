package pl.imiajd.Mingielewicz;

import pl.imiajd.Mingielewicz.Instrument;
import java.time.LocalDate;

class Skrzypce extends pl.imiajd.Mingielewicz.Instrument {
    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent,rokProdukcji);
    }

    public String getDzwiek() {
        return String.format("ciach");
    }

}