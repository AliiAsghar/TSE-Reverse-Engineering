package defpackage;

import androidx.compose.foundation.IndicationModifierElement;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aex {
    public static final bzc a = new cat(AnonymousClass1.a);

    /* compiled from: PG */
    /* renamed from: aex$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<aev> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return aeg.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aex$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ aev a;
        final /* synthetic */ ajq b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(aev aevVar, ajq ajqVar) {
            super(3);
            this.a = aevVar;
            this.b = ajqVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(-353972293);
            aew b = this.a.b(this.b, bwjVar);
            boolean G = bwjVar.G(b);
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new aey(b);
                bwjVar.B(h);
            }
            aey aeyVar = (aey) h;
            bwjVar.q();
            return aeyVar;
        }
    }

    public static final cga a(cga cgaVar, ajq ajqVar, aev aevVar) {
        if (aevVar == null) {
            return cgaVar;
        }
        if (aevVar instanceof afa) {
            return cgaVar.a(new IndicationModifierElement(ajqVar, (afa) aevVar));
        }
        return cfv.g(cgaVar, new AnonymousClass2(aevVar, ajqVar));
    }
}
