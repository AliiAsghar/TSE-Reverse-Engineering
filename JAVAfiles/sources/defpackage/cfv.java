package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfv {

    /* compiled from: PG */
    /* renamed from: cfv$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<cga.b, Boolean> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(!(((cga.b) obj) instanceof cfu));
        }
    }

    /* compiled from: PG */
    /* renamed from: cfv$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<cga, cga.b, cga> {
        final /* synthetic */ bwj a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bwj bwjVar) {
            super(2);
            this.a = bwjVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cga cgaVar = (cga) obj;
            cga cgaVar2 = (cga.b) obj2;
            if (cgaVar2 instanceof cfu) {
                arqw arqwVar = ((cfu) cgaVar2).a;
                arsd.g(arqwVar, 3);
                cgaVar2 = cfv.a(this.a, (cga) arqwVar.a(cga.e, this.a, 0));
            }
            return cgaVar.a(cgaVar2);
        }
    }

    public static final cga a(bwj bwjVar, cga cgaVar) {
        if (cgaVar.c(AnonymousClass1.a)) {
            return cgaVar;
        }
        bwjVar.z(1219399079);
        cga cgaVar2 = (cga) cgaVar.b(cga.e, new AnonymousClass2(bwjVar));
        bwjVar.r();
        return cgaVar2;
    }

    public static final cga b(bwj bwjVar, cga cgaVar) {
        bwjVar.y(439770924);
        cga a = a(bwjVar, cgaVar);
        bwjVar.q();
        return a;
    }

    public static /* synthetic */ cga c(cga cgaVar, String str, Object obj, Object obj2, Object obj3, arqw arqwVar) {
        return cgaVar.a(new cfy(str, obj, obj2, obj3, arqwVar));
    }

    public static /* synthetic */ cga d(cga cgaVar, String str, Object obj, Object obj2, arqw arqwVar) {
        return cgaVar.a(new cfx(str, obj, obj2, arqwVar));
    }

    public static /* synthetic */ cga e(cga cgaVar, String str, Object obj, arqw arqwVar) {
        return cgaVar.a(new cfw(str, obj, arqwVar));
    }

    public static /* synthetic */ cga f(cga cgaVar, arqw arqwVar) {
        return g(cgaVar, arqwVar);
    }

    public static final cga g(cga cgaVar, arqw arqwVar) {
        return cgaVar.a(new cfu(arqwVar));
    }
}
