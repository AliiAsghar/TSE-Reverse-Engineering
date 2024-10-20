package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cai<T> extends cfh implements cey<T> {
    public final caj a;
    private a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<T> extends cfi {
        public Object a;

        public a(int i, Object obj) {
            super(i);
            this.a = obj;
        }

        @Override // defpackage.cfi
        public final /* bridge */ /* synthetic */ cfi a(int i) {
            return new a(cex.b().v(), this.a);
        }

        @Override // defpackage.cfi
        public final void b(cfi cfiVar) {
            cfiVar.getClass();
            this.a = ((a) cfiVar).a;
        }
    }

    public cai(Object obj, caj cajVar) {
        this.a = cajVar;
        ces b = cex.b();
        a aVar = new a(b.v(), obj);
        if (!(b instanceof cel)) {
            aVar.h = new a(1, obj);
        }
        this.b = aVar;
    }

    @Override // defpackage.byn, defpackage.cas
    public final Object a() {
        return ((a) cex.j(this.b, this)).a;
    }

    @Override // defpackage.cfg
    public final cfi e() {
        return this.b;
    }

    @Override // defpackage.cfg
    public final void f(cfi cfiVar) {
        cfiVar.getClass();
        this.b = (a) cfiVar;
    }

    @Override // defpackage.byn
    public final void h(Object obj) {
        ces b;
        a aVar = (a) cex.e(this.b);
        if (!this.a.a(aVar.a, obj)) {
            a aVar2 = this.b;
            synchronized (cex.c) {
                b = cex.b();
                ((a) cex.i(aVar2, this, b, aVar)).a = obj;
            }
            cex.t(b, this);
        }
    }

    @Override // defpackage.cey
    public final caj i() {
        return this.a;
    }

    @Override // defpackage.cfh, defpackage.cfg
    public final cfi j(cfi cfiVar, cfi cfiVar2, cfi cfiVar3) {
        if (this.a.a(((a) cfiVar2).a, ((a) cfiVar3).a)) {
            return cfiVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableState(value=" + ((a) cex.e(this.b)).a + ")@" + hashCode();
    }
}
