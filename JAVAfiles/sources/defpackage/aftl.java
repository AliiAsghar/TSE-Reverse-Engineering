package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aftl extends aftm {
    public static final aftl a = new aftl();
    public static final Parcelable.Creator<aftl> CREATOR = new aftg(4);

    private aftl() {
        super("3gpp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aftl)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -317061387;
    }

    public final String toString() {
        return "3GPP";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
