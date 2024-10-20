package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aojr {
    public final Context a;
    public final aegu b;
    public final aokc c;
    public final Executor d;
    public final Executor e;
    public final Executor f;
    public final ScheduledExecutorService g;
    public final aokg h;
    public final aojw i;
    public final String j;
    public final alhr k;
    public final alhr l;
    public final alhr m;
    public final alhr n;
    public final int o;
    public final long p;
    public final long q;
    public final appn r;
    public final aode s;
    public final aode t;

    public aojr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        aokg aokgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aojr) {
            aojr aojrVar = (aojr) obj;
            if (this.a.equals(aojrVar.a) && this.b.equals(aojrVar.b) && this.c.equals(aojrVar.c) && this.d.equals(aojrVar.d) && this.e.equals(aojrVar.e) && this.f.equals(aojrVar.f) && ((scheduledExecutorService = this.g) != null ? scheduledExecutorService.equals(aojrVar.g) : aojrVar.g == null) && ((aokgVar = this.h) != null ? aokgVar.equals(aojrVar.h) : aojrVar.h == null)) {
                aojw aojwVar = aojrVar.i;
                String str = this.j;
                if (str != null ? str.equals(aojrVar.j) : aojrVar.j == null) {
                    if (this.k.equals(aojrVar.k) && this.l.equals(aojrVar.l) && this.m.equals(aojrVar.m) && this.n.equals(aojrVar.n)) {
                        aode aodeVar = aojrVar.t;
                        aode aodeVar2 = aojrVar.s;
                        if (this.o == aojrVar.o && this.p == aojrVar.p && this.q == aojrVar.q) {
                            appn appnVar = aojrVar.r;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.g;
        int i = 0;
        if (scheduledExecutorService == null) {
            hashCode = 0;
        } else {
            hashCode = scheduledExecutorService.hashCode();
        }
        int i2 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        aokg aokgVar = this.h;
        if (aokgVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aokgVar.hashCode();
        }
        int i3 = i2 ^ hashCode2;
        String str = this.j;
        if (str != null) {
            i = str.hashCode();
        }
        int hashCode4 = ((((((((((((i3 * (-721379959)) ^ i) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1525764945) ^ this.o) * 1000003;
        long j = this.p;
        int i4 = (hashCode4 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.q;
        return (i4 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
    }

    public final String toString() {
        alhr alhrVar = this.n;
        alhr alhrVar2 = this.m;
        alhr alhrVar3 = this.l;
        alhr alhrVar4 = this.k;
        aokg aokgVar = this.h;
        ScheduledExecutorService scheduledExecutorService = this.g;
        Executor executor = this.f;
        Executor executor2 = this.e;
        Executor executor3 = this.d;
        aokc aokcVar = this.c;
        aegu aeguVar = this.b;
        return "ChannelConfig{context=" + String.valueOf(this.a) + ", clock=" + String.valueOf(aeguVar) + ", transport=" + String.valueOf(aokcVar) + ", transportExecutor=" + String.valueOf(executor3) + ", ioExecutor=" + String.valueOf(executor2) + ", networkExecutor=" + String.valueOf(executor) + ", transportScheduledExecutor=" + String.valueOf(scheduledExecutorService) + ", authContextManager=" + String.valueOf(aokgVar) + ", rpcCacheProvider=null, userAgentOverride=" + this.j + ", recordNetworkMetricsToPrimes=" + String.valueOf(alhrVar4) + ", recordCachingMetricsToPrimes=" + String.valueOf(alhrVar3) + ", recordBandwidthMetrics=" + String.valueOf(alhrVar2) + ", grpcIdleTimeoutMillis=" + String.valueOf(alhrVar) + ", streamzConfig=null, grpcServiceConfig=null, consistencyTokenConfig=null, maxMessageSize=" + this.o + ", grpcKeepAliveTimeMillis=" + this.p + ", grpcKeepAliveTimeoutMillis=" + this.q + ", channelCredentials=null}";
    }

    public aojr(Context context, aegu aeguVar, aokc aokcVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, aokg aokgVar, String str, alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4, int i, long j, long j2) {
        this.a = context;
        this.b = aeguVar;
        this.c = aokcVar;
        this.d = executor;
        this.e = executor2;
        this.f = executor3;
        this.g = scheduledExecutorService;
        this.h = aokgVar;
        this.i = null;
        this.j = str;
        this.k = alhrVar;
        this.l = alhrVar2;
        this.m = alhrVar3;
        this.n = alhrVar4;
        this.t = null;
        this.s = null;
        this.o = i;
        this.p = j;
        this.q = j2;
        this.r = null;
    }
}
