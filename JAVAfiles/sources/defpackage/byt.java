package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byt extends cah implements Parcelable {
    public static final Parcelable.Creator<byt> CREATOR = new Parcelable.Creator<byt>() { // from class: byt.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ byt createFromParcel(Parcel parcel) {
            return new byt(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ byt[] newArray(int i) {
            return new byt[i];
        }
    };

    public byt(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(b());
    }
}
