package defpackage;

import androidx.compose.foundation.selection.SelectableElement;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avt {

    /* compiled from: PG */
    /* renamed from: avt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ aev a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ dgv d;
        final /* synthetic */ arqg e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(aev aevVar, boolean z, boolean z2, dgv dgvVar, arqg arqgVar) {
            super(3);
            this.a = aevVar;
            this.b = z;
            this.c = z2;
            this.d = dgvVar;
            this.e = arqgVar;
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
            cga a = aex.a(cga.e, ajrVar, this.a).a(new SelectableElement(this.b, ajrVar, null, this.c, this.d, this.e));
            bwjVar.q();
            return a;
        }
    }

    public static final cga a(cga cgaVar, boolean z, ajr ajrVar, aev aevVar, boolean z2, dgv dgvVar, arqg arqgVar) {
        cga g;
        if (aevVar instanceof afa) {
            g = new SelectableElement(z, ajrVar, (afa) aevVar, z2, dgvVar, arqgVar);
        } else if (aevVar == null) {
            g = new SelectableElement(z, ajrVar, null, z2, dgvVar, arqgVar);
        } else if (ajrVar == null) {
            g = cfv.g(cga.e, new AnonymousClass1(aevVar, z, z2, dgvVar, arqgVar));
        } else {
            g = aex.a(cga.e, ajrVar, aevVar).a(new SelectableElement(z, ajrVar, null, z2, dgvVar, arqgVar));
        }
        return cgaVar.a(g);
    }
}
