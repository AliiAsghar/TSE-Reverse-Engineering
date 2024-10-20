package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foa implements erj {
    public static final Parcelable.Creator<foa> CREATOR = new eri(7);
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public foa(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static foa d(euf eufVar) {
        int e = eufVar.e();
        String e2 = erl.e(eufVar.z(eufVar.e(), StandardCharsets.US_ASCII));
        String y = eufVar.y(eufVar.e());
        int e3 = eufVar.e();
        int e4 = eufVar.e();
        int e5 = eufVar.e();
        int e6 = eufVar.e();
        int e7 = eufVar.e();
        byte[] bArr = new byte[e7];
        eufVar.E(bArr, 0, e7);
        return new foa(e, e2, y, e3, e4, e5, e6, bArr);
    }

    @Override // defpackage.erj
    public final /* synthetic */ eqn a() {
        return null;
    }

    @Override // defpackage.erj
    public final void b(erg ergVar) {
        ergVar.a(this.h, this.a);
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
            foa foaVar = (foa) obj;
            if (this.a == foaVar.a && this.b.equals(foaVar.b) && this.c.equals(foaVar.c) && this.d == foaVar.d && this.e == foaVar.e && this.f == foaVar.f && this.g == foaVar.g && Arrays.equals(this.h, foaVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + Arrays.hashCode(this.h);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByteArray(this.h);
    }

    public foa(Parcel parcel) {
        this.a = parcel.readInt();
        String readString = parcel.readString();
        int i = eul.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.createByteArray();
    }
}
