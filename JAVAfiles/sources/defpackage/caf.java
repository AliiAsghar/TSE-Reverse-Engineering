package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class caf extends cfh implements byj, cey {
    private a a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a extends cfi {
        public float a;

        public a(int i, float f) {
            super(i);
            this.a = f;
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

    public caf(float f) {
        ces b = cex.b();
        a aVar = new a(b.v(), f);
        if (!(b instanceof cel)) {
            aVar.h = new a(1, f);
        }
        this.a = aVar;
    }

    @Override // defpackage.cas
    public final /* bridge */ /* synthetic */ Object a() {
        return c();
    }

    @Override // defpackage.byj, defpackage.bxm
    public final float b() {
        return ((a) cex.j(this.a, this)).a;
    }

    @Override // defpackage.byj
    public final /* synthetic */ Float c() {
        return Float.valueOf(b());
    }

    @Override // defpackage.byj
    public final void d(float f) {
        ces b;
        a aVar = (a) cex.e(this.a);
        if (aVar.a == f) {
            return;
        }
        a aVar2 = this.a;
        synchronized (cex.c) {
            b = cex.b();
            ((a) cex.i(aVar2, this, b, aVar)).a = f;
        }
        cex.t(b, this);
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

    @Override // defpackage.byj
    public final /* synthetic */ void g(float f) {
        d(f);
    }

    @Override // defpackage.byn
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        g(((Number) obj).floatValue());
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
        return "MutableFloatState(value=" + ((a) cex.e(this.a)).a + ")@" + hashCode();
    }
}
