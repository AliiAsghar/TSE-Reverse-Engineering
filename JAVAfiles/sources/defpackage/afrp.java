package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afrp extends afrs {
    public static final afrp a = new afrp();
    public static final Parcelable.Creator<afrp> CREATOR = new afqb(11);

    private afrp() {
        super("ogg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afrp)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68865580;
    }

    public final String toString() {
        return "OGG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
