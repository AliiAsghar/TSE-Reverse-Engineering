package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cag extends cfh implements byk, cey {
    private a a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a extends cfi {
        public int a;

        public a(int i, int i2) {
            super(i);
            this.a = i2;
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

    public cag(int i) {
        ces b = cex.b();
        a aVar = new a(b.v(), i);
        if (!(b instanceof cel)) {
            aVar.h = new a(1, i);
        }
        this.a = aVar;
    }

    @Override // defpackage.cas
    public final /* bridge */ /* synthetic */ Object a() {
        return c();
    }

    @Override // defpackage.byk, defpackage.bxs
    public final int b() {
        return ((a) cex.j(this.a, this)).a;
    }

    @Override // defpackage.byk
    public final /* synthetic */ Integer c() {
        return Integer.valueOf(b());
    }

    @Override // defpackage.byk
    public final void d(int i) {
        ces b;
        a aVar = (a) cex.e(this.a);
        if (aVar.a != i) {
            a aVar2 = this.a;
            synchronized (cex.c) {
                b = cex.b();
                ((a) cex.i(aVar2, this, b, aVar)).a = i;
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

    @Override // defpackage.byk
    public final /* synthetic */ void g(int i) {
        d(i);
    }

    @Override // defpackage.byn
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        g(((Number) obj).intValue());
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
        return "MutableIntState(value=" + ((a) cex.e(this.a)).a + ")@" + hashCode();
    }
}
