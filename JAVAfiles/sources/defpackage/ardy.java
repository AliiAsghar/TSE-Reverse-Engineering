package defpackage;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ardy extends aque {
    private static final Method u;
    arep d;
    public arep e;
    aqvf f;
    final List g;
    final String h;
    String i;
    final String j;
    aqsp k;
    aqsb l;
    long m;
    public final boolean n;
    final aqtc o;
    public final ards p;
    private final List v;
    private final ardt w;
    private static final Logger q = Logger.getLogger(ardy.class.getName());
    static final long a = TimeUnit.MINUTES.toMillis(30);
    static final long b = TimeUnit.SECONDS.toMillis(1);
    private static final arep r = new arhm(arcb.n, 0);
    private static final aqsp s = aqsp.b;
    private static final aqsb t = aqsb.a;
    static final Pattern c = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method method = null;
        try {
            Class<?> cls = Class.forName("aqyr");
            Class<?> cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            q.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e);
        } catch (NoSuchMethodException e2) {
            q.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        }
        u = method;
    }

    public ardy(String str, ardt ardtVar, ards ardsVar) {
        arep arepVar = r;
        this.d = arepVar;
        this.e = arepVar;
        this.v = new ArrayList();
        this.f = aqvf.b();
        this.g = new ArrayList();
        this.j = "pick_first";
        this.k = s;
        this.l = t;
        this.m = a;
        this.n = true;
        this.o = aqtc.b;
        new ArrayList();
        str.getClass();
        this.h = str;
        this.w = ardtVar;
        this.p = ardsVar;
        arrj.D();
    }

    static String b(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", a.cr(socketAddress, "/"), null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    static asmb j(String str, aqvf aqvfVar, Collection collection) {
        URI uri;
        aqve aqveVar;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri != null) {
            aqveVar = aqvfVar.a(uri.getScheme());
        } else {
            aqveVar = null;
        }
        String str2 = "";
        if (aqveVar == null && !c.matcher(str).matches()) {
            try {
                uri = new URI(aqvfVar.c(), "", a.cp(str, "/"), null);
                aqveVar = aqvfVar.a(uri.getScheme());
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        if (aqveVar == null) {
            if (sb.length() > 0) {
                str2 = a.bX(sb, " (", ")");
            }
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
        }
        if (collection != null && !collection.containsAll(aqveVar.c())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        return new asmb(uri, aqveVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:11|12|(10:14|15|16|(1:18)|19|20|21|(1:23)|24|25)|40|(0)|19|20|21|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
    
        defpackage.ardy.q.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        defpackage.ardy.q.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        defpackage.ardy.q.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        defpackage.ardy.q.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    @Override // defpackage.aque
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aquc a() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ardy.a():aquc");
    }

    @Override // defpackage.aque
    public final /* synthetic */ void c(aqsb aqsbVar) {
        this.l = aqsbVar;
    }

    @Override // defpackage.aque
    public final /* synthetic */ void d(aqsp aqspVar) {
        this.k = aqspVar;
    }

    @Override // defpackage.aque
    public final /* bridge */ /* synthetic */ void e(Executor executor) {
        if (executor != null) {
            this.d = new arhm(executor, 1);
        } else {
            this.d = r;
        }
    }

    @Override // defpackage.aque
    public final /* bridge */ /* synthetic */ void f(long j, TimeUnit timeUnit) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        albo.M(z, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            this.m = -1L;
        } else {
            this.m = Math.max(timeUnit.toMillis(j), b);
        }
    }

    @Override // defpackage.aque
    public final /* bridge */ /* synthetic */ void g(aqrv[] aqrvVarArr) {
        this.v.addAll(Arrays.asList(aqrvVarArr));
    }

    @Override // defpackage.aque
    public final /* bridge */ /* synthetic */ void h(Executor executor) {
        if (executor != null) {
            this.e = new arhm(executor, 1);
        } else {
            this.e = r;
        }
    }

    @Override // defpackage.aque
    public final /* synthetic */ void i(String str) {
        this.i = str;
    }

    public ardy(SocketAddress socketAddress, String str, ardt ardtVar) {
        arep arepVar = r;
        this.d = arepVar;
        this.e = arepVar;
        this.v = new ArrayList();
        this.f = aqvf.b();
        this.g = new ArrayList();
        this.j = "pick_first";
        this.k = s;
        this.l = t;
        this.m = a;
        this.n = true;
        this.o = aqtc.b;
        new ArrayList();
        this.h = b(socketAddress);
        this.w = ardtVar;
        aqvf aqvfVar = new aqvf();
        aqvfVar.e(new ardv(socketAddress, str));
        this.f = aqvfVar;
        this.p = new ardx();
        arrj.D();
    }
}
