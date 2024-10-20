package defpackage;

import defpackage.dli;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlk implements dli.a {
    public final dmc a;
    public final dlq b;
    public final dmb c;
    public final arqr d = new AnonymousClass1();
    private final dmd e;
    private final dmo f;

    /* compiled from: PG */
    /* renamed from: dlk$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<dmm, Object> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dmm dmmVar = (dmm) obj;
            dlx dlxVar = dmmVar.b;
            int i = dmmVar.c;
            int i2 = dmmVar.d;
            Object obj2 = dmmVar.e;
            return dlk.this.b(new dmm(null, dlxVar, i, i2)).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dlk$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<arqr<? super dmp, ? extends arnb>, dmp> {
        final /* synthetic */ dmm b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dmm dmmVar) {
            super(1);
            this.b = dmmVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x03ea  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x03ec  */
        @Override // defpackage.arqr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 1013
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dlk.AnonymousClass2.a(java.lang.Object):java.lang.Object");
        }
    }

    public dlk(dmc dmcVar, dmd dmdVar, dmo dmoVar, dlq dlqVar, dmb dmbVar) {
        this.a = dmcVar;
        this.e = dmdVar;
        this.f = dmoVar;
        this.b = dlqVar;
        this.c = dmbVar;
    }

    @Override // dli.a
    public final cas a(dli dliVar, dlx dlxVar, int i, int i2) {
        int i3 = ((dlb) this.e).a;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            dlxVar = new dlx(arrn.u(dlxVar.h + i3, 1, 1000));
        }
        return b(new dmm(dliVar, dlxVar, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [vj] */
    /* JADX WARN: Type inference failed for: r3v2, types: [dmp] */
    /* JADX WARN: Type inference failed for: r3v3, types: [dmp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [cas] */
    public final cas b(dmm dmmVar) {
        ?? r3;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(dmmVar);
        dmo dmoVar = this.f;
        synchronized (dmoVar.a) {
            r3 = (dmp) dmoVar.b.a(dmmVar);
            if (r3 != 0) {
                if (!r3.b()) {
                }
            }
            try {
                r3 = anonymousClass2.a(new dmn(dmoVar, dmmVar));
                synchronized (dmoVar.a) {
                    if (dmoVar.b.a(dmmVar) == null && r3.b()) {
                        dmoVar.b.c(dmmVar, r3);
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return r3;
    }
}
