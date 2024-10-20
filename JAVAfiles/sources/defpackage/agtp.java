package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agtp {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/concurrent/StalledTaskDetector");
    public final ScheduledExecutorService b;
    public final Map c = new ConcurrentHashMap();
    public final algk d;

    public agtp(ScheduledExecutorService scheduledExecutorService, algk algkVar) {
        this.b = scheduledExecutorService;
        this.d = algkVar;
    }
}
