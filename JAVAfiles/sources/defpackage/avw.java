package defpackage;

import androidx.compose.foundation.selection.ToggleableElement;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avw {

    /* compiled from: PG */
    /* renamed from: avw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ aev a;
        final /* synthetic */ boolean b;
        final /* synthetic */ dgv c;
        final /* synthetic */ arqr d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(aev aevVar, boolean z, dgv dgvVar, arqr arqrVar) {
            super(3);
            this.a = aevVar;
            this.b = z;
            this.c = dgvVar;
            this.d = arqrVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(-1525724089);
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new ajs();
                bwjVar.B(h);
            }
            ajr ajrVar = (ajr) h;
            cga a = aex.a(cga.e, ajrVar, this.a).a(new ToggleableElement(this.b, ajrVar, null, this.c, this.d));
            bwjVar.q();
            return a;
        }
    }

    public static final cga a(cga cgaVar, boolean z, ajr ajrVar, aev aevVar, dgv dgvVar, arqr arqrVar) {
        cga g;
        if (aevVar instanceof afa) {
            g = new ToggleableElement(z, ajrVar, (afa) aevVar, dgvVar, arqrVar);
        } else if (aevVar == null) {
            g = new ToggleableElement(z, ajrVar, null, dgvVar, arqrVar);
        } else if (ajrVar == null) {
            g = cfv.g(cga.e, new AnonymousClass1(aevVar, z, dgvVar, arqrVar));
        } else {
            g = aex.a(cga.e, ajrVar, aevVar).a(new ToggleableElement(z, ajrVar, null, dgvVar, arqrVar));
        }
        return cgaVar.a(g);
    }
}
