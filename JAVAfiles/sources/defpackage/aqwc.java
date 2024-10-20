package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwc implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public aqwc(aqwe aqweVar, aqwd aqwdVar, Runnable runnable, int i) {
        this.d = i;
        this.a = aqwdVar;
        this.b = runnable;
        this.c = aqweVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            if (((akug) ((arsb) this.b).a) == null) {
                ?? r0 = this.a;
                ?? r1 = this.c;
                akry h = akqj.h(akqj.b(), r0);
                try {
                    r1.run();
                } finally {
                }
            } else {
                throw null;
            }
        } else {
            ((aqwe) this.c).execute(this.a);
        }
    }

    public final String toString() {
        if (this.d != 0) {
            return "propagating=[" + this.c + "]";
        }
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }

    public aqwc(arsb arsbVar, akry akryVar, Runnable runnable, int i) {
        this.d = i;
        this.b = arsbVar;
        this.a = akryVar;
        this.c = runnable;
    }
}
