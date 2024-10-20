package defpackage;

import android.view.View;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.atl;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asa {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: asa$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqw<cea, bwj, Integer, arnb> {
        final /* synthetic */ asm a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqv c;
        final /* synthetic */ cas d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(asm asmVar, cga cgaVar, arqv arqvVar, cas casVar) {
            super(3);
            this.a = asmVar;
            this.b = cgaVar;
            this.c = arqvVar;
            this.d = casVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            cga a;
            cea ceaVar = (cea) obj;
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                Object arqVar = new arq(ceaVar, new arz(this.d));
                bwjVar.B(arqVar);
                h = arqVar;
            }
            arq arqVar2 = (arq) h;
            Object h2 = bwjVar.h();
            if (h2 == bwj.a.a) {
                h2 = new cvm(new aru(arqVar2));
                bwjVar.B(h2);
            }
            cvm cvmVar = (cvm) h2;
            bwjVar.y(6588890);
            if (this.a != null) {
                bwjVar.y(6590278);
                atl.AnonymousClass1 anonymousClass1 = atl.a;
                bwjVar.y(-930674276);
                atk atkVar = atl.a;
                if (atkVar == null) {
                    View view = (View) bwjVar.g(AndroidCompositionLocals_androidKt.f);
                    boolean G = bwjVar.G(view);
                    Object h3 = bwjVar.h();
                    if (G || h3 == bwj.a.a) {
                        h3 = new aqw(view);
                        bwjVar.B(h3);
                    }
                    atkVar = (aqw) h3;
                }
                bwjVar.q();
                bwjVar.q();
                Object obj4 = this.a;
                Object[] objArr = {obj4, arqVar2, cvmVar, atkVar};
                boolean G2 = bwjVar.G(obj4) | bwjVar.I(arqVar2) | bwjVar.I(cvmVar) | bwjVar.I(atkVar);
                asm asmVar = this.a;
                Object h4 = bwjVar.h();
                if (G2 || h4 == bwj.a.a) {
                    h4 = new arx(asmVar, arqVar2, cvmVar, atkVar);
                    bwjVar.B(h4);
                }
                bxl.d(objArr, (arqr) h4, bwjVar);
            }
            bwjVar.q();
            cga cgaVar = this.b;
            asm asmVar2 = this.a;
            long j = asn.a;
            if (asmVar2 != null && (a = cgaVar.a(new TraversablePrefetchStateModifierElement(asmVar2))) != null) {
                cgaVar = a;
            }
            boolean G3 = bwjVar.G(arqVar2) | bwjVar.G(this.c);
            arqv arqvVar = this.c;
            Object h5 = bwjVar.h();
            if (G3 || h5 == bwj.a.a) {
                h5 = new ary(arqVar2, arqvVar);
                bwjVar.B(h5);
            }
            cvl.b(cvmVar, cgaVar, (arqv) h5, bwjVar, 8);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: asa$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqg a;
        final /* synthetic */ cga b;
        final /* synthetic */ asm c;
        final /* synthetic */ arqv d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqg arqgVar, cga cgaVar, asm asmVar, arqv arqvVar, int i) {
            super(2);
            this.a = arqgVar;
            this.b = cgaVar;
            this.c = asmVar;
            this.d = arqvVar;
            this.e = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            asa.a(this.a, this.b, this.c, this.d, (bwj) obj, bzh.a(this.e | 1));
            return arnb.a;
        }
    }

    public static final void a(arqg arqgVar, cga cgaVar, asm asmVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 6;
        bwj c = bwjVar.c(2002163445);
        if (i7 == 0) {
            if (true != c.I(arqgVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (true != c.G(asmVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c.L()) {
            c.v();
        } else {
            ata.a(cdk.e(-1488997347, new AnonymousClass1(asmVar, cgaVar, arqvVar, cap.a(arqgVar, c)), c), c, 6);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(arqgVar, cgaVar, asmVar, arqvVar, i);
        }
    }
}
