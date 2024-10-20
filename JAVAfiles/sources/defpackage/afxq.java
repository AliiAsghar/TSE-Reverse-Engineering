package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxq implements afqq {
    public static final afxq a = new afxq();
    public static final Parcelable.Creator<afxq> CREATOR = new aftg(10);

    private afxq() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afxq)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1478832996;
    }

    public final String toString() {
        return "StickerApi";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
