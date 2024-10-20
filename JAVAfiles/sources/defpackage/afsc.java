package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsc extends afsk {
    public static final afsc a = new afsc();
    public static final Parcelable.Creator<afsc> CREATOR = new afqb(17);

    private afsc() {
        super("jpeg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afsc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -312438618;
    }

    public final String toString() {
        return "JPEG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
