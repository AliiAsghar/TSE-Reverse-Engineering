package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aftq implements aftr, afsl {
    public static final Parcelable.Creator<aftq> CREATOR = new aftg(8);
    public final aftm a;
    public final String b;
    public final int c;
    public final int d;
    public final Instant e;
    public final afcp f;
    public final Duration g;
    private final Map h;
    private final String i;
    private final long j;

    public aftq(aftm aftmVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, afcp afcpVar, Duration duration) {
        aftmVar.getClass();
        str.getClass();
        instant.getClass();
        afcpVar.getClass();
        duration.getClass();
        this.a = aftmVar;
        this.b = str;
        this.h = map;
        this.i = str2;
        this.c = i;
        this.d = i2;
        this.j = j;
        this.e = instant;
        this.f = afcpVar;
        this.g = duration;
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
        if (!(obj instanceof aftq)) {
            return false;
        }
        aftq aftqVar = (aftq) obj;
        if (d.F(this.a, aftqVar.a) && d.F(this.b, aftqVar.b) && d.F(this.h, aftqVar.h) && d.F(this.i, aftqVar.i) && this.c == aftqVar.c && this.d == aftqVar.d && this.j == aftqVar.j && d.F(this.e, aftqVar.e) && d.F(this.f, aftqVar.f) && d.F(this.g, aftqVar.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afcv
    public final Instant f() {
        return this.e;
    }

    @Override // defpackage.afcq
    public final afcp fh() {
        return this.f;
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
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Map map = this.h;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        String str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((((((i2 + i) * 31) + this.c) * 31) + this.d) * 31) + a.A(this.j)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
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
        return "Video(format=" + this.a + ", url=" + this.b + ", headers=" + this.h + ", displayName=" + this.i + ", widthPx=" + this.c + ", heightPx=" + this.d + ", sizeBytes=" + this.j + ", dateModified=" + this.e + ", source=" + this.f + ", duration=" + this.g + ")";
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
        parcel.writeString(this.i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.j);
        parcel.writeSerializable(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeSerializable(this.g);
    }

    public /* synthetic */ aftq(aftm aftmVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, afcp afcpVar, Duration duration, int i3) {
        this(aftmVar, str, (i3 & 4) != 0 ? null : map, (i3 & 8) != 0 ? null : str2, i, i2, j, instant, afcpVar, duration);
    }
}
