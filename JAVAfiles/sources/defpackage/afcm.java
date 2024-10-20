package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afcm implements afcp<afcq> {
    public static final Parcelable.Creator<afcm> CREATOR = new adsv(14);
    public final String a;
    public final int b;

    public afcm(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afcm)) {
            return false;
        }
        afcm afcmVar = (afcm) obj;
        if (d.F(this.a, afcmVar.a) && this.b == afcmVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = this.b;
        a.bm(i);
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "External(authority=" + this.a + ", entryPoint=" + ((Object) adom.aZ(this.b)) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(adom.aZ(this.b));
    }
}
