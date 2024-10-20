package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwy {
    public static adwy a;
    private final Context b;

    public adwy(Context context) {
        this.b = context;
    }

    public static adwy a() {
        adwy adwyVar = a;
        if (adwyVar != null) {
            return adwyVar;
        }
        throw new IllegalStateException("WakeLockThreadFactory was not initialized");
    }

    public final Thread b(String str, Runnable runnable, long j) {
        return new adwx(str, this.b, runnable, j);
    }
}
