package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgg<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cgg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe, Object> {
        int a;
        final /* synthetic */ arqr b;
        final /* synthetic */ AtomicReference c;
        final /* synthetic */ arqv d;
        private /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqr arqrVar, AtomicReference atomicReference, arqv arqvVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arqrVar;
            this.c = atomicReference;
            this.d = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        
            if (defpackage.arwi.t(r6.a, r5) != r0) goto L27;
         */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r6) {
            /*
                r5 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r5.a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 == r2) goto L13
                java.lang.Object r0 = r5.e
                cgg$a r0 = (cgg.a) r0
                defpackage.aqil.P(r6)     // Catch: java.lang.Throwable -> L11
                goto L5b
            L11:
                r6 = move-exception
                goto L64
            L13:
                java.lang.Object r1 = r5.e
                cgg$a r1 = (cgg.a) r1
                defpackage.aqil.P(r6)
                goto L4b
            L1b:
                defpackage.aqil.P(r6)
                java.lang.Object r6 = r5.e
                arwe r6 = (defpackage.arwe) r6
                cgg$a r1 = new cgg$a
                arpi r3 = r6.b()
                arxm r3 = defpackage.arwi.v(r3)
                arqr r4 = r5.b
                java.lang.Object r6 = r4.a(r6)
                r1.<init>(r3, r6)
                java.util.concurrent.atomic.AtomicReference r6 = r5.c
                java.lang.Object r6 = r6.getAndSet(r1)
                cgg$a r6 = (cgg.a) r6
                if (r6 == 0) goto L4b
                r5.e = r1
                r5.a = r2
                arxm r6 = r6.a
                java.lang.Object r6 = defpackage.arwi.t(r6, r5)
                if (r6 == r0) goto L61
            L4b:
                arqv r6 = r5.d     // Catch: java.lang.Throwable -> L62
                java.lang.Object r2 = r1.b     // Catch: java.lang.Throwable -> L62
                r5.e = r1     // Catch: java.lang.Throwable -> L62
                r3 = 2
                r5.a = r3     // Catch: java.lang.Throwable -> L62
                java.lang.Object r6 = r6.a(r2, r5)     // Catch: java.lang.Throwable -> L62
                if (r6 == r0) goto L61
                r0 = r1
            L5b:
                java.util.concurrent.atomic.AtomicReference r1 = r5.c
                defpackage.a.bD(r1, r0)
                return r6
            L61:
                return r0
            L62:
                r6 = move-exception
                r0 = r1
            L64:
                java.util.concurrent.atomic.AtomicReference r1 = r5.c
                defpackage.a.bD(r1, r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cgg.AnonymousClass1.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, arpeVar);
            anonymousClass1.e = obj;
            return anonymousClass1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<T> {
        public final arxm a;
        public final Object b;

        public a(arxm arxmVar, Object obj) {
            this.a = arxmVar;
            this.b = obj;
        }
    }

    public static final Object a(AtomicReference atomicReference) {
        a aVar = (a) atomicReference.get();
        if (aVar != null) {
            return aVar.b;
        }
        return null;
    }

    public static final Object b(AtomicReference atomicReference, arqr arqrVar, arqv arqvVar, arpe arpeVar) {
        return arwi.d(new AnonymousClass1(arqrVar, atomicReference, arqvVar, null), arpeVar);
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
