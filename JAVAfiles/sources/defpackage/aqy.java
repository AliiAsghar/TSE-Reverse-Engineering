package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqy implements Parcelable {
    public static final Parcelable.Creator<aqy> CREATOR = new Parcelable.Creator<aqy>() { // from class: aqy.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ aqy createFromParcel(Parcel parcel) {
            return new aqy(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ aqy[] newArray(int i) {
            return new aqy[i];
        }
    };
    private final int a;

    public aqy(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aqy) && this.a == ((aqy) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DefaultLazyKey(index=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
