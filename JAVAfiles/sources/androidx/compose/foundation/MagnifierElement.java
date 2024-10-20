package androidx.compose.foundation;

import android.view.View;
import defpackage.a;
import defpackage.afb;
import defpackage.afn;
import defpackage.arqr;
import defpackage.cga;
import defpackage.cwp;
import defpackage.cwq;
import defpackage.cyg;
import defpackage.d;
import defpackage.dqv;
import defpackage.dqy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MagnifierElement extends cyg<afb> {
    private final arqr a;
    private final arqr c;
    private final afn f;
    private final arqr b = null;
    private final float d = Float.NaN;

    public MagnifierElement(arqr arqrVar, arqr arqrVar2, afn afnVar) {
        this.a = arqrVar;
        this.c = arqrVar2;
        this.f = afnVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new afb(this.a, this.c, this.f);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        afb afbVar = (afb) cVar;
        float f = afbVar.c;
        long j = afbVar.e;
        float f2 = afbVar.f;
        boolean z = afbVar.d;
        float f3 = afbVar.g;
        boolean z2 = afbVar.h;
        afn afnVar = afbVar.i;
        View view = afbVar.j;
        dqv dqvVar = afbVar.k;
        afbVar.a = this.a;
        afbVar.c = Float.NaN;
        afbVar.d = true;
        afbVar.e = 9205357640488583168L;
        afbVar.f = Float.NaN;
        afbVar.g = Float.NaN;
        afbVar.h = true;
        afbVar.b = this.c;
        afn afnVar2 = this.f;
        afbVar.i = afnVar2;
        View a = cwq.a(afbVar);
        dqv h = cwp.h(afbVar);
        if (afbVar.l != null && (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && f != Float.NaN && !afnVar2.b()) || !a.bB(9205357640488583168L, j) || !dqy.b(Float.NaN, f2) || !dqy.b(Float.NaN, f3) || !z || !z2 || !d.F(afnVar2, afnVar) || !d.F(a, view) || !d.F(h, dqvVar))) {
            afbVar.b();
        }
        afbVar.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        if (this.a != magnifierElement.a) {
            return false;
        }
        arqr arqrVar = magnifierElement.b;
        float f = magnifierElement.d;
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 961) + Float.floatToIntBits(Float.NaN)) * 31) + 1231) * 31) + a.A(9205357640488583168L)) * 31) + Float.floatToIntBits(Float.NaN)) * 31) + Float.floatToIntBits(Float.NaN)) * 31) + 1231) * 31) + this.c.hashCode()) * 31) + this.f.hashCode();
    }
}
