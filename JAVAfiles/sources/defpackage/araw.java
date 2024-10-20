package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class araw implements Runnable {
    private final aqsm a;

    /* JADX INFO: Access modifiers changed from: protected */
    public araw(aqsm aqsmVar) {
        this.a = aqsmVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        aqsm a = this.a.a();
        try {
            a();
        } finally {
            this.a.f(a);
        }
    }
}
