package defpackage;

import defpackage.anf;
import defpackage.bwj;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ani {

    /* compiled from: PG */
    /* renamed from: ani$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqw<cga, bwj, Integer, cga> {
        public AnonymousClass1() {
            super(3);
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(359872873);
            WeakHashMap weakHashMap = anf.a;
            anf b = anf.a.b(bwjVar);
            boolean G = bwjVar.G(b);
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new als(b.c);
                bwjVar.B(h);
            }
            als alsVar = (als) h;
            bwjVar.q();
            return alsVar;
        }
    }

    /* compiled from: PG */
    /* renamed from: ani$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqw<cga, bwj, Integer, cga> {
        public AnonymousClass2() {
            super(3);
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(359872873);
            WeakHashMap weakHashMap = anf.a;
            anf b = anf.a.b(bwjVar);
            boolean G = bwjVar.G(b);
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new als(b.d);
                bwjVar.B(h);
            }
            als alsVar = (als) h;
            bwjVar.q();
            return alsVar;
        }
    }

    public static final cga a(cga cgaVar) {
        return cfv.g(cgaVar, new AnonymousClass1());
    }

    public static final cga b(cga cgaVar) {
        return cfv.g(cgaVar, new AnonymousClass2());
    }
}
