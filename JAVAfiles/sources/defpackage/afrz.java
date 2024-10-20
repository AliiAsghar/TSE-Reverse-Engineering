package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afrz extends afsk {
    public static final afrz a = new afrz();
    public static final Parcelable.Creator<afrz> CREATOR = new afqb(14);

    private afrz() {
        super("gif");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afrz)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 405560230;
    }

    public final String toString() {
        return "GIF";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
