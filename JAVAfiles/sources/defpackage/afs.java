package defpackage;

import androidx.compose.foundation.ScrollingLayoutElement;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afs {

    /* compiled from: PG */
    /* renamed from: afs$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<afv> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return new afv(0);
        }
    }

    /* compiled from: PG */
    /* renamed from: afs$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ afv c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, afv afvVar, boolean z3) {
            super(3);
            this.a = z;
            this.b = z2;
            this.c = afvVar;
            this.d = z3;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            ahp ahpVar;
            cga a;
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(1478351300);
            if (this.a) {
                ahpVar = ahp.a;
            } else {
                ahpVar = ahp.b;
            }
            ahp ahpVar2 = ahpVar;
            boolean c = ahx.c((drk) bwjVar.g(dch.i), ahpVar2, this.b);
            afv afvVar = this.c;
            boolean z = this.d;
            a = afw.a(cga.e, afvVar, ahpVar2, z, c, null, afvVar.c, null, ahx.b(bwjVar));
            cga a2 = a.a(new ScrollingLayoutElement(this.c, this.b, this.a));
            bwjVar.q();
            return a2;
        }
    }

    public static /* synthetic */ cga a(cga cgaVar, afv afvVar) {
        return d(cgaVar, afvVar, false, true, false);
    }

    public static final afv b(bwj bwjVar, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = false;
        Object[] objArr = new Object[0];
        ceh cehVar = afv.a;
        if ((i2 > 4 && bwjVar.E(0)) || (i & 6) == 4) {
            z = true;
        }
        Object h = bwjVar.h();
        if (z || h == bwj.a.a) {
            h = new AnonymousClass1();
            bwjVar.B(h);
        }
        return (afv) cdy.b(objArr, cehVar, (arqg) h, bwjVar, 0, 4);
    }

    public static /* synthetic */ cga c(cga cgaVar, afv afvVar, boolean z, int i) {
        boolean z2;
        boolean z3 = false;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) == 0) {
            z3 = true;
        }
        return d(cgaVar, afvVar, z & z3, z2, true);
    }

    public static final cga d(cga cgaVar, afv afvVar, boolean z, boolean z2, boolean z3) {
        return cfv.g(cgaVar, new AnonymousClass2(z3, z, afvVar, z2));
    }
}
