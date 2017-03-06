package wildsas.blablawild;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by apprenti on 05/03/17.
 */

public class informationsclasse implements Parcelable {

    private String mDepart;
    private String mDestination;
    private String mDate;

    public informationsclasse(String depart, String destination, String date){
        this.mDepart = depart;
        this.mDestination= destination;
        this.mDate= date;
    }

    protected informationsclasse(Parcel in) {
        mDepart = in.readString();
        mDestination = in.readString();
        mDate = in.readString();
    }

    public static final Creator<informationsclasse> CREATOR = new Creator<informationsclasse>() {
        @Override
        public informationsclasse createFromParcel(Parcel in) {
            return new informationsclasse(in);
        }

        @Override
        public informationsclasse[] newArray(int size) {
            return new informationsclasse[size];
        }
    };

    public String getmDepart(){
        return mDepart;
    }
    public String getmDestination(){
        return mDestination;
    }
    public String getmDate(){
        return mDate;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mDepart);
        dest.writeString(mDestination);
        dest.writeString(mDate);
    }
}
