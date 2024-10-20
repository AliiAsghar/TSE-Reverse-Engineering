package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class neq implements yfx {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public neq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.yfx
    public final void fs() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((ney) this.b).e.h(this.a);
                return;
            } else {
                ((agoz) this.a).E((agmc) this.b);
                return;
            }
        }
        ((lgg) this.a).h(this.b);
    }

    @Override // defpackage.yfx
    public final void ft() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((ney) this.b).e.i(this.a);
                return;
            } else {
                ((agoz) this.a).G((agmc) this.b);
                return;
            }
        }
        ((lgg) this.a).i(this.b);
    }

    public neq(ney neyVar, puj pujVar, int i) {
        this.c = i;
        this.a = pujVar;
        this.b = neyVar;
    }
}
