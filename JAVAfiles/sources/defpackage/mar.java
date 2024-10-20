package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mar {
    public mbb a;
    private amfq b;
    private mbt c;
    private Optional d;
    private Optional e;
    private Optional f;
    private int g;

    public mar() {
        throw null;
    }

    public final void a(amfq amfqVar, mbt mbtVar) {
        mbb d = d();
        h(amfqVar);
        f(mbtVar);
        this.g = 2;
        d.b(c());
    }

    public final void b(amfq amfqVar, mbt mbtVar) {
        mbb d = d();
        h(amfqVar);
        f(mbtVar);
        this.g = 3;
        d.b(c());
    }

    public final mas c() {
        mbt mbtVar;
        int i;
        mbb mbbVar;
        amfq amfqVar = this.b;
        if (amfqVar != null && (mbtVar = this.c) != null && (i = this.g) != 0 && (mbbVar = this.a) != null) {
            return new mas(amfqVar, mbtVar, i, this.d, mbbVar, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" event");
        }
        if (this.c == null) {
            sb.append(" logSpec");
        }
        if (this.g == 0) {
            sb.append(" logPurpose");
        }
        if (this.a == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final mbb d() {
        mbb mbbVar = this.a;
        if (mbbVar != null) {
            return mbbVar;
        }
        throw new IllegalStateException("Property \"logger\" has not been set");
    }

    public final void e(amrs amrsVar) {
        this.f = Optional.of(amrsVar);
    }

    public final void f(mbt mbtVar) {
        if (mbtVar != null) {
            this.c = mbtVar;
            return;
        }
        throw new NullPointerException("Null logSpec");
    }

    public final void g(mbh mbhVar) {
        this.e = Optional.of(mbhVar);
    }

    public final void h(amfq amfqVar) {
        if (amfqVar != null) {
            this.b = amfqVar;
            return;
        }
        throw new NullPointerException("Null event");
    }

    public mar(byte[] bArr) {
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
    }
}
