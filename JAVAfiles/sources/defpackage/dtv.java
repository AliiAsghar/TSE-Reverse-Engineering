package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtv implements Executor {
    public static final dtv a;
    private static final /* synthetic */ dtv[] b;

    static {
        dtv dtvVar = new dtv();
        a = dtvVar;
        b = new dtv[]{dtvVar};
    }

    private dtv() {
    }

    public static dtv[] values() {
        return (dtv[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
