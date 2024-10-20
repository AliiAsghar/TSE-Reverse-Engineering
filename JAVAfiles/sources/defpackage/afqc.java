package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqc implements aftr, afsl {
    public static final Parcelable.Creator<afqc> CREATOR = new afqb(0);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final afsk e;
    public final int f;
    public final int g;
    private final Map h;
    private final String i;
    private final long j;
    private final Instant k;
    private final afcp l;

    public /* synthetic */ afqc(String str, String str2, String str3, boolean z, afsk afskVar, Map map, String str4, int i, int i2, long j, Instant instant, afcp afcpVar, int i3) {
        afsk afskVar2;
        Map map2;
        String str5;
        int i4;
        long j2;
        Instant instant2;
        boolean z2;
        afcp afcpVar2;
        if ((i3 & 16) != 0) {
            afskVar2 = afse.a;
        } else {
            afskVar2 = afskVar;
        }
        if ((i3 & 32) != 0) {
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i3 & 64) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
        if ((i3 & 128) != 0) {
            i4 = 512;
        } else {
            i4 = i;
        }
        int i5 = (i3 & 256) == 0 ? i2 : 512;
        if ((i3 & 512) != 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i3 & 1024) != 0) {
            instant2 = Instant.EPOCH;
        } else {
            instant2 = instant;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z2 & z;
        if ((i3 & 2048) != 0) {
            aozy createBuilder = afty.a.createBuilder();
            createBuilder.getClass();
            if (z3) {
                aozy createBuilder2 = aftx.a.createBuilder();
                createBuilder2.getClass();
                afwv.p(afwv.m(createBuilder2), createBuilder);
            } else {
                aozy createBuilder3 = aftw.a.createBuilder();
                createBuilder3.getClass();
                afwv.o(afwv.E(createBuilder3), createBuilder);
            }
            afcpVar2 = new afqe(afwv.n(createBuilder));
        } else {
            afcpVar2 = afcpVar;
        }
        String str6 = (i3 & 4) == 0 ? str3 : null;
        str.getClass();
        str2.getClass();
        afskVar2.getClass();
        instant2.getClass();
        afcpVar2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str6;
        this.d = z3;
        this.e = afskVar2;
        this.h = map2;
        this.i = str5;
        this.f = i4;
        this.g = i5;
        this.j = j2;
        this.k = instant2;
        this.l = afcpVar2;
    }

    @Override // defpackage.afsm, defpackage.afcv
    public final long b() {
        return this.j;
    }

    @Override // defpackage.afts, defpackage.afsm, defpackage.afcv
    public final /* synthetic */ afsx d() {
        return afwv.F(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afqc)) {
            return false;
        }
        afqc afqcVar = (afqc) obj;
        if (d.F(this.a, afqcVar.a) && d.F(this.b, afqcVar.b) && d.F(this.c, afqcVar.c) && this.d == afqcVar.d && d.F(this.e, afqcVar.e) && d.F(this.h, afqcVar.h) && d.F(this.i, afqcVar.i) && this.f == afqcVar.f && this.g == afqcVar.g && this.j == afqcVar.j && d.F(this.k, afqcVar.k) && d.F(this.l, afqcVar.l)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afcv
    public final Instant f() {
        return this.k;
    }

    @Override // defpackage.afcq
    public final afcp fh() {
        return this.l;
    }

    @Override // defpackage.afcs
    public final /* bridge */ /* synthetic */ Object fi() {
        Object h;
        h = h();
        return h;
    }

    @Override // defpackage.afcq
    public final /* synthetic */ String fj() {
        return toString();
    }

    @Override // defpackage.afcv
    public final String g() {
        return this.i;
    }

    @Override // defpackage.afcv
    public final /* synthetic */ String h() {
        return aeke.ci(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int v = ((((((hashCode3 * 31) + hashCode) * 31) + a.v(this.d)) * 31) + this.e.hashCode()) * 31;
        Map map = this.h;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i2 = (v + hashCode2) * 31;
        String str2 = this.i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((((i2 + i) * 31) + this.f) * 31) + this.g) * 31) + a.A(this.j)) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    @Override // defpackage.afsm, defpackage.afcv
    public final String i() {
        return this.b;
    }

    @Override // defpackage.afsl
    public final int j() {
        return this.g;
    }

    @Override // defpackage.afsl
    public final int k() {
        return this.f;
    }

    @Override // defpackage.afsm
    public final /* synthetic */ afru l() {
        return this.e;
    }

    @Override // defpackage.afso
    public final /* synthetic */ afsw m() {
        return afwv.I(this);
    }

    @Override // defpackage.afsm
    public final /* synthetic */ afsz n() {
        return afsz.d;
    }

    @Override // defpackage.afsm
    public final Map o() {
        return this.h;
    }

    public final String toString() {
        return "CustomSticker(id=" + this.a + ", url=" + this.b + ", originId=" + this.c + ", selfOwned=" + this.d + ", format=" + this.e + ", headers=" + this.h + ", displayName=" + this.i + ", widthPx=" + this.f + ", heightPx=" + this.g + ", sizeBytes=" + this.j + ", dateModified=" + this.k + ", source=" + this.l + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
