package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqp implements afqq<afqs> {
    public static final afqp a = new afqp();
    public static final Parcelable.Creator<afqp> CREATOR = new afqb(3);

    private afqp() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afqp)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -2118806537;
    }

    public final String toString() {
        return "Tenor";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
