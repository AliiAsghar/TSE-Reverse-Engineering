package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afge implements afgg {
    public static final afge a = new afge();
    public static final Parcelable.Creator<afge> CREATOR = new adsv(18);

    private afge() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afge)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1049850350;
    }

    public final String toString() {
        return "Grid";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
