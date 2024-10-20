package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoft implements Executor {
    public static final aoft a;
    private static final Handler b;
    private static final /* synthetic */ aoft[] c;

    static {
        aoft aoftVar = new aoft();
        a = aoftVar;
        c = new aoft[]{aoftVar};
        b = new Handler(Looper.getMainLooper());
    }

    private aoft() {
    }

    public static aoft[] values() {
        return (aoft[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
