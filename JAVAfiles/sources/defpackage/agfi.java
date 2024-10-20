package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfi implements agfm {
    public static final Parcelable.Creator<agfi> CREATOR = new aftg(13);
    public final int a;
    public final afxe b;

    public agfi(int i, afxe afxeVar) {
        this.a = i;
        this.b = afxeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agfi)) {
            return false;
        }
        agfi agfiVar = (agfi) obj;
        if (this.a == agfiVar.a && d.F(this.b, agfiVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        afxe afxeVar = this.b;
        if (afxeVar == null) {
            hashCode = 0;
        } else {
            hashCode = afxeVar.hashCode();
        }
        return (this.a * 31) + hashCode;
    }

    public final String toString() {
        return "Shortcut(shortcut=" + this.a + ", configuration=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
