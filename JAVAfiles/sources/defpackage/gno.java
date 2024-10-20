package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gno implements enk {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public gno(Handler handler, Runnable runnable, int i) {
        this.c = i;
        this.a = handler;
        this.b = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        if (this.c != 0) {
            if (!((gnt) this.b).J()) {
                enmVar.N().d(this);
                if (((oo) this.a).C().isAttachedToWindow()) {
                    ((gnt) this.b).L((oo) this.a);
                    return;
                }
                return;
            }
            return;
        }
        if (enfVar == enf.ON_DESTROY) {
            ((Handler) this.a).removeCallbacks(this.b);
            enmVar.N().d(this);
        }
    }

    public gno(gnt gntVar, oo ooVar, int i) {
        this.c = i;
        this.b = gntVar;
        this.a = ooVar;
    }
}
