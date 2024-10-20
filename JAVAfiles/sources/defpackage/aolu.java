package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolu implements aols {
    public static final aqrq b = new aqrq("com.google.frameworks.client.data.android.metrics.MutableMetricsContext", null);
    public final aojx c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicInteger i = new AtomicInteger(-1);
    public final ConcurrentLinkedQueue j = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public final AtomicLong l = new AtomicLong(-1);
    public final AtomicReference m = new AtomicReference(null);

    public aolu(aojx aojxVar) {
        this.c = aojxVar;
    }
}
