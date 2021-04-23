package sjk.basic.day19;

import java.io.Serializable;

public class BoardVO implements Serializable {

    protected String bdno;
    protected String title;
    protected String userid;
    protected String regdate;
    protected String views;
    protected String thumbup;
    protected String contents;

    public BoardVO(String bdno, String title, String userid,
                   String regdate, String views, String thumbup, String contents) {
        this.bdno = bdno;
        this.title = title;
        this.userid = userid;
        this.regdate = regdate;
        this.views = views;
        this.thumbup = thumbup;
        this.contents = contents;
    }

    public String getDbno() {
        return bdno;
    }

    public void setDbno(String dbno) {
        this.bdno = dbno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getThumbup() {
        return thumbup;
    }

    public void setThumbup(String thumbup) {
        this.thumbup = thumbup;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        String fmt = " { bdno: '%s', userid: '%s', title: '%s', regdate: '%s', " +
                    " contents: '%s', tumbup: '%s', views: '%s' } ";
        String result = String.format(fmt, bdno, userid, title, regdate, contents, thumbup, views);
        return result;
    }
}
