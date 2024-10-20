package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hym implements Executor {
    public static final hym a = new hym(3);
    private final /* synthetic */ int b;

    public hym(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            runnable.run();
            return;
        }
        if (i != 1) {
            if (i != 2) {
                runnable.run();
                return;
            } else {
                runnable.run();
                return;
            }
        }
        hyv.j(runnable);
    }
}
