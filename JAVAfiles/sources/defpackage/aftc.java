package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aftc extends aftm {
    public static final aftc a = new aftc();
    public static final Parcelable.Creator<aftc> CREATOR = new afsh(5);

    private aftc() {
        super("x-matroska");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aftc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1376881254;
    }

    public final String toString() {
        return "MKV";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
