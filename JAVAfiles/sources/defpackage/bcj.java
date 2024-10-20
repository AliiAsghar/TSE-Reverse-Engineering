package defpackage;

import defpackage.bwj;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcj extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ arqg a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcj(arqg arqgVar, boolean z) {
        super(3);
        this.a = arqgVar;
        this.b = z;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga cgaVar = (cga) obj;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-196777734);
        long j = ((bfo) bwjVar.g(bfp.a)).a;
        boolean F = bwjVar.F(j) | bwjVar.G(this.a) | bwjVar.H(this.b);
        Object h = bwjVar.h();
        if (F || h == bwj.a.a) {
            bci bciVar = new bci(j, this.a, this.b);
            bwjVar.B(bciVar);
            h = bciVar;
        }
        cga b = cho.b(cgaVar, (arqr) h);
        bwjVar.q();
        return b;
    }
}
