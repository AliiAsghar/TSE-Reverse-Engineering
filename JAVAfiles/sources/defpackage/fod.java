package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fod implements erj {
    public static final Parcelable.Creator<fod> CREATOR = new eri(9);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public fod(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        d.s(z2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    @Override // defpackage.erj
    public final /* synthetic */ eqn a() {
        return null;
    }

    @Override // defpackage.erj
    public final void b(erg ergVar) {
        String str = this.c;
        if (str != null) {
            ergVar.v = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            ergVar.u = str2;
        }
    }

    @Override // defpackage.erj
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fod fodVar = (fod) obj;
            if (this.a == fodVar.a && Objects.equals(this.b, fodVar.b) && Objects.equals(this.c, fodVar.c) && Objects.equals(this.d, fodVar.d) && this.e == fodVar.e && this.f == fodVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = this.a;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = ((i4 + 527) * 31) + i;
        String str3 = this.d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return (((((((i5 * 31) + i2) * 31) + i3) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        int i2 = eul.a;
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
    }

    public fod(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        int i = eul.a;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
    }
}
