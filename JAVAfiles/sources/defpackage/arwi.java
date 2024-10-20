package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arwi {
    public static final boolean A(arpi arpiVar) {
        arxm arxmVar = (arxm) arpiVar.get(arxm.c);
        if (arxmVar != null) {
            return arxmVar.x();
        }
        return true;
    }

    public static final aslu B(SSLSession sSLSession) {
        Object obj;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!d.F(cipherSuite, "TLS_NULL_WITH_NULL_NULL") && !d.F(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                asli D = asli.t.D(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!d.F("NONE", protocol)) {
                        asmr asmrVar = asmr.a;
                        asmr al = aotl.al(protocol);
                        try {
                            obj = L(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            obj = arnv.a;
                        }
                        return new aslu(al, D, L(sSLSession.getLocalCertificates()), new arih(obj, 3));
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null");
            }
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[LOOP:0: B:1:0x0000->B:10:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int C(java.lang.String r4, int r5, int r6, boolean r7) {
        /*
        L0:
            if (r5 >= r6) goto L3d
            char r0 = r4.charAt(r5)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto L10
            r1 = 9
            if (r0 != r1) goto L34
            r0 = r1
        L10:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L34
            r1 = 48
            r3 = 58
            if (r0 < r1) goto L1d
            if (r0 >= r3) goto L1d
            goto L34
        L1d:
            r1 = 97
            if (r0 < r1) goto L26
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L26
            goto L34
        L26:
            r1 = 65
            if (r0 < r1) goto L2f
            r1 = 91
            if (r0 >= r1) goto L2f
            goto L34
        L2f:
            if (r0 != r3) goto L32
            goto L34
        L32:
            r0 = 0
            goto L35
        L34:
            r0 = r2
        L35:
            r1 = r7 ^ 1
            if (r0 != r1) goto L3a
            return r5
        L3a:
            int r5 = r5 + 1
            goto L0
        L3d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arwi.C(java.lang.String, int, int, boolean):int");
    }

    public static final asli E(String str) {
        asli asliVar = new asli(str);
        asli.b.put(str, asliVar);
        return asliVar;
    }

    public static final int F(String str, String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (arsd.N(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static String G(int i) {
        return Integer.toString(a.av(i));
    }

    public static int H(int i) {
        return i - 2;
    }

    public static int I(int i) {
        return i - 2;
    }

    public static int J(int i) {
        return i - 2;
    }

    private static final Object K(aryn arynVar, arqv arqvVar) {
        Object arvxVar;
        arpe arpeVar;
        u(arynVar, true, new arwv(o(arynVar.e.u()).c(arynVar.b, arynVar, ((arvg) arynVar).a)));
        try {
            if (!(arqvVar instanceof arpq)) {
                arvxVar = arhi.g(arqvVar, arynVar, arynVar);
            } else {
                arsd.g(arqvVar, 2);
                arvxVar = arqvVar.a(arynVar, arynVar);
            }
        } catch (Throwable th) {
            arvxVar = new arvx(th);
        }
        arpl arplVar = arpl.a;
        if (arvxVar == arplVar) {
            return arplVar;
        }
        Object H = arynVar.H(arvxVar);
        if (H == arxx.b) {
            return arpl.a;
        }
        if (H instanceof arvx) {
            Throwable th2 = ((arvx) H).b;
            if ((th2 instanceof arym) && ((arym) th2).a == arynVar) {
                if (arvxVar instanceof arvx) {
                    th2 = ((arvx) arvxVar).b;
                    arpeVar = arynVar.e;
                    if (arwh.b) {
                        if (!(arpeVar instanceof arpt)) {
                            throw th2;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    return arvxVar;
                }
            } else {
                arpeVar = arynVar.e;
                if (arwh.b) {
                    if (!(arpeVar instanceof arpt)) {
                        throw th2;
                    }
                } else {
                    throw th2;
                }
            }
            throw asfm.a(th2, (arpt) arpeVar);
        }
        return arxx.b(H);
    }

    private static final List L(Certificate[] certificateArr) {
        if (certificateArr != null) {
            return asmt.m(Arrays.copyOf(certificateArr, certificateArr.length));
        }
        return arnv.a;
    }

    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(arpe arpeVar) {
        Object O;
        if (arpeVar instanceof aset) {
            return ((aset) arpeVar).toString();
        }
        try {
            O = arpeVar + "@" + b(arpeVar);
        } catch (Throwable th) {
            O = aqil.O(th);
        }
        if (armq.c(O) != null) {
            O = arpeVar.getClass().getName() + "@" + b(arpeVar);
        }
        return (String) O;
    }

    public static final Object d(arqv arqvVar, arpe arpeVar) {
        asfk asfkVar = new asfk(arpeVar.u(), arpeVar);
        Object ay = arsd.ay(asfkVar, asfkVar, arqvVar);
        if (ay == arpl.a) {
            arpeVar.getClass();
        }
        return ay;
    }

    public static final arwe e(arpi arpiVar) {
        if (arpiVar.get(arxm.c) == null) {
            arpiVar = arpiVar.plus(new arxo(null));
        }
        return new asep(arpiVar);
    }

    public static final arwe f(arwe arweVar, arpi arpiVar) {
        return new asep(arweVar.b().plus(arpiVar));
    }

    public static final void g(arwe arweVar, CancellationException cancellationException) {
        arxm arxmVar = (arxm) arweVar.b().get(arxm.c);
        if (arxmVar != null) {
            arxmVar.v(cancellationException);
        } else {
            Objects.toString(arweVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(arweVar)));
        }
    }

    public static final boolean h(arwe arweVar) {
        arxm arxmVar = (arxm) arweVar.b().get(arxm.c);
        if (arxmVar != null) {
            return arxmVar.x();
        }
        return true;
    }

    public static final void j(arwq arwqVar, arpe arpeVar, boolean z) {
        Object n;
        aryq aryqVar;
        Object o = arwqVar.o();
        Throwable r = arwqVar.r(o);
        if (r != null) {
            n = aqil.O(r);
        } else {
            n = arwqVar.n(o);
        }
        if (z) {
            aset asetVar = (aset) arpeVar;
            arpe arpeVar2 = asetVar.b;
            Object obj = asetVar.d;
            arpi u = arpeVar2.u();
            Object b = asfq.b(u, obj);
            if (b != asfq.a) {
                aryqVar = arwa.c(arpeVar2, u, b);
            } else {
                aryqVar = null;
            }
            try {
                asetVar.b.w(n);
                if (aryqVar != null && !aryqVar.f()) {
                    return;
                }
                asfq.c(u, b);
                return;
            } catch (Throwable th) {
                if (aryqVar == null || aryqVar.f()) {
                    asfq.c(u, b);
                }
                throw th;
            }
        }
        arpeVar.w(n);
    }

    public static final long k(long j) {
        long j2 = arut.a;
        if (j <= 0) {
            return 0L;
        }
        return arut.g(arut.i(j, arsd.p(999999L, aruv.a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(defpackage.arpe r4) {
        /*
            boolean r0 = r4 instanceof defpackage.arwn
            if (r0 == 0) goto L13
            r0 = r4
            arwn r0 = (defpackage.arwn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            arwn r0 = new arwn
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            defpackage.aqil.P(r4)
            goto L4e
        L2f:
            defpackage.aqil.P(r4)
            r0.b = r3
            arvp r4 = new arvp
            arpe r2 = defpackage.arhi.i(r0)
            r4.<init>(r2, r3)
            r4.A()
            java.lang.Object r4 = r4.l()
            arpl r2 = defpackage.arpl.a
            if (r4 != r2) goto L4b
            r0.getClass()
        L4b:
            if (r4 != r1) goto L4e
            return r1
        L4e:
            armj r4 = new armj
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arwi.l(arpe):java.lang.Object");
    }

    public static final Object m(long j, arpe arpeVar) {
        if (j > 0) {
            arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
            arvpVar.A();
            if (j < Long.MAX_VALUE) {
                o(arvpVar.b).d(j, arvpVar);
            }
            Object l = arvpVar.l();
            arpl arplVar = arpl.a;
            if (l == arplVar) {
                arpeVar.getClass();
            }
            if (l == arplVar) {
                return l;
            }
        }
        return arnb.a;
    }

    public static final Object n(long j, arpe arpeVar) {
        Object m = m(k(j), arpeVar);
        if (m == arpl.a) {
            return m;
        }
        return arnb.a;
    }

    public static final arwm o(arpi arpiVar) {
        arwm arwmVar;
        arpg arpgVar = arpiVar.get(arpf.k);
        if (arpgVar instanceof arwm) {
            arwmVar = (arwm) arpgVar;
        } else {
            arwmVar = null;
        }
        if (arwmVar == null) {
            return arwk.a;
        }
        return arwmVar;
    }

    public static /* synthetic */ String p(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "DROP_LATEST";
            }
            return "DROP_OLDEST";
        }
        return "SUSPEND";
    }

    public static final Object q(arpe arpeVar) {
        aset asetVar;
        Object obj;
        arpi u = arpeVar.u();
        y(u);
        arpe i = arhi.i(arpeVar);
        if (i instanceof aset) {
            asetVar = (aset) i;
        } else {
            asetVar = null;
        }
        if (asetVar == null) {
            obj = arnb.a;
        } else {
            if (asetVar.a.ey(u)) {
                asetVar.a(u, arnb.a);
            } else {
                aryt arytVar = new aryt();
                asetVar.a(u.plus(arytVar), arnb.a);
                if (arytVar.a) {
                    arnb arnbVar = arnb.a;
                    boolean z = arwh.a;
                    ThreadLocal threadLocal = aryl.a;
                    arwx a = aryl.a();
                    if (!a.q()) {
                        if (a.p()) {
                            asetVar.c = arnbVar;
                            asetVar.e = 1;
                            a.n(asetVar);
                            obj = arpl.a;
                        } else {
                            a.o(true);
                            try {
                                asetVar.run();
                                do {
                                } while (a.r());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = arnb.a;
                }
            }
            obj = arpl.a;
        }
        arpl arplVar = arpl.a;
        if (obj == arplVar) {
            arpeVar.getClass();
        }
        if (obj == arplVar) {
            return obj;
        }
        return arnb.a;
    }

    public static final Object r(long j, arqv arqvVar, arpe arpeVar) {
        if (j > 0) {
            return K(new aryn(j, arpeVar), arqvVar);
        }
        throw new arym("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(long r7, defpackage.arqv r9, defpackage.arpe r10) {
        /*
            boolean r0 = r10 instanceof defpackage.aryo
            if (r0 == 0) goto L13
            r0 = r10
            aryo r0 = (defpackage.aryo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aryo r0 = new aryo
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            arsb r7 = r0.c
            defpackage.aqil.P(r10)     // Catch: defpackage.arym -> L2a
            goto L55
        L2a:
            r8 = move-exception
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.aqil.P(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            arsb r10 = new arsb
            r10.<init>()
            r0.c = r10     // Catch: defpackage.arym -> L56
            r0.b = r4     // Catch: defpackage.arym -> L56
            aryn r2 = new aryn     // Catch: defpackage.arym -> L56
            r2.<init>(r7, r0)     // Catch: defpackage.arym -> L56
            r10.a = r2     // Catch: defpackage.arym -> L56
            java.lang.Object r10 = K(r2, r9)     // Catch: defpackage.arym -> L56
            if (r10 != r1) goto L55
            return r1
        L55:
            return r10
        L56:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L59:
            arxm r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L60
            return r3
        L60:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arwi.s(long, arqv, arpe):java.lang.Object");
    }

    public static final Object t(arxm arxmVar, arpe arpeVar) {
        arxmVar.v(null);
        Object q = arxmVar.q(arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public static final arwu u(arxm arxmVar, boolean z, arxp arxpVar) {
        if (arxmVar instanceof arxw) {
            return ((arxw) arxmVar).L(z, arxpVar);
        }
        return arxmVar.t(arxpVar.b(), z, new afya(arxpVar, 13, (byte[][][]) null));
    }

    public static final arxm v(arpi arpiVar) {
        arxm arxmVar = (arxm) arpiVar.get(arxm.c);
        if (arxmVar != null) {
            return arxmVar;
        }
        Objects.toString(arpiVar);
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(arpiVar)));
    }

    public static final void w(arpi arpiVar, CancellationException cancellationException) {
        arxm arxmVar = (arxm) arpiVar.get(arxm.c);
        if (arxmVar != null) {
            arxmVar.v(cancellationException);
        }
    }

    public static final void x(arxm arxmVar, String str, Throwable th) {
        arxmVar.v(arsd.ao(str, th));
    }

    public static final void y(arpi arpiVar) {
        arxm arxmVar = (arxm) arpiVar.get(arxm.c);
        if (arxmVar != null) {
            z(arxmVar);
        }
    }

    public static final void z(arxm arxmVar) {
        if (arxmVar.x()) {
        } else {
            throw arxmVar.r();
        }
    }

    public final synchronized asli D(String str) {
        asli asliVar;
        String str2;
        str.getClass();
        asliVar = (asli) asli.b.get(str);
        if (asliVar == null) {
            Map map = asli.b;
            if (arsd.z(str, "TLS_", false)) {
                String substring = str.substring(4);
                substring.getClass();
                str2 = "SSL_".concat(substring);
            } else if (arsd.z(str, "SSL_", false)) {
                String substring2 = str.substring(4);
                substring2.getClass();
                str2 = "TLS_".concat(substring2);
            } else {
                str2 = str;
            }
            asliVar = (asli) map.get(str2);
            if (asliVar == null) {
                asliVar = new asli(str);
            }
            asli.b.put(str, asliVar);
        }
        return asliVar;
    }
}
