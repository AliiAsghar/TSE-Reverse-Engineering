package defpackage;

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqv implements Closeable {
    static final ahqv a = new ahqv("", SystemClock.elapsedRealtime(), -1, Thread.currentThread().getId(), 3);
    public String b;
    public final long c;
    long d;
    final long e;
    public volatile List f;
    final int g;
    final int h;

    public ahqv(String str, long j, long j2, long j3, int i) {
        this.b = str;
        this.g = 1;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.h = i;
        if (i == 1) {
            this.f = DesugarCollections.synchronizedList(new ArrayList());
        } else {
            this.f = Collections.emptyList();
        }
    }

    public final long a() {
        long j = this.d;
        if (j == -1) {
            return -1L;
        }
        return j - this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(List list) {
        if (this.f == Collections.EMPTY_LIST) {
            this.f = new ArrayList();
        }
        if (this.f != null) {
            this.f.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        if (this.h == 1) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!equals(a)) {
            if (this.d < 0) {
                this.d = SystemClock.elapsedRealtime();
            }
            ahrd ahrdVar = (ahrd) ahrj.c.get();
            if (ahrdVar != null) {
                if (this != ((ahqv) ahrdVar.c().poll())) {
                    ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 174, "Tracer.java")).q("Incorrect Span passed. Ignore...");
                    return;
                }
                if (a() >= ahrj.a) {
                    if (ahrdVar.b() < ahrj.b) {
                        ahqv ahqvVar = (ahqv) ahrdVar.c().peek();
                        if (ahqvVar != null) {
                            if (ahqvVar.f == Collections.EMPTY_LIST) {
                                ahqvVar.f = new ArrayList();
                            }
                            if (ahqvVar.f != null) {
                                ahqvVar.f.add(this);
                                return;
                            }
                            return;
                        }
                        ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "linkToParent", 108, "TraceData.java")).t("null Parent for Span: %s", this.b);
                        return;
                    }
                    ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 183, "Tracer.java")).r("Dropping trace as max buffer size is hit. Size: %d", ahrdVar.a());
                    ahrj.c.set(null);
                }
            }
        }
    }

    public ahqv(String str, long j, int i) {
        this(str, SystemClock.elapsedRealtime(), -1L, j, i);
    }
}
