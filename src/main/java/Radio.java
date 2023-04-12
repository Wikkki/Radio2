public class Radio {
    private int currentStation;
    private int currentVolume;
    private int MaxStations;

    public Radio() {
        MaxStations = 9;
    }

    public Radio(int stationsCount) {
        MaxStations = stationsCount - 1;

    }

    public void next() {
        if (currentStation != MaxStations) {
            currentStation++;
        } else {
            currentStation = 0;
        }


    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = MaxStations;
        }


    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void downVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > MaxStations) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
