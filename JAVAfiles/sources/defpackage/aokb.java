package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aokb {
    public static final long a = TimeUnit.SECONDS.toMillis(20);
    public final Context b;
    public final URI c;
    public final Executor d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final String g;
    public final alhr h;
    public final Integer i;
    public final Integer j;
    public final long k;
    public final int l;
    public final long m;
    public final appn n;
    public final aode o;
    private final long p;

    public aokb() {
        throw null;
    }

    public final int a() {
        return this.c.getPort();
    }

    public final String b() {
        return this.c.getHost();
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aokb) {
            aokb aokbVar = (aokb) obj;
            if (this.b.equals(aokbVar.b) && this.c.equals(aokbVar.c) && this.d.equals(aokbVar.d) && this.e.equals(aokbVar.e) && ((scheduledExecutorService = this.f) != null ? scheduledExecutorService.equals(aokbVar.f) : aokbVar.f == null) && ((str = this.g) != null ? str.equals(aokbVar.g) : aokbVar.g == null) && this.h.equals(aokbVar.h)) {
                aode aodeVar = aokbVar.o;
                Integer num = this.i;
                if (num != null ? num.equals(aokbVar.i) : aokbVar.i == null) {
                    Integer num2 = this.j;
                    if (num2 != null ? num2.equals(aokbVar.j) : aokbVar.j == null) {
                        if (this.k == aokbVar.k && this.l == aokbVar.l && this.p == aokbVar.p && this.m == aokbVar.m) {
                            appn appnVar = aokbVar.n;
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
        int hashCode3;
        int hashCode4 = ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.f;
        int i = 0;
        if (scheduledExecutorService == null) {
            hashCode = 0;
        } else {
            hashCode = scheduledExecutorService.hashCode();
        }
        int i2 = ((hashCode4 * 1000003) ^ hashCode) * 1000003;
        String str = this.g;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode5 = ((i2 ^ hashCode2) * 1000003) ^ this.h.hashCode();
        Integer num = this.i;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i3 = ((hashCode5 * (-721379959)) ^ hashCode3) * 1000003;
        Integer num2 = this.j;
        if (num2 != null) {
            i = num2.hashCode();
        }
        long j = this.k;
        int i4 = (((((i3 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.l) * 1000003;
        long j2 = this.p;
        int i5 = (i4 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.m;
        return (i5 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
    }

    public final String toString() {
        alhr alhrVar = this.h;
        ScheduledExecutorService scheduledExecutorService = this.f;
        Executor executor = this.e;
        Executor executor2 = this.d;
        URI uri = this.c;
        return "TransportConfig{applicationContext=" + String.valueOf(this.b) + ", uri=" + String.valueOf(uri) + ", networkExecutor=" + String.valueOf(executor2) + ", transportExecutor=" + String.valueOf(executor) + ", transportScheduledExecutorService=" + String.valueOf(scheduledExecutorService) + ", userAgentOverride=" + this.g + ", recordNetworkMetricsToPrimes=" + String.valueOf(alhrVar) + ", grpcServiceConfig=null, trafficStatsUid=" + this.i + ", trafficStatsTag=" + this.j + ", grpcIdleTimeoutMillis=" + this.k + ", maxMessageSize=" + this.l + ", grpcKeepAliveTimeMillis=" + this.p + ", grpcKeepAliveTimeoutMillis=" + this.m + ", channelCredentials=null}";
    }

    public aokb(Context context, URI uri, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, String str, alhr alhrVar, Integer num, Integer num2, long j, int i, long j2, long j3) {
        this.b = context;
        this.c = uri;
        this.d = executor;
        this.e = executor2;
        this.f = scheduledExecutorService;
        this.g = str;
        this.h = alhrVar;
        this.o = null;
        this.i = num;
        this.j = num2;
        this.k = j;
        this.l = i;
        this.p = j2;
        this.m = j3;
        this.n = null;
    }
}
