package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nba {
    public final String a;
    public final Uri b;
    public final nfw c;
    public final atok d;
    private final boolean e;
    private final String f;
    private final rve g;

    public nba(String str, Uri uri, nfw nfwVar, atok atokVar) {
        uri.getClass();
        this.a = str;
        this.b = uri;
        this.e = false;
        this.c = nfwVar;
        this.d = atokVar;
        this.f = null;
        this.g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nba)) {
            return false;
        }
        nba nbaVar = (nba) obj;
        if (!d.F(this.a, nbaVar.a) || !d.F(this.b, nbaVar.b)) {
            return false;
        }
        boolean z = nbaVar.e;
        if (!d.F(this.c, nbaVar.c) || !d.F(this.d, nbaVar.d)) {
            return false;
        }
        String str = nbaVar.f;
        if (!d.F(null, null)) {
            return false;
        }
        rve rveVar = nbaVar.g;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 961;
    }

    public final String toString() {
        return "DefaultReactionMetadata(reactorName=" + this.a + ", reactorAvatar=" + this.b + ", isFromIos=false, selfIdentity=" + this.c + ", traceId=" + this.d + ", reactorProfileName=null, rcsMessageId=null)";
    }
}
