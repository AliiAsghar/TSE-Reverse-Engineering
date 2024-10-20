package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aian implements Parcelable {
    ACCESS,
    BREAKFAST,
    BRUNCH,
    DELIVERY,
    DINNER,
    DRIVE_THROUGH,
    HAPPY_HOUR,
    KITCHEN,
    LUNCH,
    ONLINE_SERVICE_HOURS,
    PICKUP,
    SENIOR_HOURS,
    TAKEOUT;

    public static final Parcelable.Creator<aian> CREATOR = new ahzu(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
