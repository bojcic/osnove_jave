package d18_09_2023;

public class AudioControl extends Control{
    private boolean isUp;

    public AudioControl(boolean isUp) {
        this.isUp = isUp;
    }
    @Override
    public void execute(VideoPlayer videoPlayer){
        if (this.isUp){
            if (videoPlayer.getVolume() + 1 <= 100){
                videoPlayer.setVolume(videoPlayer.getVolume() + 1);
            } else {
                videoPlayer.setVolume(100);
            }
        } else {
            if (videoPlayer.getTimeNow() - 1 >= 0){
                videoPlayer.setVolume(videoPlayer.getVolume() - 1);
            } else {
                videoPlayer.setVolume(0);
            }
        }
    }

    public boolean isUp() {
        return isUp;
    }

    public void setUp(boolean up) {
        isUp = up;
    }
}
