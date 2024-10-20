package androidx.compose.animation;

import defpackage.arqg;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;
import defpackage.xx;
import defpackage.yp;
import defpackage.zc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SkipToLookaheadElement extends cyg<zc> {
    private final xx a;
    private final arqg b;

    public SkipToLookaheadElement(xx xxVar, arqg arqgVar) {
        this.a = xxVar;
        this.b = arqgVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new zc(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        zc zcVar = (zc) cVar;
        zcVar.a.h(this.a);
        zcVar.b.h(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipToLookaheadElement)) {
            return false;
        }
        SkipToLookaheadElement skipToLookaheadElement = (SkipToLookaheadElement) obj;
        if (d.F(this.a, skipToLookaheadElement.a) && d.F(this.b, skipToLookaheadElement.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        xx xxVar = this.a;
        if (xxVar == null) {
            hashCode = 0;
        } else {
            hashCode = xxVar.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SkipToLookaheadElement(scaleToBounds=" + this.a + ", isEnabled=" + this.b + ')';
    }

    public SkipToLookaheadElement() {
        this(null, yp.a);
    }
}
