package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arhi {
    public static Set a(Map map, String str) {
        Status.Code code;
        boolean z;
        List f = arct.f(map, str);
        if (f == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(Status.Code.class);
        for (Object obj : f) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int intValue = d.intValue();
                boolean z2 = true;
                if (intValue == d.doubleValue()) {
                    z = true;
                } else {
                    z = false;
                }
                albo.z(z, "Status code %s is not integral", obj);
                code = Status.fromCodeValue(intValue).getCode();
                if (code.value() != d.intValue()) {
                    z2 = false;
                }
                albo.z(z2, "Status code %s is not valid", obj);
            } else if (obj instanceof String) {
                try {
                    code = (Status.Code) Enum.valueOf(Status.Code.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new alia(hht.b(obj, "Status code ", " is not valid"), e);
                }
            } else {
                throw new alia("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
            }
            noneOf.add(code);
        }
        return DesugarCollections.unmodifiableSet(noneOf);
    }

    public static final PasswordAuthentication b(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            arfg.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static final asai c(asai asaiVar, Object obj) {
        return new asaa(new asbv(asaiVar, obj, null, 1));
    }

    public static final Object d(aqrs aqrsVar, aqux aquxVar, Object obj, aqrr aqrrVar, aqut aqutVar, arpe arpeVar) {
        if (aquxVar.a == aquw.UNARY) {
            return arrn.Y(c(new asaa(new aria(aqrrVar, aqrsVar, aquxVar, aqutVar, new atoi(obj), null)), aquxVar), arpeVar);
        }
        Objects.toString(aquxVar);
        throw new IllegalArgumentException("Expected a unary RPC method, but got ".concat(aquxVar.toString()));
    }

    public static final int e(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - u(i2, i, i3);
            }
        } else if (i3 < 0) {
            if (i > i2) {
                return i2 + u(i, i2, -i3);
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i2;
    }

    public static final arpx f(Enum[] enumArr) {
        enumArr.getClass();
        return new arpx(enumArr);
    }

    public static final Object g(arqv arqvVar, Object obj, arpe arpeVar) {
        Object arppVar;
        arqvVar.getClass();
        arpi u = arpeVar.u();
        if (u == arpj.a) {
            arppVar = new arpo(arpeVar);
        } else {
            arppVar = new arpp(arpeVar, u);
        }
        arsd.g(arqvVar, 2);
        return arqvVar.a(obj, arppVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final arpe h(arqv arqvVar, Object obj, arpe arpeVar) {
        arqvVar.getClass();
        if (arqvVar instanceof arpq) {
            return ((arpq) arqvVar).c(obj, arpeVar);
        }
        arpi u = arpeVar.u();
        if (u == arpj.a) {
            return new arpm(arpeVar, arqvVar, obj);
        }
        return new arpn(arpeVar, u, arqvVar, obj);
    }

    public static final arpe i(arpe arpeVar) {
        arps arpsVar;
        arpeVar.getClass();
        if (arpeVar instanceof arps) {
            arpsVar = (arps) arpeVar;
        } else {
            arpsVar = null;
        }
        if (arpsVar != null && (arpeVar = arpsVar.B) == null) {
            arpf arpfVar = (arpf) arpsVar.u().get(arpf.k);
            if (arpfVar != null) {
                arpeVar = arpfVar.e(arpsVar);
            } else {
                arpeVar = arpsVar;
            }
            arpsVar.B = arpeVar;
        }
        return arpeVar;
    }

    public static Object j() {
        return arpl.a;
    }

    public static Object k(arpg arpgVar, Object obj, arqv arqvVar) {
        arqvVar.getClass();
        return arqvVar.a(obj, arpgVar);
    }

    public static arpg l(arpg arpgVar, arph arphVar) {
        arphVar.getClass();
        if (d.F(arpgVar.getKey(), arphVar)) {
            return arpgVar;
        }
        return null;
    }

    public static arpi m(arpg arpgVar, arph arphVar) {
        arphVar.getClass();
        if (d.F(arpgVar.getKey(), arphVar)) {
            return arpj.a;
        }
        return arpgVar;
    }

    public static arpi n(arpg arpgVar, arpi arpiVar) {
        arpiVar.getClass();
        return arrj.p(arpgVar, arpiVar);
    }

    public static final arzw o(arwe arweVar, arpi arpiVar, int i, arqv arqvVar) {
        return q(arweVar, arpiVar, i, 1, arwf.a, arqvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p(defpackage.arzu r4, defpackage.arqg r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.arzt
            if (r0 == 0) goto L13
            r0 = r6
            arzt r0 = (defpackage.arzt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            arzt r0 = new arzt
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.aqil.P(r6)     // Catch: java.lang.Throwable -> L29
            goto L64
        L29:
            r4 = move-exception
            goto L6a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.aqil.P(r6)
            arpi r6 = r0.u()
            akty r2 = defpackage.arxm.c
            arpg r6 = r6.get(r2)
            if (r6 != r4) goto L6e
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            arvp r6 = new arvp     // Catch: java.lang.Throwable -> L29
            arpe r0 = i(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L29
            r6.A()     // Catch: java.lang.Throwable -> L29
            arnd r0 = new arnd     // Catch: java.lang.Throwable -> L29
            r2 = 6
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            arzj r4 = r4.b     // Catch: java.lang.Throwable -> L29
            r4.d(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.l()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L64
            return r1
        L64:
            r5.a()
            arnb r4 = defpackage.arnb.a
            return r4
        L6a:
            r5.a()
            throw r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arhi.p(arzu, arqg, arpe):java.lang.Object");
    }

    public static final arzw q(arwe arweVar, arpi arpiVar, int i, int i2, arwf arwfVar, arqv arqvVar) {
        arzu arzuVar = new arzu(arwa.b(arweVar, arpiVar), t(i, i2, 4));
        arwfVar.a(arqvVar, arzuVar, arzuVar);
        return arzuVar;
    }

    public static final void r(arzw arzwVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = arsd.ao("Channel was consumed, consumer had failed", th);
            }
        }
        arzwVar.v(cancellationException);
    }

    public static final void s(arzx arzxVar, Object obj) {
        Object c = arzxVar.c(obj);
        if (!(c instanceof arzm)) {
        } else {
            Object obj2 = ((arzn) arrn.K(new arzp(arzxVar, obj, null))).b;
        }
    }

    public static /* synthetic */ arzj t(int i, int i2, int i3) {
        arzs arzsVar;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (i2 == 1) {
                            return new arzf(i);
                        }
                        return new arzs(i, i2);
                    }
                    return new arzf(Integer.MAX_VALUE);
                }
                if (i2 == 1) {
                    return new arzf(0);
                }
                arzsVar = new arzs(1, i2);
            } else {
                if (i2 == 1) {
                    return new arzs(1, 2);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else {
            if (i2 == 1) {
                return new arzf(arzi.a);
            }
            arzsVar = new arzs(1, i2);
        }
        return arzsVar;
    }

    private static final int u(int i, int i2, int i3) {
        return v(v(i, i3) - v(i2, i3), i3);
    }

    private static final int v(int i, int i2) {
        int i3 = i % i2;
        if (i3 >= 0) {
            return i3;
        }
        return i3 + i2;
    }
}
