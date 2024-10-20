package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arwr implements Executor {
    public final arwb a;

    public arwr(arwb arwbVar) {
        this.a = arwbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a.ey(arpj.a)) {
            this.a.a(arpj.a, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
