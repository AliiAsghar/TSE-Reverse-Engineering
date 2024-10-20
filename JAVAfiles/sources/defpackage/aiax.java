package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aiax implements Parcelable {
    OPERATIONAL,
    CLOSED_TEMPORARILY,
    CLOSED_PERMANENTLY;

    public static final Parcelable.Creator<aiax> CREATOR = new ahzu(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
