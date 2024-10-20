package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgi implements afgj {
    public static final afgi a = new afgi();
    public static final Parcelable.Creator<afgi> CREATOR = new afqb(1);

    private afgi() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afgi)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -370821057;
    }

    public final String toString() {
        return "System";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
