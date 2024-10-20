package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agkz {
    public static final agkx a = new agkx();
    public static final Thread b;
    public static agkw c;

    static {
        Thread thread = Looper.getMainLooper().getThread();
        thread.getClass();
        b = thread;
    }
}
