package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aftk extends aftm {
    public static final aftk a = new aftk();
    public static final Parcelable.Creator<aftk> CREATOR = new aftg(5);

    private aftk() {
        super("3gpp2");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aftk)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1238968355;
    }

    public final String toString() {
        return "3GPP2";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
