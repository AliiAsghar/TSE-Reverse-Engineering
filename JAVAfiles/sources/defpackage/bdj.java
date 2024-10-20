package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bdf;
import defpackage.bwj;
import defpackage.cga;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdj extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqv a;
    final /* synthetic */ bdy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdj(arqv arqvVar, bdy bdyVar) {
        super(2);
        this.a = arqvVar;
        this.b = bdyVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bcy f;
        Object bdiVar;
        dqh dqhVar;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            this.a.a(bwjVar, 0);
            if (this.b.A() && this.b.y() && !this.b.C() && (f = this.b.f()) != null) {
                bdy bdyVar = this.b;
                bwjVar.y(1495564158);
                List B = aqjn.B(true, false);
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    boolean booleanValue = ((Boolean) B.get(i)).booleanValue();
                    boolean H = bwjVar.H(booleanValue);
                    Object h = bwjVar.h();
                    if (H || h == bwj.a.a) {
                        h = new beb(booleanValue, bdyVar);
                        bwjVar.B(h);
                    }
                    ays aysVar = (ays) h;
                    boolean H2 = bwjVar.H(booleanValue);
                    Object h2 = bwjVar.h();
                    if (H2 || h2 == bwj.a.a) {
                        if (booleanValue) {
                            bdiVar = new bdh(bdyVar);
                        } else {
                            bdiVar = new bdi(bdyVar);
                        }
                        h2 = bdiVar;
                        bwjVar.B(h2);
                    }
                    arqg arqgVar = (arqg) h2;
                    if (booleanValue) {
                        dqhVar = f.a.a;
                    } else {
                        dqhVar = f.b.a;
                    }
                    dqh dqhVar2 = dqhVar;
                    bdf.AnonymousClass7 anonymousClass7 = new bdf.AnonymousClass7(arqgVar);
                    boolean z = f.c;
                    cga.a aVar = cga.e;
                    boolean I = bwjVar.I(aysVar);
                    Object h3 = bwjVar.h();
                    if (I || h3 == bwj.a.a) {
                        h3 = new bdg(aysVar);
                        bwjVar.B(h3);
                    }
                    bcd.d(anonymousClass7, booleanValue, dqhVar2, z, 0L, cru.a(aVar, aysVar, (PointerInputEventHandler) h3), bwjVar, 0);
                }
                bwjVar.q();
            }
        }
        return arnb.a;
    }
}
