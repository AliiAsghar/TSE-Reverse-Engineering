package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsj extends afsk {
    public static final afsj a = new afsj();
    public static final Parcelable.Creator<afsj> CREATOR = new afsh(2);

    private afsj() {
        super("x-ms-bmp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afsj)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 168151633;
    }

    public final String toString() {
        return "X_MS_BMP";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
