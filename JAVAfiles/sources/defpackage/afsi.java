package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsi extends afsk {
    public static final afsi a = new afsi();
    public static final Parcelable.Creator<afsi> CREATOR = new afsh(0);

    private afsi() {
        super("webp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afsi)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -312061990;
    }

    public final String toString() {
        return "WEBP";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
