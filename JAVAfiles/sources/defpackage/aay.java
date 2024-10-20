package defpackage;

import defpackage.aax;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aay {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aay$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ Object a;
        final /* synthetic */ aax.a b;
        final /* synthetic */ Object c;
        final /* synthetic */ aaw d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, aax.a aVar, Object obj2, aaw aawVar) {
            super(0);
            this.a = obj;
            this.b = aVar;
            this.c = obj2;
            this.d = aawVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            if (!d.F(this.a, this.b.a) || !d.F(this.c, this.b.b)) {
                aax.a aVar = this.b;
                Object obj = this.a;
                Object obj2 = this.c;
                aaw aawVar = this.d;
                aVar.a = obj;
                aVar.b = obj2;
                aVar.d = aawVar;
                aVar.e = new abs(aawVar, aVar.c, obj, obj2);
                aax.this.b(true);
                aVar.f = false;
                aVar.g = true;
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aay$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ aax a;
        final /* synthetic */ aax.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(aax aaxVar, aax.a aVar) {
            super(1);
            this.a = aaxVar;
            this.b = aVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            aax aaxVar = this.a;
            aaxVar.a.n(this.b);
            aaxVar.b(true);
            return new aaz(this.a, this.b);
        }
    }

    public static final cas a(aax aaxVar, float f, float f2, aaw aawVar, bwj bwjVar) {
        return c(aaxVar, Float.valueOf(f), Float.valueOf(f2), aci.a, aawVar, bwjVar, 33208);
    }

    public static final aax b(bwj bwjVar) {
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            h = new aax();
            bwjVar.B(h);
        }
        aax aaxVar = (aax) h;
        aaxVar.a(bwjVar, 0);
        return aaxVar;
    }

    public static final cas c(aax aaxVar, Object obj, Object obj2, acg acgVar, aaw aawVar, bwj bwjVar, int i) {
        boolean z;
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            h = new aax.a(obj, obj2, acgVar, aawVar);
            bwjVar.B(h);
        }
        aax.a aVar = (aax.a) h;
        boolean z2 = false;
        if ((((i & 112) ^ 48) > 32 && bwjVar.I(obj)) || (i & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 896) ^ 384) > 256 && bwjVar.I(obj2)) || (i & 384) == 256) {
            z2 = true;
        }
        boolean I = z | z2 | bwjVar.I(aawVar);
        Object h2 = bwjVar.h();
        if (I || h2 == bwj.a.a) {
            h2 = new AnonymousClass1(obj, aVar, obj2, aawVar);
            bwjVar.B(h2);
        }
        bxl.h((arqg) h2, bwjVar);
        boolean I2 = bwjVar.I(aaxVar);
        Object h3 = bwjVar.h();
        if (I2 || h3 == bwj.a.a) {
            h3 = new AnonymousClass2(aaxVar, aVar);
            bwjVar.B(h3);
        }
        bxl.c(aVar, (arqr) h3, bwjVar);
        return aVar;
    }
}
