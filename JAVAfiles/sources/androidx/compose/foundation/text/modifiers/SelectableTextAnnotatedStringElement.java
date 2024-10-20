package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.arqr;
import defpackage.awn;
import defpackage.bbu;
import defpackage.bbw;
import defpackage.bca;
import defpackage.cga;
import defpackage.ckx;
import defpackage.cxl;
import defpackage.cyg;
import defpackage.d;
import defpackage.dhv;
import defpackage.dje;
import defpackage.dli;
import defpackage.dqq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends cyg<bbu> {
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
    private final bbw l;
    private final ckx m;
    private final awn n = null;

    public SelectableTextAnnotatedStringElement(dhv dhvVar, dje djeVar, dli.a aVar, arqr arqrVar, int i, boolean z, int i2, int i3, List list, arqr arqrVar2, bbw bbwVar, ckx ckxVar) {
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
        this.l = bbwVar;
        this.m = ckxVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new bbu(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        bbu bbuVar = (bbu) cVar;
        bca bcaVar = bbuVar.b;
        ckx ckxVar = this.m;
        dje djeVar = this.b;
        arqr arqrVar = this.d;
        arqr arqrVar2 = this.k;
        bbw bbwVar = this.l;
        bcaVar.i(bcaVar.l(ckxVar, djeVar), bcaVar.m(this.a), bcaVar.n(djeVar, this.j, this.i, this.h, this.g, this.c, this.f), bcaVar.k(arqrVar, arqrVar2, bbwVar, null));
        bbuVar.a = bbwVar;
        cxl.b(bbuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (!d.F(this.m, selectableTextAnnotatedStringElement.m) || !d.F(this.a, selectableTextAnnotatedStringElement.a) || !d.F(this.b, selectableTextAnnotatedStringElement.b) || !d.F(this.j, selectableTextAnnotatedStringElement.j) || !d.F(this.c, selectableTextAnnotatedStringElement.c)) {
            return false;
        }
        awn awnVar = selectableTextAnnotatedStringElement.n;
        if (d.F(null, null) && this.d == selectableTextAnnotatedStringElement.d && a.bA(this.f, selectableTextAnnotatedStringElement.f) && this.g == selectableTextAnnotatedStringElement.g && this.h == selectableTextAnnotatedStringElement.h && this.i == selectableTextAnnotatedStringElement.i && this.k == selectableTextAnnotatedStringElement.k && d.F(this.l, selectableTextAnnotatedStringElement.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        arqr arqrVar = this.d;
        int i4 = 0;
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
        int i5 = (v + i2) * 31;
        arqr arqrVar2 = this.k;
        if (arqrVar2 != null) {
            i3 = arqrVar2.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = ((i5 + i3) * 31) + this.l.hashCode();
        ckx ckxVar = this.m;
        if (ckxVar != null) {
            i4 = ckxVar.hashCode();
        }
        return (hashCode2 * 961) + i4;
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.a) + ", style=" + this.b + ", fontFamilyResolver=" + this.c + ", onTextLayout=" + this.d + ", overflow=" + ((Object) dqq.a(this.f)) + ", softWrap=" + this.g + ", maxLines=" + this.h + ", minLines=" + this.i + ", placeholders=" + this.j + ", onPlaceholderLayout=" + this.k + ", selectionController=" + this.l + ", color=" + this.m + ", autoSize=null)";
    }
}
