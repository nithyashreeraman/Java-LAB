
import java.io.Serializable;

public class movie implements Serializable {
    private String title;
    private int screen_no;
    private String show;
    private int cost;
    
    public movie(String tit,int sno, String showw, int costt)
    {
       setTitle(tit);
       setScreen(sno);
       setShow(showw);
       setCost(costt);
    }
    
    public void setTitle(String tit){
        title=tit;
    }
    
    public String getTitle(){
    return title;
    }
    public void setScreen(int sno){
        screen_no=sno;
    }
    
    public int getScreen(){
    return screen_no;
    }
    public void setShow(String showw){
        show=showw;
    }
    
    public String getShow(){
    return show;
    }
    public void setCost(int costt){
        cost=costt;
    }
    
    public int getCost(){
    return cost;
    }
    
    
}
