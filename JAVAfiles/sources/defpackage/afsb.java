package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsb extends afsk {
    public static final afsb a = new afsb();
    public static final Parcelable.Creator<afsb> CREATOR = new afqb(16);

    private afsb() {
        super("heif");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afsb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -312508648;
    }

    public final String toString() {
        return "HEIF";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
