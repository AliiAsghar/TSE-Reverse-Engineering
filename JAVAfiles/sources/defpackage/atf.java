package defpackage;

import android.os.Trace;
import defpackage.asm;
import defpackage.cvm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atf {
    public final arq a;
    public final cvm b;
    public final atk c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a implements asm.b, ati {
        public boolean a;
        private final int c;
        private final long d;
        private final ath e;
        private cvm.a f;
        private boolean g;
        private boolean h;
        private C0016a i;
        private boolean j;

        /* compiled from: PG */
        /* renamed from: atf$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        final class C0016a {
            public final List a;
            public final List[] b;
            public int c;
            public int d;

            public C0016a(List list) {
                this.a = list;
                this.b = new List[list.size()];
                if (!list.isEmpty()) {
                    return;
                }
                aju.c("NestedPrefetchController shouldn't be created with no states");
            }
        }

        public a(int i, long j, ath athVar) {
            this.c = i;
            this.d = j;
            this.e = athVar;
        }

        private final boolean d() {
            if (this.f != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [ars, java.lang.Object] */
        private final boolean e() {
            if (!this.a) {
                int e = atf.this.a.b.a().e();
                int i = this.c;
                if (i >= 0 && i < e) {
                    return true;
                }
                return false;
            }
            return false;
        }

        private final boolean f(atj atjVar, long j) {
            long a = atjVar.a();
            if ((this.j && a > 0) || j < a) {
                return true;
            }
            return false;
        }

        @Override // asm.b
        public final void a() {
            if (!this.a) {
                this.a = true;
                cvm.a aVar = this.f;
                if (aVar != null) {
                    aVar.b();
                }
                this.f = null;
            }
        }

        @Override // asm.b
        public final void b() {
            this.j = true;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [ars, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v42, types: [ars, java.lang.Object] */
        @Override // defpackage.ati
        public final boolean c(atj atjVar) {
            boolean z;
            boolean z2;
            long j;
            List list;
            C0016a c0016a;
            long j2;
            if (!e()) {
                return false;
            }
            Object f = atf.this.a.b.a().f(this.c);
            if (!d()) {
                if (f != null && this.e.c.c(f)) {
                    j2 = this.e.c.b(f);
                } else {
                    j2 = this.e.a;
                }
                if (!f(atjVar, j2)) {
                    return true;
                }
                ath athVar = this.e;
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    if (!e()) {
                        aju.c("Callers should check whether the request is still valid before calling performComposition()");
                    }
                    if (this.f != null) {
                        aju.c("Request was already composed!");
                    }
                    ?? a = atf.this.a.b.a();
                    Object g = a.g(this.c);
                    this.f = atf.this.b.a().a(g, atf.this.a.b(this.c, g, a.f(this.c)));
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (f != null) {
                        athVar.c.d(f, ath.a(nanoTime2, athVar.c.e(f)));
                    }
                    athVar.a = ath.a(nanoTime2, athVar.a);
                } finally {
                }
            }
            if (!this.j) {
                if (!this.h) {
                    if (atjVar.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        cvm.a aVar = this.f;
                        if (aVar != null) {
                            arsb arsbVar = new arsb();
                            aVar.d(new atg(arsbVar));
                            List list2 = (List) arsbVar.a;
                            if (list2 != null) {
                                c0016a = new C0016a(list2);
                            } else {
                                c0016a = null;
                            }
                            this.i = c0016a;
                            this.h = true;
                        } else {
                            aju.a("Should precompose before resolving nested prefetch states");
                            throw new armj();
                        }
                    } finally {
                    }
                }
                C0016a c0016a2 = this.i;
                if (c0016a2 != null) {
                    if (c0016a2.c < c0016a2.a.size()) {
                        if (a.this.a) {
                            aju.d("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (c0016a2.c < c0016a2.a.size()) {
                            try {
                                if (c0016a2.b[c0016a2.c] == null) {
                                    if (atjVar.a() <= 0) {
                                        return true;
                                    }
                                    List[] listArr = c0016a2.b;
                                    int i = c0016a2.c;
                                    asm asmVar = (asm) c0016a2.a.get(i);
                                    arqr arqrVar = asmVar.a;
                                    if (arqrVar == null) {
                                        list = arnv.a;
                                    } else {
                                        asm.a aVar2 = new asm.a();
                                        arqrVar.a(aVar2);
                                        list = aVar2.a;
                                    }
                                    listArr[i] = list;
                                }
                                List list3 = c0016a2.b[c0016a2.c];
                                list3.getClass();
                                while (c0016a2.d < list3.size()) {
                                    if (((ati) list3.get(c0016a2.d)).c(atjVar)) {
                                        return true;
                                    }
                                    c0016a2.d++;
                                }
                                c0016a2.d = 0;
                                c0016a2.c++;
                            } finally {
                            }
                        }
                    }
                }
            }
            if (!this.g) {
                int i2 = (int) (3 & this.d);
                int i3 = (i2 & 2) >> 1;
                int i4 = i2 & 1;
                int i5 = i4 + i4 + (i3 * 3);
                if ((((1 << (18 - i5)) - 1) & ((int) (r4 >> (i5 + 46)))) - 1 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((((1 << (i5 + 13)) - 1) & ((int) (r4 >> 33))) - 1 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(z2 | z)) {
                    if (f != null && this.e.d.c(f)) {
                        j = this.e.d.b(f);
                    } else {
                        j = this.e.b;
                    }
                    if (!f(atjVar, j)) {
                        return true;
                    }
                    ath athVar2 = this.e;
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = this.d;
                        if (this.a) {
                            aju.c("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            aju.c("Request was already measured!");
                        }
                        this.g = true;
                        cvm.a aVar3 = this.f;
                        if (aVar3 != null) {
                            int a2 = aVar3.a();
                            for (int i6 = 0; i6 < a2; i6++) {
                                aVar3.c(i6, j3);
                            }
                            Trace.endSection();
                            long nanoTime4 = System.nanoTime() - nanoTime3;
                            if (f != null) {
                                athVar2.d.d(f, ath.a(nanoTime4, athVar2.d.e(f)));
                            }
                            athVar2.b = ath.a(nanoTime4, athVar2.b);
                        } else {
                            aju.a("performComposition() must be called before performMeasure()");
                            throw new armj();
                        }
                    } finally {
                    }
                }
            }
            return false;
        }

        public final String toString() {
            return "HandleAndRequestImpl { index = " + this.c + ", constraints = " + ((Object) dqs.e(this.d)) + ", isComposed = " + d() + ", isMeasured = " + this.g + ", isCanceled = " + this.a + " }";
        }
    }

    public atf(arq arqVar, cvm cvmVar, atk atkVar) {
        this.a = arqVar;
        this.b = cvmVar;
        this.c = atkVar;
    }
}
