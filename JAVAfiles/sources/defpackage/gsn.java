package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsn implements Executor {
    public static final gsn a;
    private static final /* synthetic */ gsn[] b;

    static {
        gsn gsnVar = new gsn();
        a = gsnVar;
        b = new gsn[]{gsnVar};
    }

    private gsn() {
    }

    public static gsn[] values() {
        return (gsn[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
