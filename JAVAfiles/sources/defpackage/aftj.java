package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aftj extends aftm {
    public static final aftj a = new aftj();
    public static final Parcelable.Creator<aftj> CREATOR = new aftg(3);

    private aftj() {
        super("3gp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aftj)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 266866875;
    }

    public final String toString() {
        return "3GP";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
