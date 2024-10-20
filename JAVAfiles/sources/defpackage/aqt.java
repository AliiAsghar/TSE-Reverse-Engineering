package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqt {
    public static final aqe a;

    /* compiled from: PG */
    /* renamed from: aqt$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Integer, List<? extends armo<? extends Integer, ? extends dqs>>> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            ((Number) obj).intValue();
            return arnv.a;
        }
    }

    static {
        cuf cufVar = new cuf() { // from class: aqt.1
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
        };
        arnv arnvVar = arnv.a;
        ahp ahpVar = ahp.a;
        a = new aqe(null, 0, false, brg.a, cufVar, false, arwi.e(arpj.a), new dqw(1.0f), 0, AnonymousClass2.a, arnvVar, 0, 0, 0, ahpVar, 0, 0);
    }
}
