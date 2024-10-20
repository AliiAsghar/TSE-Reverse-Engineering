package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsh implements Executor {
    public static final aqsh a;
    private static final /* synthetic */ aqsh[] b;

    static {
        aqsh aqshVar = new aqsh();
        a = aqshVar;
        b = new aqsh[]{aqshVar};
    }

    private aqsh() {
    }

    public static aqsh[] values() {
        return (aqsh[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
