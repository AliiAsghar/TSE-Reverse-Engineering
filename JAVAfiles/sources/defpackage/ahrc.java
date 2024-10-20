package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahrc extends ThreadLocal {
    final /* synthetic */ ahrd a;

    public ahrc(ahrd ahrdVar) {
        this.a = ahrdVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        String concat;
        long id = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            concat = "UI Thread";
        } else {
            concat = "Thread: ".concat(String.valueOf(Thread.currentThread().getName()));
        }
        ahqv ahqvVar = new ahqv(concat, id, 1);
        ArrayDeque arrayDeque = new ArrayDeque();
        ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceData$1", "initialValue", 62, "TraceData.java")).A("Instantiate thread-data, thread:%d name:%s", id, ahqvVar.b);
        arrayDeque.push(ahqvVar);
        this.a.a.incrementAndGet();
        this.a.c.put(ahqvVar, arrayDeque);
        return new WeakReference(arrayDeque);
    }
}
