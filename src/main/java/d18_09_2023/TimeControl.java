package d18_09_2023;

public class TimeControl extends Control{
    private boolean isForward;

    public TimeControl(boolean isForward) {
        this.isForward = isForward;
    }

    @Override
    public void execute(VideoPlayer videoPlayer){
        if (this.isForward){
            if (videoPlayer.getTimeNow() + 15 <= videoPlayer.getLenght()){
                videoPlayer.setTimeNow(videoPlayer.getTimeNow() + 15);
            } else {
                videoPlayer.setTimeNow(videoPlayer.getLenght());
            }
        } else {
            if (videoPlayer.getTimeNow() - 15 >= 0){
                videoPlayer.setTimeNow(videoPlayer.getTimeNow() - 15);
            } else {
                videoPlayer.setTimeNow(0);
            }
        }

    }

    public boolean isForward() {
        return isForward;
    }

    public void setForward(boolean forward) {
        isForward = forward;
    }
}
