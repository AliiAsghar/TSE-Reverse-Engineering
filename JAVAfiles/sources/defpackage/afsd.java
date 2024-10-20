package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsd extends afsk {
    public static final afsd a = new afsd();
    public static final Parcelable.Creator<afsd> CREATOR = new afqb(18);

    private afsd() {
        super("jpg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afsd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 405563331;
    }

    public final String toString() {
        return "JPG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
