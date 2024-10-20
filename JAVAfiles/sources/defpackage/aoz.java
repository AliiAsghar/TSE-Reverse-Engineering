package defpackage;

import defpackage.bwj;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoz {
    public static final aom a = new aom(null, 0, false, brg.a, new cuf() { // from class: aoz.1
        private final Map a = arnw.a;

        @Override // defpackage.cuf
        public final int j() {
            return 0;
        }

        @Override // defpackage.cuf
        public final int k() {
            return 0;
        }

        @Override // defpackage.cuf
        public final Map m() {
            return this.a;
        }

        @Override // defpackage.cuf
        public final /* synthetic */ arqr n() {
            return null;
        }

        @Override // defpackage.cuf
        public final void o() {
        }
    }, brg.a, false, arwi.e(arpj.a), new dqw(1.0f), dqt.l(0, 0, 15), arnv.a, 0, 0, 0, false, ahp.a, 0, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aoz$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqg<aov> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return new aov(0, 0);
        }
    }

    public static final aov a(bwj bwjVar) {
        Object[] objArr = new Object[0];
        ceh cehVar = aov.a;
        boolean E = bwjVar.E(0) | bwjVar.E(0);
        Object h = bwjVar.h();
        if (E || h == bwj.a.a) {
            h = new AnonymousClass2();
            bwjVar.B(h);
        }
        return (aov) cdy.b(objArr, cehVar, (arqg) h, bwjVar, 0, 4);
    }
}
