package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolg extends aqrs {
    private final String a;
    private final aojr b;
    private final Object c = new Object();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public aolg(String str, aojr aojrVar) {
        this.a = str;
        this.b = aojrVar;
    }

    private static final URI c(String str) {
        try {
            URI uri = new URI(null, str, null, null, null);
            if (uri.getPort() != -1) {
                return uri;
            }
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    @Override // defpackage.aqrs
    public final aqru a(aqux aquxVar, aqrr aqrrVar) {
        Object obj;
        aolg aolgVar;
        aolf aolfVar;
        Context context;
        URI uri;
        Executor executor;
        Executor executor2;
        alhr alhrVar;
        String str = (String) aqrrVar.f(aojz.a);
        aojr aojrVar = this.b;
        if (str == null) {
            str = this.a;
        }
        URI c = c(str);
        albo.U(!TextUtils.isEmpty(c.getAuthority()), "Could not parse channel authority");
        Integer num = (Integer) aqrrVar.f(aoly.a);
        Integer num2 = (Integer) aqrrVar.f(aoly.b);
        Integer num3 = (Integer) aqrrVar.f(aojv.a);
        long longValue = ((Long) ((alhw) this.b.n).a).longValue();
        aojr aojrVar2 = this.b;
        aolf aolfVar2 = new aolf(c, longValue, aojrVar2.p, aojrVar2.q, num, num2, num3);
        aole aoleVar = (aole) this.d.get(aolfVar2);
        if (aoleVar == null) {
            Object obj2 = this.c;
            synchronized (obj2) {
                try {
                    try {
                        if (!this.d.containsKey(aolfVar2)) {
                            alhw alhwVar = new alhw(false);
                            aoka aokaVar = new aoka();
                            aokaVar.d(alhwVar);
                            aokaVar.c(4194304);
                            aokaVar.a(Long.MAX_VALUE);
                            aokaVar.b(aokb.a);
                            Context context2 = aojrVar.a;
                            if (context2 != null) {
                                aokaVar.a = context2;
                                aokaVar.b = aolfVar2.a;
                                aokaVar.h = aolfVar2.c;
                                aokaVar.i = aolfVar2.d;
                                aokaVar.j = aolfVar2.b;
                                aokaVar.n = (byte) (aokaVar.n | 1);
                                Executor executor3 = aojrVar.f;
                                if (executor3 != null) {
                                    aokaVar.c = executor3;
                                    Executor executor4 = aojrVar.d;
                                    if (executor4 != null) {
                                        aokaVar.d = executor4;
                                        aokaVar.e = aojrVar.g;
                                        aokaVar.f = aojrVar.j;
                                        aokaVar.d(aojrVar.k);
                                        aokaVar.a(aojrVar.p);
                                        aokaVar.b(aojrVar.q);
                                        Integer num4 = aolfVar2.e;
                                        if (num4 != null) {
                                            aokaVar.c(num4.intValue());
                                        } else {
                                            aokaVar.c(aojrVar.o);
                                        }
                                        aokc aokcVar = aojrVar.c;
                                        if (aokaVar.n == 15 && (context = aokaVar.a) != null && (uri = aokaVar.b) != null && (executor = aokaVar.c) != null && (executor2 = aokaVar.d) != null && (alhrVar = aokaVar.g) != null) {
                                            try {
                                                obj = obj2;
                                            } catch (Throwable th) {
                                                th = th;
                                                obj = obj2;
                                                throw th;
                                            }
                                            try {
                                                aole aoleVar2 = new aole(aokcVar, new aokb(context, uri, executor, executor2, aokaVar.e, aokaVar.f, alhrVar, aokaVar.h, aokaVar.i, aokaVar.j, aokaVar.k, aokaVar.l, aokaVar.m), aojrVar.e);
                                                aolgVar = this;
                                                aolfVar = aolfVar2;
                                                aolgVar.d.put(aolfVar, aoleVar2);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                throw th;
                                            }
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        if (aokaVar.a == null) {
                                            sb.append(" applicationContext");
                                        }
                                        if (aokaVar.b == null) {
                                            sb.append(" uri");
                                        }
                                        if (aokaVar.c == null) {
                                            sb.append(" networkExecutor");
                                        }
                                        if (aokaVar.d == null) {
                                            sb.append(" transportExecutor");
                                        }
                                        if (aokaVar.g == null) {
                                            sb.append(" recordNetworkMetricsToPrimes");
                                        }
                                        if ((aokaVar.n & 1) == 0) {
                                            sb.append(" grpcIdleTimeoutMillis");
                                        }
                                        if ((aokaVar.n & 2) == 0) {
                                            sb.append(" maxMessageSize");
                                        }
                                        if ((aokaVar.n & 4) == 0) {
                                            sb.append(" grpcKeepAliveTimeMillis");
                                        }
                                        if ((aokaVar.n & 8) == 0) {
                                            sb.append(" grpcKeepAliveTimeoutMillis");
                                        }
                                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                    }
                                    throw new NullPointerException("Null transportExecutor");
                                }
                                throw new NullPointerException("Null networkExecutor");
                            }
                            throw new NullPointerException("Null applicationContext");
                        }
                        aolgVar = this;
                        obj = obj2;
                        aolfVar = aolfVar2;
                        aoleVar = (aole) aolgVar.d.get(aolfVar);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        return aoleVar.a(aquxVar, aqrrVar);
    }

    @Override // defpackage.aqrs
    public final String b() {
        return this.a;
    }
}
