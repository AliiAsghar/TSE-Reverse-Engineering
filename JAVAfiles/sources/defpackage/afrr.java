package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afrr extends afrs {
    public static final afrr a = new afrr();
    public static final Parcelable.Creator<afrr> CREATOR = new afqb(13);

    private afrr() {
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
        if (!(obj instanceof afrr)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1769496016;
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
