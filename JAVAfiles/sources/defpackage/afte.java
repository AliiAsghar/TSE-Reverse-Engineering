package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afte extends aftm {
    public static final afte a = new afte();
    public static final Parcelable.Creator<afte> CREATOR = new aftg(1);

    private afte() {
        super("mpeg4");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afte)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -332823055;
    }

    public final String toString() {
        return "MPEG4";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
