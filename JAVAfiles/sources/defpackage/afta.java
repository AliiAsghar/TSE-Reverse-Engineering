package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afta extends aftm {
    public static final afta a = new afta();
    public static final Parcelable.Creator<afta> CREATOR = new afsh(3);

    private afta() {
        super("avc");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afta)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1376892464;
    }

    public final String toString() {
        return "AVC";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
