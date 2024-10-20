package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsf extends afsk {
    public static final Parcelable.Creator<afsf> CREATOR = new afqb(20);
    private final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afsf(String str) {
        super(str);
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.afsk, defpackage.afru
    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afsf) && d.F(this.a, ((afsf) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnknownImageFormat(subType=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
