package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afrj extends afrs {
    public static final afrj a = new afrj();
    public static final Parcelable.Creator<afrj> CREATOR = new afqb(5);

    private afrj() {
        super("aac");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afrj)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68851936;
    }

    public final String toString() {
        return "AAC";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
