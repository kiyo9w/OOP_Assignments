public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;

        private static final int MAX_CHANNEL = 1000;
    private static final int MIN_CHANNEL = 0;
    private static final int MAX_VOLUME = 100;
    private static final int MIN_VOLUME = 0;

    TV() {
        this.channel = MIN_CHANNEL;
        this.volumeLevel = 50;
        this.on = false;
    }

    public void turnOn() {
        this.on = true;
        System.out.println("TV turned on");
    }

    public void turnOff() {
        System.out.println("TV turning off");
        this.on = false;
    }

    private void currentVolume() {
        System.out.println("Current volume: " + this.volumeLevel);
    }

    private void currentChannel() {
        System.out.println("Channel: " + this.channel);
    }

    public void setChannel(int newChannel) {
        if(this.on && newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL) {
            this.channel = newChannel;
            currentChannel();
        }
    }

    public void setVolume(int newVolumeLevel) {
        if(this.on && newVolumeLevel >= MIN_VOLUME && newVolumeLevel <= MAX_VOLUME && newVolumeLevel % 5 == 0) {
            this.volumeLevel = newVolumeLevel;
            currentVolume();
        }
    }

    public void channelUp() {
        if(this.on && this.channel + 1 <= MAX_CHANNEL) {
            this.channel++;
            currentChannel();
        }
    }

    public void channelDown() {
        if(this.on && this.channel - 1 >= MIN_CHANNEL) {
                this.channel--;
                currentChannel();
        }
    }

    public void volumeUp() {
        if(this.on && volumeLevel + 5 <= MAX_VOLUME) {
                this.volumeLevel += 5;
                currentVolume();
        }
    }

    public void volumeDown() {
        if (this.on && volumeLevel - 5 >= MIN_VOLUME) {
                this.volumeLevel -= 5;
                currentVolume();
        }
    }
}
