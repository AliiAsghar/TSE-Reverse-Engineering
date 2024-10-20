package defpackage;

import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awl extends arrp implements arqw<cga, bwj, Integer, cga> {
    public static final awl a = new awl();

    public awl() {
        super(3);
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga cgaVar = (cga) obj;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-2126899193);
        long j = ((bfo) bwjVar.g(bfp.a)).a;
        cga.a aVar = cga.e;
        boolean F = bwjVar.F(j);
        Object h = bwjVar.h();
        if (F || h == bwj.a.a) {
            h = new awk(j);
            bwjVar.B(h);
        }
        cga a2 = cgaVar.a(cho.b(aVar, (arqr) h));
        bwjVar.q();
        return a2;
    }
}
