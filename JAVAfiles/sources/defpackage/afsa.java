package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsa extends afsk {
    public static final afsa a = new afsa();
    public static final Parcelable.Creator<afsa> CREATOR = new afqb(15);

    private afsa() {
        super("heic");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afsa)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -312508651;
    }

    public final String toString() {
        return "HEIC";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
