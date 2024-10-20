package defpackage;

import defpackage.ance;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aner extends ance.i implements Runnable {
    private final Runnable a;

    public aner(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            setException(th);
            throw th;
        }
    }
}
