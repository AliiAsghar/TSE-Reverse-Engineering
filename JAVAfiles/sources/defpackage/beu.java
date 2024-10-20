package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beu implements bes {
    public static final ceh a = new cej(AnonymousClass1.a, AnonymousClass2.a);
    public final List b;
    public AtomicLong c;
    public arqr d;
    public arqx e;
    public arqz f;
    public arqg g;
    public arqr h;
    public arqr i;
    public final uf j;
    private boolean k;
    private final byn l;

    /* compiled from: PG */
    /* renamed from: beu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<cek, beu, Long> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Long.valueOf(((beu) obj2).c.get());
        }
    }

    /* compiled from: PG */
    /* renamed from: beu$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Long, beu> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new beu(((Number) obj).longValue());
        }
    }

    /* compiled from: PG */
    /* renamed from: beu$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqv<bcw, bcw, Integer> {
        final /* synthetic */ cti a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cti ctiVar) {
            super(2);
            this.a = ctiVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            long j;
            int q;
            cti j2 = ((bcw) obj).j();
            cti j3 = ((bcw) obj2).j();
            long j4 = 0;
            if (j2 != null) {
                j = this.a.h(j2, 0L);
            } else {
                j = 0;
            }
            if (j3 != null) {
                j4 = this.a.h(j3, 0L);
            }
            int i = (int) (4294967295L & j4);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
                q = arrj.q(Float.valueOf(Float.intBitsToFloat((int) (j >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j4 >> 32))));
            } else {
                q = arrj.q(Float.valueOf(Float.intBitsToFloat(i2)), Float.valueOf(Float.intBitsToFloat(i)));
            }
            return Integer.valueOf(q);
        }
    }

    public beu() {
        this(1L);
    }

    @Override // defpackage.bes
    public final long a() {
        long andIncrement = this.c.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.c.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // defpackage.bes
    public final uf b() {
        return (uf) this.l.a();
    }

    @Override // defpackage.bes
    public final void c(long j) {
        this.k = false;
        arqr arqrVar = this.d;
        if (arqrVar != null) {
            arqrVar.a(Long.valueOf(j));
        }
    }

    @Override // defpackage.bes
    public final void d(long j) {
        arqr arqrVar = this.h;
        if (arqrVar != null) {
            arqrVar.a(Long.valueOf(j));
        }
    }

    @Override // defpackage.bes
    public final void e() {
        arqg arqgVar = this.g;
        if (arqgVar != null) {
            arqgVar.a();
        }
    }

    @Override // defpackage.bes
    public final void f(cti ctiVar, long j, bdd bddVar, boolean z) {
        arqx arqxVar = this.e;
        if (arqxVar != null) {
            arqxVar.a(Boolean.valueOf(z), ctiVar, new cjn(j), bddVar);
        }
    }

    @Override // defpackage.bes
    public final void g(bcw bcwVar) {
        bct bctVar = (bct) bcwVar;
        if (this.j.b(bctVar.a)) {
            this.b.remove(bcwVar);
            this.j.d(bctVar.a);
            arqr arqrVar = this.i;
            if (arqrVar != null) {
                arqrVar.a(Long.valueOf(bctVar.a));
            }
        }
    }

    @Override // defpackage.bes
    public final boolean h(cti ctiVar, long j, long j2, bdd bddVar, boolean z) {
        arqz arqzVar = this.f;
        if (arqzVar != null) {
            return ((Boolean) arqzVar.a(Boolean.valueOf(z), ctiVar, new cjn(j), new cjn(j2), false, bddVar)).booleanValue();
        }
        return true;
    }

    @Override // defpackage.bes
    public final void i(bcw bcwVar) {
        bct bctVar = (bct) bcwVar;
        if (bctVar.a == 0) {
            aju.c("The selectable contains an invalid id: " + bctVar.a);
        }
        if (this.j.b(bctVar.a)) {
            aju.c(a.cc(bcwVar, "Another selectable with the id: ", ".selectableId has already subscribed."));
        }
        this.j.f(bctVar.a, bcwVar);
        this.b.add(bcwVar);
        this.k = false;
    }

    public final List j(cti ctiVar) {
        if (!this.k) {
            List list = this.b;
            final AnonymousClass3 anonymousClass3 = new AnonymousClass3(ctiVar);
            aqjn.M(list, new Comparator() { // from class: bet
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) arqv.this.a(obj, obj2)).intValue();
                }
            });
            this.k = true;
        }
        return this.b;
    }

    public final void k(uf ufVar) {
        this.l.h(ufVar);
    }

    public beu(long j) {
        this.b = new ArrayList();
        this.j = new uf((byte[]) null);
        this.c = new AtomicLong(j);
        this.l = new byu(ug.a(), cav.a);
    }
}
