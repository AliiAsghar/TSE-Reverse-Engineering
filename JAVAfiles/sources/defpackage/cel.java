package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cel extends cem {

    /* compiled from: PG */
    /* renamed from: cel$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Object, arnb> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list) {
            super(1);
            this.a = list;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((arqr) list.get(i)).a(obj);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cel$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cev, cem> {
        final /* synthetic */ arqr a;
        final /* synthetic */ arqr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqr arqrVar, arqr arqrVar2) {
            super(1);
            this.a = arqrVar;
            this.b = arqrVar2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            int i;
            cev cevVar = (cev) obj;
            synchronized (cex.c) {
                i = cex.e;
                cex.e = i + 1;
            }
            return new cem(i, cevVar, this.a, this.b);
        }
    }

    /* compiled from: PG */
    /* renamed from: cel$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cev, ceq> {
        final /* synthetic */ arqr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqr arqrVar) {
            super(1);
            this.a = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            int i;
            cev cevVar = (cev) obj;
            synchronized (cex.c) {
                i = cex.e;
                cex.e = i + 1;
            }
            return new ceq(i, cevVar, this.a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cel(int r4, defpackage.cev r5) {
        /*
            r3 = this;
            java.lang.Object r0 = defpackage.cex.c
            monitor-enter(r0)
            java.util.List r1 = defpackage.cex.h     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = defpackage.aqjn.ah(r1)     // Catch: java.lang.Throwable -> L18
            arqr r2 = (defpackage.arqr) r2     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L12
            cel$1 r2 = new cel$1     // Catch: java.lang.Throwable -> L18
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L18
        L12:
            monitor-exit(r0)
            r0 = 0
            r3.<init>(r4, r5, r0, r2)
            return
        L18:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cel.<init>(int, cev):void");
    }

    @Override // defpackage.cem
    public final cem a(arqr arqrVar, arqr arqrVar2) {
        return (cem) cex.c(new AnonymousClass2(arqrVar, arqrVar2));
    }

    @Override // defpackage.cem, defpackage.ces
    public final ces b(arqr arqrVar) {
        return (ceq) cex.c(new AnonymousClass3(arqrVar));
    }

    @Override // defpackage.cem
    public final cet c() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.cem, defpackage.ces
    public final void d() {
        synchronized (cex.c) {
            z();
        }
    }

    @Override // defpackage.cem, defpackage.ces
    public final void e() {
        cex.r();
    }

    @Override // defpackage.cem, defpackage.ces
    public final /* synthetic */ void f() {
        d.aL();
    }

    @Override // defpackage.cem, defpackage.ces
    public final /* synthetic */ void g() {
        d.aL();
    }
}
