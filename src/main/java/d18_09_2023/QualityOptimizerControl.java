package d18_09_2023;

public class QualityOptimizerControl extends Control{
    private double netSpeed;

    public QualityOptimizerControl(double netSpeed) {
        this.netSpeed = netSpeed;
    }
    @Override
    public void execute(VideoPlayer videoPlayer){
        double quality = this.netSpeed * 10.1;
        if (quality < 144) {
            videoPlayer.setQuality(144);
        }  else if (quality < 240){
            videoPlayer.setQuality(240);
        }   else if (quality < 360){
            videoPlayer.setQuality(360);
        }  else if (quality < 480){
            videoPlayer.setQuality(480);
        }  else if (quality < 720){
            videoPlayer.setQuality(720);
        } else {
            videoPlayer.setQuality(1080);
        }
    }

    public double getNetSpeed() {
        return netSpeed;
    }

    public void setNetSpeed(double netSpeed) {
        this.netSpeed = netSpeed;
    }
}
