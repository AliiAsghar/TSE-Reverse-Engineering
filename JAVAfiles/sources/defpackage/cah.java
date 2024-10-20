package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cah extends cfh implements byl, cey {
    private a a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a extends cfi {
        public long a;

        public a(int i, long j) {
            super(i);
            this.a = j;
        }

        @Override // defpackage.cfi
        public final cfi a(int i) {
            return new a(i, this.a);
        }

        @Override // defpackage.cfi
        public final void b(cfi cfiVar) {
            cfiVar.getClass();
            this.a = ((a) cfiVar).a;
        }
    }

    public cah(long j) {
        ces b = cex.b();
        a aVar = new a(b.v(), j);
        if (!(b instanceof cel)) {
            aVar.h = new a(1, j);
        }
        this.a = aVar;
    }

    @Override // defpackage.cas
    public final /* bridge */ /* synthetic */ Object a() {
        return c();
    }

    @Override // defpackage.byl, defpackage.byc
    public final long b() {
        return ((a) cex.j(this.a, this)).a;
    }

    @Override // defpackage.byl
    public final /* synthetic */ Long c() {
        return Long.valueOf(b());
    }

    @Override // defpackage.byl
    public final void d(long j) {
        ces b;
        a aVar = (a) cex.e(this.a);
        if (aVar.a != j) {
            a aVar2 = this.a;
            synchronized (cex.c) {
                b = cex.b();
                ((a) cex.i(aVar2, this, b, aVar)).a = j;
            }
            cex.t(b, this);
        }
    }

    @Override // defpackage.cfg
    public final cfi e() {
        return this.a;
    }

    @Override // defpackage.cfg
    public final void f(cfi cfiVar) {
        cfiVar.getClass();
        this.a = (a) cfiVar;
    }

    @Override // defpackage.byl
    public final /* synthetic */ void g(long j) {
        d(j);
    }

    @Override // defpackage.byn
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        g(((Number) obj).longValue());
    }

    @Override // defpackage.cey
    public final caj i() {
        return cav.a;
    }

    @Override // defpackage.cfh, defpackage.cfg
    public final cfi j(cfi cfiVar, cfi cfiVar2, cfi cfiVar3) {
        if (((a) cfiVar2).a == ((a) cfiVar3).a) {
            return cfiVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((a) cex.e(this.a)).a + ")@" + hashCode();
    }
}
