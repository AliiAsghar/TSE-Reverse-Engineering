package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euh implements eti {
    @Override // defpackage.eti
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.eti
    public final etu b(Looper looper, Handler.Callback callback) {
        return new eui(new Handler(looper, callback));
    }
}
