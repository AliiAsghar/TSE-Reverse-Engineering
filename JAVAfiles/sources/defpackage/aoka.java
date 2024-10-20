package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoka {
    public Context a;
    public URI b;
    public Executor c;
    public Executor d;
    public ScheduledExecutorService e;
    public String f;
    public alhr g;
    public Integer h;
    public Integer i;
    public long j;
    public int k;
    public long l;
    public long m;
    public byte n;

    public final void a(long j) {
        this.l = j;
        this.n = (byte) (this.n | 4);
    }

    public final void b(long j) {
        this.m = j;
        this.n = (byte) (this.n | 8);
    }

    public final void c(int i) {
        this.k = i;
        this.n = (byte) (this.n | 2);
    }

    public final void d(alhr alhrVar) {
        if (alhrVar != null) {
            this.g = alhrVar;
            return;
        }
        throw new NullPointerException("Null recordNetworkMetricsToPrimes");
    }
}
