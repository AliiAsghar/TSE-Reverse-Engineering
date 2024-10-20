package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akau {
    public static final alvi a = alvi.m("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter");
    public static final SettableFuture b;
    public final AtomicLong c = new AtomicLong(0);
    public final Object d = new Object();
    public final ConcurrentHashMap e = new ConcurrentHashMap(10, 0.75f, 4);
    public final SparseArray f = new SparseArray();
    public final SparseArray g = new SparseArray();
    public final UUID h = UUID.randomUUID();
    public final Context i;

    static {
        SettableFuture create = SettableFuture.create();
        b = create;
        create.set(new Object());
    }

    public akau(Context context) {
        this.i = context;
    }

    public static int a(long j) {
        return (int) (j >> 32);
    }

    public static int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static long c(int i, long j) {
        return (i << 32) | b(j);
    }
}
