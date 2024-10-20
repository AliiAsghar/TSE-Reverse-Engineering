package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@armg
/* loaded from: classes4.dex */
public final class afco implements afcp<afcq> {
    public static final afco a = new afco();
    public static final Parcelable.Creator<afco> CREATOR = new adsv(16);

    private afco() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afco)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1330778708;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
