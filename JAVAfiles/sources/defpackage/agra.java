package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agra implements agqz {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    @Override // defpackage.agqz
    public final void a() {
        AtomicBoolean atomicBoolean = a;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                Log.e("HatsLibClient", "Notified that survey was destroyed when it wasn't marked as running.");
            }
            atomicBoolean.set(false);
        }
    }

    @Override // defpackage.agqz
    public final void b() {
        AtomicBoolean atomicBoolean = a;
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
        }
    }
}
