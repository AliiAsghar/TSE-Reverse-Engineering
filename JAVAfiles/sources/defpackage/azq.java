package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azq extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ arqr a;
    final /* synthetic */ ajr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azq(arqr arqrVar, ajr ajrVar) {
        super(3);
        this.a = arqrVar;
        this.b = ajrVar;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-102778667);
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            h = bxl.a(arpj.a, bwjVar);
            bwjVar.B(h);
        }
        arwe arweVar = (arwe) h;
        Object h2 = bwjVar.h();
        if (h2 == bwj.a.a) {
            byu byuVar = new byu(null, cav.a);
            bwjVar.B(byuVar);
            h2 = byuVar;
        }
        byn bynVar = (byn) h2;
        cas a = cap.a(this.a, bwjVar);
        ajr ajrVar = this.b;
        boolean G = bwjVar.G(ajrVar);
        ajr ajrVar2 = this.b;
        Object h3 = bwjVar.h();
        if (G || h3 == bwj.a.a) {
            h3 = new azo(bynVar, ajrVar2);
            bwjVar.B(h3);
        }
        bxl.c(ajrVar, (arqr) h3, bwjVar);
        ajr ajrVar3 = this.b;
        cga.a aVar = cga.e;
        boolean I = bwjVar.I(arweVar) | bwjVar.G(this.b) | bwjVar.G(a);
        ajr ajrVar4 = this.b;
        Object h4 = bwjVar.h();
        if (I || h4 == bwj.a.a) {
            h4 = new azp(arweVar, bynVar, ajrVar4, a);
            bwjVar.B(h4);
        }
        cga a2 = cru.a(aVar, ajrVar3, (PointerInputEventHandler) h4);
        bwjVar.q();
        return a2;
    }
}
