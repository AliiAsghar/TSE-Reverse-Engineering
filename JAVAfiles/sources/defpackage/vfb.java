package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfb {
    public static final xze a = xze.g("BugleNetwork", "RegisterRefreshRequestBuilder");
    public final vcs b;
    public final Supplier c;
    private final anen d;
    private final long e;
    private final Optional f;
    private final Callable g;
    private final vti h;

    public vfb(anen anenVar, vti vtiVar, vcs vcsVar, long j, Optional optional, Callable callable, Supplier supplier) {
        this.d = anenVar;
        this.h = vtiVar;
        this.b = vcsVar;
        this.f = optional;
        this.e = j;
        this.g = callable;
        this.c = supplier;
    }

    public final vfl a() {
        vfl q = this.h.q();
        q.j();
        q.k(this.g);
        Object obj = q.m;
        long j = this.e;
        synchronized (obj) {
            q.k = j;
        }
        synchronized (q.m) {
            q.l = true;
        }
        q.j = this.f;
        return q;
    }

    public final ListenableFuture b(aqgb aqgbVar, vfl vflVar) {
        return aktp.Y(vflVar.b(), new tul(this, aqgbVar, vflVar, 10, (byte[]) null), this.d);
    }
}
