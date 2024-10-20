package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afro extends afrs {
    public static final afro a = new afro();
    public static final Parcelable.Creator<afro> CREATOR = new afqb(10);

    private afro() {
        super("mpg-latm");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afro)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1597975660;
    }

    public final String toString() {
        return "MPG_LATM";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
