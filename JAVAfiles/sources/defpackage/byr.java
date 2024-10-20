package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byr extends caf implements Parcelable {
    public static final Parcelable.Creator<byr> CREATOR = new Parcelable.Creator<byr>() { // from class: byr.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ byr createFromParcel(Parcel parcel) {
            return new byr(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ byr[] newArray(int i) {
            return new byr[i];
        }
    };

    public byr(float f) {
        super(f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(b());
    }
}
