package androidx.compose.foundation.lazy.layout;

import defpackage.a;
import defpackage.ahp;
import defpackage.arqg;
import defpackage.asr;
import defpackage.ast;
import defpackage.cga;
import defpackage.cyg;
import defpackage.czl;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsModifier extends cyg<ast> {
    private final arqg a;
    private final asr b;
    private final ahp c;
    private final boolean d;
    private final boolean f;

    public LazyLayoutSemanticsModifier(arqg arqgVar, asr asrVar, ahp ahpVar, boolean z, boolean z2) {
        this.a = arqgVar;
        this.b = asrVar;
        this.c = ahpVar;
        this.d = z;
        this.f = z2;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new ast(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        ast astVar = (ast) cVar;
        astVar.a = this.a;
        astVar.b = this.b;
        ahp ahpVar = astVar.c;
        ahp ahpVar2 = this.c;
        if (ahpVar != ahpVar2) {
            astVar.c = ahpVar2;
            czl.a(astVar);
        }
        boolean z = this.f;
        boolean z2 = this.d;
        if (astVar.d == z2 && astVar.e == z) {
            return;
        }
        astVar.d = z2;
        astVar.e = z;
        astVar.a();
        czl.a(astVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        if (this.a == lazyLayoutSemanticsModifier.a && d.F(this.b, lazyLayoutSemanticsModifier.b) && this.c == lazyLayoutSemanticsModifier.c && this.d == lazyLayoutSemanticsModifier.d && this.f == lazyLayoutSemanticsModifier.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.v(this.d)) * 31) + a.v(this.f);
    }
}
