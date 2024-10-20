package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afcn implements afcp<afcq> {
    public static final Parcelable.Creator<afcn> CREATOR = new adsv(15);
    public final int a = 1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afcn)) {
            return false;
        }
        int i = ((afcn) obj).a;
        return true;
    }

    public final int hashCode() {
        a.bm(1);
        return 1;
    }

    public final String toString() {
        return "Remote(category=SCOTTY)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString("SCOTTY");
    }
}
