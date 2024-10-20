package androidx.compose.foundation.gestures;

import defpackage.a;
import defpackage.afl;
import defpackage.agq;
import defpackage.ags;
import defpackage.ahf;
import defpackage.ahl;
import defpackage.ahp;
import defpackage.ahy;
import defpackage.aia;
import defpackage.aig;
import defpackage.aii;
import defpackage.ajr;
import defpackage.arqr;
import defpackage.cga;
import defpackage.cqa;
import defpackage.cyg;
import defpackage.czl;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollableElement extends cyg<aia> {
    private final aig a;
    private final ahp b;
    private final afl c;
    private final boolean d;
    private final boolean f;
    private final ahl g;
    private final ajr h;
    private final agq i;

    public ScrollableElement(aig aigVar, ahp ahpVar, afl aflVar, boolean z, boolean z2, ahl ahlVar, ajr ajrVar, agq agqVar) {
        this.a = aigVar;
        this.b = ahpVar;
        this.c = aflVar;
        this.d = z;
        this.f = z2;
        this.g = ahlVar;
        this.h = ajrVar;
        this.i = agqVar;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new aia(this.a, this.c, this.g, this.b, this.d, this.f, this.h, this.i);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        boolean z;
        ahl ahlVar;
        boolean z2;
        ahp ahpVar;
        aia aiaVar = (aia) cVar;
        boolean z3 = ((ahf) aiaVar).c;
        boolean z4 = this.d;
        boolean z5 = false;
        if (z3 != z4) {
            aiaVar.l.a = z4;
            aiaVar.i.b = z4;
            z = true;
        } else {
            z = false;
        }
        ahl ahlVar2 = this.g;
        if (ahlVar2 == null) {
            ahlVar = aiaVar.j;
        } else {
            ahlVar = ahlVar2;
        }
        aig aigVar = this.a;
        aii aiiVar = aiaVar.k;
        cqa cqaVar = aiaVar.h;
        if (!d.F(aiiVar.a, aigVar)) {
            aiiVar.a = aigVar;
            z5 = true;
        }
        afl aflVar = this.c;
        ahp ahpVar2 = this.b;
        aiiVar.b = aflVar;
        if (aiiVar.d != ahpVar2) {
            aiiVar.d = ahpVar2;
            z5 = true;
        }
        boolean z6 = this.f;
        if (aiiVar.e != z6) {
            aiiVar.e = z6;
            z2 = true;
        } else {
            z2 = z5;
        }
        agq agqVar = this.i;
        aiiVar.c = ahlVar;
        aiiVar.f = cqaVar;
        ags agsVar = aiaVar.m;
        agsVar.a = ahpVar2;
        agsVar.c = z6;
        agsVar.d = agqVar;
        aiaVar.f = aflVar;
        aiaVar.g = ahlVar2;
        aii aiiVar2 = aiaVar.k;
        arqr arqrVar = ahy.a;
        if (aiiVar2.j()) {
            ahpVar = ahp.a;
        } else {
            ahpVar = ahp.b;
        }
        aiaVar.y(arqrVar, z4, this.h, ahpVar, z2);
        if (z) {
            aiaVar.n = null;
            aiaVar.o = null;
            czl.a(aiaVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (d.F(this.a, scrollableElement.a) && this.b == scrollableElement.b && d.F(this.c, scrollableElement.c) && this.d == scrollableElement.d && this.f == scrollableElement.f && d.F(this.g, scrollableElement.g) && d.F(this.h, scrollableElement.h) && d.F(this.i, scrollableElement.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        afl aflVar = this.c;
        int i4 = 0;
        if (aflVar != null) {
            i = aflVar.hashCode();
        } else {
            i = 0;
        }
        int v = ((((((hashCode * 31) + i) * 31) + a.v(this.d)) * 31) + a.v(this.f)) * 31;
        ahl ahlVar = this.g;
        if (ahlVar != null) {
            i2 = ahlVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (v + i2) * 31;
        ajr ajrVar = this.h;
        if (ajrVar != null) {
            i3 = ajrVar.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        agq agqVar = this.i;
        if (agqVar != null) {
            i4 = agqVar.hashCode();
        }
        return i6 + i4;
    }
}
