package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aggr implements aftp {
    public static final aggr a = new aggr();
    public static final Parcelable.Creator<aggr> CREATOR = new aftg(17);

    private aggr() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aggr)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1149300421;
    }

    public final String toString() {
        return "VoiceRecorderSource";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
