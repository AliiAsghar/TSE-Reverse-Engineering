package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alca implements Callable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public alca(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                this.a.run();
                return null;
            }
            synchronized (this.a) {
                Object obj = this.a;
                if (((hlx) obj).f != null) {
                    ((hlx) obj).g();
                    if (((hlx) this.a).h()) {
                        ((hlx) this.a).e();
                        ((hlx) this.a).h = 0;
                    }
                }
            }
            return null;
        }
        return alcc.a(((alce) this.a).c(), alce.d);
    }
}
