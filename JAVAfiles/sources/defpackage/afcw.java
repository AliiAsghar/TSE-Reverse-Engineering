package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afcw implements afcv {
    public final afsx a;
    public final String b;
    public final long c;
    public final String d;
    private final Instant e;
    private final afcp f;

    public afcw(afsx afsxVar, String str, long j, String str2, Instant instant, afcp afcpVar) {
        afsxVar.getClass();
        str.getClass();
        instant.getClass();
        afcpVar.getClass();
        this.a = afsxVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = instant;
        this.f = afcpVar;
    }

    @Override // defpackage.afcv
    public final long b() {
        return this.c;
    }

    @Override // defpackage.afcv
    public final afsx d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afcw)) {
            return false;
        }
        afcw afcwVar = (afcw) obj;
        if (d.F(this.a, afcwVar.a) && d.F(this.b, afcwVar.b) && this.c == afcwVar.c && d.F(this.d, afcwVar.d) && d.F(this.e, afcwVar.e) && d.F(this.f, afcwVar.f)) {
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
        return this.d;
    }

    @Override // defpackage.afcv
    public final /* synthetic */ String h() {
        return aeke.ci(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((((hashCode2 * 31) + a.A(this.c)) * 31) + hashCode) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @Override // defpackage.afcv
    public final String i() {
        return this.b;
    }

    public final String toString() {
        return "LocalFile(mediaType=" + this.a + ", url=" + this.b + ", sizeBytes=" + this.c + ", displayName=" + this.d + ", dateModified=" + this.e + ", source=" + this.f + ")";
    }
}
