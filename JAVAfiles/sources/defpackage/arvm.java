package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvm implements arvn {
    private final /* synthetic */ int a;
    private final Object b;

    public arvm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [arwu, java.lang.Object] */
    @Override // defpackage.arvn
    public final void b(Throwable th) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                this.b.hd();
                return;
            } else {
                this.b.cancel(false);
                return;
            }
        }
        this.b.a(th);
    }

    public final String toString() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return "DisposeOnCancel[" + this.b + "]";
            }
            return "CancelFutureOnCancel[" + this.b + "]";
        }
        return "CancelHandler.UserSupplied[" + arwi.a(this.b) + "@" + arwi.b(this) + "]";
    }
}
