package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Objects;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alce extends albv {
    static final Duration b = Duration.ofMinutes(3);
    static final Duration c = Duration.ofMinutes(3).plusSeconds(45);
    public static final alor d = altc.a;
    private static final long serialVersionUID = 4556936364828217687L;
    private final Duration a;
    public final Object e;
    public volatile alcc f;
    public transient alcd g;
    private final Duration h;

    protected alce() {
        this(null, c, b);
    }

    private final int a() {
        Date date;
        alcc alccVar = this.f;
        if (alccVar == null) {
            return 3;
        }
        Long l = alccVar.a.b;
        if (l == null) {
            date = null;
        } else {
            date = new Date(l.longValue());
        }
        if (date == null) {
            return 1;
        }
        long time = date.getTime() - System.currentTimeMillis();
        Duration duration = this.a;
        Duration ofMillis = Duration.ofMillis(time);
        if (ofMillis.compareTo(duration) <= 0) {
            return 3;
        }
        if (ofMillis.compareTo(this.h) > 0) {
            return 1;
        }
        return 2;
    }

    public static alce d(albx albxVar) {
        return new alce(albxVar, c, b);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.albv
    public void b(Executor executor, atpk atpkVar) {
        atkn atknVar;
        ListenableFuture listenableFuture;
        ListenableFuture listenableFuture2;
        if (a() == 1) {
            listenableFuture2 = albo.bI(this.f);
        } else {
            synchronized (this.e) {
                if (a() != 1) {
                    synchronized (this.e) {
                        alcd alcdVar = this.g;
                        if (alcdVar != null) {
                            atknVar = new atkn((Object) alcdVar, false);
                        } else {
                            anel anelVar = new anel(new alca(this, 0));
                            this.g = new alcd(anelVar, new hpg(this, anelVar, 4));
                            atknVar = new atkn((Object) this.g, true);
                        }
                    }
                } else {
                    atknVar = null;
                }
            }
            if (atknVar != null && atknVar.a) {
                executor.execute(atknVar.b);
            }
            synchronized (this.e) {
                if (a() != 3) {
                    listenableFuture = albo.bI(this.f);
                } else if (atknVar != null) {
                    listenableFuture = atknVar.b;
                } else {
                    listenableFuture = albo.bH(new IllegalStateException("Credentials expired, but there is no task to refresh"));
                }
            }
            listenableFuture2 = listenableFuture;
        }
        albo.bR(listenableFuture2, new alcb(atpkVar), andi.a);
    }

    public albx c() {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof alce)) {
            return false;
        }
        return Objects.equals(this.f, ((alce) obj).f);
    }

    public int hashCode() {
        return Objects.hashCode(this.f);
    }

    public String toString() {
        Map map;
        albx albxVar;
        alcc alccVar = this.f;
        if (alccVar != null) {
            map = alccVar.b;
            albxVar = alccVar.a;
        } else {
            map = null;
            albxVar = null;
        }
        algv aj = albo.aj(this);
        aj.b("requestMetadata", map);
        aj.b("temporaryAccess", albxVar);
        return aj.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public alce(albx albxVar, Duration duration, Duration duration2) {
        this.e = new byte[0];
        this.f = null;
        if (albxVar != null) {
            this.f = alcc.a(albxVar, d);
        }
        duration.getClass();
        this.h = duration;
        d.t(!duration.isNegative(), "refreshMargin can't be negative");
        duration2.getClass();
        this.a = duration2;
        d.t(!duration2.isNegative(), "expirationMargin can't be negative");
    }
}
