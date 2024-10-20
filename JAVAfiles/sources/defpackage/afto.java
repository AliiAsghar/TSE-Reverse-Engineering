package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afto implements aftr, afsl {
    public static final Parcelable.Creator<afto> CREATOR = new aftg(7);
    public final afsk a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final Instant f;
    public final afcp g;
    private final Map h;
    private final long i;

    public afto(afsk afskVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, afcp afcpVar) {
        afskVar.getClass();
        str.getClass();
        instant.getClass();
        afcpVar.getClass();
        this.a = afskVar;
        this.b = str;
        this.h = map;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.i = j;
        this.f = instant;
        this.g = afcpVar;
    }

    @Override // defpackage.afsm, defpackage.afcv
    public final long b() {
        return this.i;
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
        if (!(obj instanceof afto)) {
            return false;
        }
        afto aftoVar = (afto) obj;
        if (d.F(this.a, aftoVar.a) && d.F(this.b, aftoVar.b) && d.F(this.h, aftoVar.h) && d.F(this.c, aftoVar.c) && this.d == aftoVar.d && this.e == aftoVar.e && this.i == aftoVar.i && d.F(this.f, aftoVar.f) && d.F(this.g, aftoVar.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afcv
    public final Instant f() {
        return this.f;
    }

    @Override // defpackage.afcq
    public final afcp fh() {
        return this.g;
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
        return this.c;
    }

    @Override // defpackage.afcv
    public final /* synthetic */ String h() {
        return aeke.ci(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Map map = this.h;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((((i2 + i) * 31) + this.d) * 31) + this.e) * 31) + a.A(this.i)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    @Override // defpackage.afsm, defpackage.afcv
    public final String i() {
        return this.b;
    }

    @Override // defpackage.afsl
    public final int j() {
        return this.e;
    }

    @Override // defpackage.afsl
    public final int k() {
        return this.d;
    }

    @Override // defpackage.afsm
    public final /* synthetic */ afru l() {
        return this.a;
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
        return "Image(format=" + this.a + ", url=" + this.b + ", headers=" + this.h + ", displayName=" + this.c + ", widthPx=" + this.d + ", heightPx=" + this.e + ", sizeBytes=" + this.i + ", dateModified=" + this.f + ", source=" + this.g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        Map map = this.h;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.i);
        parcel.writeSerializable(this.f);
        parcel.writeParcelable(this.g, i);
    }

    public /* synthetic */ afto(afsk afskVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, afcp afcpVar, int i3) {
        this(afskVar, str, (i3 & 4) != 0 ? null : map, (i3 & 8) != 0 ? null : str2, i, i2, j, instant, afcpVar);
    }
}
