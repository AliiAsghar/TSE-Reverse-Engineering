package defpackage;

import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azm extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ ayd a;
    final /* synthetic */ bfb b;
    final /* synthetic */ doj c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dob e;
    final /* synthetic */ bam f;
    final /* synthetic */ arqr g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azm(ayd aydVar, bfb bfbVar, doj dojVar, boolean z, dob dobVar, bam bamVar, arqr arqrVar, int i) {
        super(3);
        this.a = aydVar;
        this.b = bfbVar;
        this.c = dojVar;
        this.d = z;
        this.e = dobVar;
        this.f = bamVar;
        this.g = arqrVar;
        this.h = i;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(851809892);
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            h = new bfn();
            bwjVar.B(h);
        }
        bfn bfnVar = (bfn) h;
        Object h2 = bwjVar.h();
        if (h2 == bwj.a.a) {
            h2 = new axn();
            bwjVar.B(h2);
        }
        azk azkVar = new azk(this.a, this.b, this.c, this.d, bfnVar, this.e, this.f, (axn) h2, axy.a, this.g, this.h);
        cga.a aVar = cga.e;
        boolean I = bwjVar.I(azkVar);
        Object h3 = bwjVar.h();
        if (I || h3 == bwj.a.a) {
            h3 = new azl(azkVar);
            bwjVar.B(h3);
        }
        cga a = cpu.a(aVar, (arqr) ((arth) h3));
        bwjVar.q();
        return a;
    }
}
