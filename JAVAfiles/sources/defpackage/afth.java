package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afth extends aftm {
    public static final Parcelable.Creator<afth> CREATOR = new aftg(0);
    private final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afth(String str) {
        super(str);
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.aftm, defpackage.afru
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
        if ((obj instanceof afth) && d.F(this.a, ((afth) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnknownVideoFormat(subType=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
