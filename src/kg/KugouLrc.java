package kg;

/**
 * Created by qtfreet on 2017/2/6.
 */
public class KugouLrc {

    /**
     * code : 1
     * data : {"lrc":"[ti:why]\n[ar:蔡健雅]\n[al:I DO BELIEVE]\n[by:mp3.91.com]\n[00:04.24]词-小寒       曲-黎沸挥\n[00:14.24]轻轻呼让玻璃窗起雾\n[00:17.54]玻璃窗起雾  就看不清楚\n[00:20.94]既然里外都看不清楚\n[00:24.46]就看不清楚  就继续模糊\n[00:28.27]有些人对爱太清楚  却得不到幸福\n[00:34.97]有些人对爱很模糊  却偏偏找到路\n[00:42.25]是否哭就会有人呵护\n[00:45.69]若不用呵护  就没理由哭\n[00:49.16]难道没有理由值得哭\n[00:52.61]就不用呵护  不值得安抚\n[00:56.25]你说没有你的呵护  她就会很无助\n[01:03.54]你说没有你的安抚  我才会不在乎\n[02:36.93][01:10.51]but why? 我的失落感到现在怎么好不起来\n[02:43.91][01:17.45]and why? 真爱只应该给那些软弱无助的女孩\n[02:50.40][01:24.42]oh why? 自由变成了一种虐待竟是如此难挨\n[02:57.99][01:31.57]哦爱  是否不该太慷慨  目送着你离开\n[02:08.83]想想不如就养只宠物\n[02:12.08]来陪我散步  来陪我看书\n[02:15.65]或者不如找一个候补\n[02:19.23]来陪我散步  来陪我跳舞\n[02:22.63]只是门被回忆堵住  谁能帮我铲除\n[02:29.72]而如今占据了一屋  是你留的孤独\n"}
     */

    private int code;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * lrc : [ti:why]
         [ar:蔡健雅]
         [al:I DO BELIEVE]
         [by:mp3.91.com]
         [00:04.24]词-小寒       曲-黎沸挥
         [00:14.24]轻轻呼让玻璃窗起雾
         [00:17.54]玻璃窗起雾  就看不清楚
         [00:20.94]既然里外都看不清楚
         [00:24.46]就看不清楚  就继续模糊
         [00:28.27]有些人对爱太清楚  却得不到幸福
         [00:34.97]有些人对爱很模糊  却偏偏找到路
         [00:42.25]是否哭就会有人呵护
         [00:45.69]若不用呵护  就没理由哭
         [00:49.16]难道没有理由值得哭
         [00:52.61]就不用呵护  不值得安抚
         [00:56.25]你说没有你的呵护  她就会很无助
         [01:03.54]你说没有你的安抚  我才会不在乎
         [02:36.93][01:10.51]but why? 我的失落感到现在怎么好不起来
         [02:43.91][01:17.45]and why? 真爱只应该给那些软弱无助的女孩
         [02:50.40][01:24.42]oh why? 自由变成了一种虐待竟是如此难挨
         [02:57.99][01:31.57]哦爱  是否不该太慷慨  目送着你离开
         [02:08.83]想想不如就养只宠物
         [02:12.08]来陪我散步  来陪我看书
         [02:15.65]或者不如找一个候补
         [02:19.23]来陪我散步  来陪我跳舞
         [02:22.63]只是门被回忆堵住  谁能帮我铲除
         [02:29.72]而如今占据了一屋  是你留的孤独

         */

        private String lrc;

        public String getLrc() {
            return lrc;
        }

        public void setLrc(String lrc) {
            this.lrc = lrc;
        }
    }
}
