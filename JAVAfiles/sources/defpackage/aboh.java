package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aboh {
    public final long a;
    public final Object b;

    public aboh(long j, Object obj) {
        this.a = j;
        this.b = obj;
    }

    public aboh(Object obj, long j) {
        this.b = obj;
        this.a = j;
    }

    public aboh(aboi aboiVar) {
        this.b = aboiVar;
        this.a = SystemClock.elapsedRealtime();
    }
}
