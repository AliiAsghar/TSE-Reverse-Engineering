package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgw implements jgx, afcs {
    public final afsx a;
    public final Uri b;
    public final Long c;
    public final afcp d;
    private final Object e;

    public jgw(afsx afsxVar, Uri uri, Long l, afcp afcpVar) {
        afsxVar.getClass();
        uri.getClass();
        afcpVar.getClass();
        this.a = afsxVar;
        this.b = uri;
        this.c = l;
        this.d = afcpVar;
        String uri2 = uri.toString();
        uri2.getClass();
        this.e = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgw)) {
            return false;
        }
        jgw jgwVar = (jgw) obj;
        if (d.F(this.a, jgwVar.a) && d.F(this.b, jgwVar.b) && d.F(this.c, jgwVar.c) && d.F(this.d, jgwVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afcs
    public final Object fi() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Long l = this.c;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Unresolved(mediaType=" + this.a + ", uri=" + yyb.bf(this.b) + ", sizeBytes=" + this.c + ", source=" + this.d + ")";
    }
}
