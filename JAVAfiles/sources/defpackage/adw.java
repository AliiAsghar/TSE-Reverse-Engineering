package defpackage;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adw {

    /* compiled from: PG */
    /* renamed from: adw$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ aev a;
        final /* synthetic */ boolean b;
        final /* synthetic */ String c;
        final /* synthetic */ dgv d;
        final /* synthetic */ arqg e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(aev aevVar, boolean z, String str, dgv dgvVar, arqg arqgVar) {
            super(3);
            this.a = aevVar;
            this.b = z;
            this.c = str;
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
            cga a = aex.a(cga.e, ajrVar, this.a).a(new ClickableElement(ajrVar, null, this.b, this.c, this.d, this.e));
            bwjVar.q();
            return a;
        }
    }

    /* compiled from: PG */
    /* renamed from: adw$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ aev a;
        final /* synthetic */ boolean b;
        final /* synthetic */ dgv c;
        final /* synthetic */ arqg d;
        final /* synthetic */ arqg e;
        final /* synthetic */ arqg f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(aev aevVar, boolean z, dgv dgvVar, arqg arqgVar, arqg arqgVar2, arqg arqgVar3) {
            super(3);
            this.a = aevVar;
            this.b = z;
            this.c = dgvVar;
            this.d = arqgVar;
            this.e = arqgVar2;
            this.f = arqgVar3;
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
            cga a = aex.a(cga.e, ajrVar, this.a).a(new CombinedClickableElement(ajrVar, null, this.b, this.c, this.d, this.e, this.f));
            bwjVar.q();
            return a;
        }
    }

    public static final cga a(cga cgaVar, ajr ajrVar, aev aevVar, boolean z, String str, dgv dgvVar, arqg arqgVar) {
        cga g;
        if (aevVar instanceof afa) {
            g = new ClickableElement(ajrVar, (afa) aevVar, z, str, dgvVar, arqgVar);
        } else if (aevVar == null) {
            g = new ClickableElement(ajrVar, null, z, str, dgvVar, arqgVar);
        } else if (ajrVar == null) {
            g = cfv.g(cga.e, new AnonymousClass1(aevVar, z, str, dgvVar, arqgVar));
        } else {
            g = aex.a(cga.e, ajrVar, aevVar).a(new ClickableElement(ajrVar, null, z, str, dgvVar, arqgVar));
        }
        return cgaVar.a(g);
    }

    public static /* synthetic */ cga b(cga cgaVar, ajr ajrVar, aev aevVar, boolean z, String str, dgv dgvVar, arqg arqgVar, int i) {
        boolean z2;
        String str2;
        dgv dgvVar2;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = (!z2) | z;
        if ((i & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 16) != 0) {
            dgvVar2 = null;
        } else {
            dgvVar2 = dgvVar;
        }
        return a(cgaVar, ajrVar, aevVar, z3, str2, dgvVar2, arqgVar);
    }

    public static /* synthetic */ cga c(cga cgaVar, boolean z, String str, arqg arqgVar, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        boolean z2 = true;
        if (1 != ((z ? 1 : 0) | (i & 1))) {
            z2 = false;
        }
        return cfv.g(cgaVar, new adv(z2, str, arqgVar));
    }

    public static final cga d(cga cgaVar, ajr ajrVar, aev aevVar, boolean z, dgv dgvVar, arqg arqgVar, arqg arqgVar2, arqg arqgVar3) {
        cga g;
        if (aevVar instanceof afa) {
            g = new CombinedClickableElement(ajrVar, (afa) aevVar, z, dgvVar, arqgVar3, arqgVar, arqgVar2);
        } else if (aevVar == null) {
            g = new CombinedClickableElement(ajrVar, null, z, dgvVar, arqgVar3, arqgVar, arqgVar2);
        } else if (ajrVar == null) {
            g = cfv.g(cga.e, new AnonymousClass2(aevVar, z, dgvVar, arqgVar3, arqgVar, arqgVar2));
        } else {
            g = aex.a(cga.e, ajrVar, aevVar).a(new CombinedClickableElement(ajrVar, null, z, dgvVar, arqgVar3, arqgVar, arqgVar2));
        }
        return cgaVar.a(g);
    }

    public static /* synthetic */ cga e(cga cgaVar, ajr ajrVar, aev aevVar, boolean z, dgv dgvVar, arqg arqgVar, arqg arqgVar2, arqg arqgVar3, int i) {
        boolean z2;
        dgv dgvVar2;
        arqg arqgVar4;
        arqg arqgVar5;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = (!z2) | z;
        if ((i & 16) != 0) {
            dgvVar2 = null;
        } else {
            dgvVar2 = dgvVar;
        }
        if ((i & 64) != 0) {
            arqgVar4 = null;
        } else {
            arqgVar4 = arqgVar;
        }
        if ((i & 128) != 0) {
            arqgVar5 = null;
        } else {
            arqgVar5 = arqgVar2;
        }
        return d(cgaVar, ajrVar, aevVar, z3, dgvVar2, arqgVar4, arqgVar5, arqgVar3);
    }

    public static /* synthetic */ cga f(cga cgaVar, boolean z, arqg arqgVar, arqg arqgVar2, int i) {
        if ((i & 16) != 0) {
            arqgVar = null;
        }
        boolean z2 = true;
        if (1 != ((z ? 1 : 0) | (i & 1))) {
            z2 = false;
        }
        return cfv.g(cgaVar, new adx(z2, arqgVar, arqgVar2));
    }
}
