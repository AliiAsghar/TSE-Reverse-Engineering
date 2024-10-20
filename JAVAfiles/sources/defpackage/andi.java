package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class andi implements Executor {
    public static final andi a;
    private static final /* synthetic */ andi[] b;

    static {
        andi andiVar = new andi();
        a = andiVar;
        b = new andi[]{andiVar};
    }

    private andi() {
    }

    public static andi[] values() {
        return (andi[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
