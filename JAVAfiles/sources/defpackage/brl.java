package defpackage;

import defpackage.bwj;
import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brl extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ brj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brl(brj brjVar) {
        super(3);
        this.a = brjVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga c;
        float f;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-1541271084);
        cas b = zl.b(this.a.b, bnu.a(buz.a, bwjVar), bwjVar, 0, 12);
        cas b2 = zl.b(this.a.a, bnu.a(buz.a, bwjVar), bwjVar, 0, 12);
        c = amv.c((cga) obj, 1.0f);
        int i = cfq.a;
        cga v = amv.v(c, cfq.a.g, 2);
        boolean G = bwjVar.G(b2);
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = new brk(b2);
            bwjVar.B(h);
        }
        cga a = amd.a(v, (arqr) h);
        f = ((dqy) b.a()).a;
        cga l = amv.l(a, f);
        bwjVar.q();
        return l;
    }
}
