package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jny implements myn, jnr {
    public final boolean a;
    public final boolean b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final Size f;
    private final String g;
    private final Duration h;
    private final Instant i;

    public jny(String str, Uri uri, Uri uri2, Size size, Duration duration, Instant instant, boolean z, boolean z2) {
        str.getClass();
        this.c = str;
        this.d = uri;
        this.e = uri2;
        this.f = size;
        this.g = null;
        this.h = duration;
        this.i = instant;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.myn
    public final long a() {
        return this.i.toEpochMilli();
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return this.e;
    }

    @Override // defpackage.myn
    public final Uri c() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.d;
    }

    @Override // defpackage.myt
    public final Size e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jny)) {
            return false;
        }
        jny jnyVar = (jny) obj;
        if (!d.F(this.c, jnyVar.c) || !d.F(this.d, jnyVar.d) || !d.F(this.e, jnyVar.e) || !d.F(this.f, jnyVar.f)) {
            return false;
        }
        String str = jnyVar.g;
        if (d.F(null, null) && d.F(this.h, jnyVar.h) && d.F(this.i, jnyVar.i) && this.a == jnyVar.a && this.b == jnyVar.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ boolean fk() {
        return lga.aE(this);
    }

    @Override // defpackage.mxf
    public final myz fl() {
        return null;
    }

    @Override // defpackage.myn
    public final Optional h() {
        return Optional.ofNullable(Long.valueOf(this.h.toMillis()));
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() * 31) + this.d.hashCode();
        Uri uri = this.e;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return (((((((((((hashCode2 * 31) + hashCode) * 31) + this.f.hashCode()) * 961) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a.v(this.a)) * 31) + a.v(this.b);
    }

    @Override // defpackage.myt
    public final String i() {
        return null;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.c;
    }

    @Override // defpackage.myn
    public final boolean k() {
        return this.a;
    }

    @Override // defpackage.myn
    public final boolean l() {
        return this.b;
    }

    @Override // defpackage.myn
    public final int m() {
        return 0;
    }

    public final String toString() {
        String str;
        Uri uri = this.e;
        String bf = yyb.bf(this.d);
        if (uri != null) {
            str = yyb.bf(uri);
        } else {
            str = null;
        }
        return "MapiVideoContent(contentType=" + this.c + ", uri=" + bf + ", originalUri=" + str + ", size=" + this.f + ", caption=null, duration=" + this.h + ", mediaModifiedTimestamp=" + this.i + ", isResizable=" + this.a + ", saveToExternalStorage=" + this.b + ")";
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
