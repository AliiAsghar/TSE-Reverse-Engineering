package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbq implements ddp, arwe {
    public final dol a;
    public final arwe b;
    public final AtomicReference c = new AtomicReference(null);
    private final View d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dbq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        /* synthetic */ Object a;
        int c;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return dbq.this.c(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dbq$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<arwe, dcz> {
        final /* synthetic */ ddm a;
        final /* synthetic */ dbq b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ddm ddmVar, dbq dbqVar) {
            super(1);
            this.a = ddmVar;
            this.b = dbqVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new dcz(this.a, new dbr(this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dbq$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arpw implements arqv<dcz, arpe<?>, Object> {
        int a;
        /* synthetic */ Object b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: dbq$3$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqr<Throwable, arnb> {
            final /* synthetic */ dcz a;
            final /* synthetic */ dbq b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(dcz dczVar, dbq dbqVar) {
                super(1);
                this.a = dczVar;
                this.b = dbqVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                dcz dczVar = this.a;
                synchronized (dczVar.c) {
                    dczVar.e = true;
                    cbh cbhVar = dczVar.d;
                    int i = cbhVar.b;
                    if (i > 0) {
                        Object[] objArr = cbhVar.a;
                        int i2 = 0;
                        do {
                            dnw dnwVar = (dnw) ((WeakReference) objArr[i2]).get();
                            if (dnwVar != null) {
                                dnwVar.a();
                            }
                            i2++;
                        } while (i2 < i);
                    }
                    dczVar.d.g();
                }
                dol dolVar = this.b.a;
                dolVar.b.set(null);
                dolVar.a.f();
                return arnb.a;
            }
        }

        public AnonymousClass3(arpe arpeVar) {
            super(2, arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((dcz) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            if (this.a == 0) {
                aqil.P(obj);
                dcz dczVar = (dcz) this.b;
                dbq dbqVar = dbq.this;
                this.b = dczVar;
                this.a = 1;
                arvp arvpVar = new arvp(arhi.i(this), 1);
                arvpVar.A();
                dol dolVar = dbqVar.a;
                dolVar.a.c();
                dolVar.b.set(new dov(dolVar, dolVar.a));
                arvpVar.d(new AnonymousClass1(dczVar, dbqVar));
                if (arvpVar.l() == arplVar) {
                    return arplVar;
                }
            } else {
                aqil.P(obj);
            }
            throw new armj();
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(arpeVar);
            anonymousClass3.b = obj;
            return anonymousClass3;
        }
    }

    public dbq(View view, dol dolVar, arwe arweVar) {
        this.d = view;
        this.a = dolVar;
        this.b = arweVar;
    }

    @Override // defpackage.ddp
    public final View a() {
        return this.d;
    }

    @Override // defpackage.arwe
    public final arpi b() {
        return this.b.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ddp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.ddm r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dbq.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            dbq$1 r0 = (defpackage.dbq.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbq$1 r0 = new dbq$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            defpackage.aqil.P(r7)
            goto L48
        L2f:
            defpackage.aqil.P(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.c
            dbq$2 r2 = new dbq$2
            r2.<init>(r6, r5)
            dbq$3 r6 = new dbq$3
            r4 = 0
            r6.<init>(r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.cgg.b(r7, r2, r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            armj r6 = new armj
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbq.c(ddm, arpe):java.lang.Object");
    }
}
