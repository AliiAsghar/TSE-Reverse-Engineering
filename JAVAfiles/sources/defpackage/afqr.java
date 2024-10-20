package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqr implements afsl {
    public static final Parcelable.Creator<afqr> CREATOR = new afqb(4);
    public final afsk a;
    public final String b;
    public final int c;
    public final int d;
    public final afqq e;
    private final afsz f;
    private final long g;
    private final afsu h;

    public afqr(afsz afszVar, afsk afskVar, String str, int i, int i2, long j, afqq afqqVar) {
        afszVar.getClass();
        afskVar.getClass();
        str.getClass();
        afqqVar.getClass();
        this.f = afszVar;
        this.a = afskVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.g = j;
        this.e = afqqVar;
        this.h = afsk.d;
    }

    @Override // defpackage.afsm, defpackage.afcv
    public final long b() {
        return this.g;
    }

    @Override // defpackage.afsm, defpackage.afcv
    public final /* synthetic */ afsx d() {
        return afwv.J(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afqr)) {
            return false;
        }
        afqr afqrVar = (afqr) obj;
        if (this.f == afqrVar.f && d.F(this.a, afqrVar.a) && d.F(this.b, afqrVar.b) && this.c == afqrVar.c && this.d == afqrVar.d && this.g == afqrVar.g && d.F(this.e, afqrVar.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afcq
    public final /* synthetic */ afcp fh() {
        return this.e;
    }

    @Override // defpackage.afcq
    public final String fj() {
        Uri parse = Uri.parse(this.b);
        parse.getClass();
        return "Variation(quality=" + this.f + ", format=" + this.a + ", url='" + aeke.bn(parse) + "', widthPx=" + this.c + ", heightPx=" + this.d + ", sizeBytes=" + this.g + ", source=" + this.e + ")";
    }

    public final int hashCode() {
        int hashCode = (((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        afqq afqqVar = this.e;
        return (((((((hashCode * 31) + this.c) * 31) + this.d) * 31) + a.A(this.g)) * 31) + afqqVar.hashCode();
    }

    @Override // defpackage.afsm, defpackage.afcv
    public final String i() {
        return this.b;
    }

    @Override // defpackage.afsl
    public final int j() {
        return this.d;
    }

    @Override // defpackage.afsl
    public final int k() {
        return this.c;
    }

    @Override // defpackage.afsm
    public final /* synthetic */ afru l() {
        return this.a;
    }

    @Override // defpackage.afso
    public final /* synthetic */ afsw m() {
        return this.h;
    }

    @Override // defpackage.afsm
    public final afsz n() {
        return this.f;
    }

    @Override // defpackage.afsm
    public final Map o() {
        return null;
    }

    public final String toString() {
        return "Variation(quality=" + this.f + ", format=" + this.a + ", url=" + this.b + ", widthPx=" + this.c + ", heightPx=" + this.d + ", sizeBytes=" + this.g + ", source=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f.name());
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.g);
        parcel.writeParcelable(this.e, i);
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }
}
