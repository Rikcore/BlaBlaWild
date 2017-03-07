package wildsas.blablawild;

import java.util.Date;

/**
 * Created by apprenti on 06/03/17.
 */

public class TripResultModel {
    private String mFirstName;
    private Date mDepartureTime;
    private int mPrice;

    public TripResultModel(String firstName, Date departureTime, int price){
        this.mFirstName = firstName;
        this.mDepartureTime = departureTime;
        this.mPrice = price;

    }
    public String getFirstName() {
        return mFirstName;
    }


    public Date getDepartureTime() {
        return mDepartureTime;
    }



    public int getPrice() {
        return mPrice;
    }



}
