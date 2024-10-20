package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnq implements mxh, jnr {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final Duration d;
    private final mvy e;
    private final aggp f;

    public jnq(String str, Uri uri, Duration duration, aggp aggpVar) {
        str.getClass();
        this.a = str;
        this.b = uri;
        this.c = null;
        this.d = duration;
        this.e = null;
        this.f = aggpVar;
    }

    @Override // defpackage.mxh
    public final mvy a() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.mxh
    public final aggp c() {
        return this.f;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.b;
    }

    @Override // defpackage.mxh
    public final Duration e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnq)) {
            return false;
        }
        jnq jnqVar = (jnq) obj;
        if (!d.F(this.a, jnqVar.a) || !d.F(this.b, jnqVar.b)) {
            return false;
        }
        Uri uri = jnqVar.c;
        if (!d.F(null, null) || !d.F(this.d, jnqVar.d)) {
            return false;
        }
        mvy mvyVar = jnqVar.e;
        if (d.F(null, null) && d.F(this.f, jnqVar.f)) {
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

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode()) * 961) + this.f.hashCode();
    }

    @Override // defpackage.mym
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return "MapiAudioContent(contentType=" + this.a + ", uri=" + yyb.bf(this.b) + ", originalUri=null, duration=" + this.d + ", voiceTranscription=null, voiceMetadata=" + this.f + ")";
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
