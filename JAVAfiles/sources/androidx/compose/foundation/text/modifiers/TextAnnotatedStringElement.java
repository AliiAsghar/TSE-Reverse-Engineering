package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.arqr;
import defpackage.bbw;
import defpackage.bca;
import defpackage.cga;
import defpackage.ckx;
import defpackage.cyg;
import defpackage.d;
import defpackage.dhv;
import defpackage.dje;
import defpackage.dli;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends cyg<bca> {
    private final dhv a;
    private final dje b;
    private final dli.a c;
    private final arqr d;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final List j;
    private final arqr k;
    private final bbw l = null;
    private final ckx m;
    private final arqr n;

    public TextAnnotatedStringElement(dhv dhvVar, dje djeVar, dli.a aVar, arqr arqrVar, int i, boolean z, int i2, int i3, List list, arqr arqrVar2, ckx ckxVar, arqr arqrVar3) {
        this.a = dhvVar;
        this.b = djeVar;
        this.c = aVar;
        this.d = arqrVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = arqrVar2;
        this.m = ckxVar;
        this.n = arqrVar3;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new bca(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, null, this.m, this.n);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        bca bcaVar = (bca) cVar;
        bcaVar.i(bcaVar.l(this.m, this.b), bcaVar.m(this.a), bcaVar.n(this.b, this.j, this.i, this.h, this.g, this.c, this.f), bcaVar.k(this.d, this.k, null, this.n));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (!d.F(this.m, textAnnotatedStringElement.m) || !d.F(this.a, textAnnotatedStringElement.a) || !d.F(this.b, textAnnotatedStringElement.b) || !d.F(this.j, textAnnotatedStringElement.j) || !d.F(this.c, textAnnotatedStringElement.c) || this.d != textAnnotatedStringElement.d || this.n != textAnnotatedStringElement.n || !a.bA(this.f, textAnnotatedStringElement.f) || this.g != textAnnotatedStringElement.g || this.h != textAnnotatedStringElement.h || this.i != textAnnotatedStringElement.i || this.k != textAnnotatedStringElement.k) {
            return false;
        }
        bbw bbwVar = textAnnotatedStringElement.l;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        arqr arqrVar = this.d;
        int i5 = 0;
        if (arqrVar != null) {
            i = arqrVar.hashCode();
        } else {
            i = 0;
        }
        int v = ((((((((((hashCode * 31) + i) * 31) + this.f) * 31) + a.v(this.g)) * 31) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (v + i2) * 31;
        arqr arqrVar2 = this.k;
        if (arqrVar2 != null) {
            i3 = arqrVar2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = i6 + i3;
        ckx ckxVar = this.m;
        if (ckxVar != null) {
            i4 = ckxVar.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = ((i7 * 961) + i4) * 31;
        arqr arqrVar3 = this.n;
        if (arqrVar3 != null) {
            i5 = arqrVar3.hashCode();
        }
        return i8 + i5;
    }
}
