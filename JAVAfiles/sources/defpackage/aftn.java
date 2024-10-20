package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aftn implements afts, afsm {
    public static final Parcelable.Creator<aftn> CREATOR = new aftg(6);
    public final afrs a;
    public final String b;
    public final String c;
    public final afcp d;
    public final Duration e;
    public final aggp f;
    private final Map g;
    private final long h;
    private final Instant i;

    public aftn(afrs afrsVar, String str, Map map, String str2, long j, Instant instant, afcp afcpVar, Duration duration, aggp aggpVar) {
        afrsVar.getClass();
        str.getClass();
        instant.getClass();
        afcpVar.getClass();
        duration.getClass();
        aggpVar.getClass();
        this.a = afrsVar;
        this.b = str;
        this.g = map;
        this.c = str2;
        this.h = j;
        this.i = instant;
        this.d = afcpVar;
        this.e = duration;
        this.f = aggpVar;
    }

    public static /* synthetic */ aftn j(aftn aftnVar, aggp aggpVar) {
        return new aftn(aftnVar.a, aftnVar.b, aftnVar.g, aftnVar.c, aftnVar.h, aftnVar.i, aftnVar.d, aftnVar.e, aggpVar);
    }

    @Override // defpackage.afsm, defpackage.afcv
    public final long b() {
        return this.h;
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
        if (!(obj instanceof aftn)) {
            return false;
        }
        aftn aftnVar = (aftn) obj;
        if (d.F(this.a, aftnVar.a) && d.F(this.b, aftnVar.b) && d.F(this.g, aftnVar.g) && d.F(this.c, aftnVar.c) && this.h == aftnVar.h && d.F(this.i, aftnVar.i) && d.F(this.d, aftnVar.d) && d.F(this.e, aftnVar.e) && d.F(this.f, aftnVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afcv
    public final Instant f() {
        return this.i;
    }

    @Override // defpackage.afcq
    public final afcp fh() {
        return this.d;
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
        Map map = this.g;
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
        return ((((((((((i2 + i) * 31) + a.A(this.h)) * 31) + this.i.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @Override // defpackage.afsm, defpackage.afcv
    public final String i() {
        return this.b;
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
        return this.g;
    }

    public final String toString() {
        return "Audio(format=" + this.a + ", url=" + this.b + ", headers=" + this.g + ", displayName=" + this.c + ", sizeBytes=" + this.h + ", dateModified=" + this.i + ", source=" + this.d + ", duration=" + this.e + ", voiceMetadata=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        Map map = this.g;
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
        parcel.writeLong(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeParcelable(this.d, i);
        parcel.writeSerializable(this.e);
        aowt.g(parcel, this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ aftn(defpackage.afrs r14, java.lang.String r15, java.util.Map r16, java.lang.String r17, long r18, j$.time.Instant r20, defpackage.afcp r21, j$.time.Duration r22, defpackage.aggp r23, int r24) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto La
            aggp r1 = defpackage.aggp.a
            r12 = r1
            goto Lc
        La:
            r12 = r23
        Lc:
            r1 = r0 & 8
            r0 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L15
            r6 = r2
            goto L17
        L15:
            r6 = r17
        L17:
            if (r0 == 0) goto L1b
            r5 = r2
            goto L1d
        L1b:
            r5 = r16
        L1d:
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aftn.<init>(afrs, java.lang.String, java.util.Map, java.lang.String, long, j$.time.Instant, afcp, j$.time.Duration, aggp, int):void");
    }
}
