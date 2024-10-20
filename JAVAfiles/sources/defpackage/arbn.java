package defpackage;

import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbn extends aqvd {
    public static final Logger a;
    public static final Set b;
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final arbm f;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private final boolean A;
    private apzj B;
    final aqvo g;
    public final String j;
    public final int k;
    public final long l;
    public final aqwe m;
    public final alhp n;
    public boolean o;
    public final aqvc p;
    public boolean q;
    private final String w;
    private final arhk x;
    private boolean y;
    private Executor z;
    public final Random h = new Random();
    protected volatile int r = 1;
    public final AtomicReference i = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(arbn.class.getName());
        a = logger;
        b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        c = Boolean.parseBoolean(property);
        d = Boolean.parseBoolean(property2);
        e = Boolean.parseBoolean(property3);
        arbm arbmVar = null;
        try {
            try {
                try {
                    arbm arbmVar2 = (arbm) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, arbn.class.getClassLoader()).asSubclass(arbm.class).getConstructor(null).newInstance(null);
                    if (arbmVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", arbmVar2.b());
                    } else {
                        arbmVar = arbmVar2;
                    }
                } catch (Exception e2) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        f = arbmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public arbn(String str, aquy aquyVar, arhk arhkVar, alhp alhpVar, boolean z) {
        boolean z2;
        aquyVar.getClass();
        this.x = arhkVar;
        str.getClass();
        URI create = URI.create("//".concat(str));
        if (create.getHost() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        albo.N(z2, "Invalid DNS name: %s", str);
        String authority = create.getAuthority();
        authority.getClass();
        this.w = authority;
        this.j = create.getHost();
        if (create.getPort() == -1) {
            this.k = aquyVar.a;
        } else {
            this.k = create.getPort();
        }
        this.g = aquyVar.b;
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            if (j2 > 0) {
                j = TimeUnit.SECONDS.toNanos(j2);
            } else {
                j = j2;
            }
        }
        this.l = j;
        this.n = alhpVar;
        this.m = aquyVar.c;
        Executor executor = aquyVar.f;
        this.z = executor;
        this.A = executor == null;
        this.p = aquyVar.d;
    }

    public static String e() {
        if (v == null) {
            try {
                v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return v;
    }

    private final void f() {
        if (!this.q && !this.y) {
            if (this.o) {
                long j = this.l;
                if (j != 0 && (j <= 0 || this.n.a(TimeUnit.NANOSECONDS) <= this.l)) {
                    return;
                }
            }
            this.q = true;
            this.z.execute(new arbk(this, this.B));
        }
    }

    @Override // defpackage.aqvd
    public final String a() {
        return this.w;
    }

    @Override // defpackage.aqvd
    public final void b() {
        boolean z;
        if (this.B != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "not started");
        f();
    }

    @Override // defpackage.aqvd
    public final void c() {
        if (!this.y) {
            this.y = true;
            Executor executor = this.z;
            if (executor != null && this.A) {
                arhl.d(this.x, executor);
                this.z = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.aqvd
    public final void d(apzj apzjVar) {
        boolean z;
        if (this.B == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "already started");
        if (this.A) {
            this.z = arhl.a(this.x);
        }
        this.B = apzjVar;
        f();
    }
}
