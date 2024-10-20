package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.OutputStream;
import java.net.URI;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aogy {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public aogy(ahyr ahyrVar, agxw agxwVar, agrk agrkVar, adxs adxsVar, ahiy ahiyVar, aegu aeguVar) {
        this.c = ahyrVar;
        this.d = agxwVar;
        this.e = agrkVar;
        this.b = adxsVar;
        this.f = ahiyVar;
        this.a = aeguVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    private final void E(akcx akcxVar, gtn gtnVar) {
        aluq listIterator = akcxVar.i.listIterator();
        while (listIterator.hasNext()) {
            gtnVar.c((String) listIterator.next());
        }
        if (akcxVar.c.f()) {
            gtnVar.b((gtf) akcxVar.c.b());
        }
        if (akcxVar.j.f() && akcxVar.k.f()) {
            algw algwVar = akcxVar.k;
            algw algwVar2 = akcxVar.j;
            akcv akcvVar = (akcv) algwVar.b();
            gtnVar.e((gry) algwVar2.b(), akcvVar.a, akcvVar.b);
        }
        if (akcxVar.e.f() && (gtnVar instanceof gtg)) {
            gtg gtgVar = (gtg) gtnVar;
            long longValue = ((Long) akcxVar.e.b()).longValue();
            if (longValue != Long.MAX_VALUE) {
                gys gysVar = gtgVar.c;
                gysVar.w = longValue;
                gysVar.x = 1;
            } else {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
        }
        hgi hgiVar = new hgi((char[]) null);
        hgiVar.k(akcxVar.f);
        if (akcxVar.l.f()) {
            ComponentName componentName = (ComponentName) ((alha) this.f).a.get(akcxVar.l.b());
            hgiVar.n("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName.getPackageName());
            hgiVar.n("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", componentName.getClassName());
        }
        gtnVar.i(hgiVar.j());
    }

    private final kkc F(akcx akcxVar, akcv akcvVar) {
        albo.T(akcxVar.g.f());
        gtg gtgVar = new gtg(TikTokListenableWorker.class, akcvVar.a, akcvVar.b);
        E(akcxVar, gtgVar);
        gtgVar.f(akcxVar.b);
        akcv akcvVar2 = akcxVar.d;
        gtgVar.g(akcvVar2.a, akcvVar2.b);
        return gtgVar.j();
    }

    private final kkc G(akcx akcxVar) {
        albo.T(!akcxVar.g.f());
        gsz gszVar = new gsz(TikTokListenableWorker.class);
        gszVar.f(akcxVar.b);
        akcv akcvVar = akcxVar.d;
        gszVar.g(akcvVar.a, akcvVar.b);
        gszVar.i(akcxVar.f);
        E(akcxVar, gszVar);
        return gszVar.j();
    }

    public static final String i() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }

    public static final aptw j(aniv anivVar) {
        aozy builder = xea.a(anivVar.a).toBuilder();
        builder.getClass();
        int i = anivVar.b;
        if (i != 0) {
            if (!builder.b.isMutable()) {
                builder.u();
            }
            ((aptw) builder.b).d = a.an(i);
            DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((aptw) builder.b).e)).getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (anivVar.getCause() instanceof aqwb) {
                Throwable cause = anivVar.getCause();
                cause.getClass();
                aqwb aqwbVar = (aqwb) cause;
                if (aqwbVar.getCause() instanceof NetworkException) {
                    Throwable cause2 = aqwbVar.getCause();
                    cause2.getClass();
                    NetworkException networkException = (NetworkException) cause2;
                    linkedHashMap.put("CRONET_NETWORK_ERROR", Integer.valueOf(networkException.getErrorCode()));
                    linkedHashMap.put("CRONET_INTERNAL_ERROR", Integer.valueOf(networkException.getCronetInternalErrorCode()));
                    if (networkException instanceof QuicException) {
                        linkedHashMap.put("CRONET_QUIC_ERROR", Integer.valueOf(((QuicException) networkException).getQuicDetailedErrorCode()));
                    }
                }
            }
            if (!builder.b.isMutable()) {
                builder.u();
            }
            aptw aptwVar = (aptw) builder.b;
            apbo apboVar = aptwVar.e;
            if (!apboVar.b) {
                aptwVar.e = apboVar.a();
            }
            aptwVar.e.putAll(linkedHashMap);
            return aovn.r(builder);
        }
        throw null;
    }

    public static final void l(anjw anjwVar, String str) {
        anjs anjsVar = new anjs(null);
        anjsVar.b();
        anjsVar.c = Optional.of(anjwVar.a);
        anjsVar.b = str;
        xdj.a(anjsVar.a());
    }

    public static final anjj m(aqgw aqgwVar, String str) {
        anjg anjgVar;
        anjm az = albo.az();
        algf m = new anka().m();
        asks b = asks.b(aqgwVar.f);
        if (b == null) {
            b = asks.UNRECOGNIZED;
        }
        Object fu = m.fu(b);
        fu.getClass();
        az.e((anjq) fu);
        if (str == null) {
            aqft aqftVar = aqgwVar.d;
            if (aqftVar == null) {
                aqftVar = aqft.a;
            }
            str = aqftVar.b;
            str.getClass();
        }
        az.d(str);
        aqft aqftVar2 = aqgwVar.d;
        if (aqftVar2 == null) {
            aqftVar2 = aqft.a;
        }
        String str2 = aqftVar2.c;
        if (str2 != null) {
            anjgVar = new anjg(str2);
        } else {
            anjgVar = anjg.a;
        }
        az.b(anjgVar);
        aqft aqftVar3 = aqgwVar.d;
        if (aqftVar3 == null) {
            aqftVar3 = aqft.a;
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(aqftVar3.d);
        unmodifiableMap.getClass();
        az.c(unmodifiableMap);
        anjn a = az.a();
        URI uri = null;
        anjh anjhVar = new anjh(null);
        aqfn aqfnVar = aqgwVar.c;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        aqfnVar.getClass();
        anjhVar.b(aqfnVar);
        String str3 = aqgwVar.g;
        str3.getClass();
        try {
            uri = URI.create(str3);
        } catch (IllegalArgumentException unused) {
            anjs anjsVar = new anjs(null);
            anjsVar.c();
            anjsVar.b = "Failed to parse group conference URI.";
            xdj.a(anjsVar.a());
        }
        if (uri != null) {
            anjhVar.c(uri);
        }
        anjq anjqVar = a.b;
        algf m2 = new anjy(anjqVar).m();
        apax apaxVar = aqgwVar.e;
        apaxVar.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(apaxVar, 10));
        Iterator<E> it = apaxVar.iterator();
        while (it.hasNext()) {
            Object fu2 = m2.fu((aqgy) it.next());
            fu2.getClass();
            arrayList.add((anjl) fu2);
        }
        ankr ankrVar = ankr.a;
        aqhf aqhfVar = aqgwVar.h;
        if (aqhfVar == null) {
            aqhfVar = aqhf.a;
        }
        aqhfVar.getClass();
        anjf apply = ankrVar.apply(aqhfVar);
        if (anjqVar.a(apply)) {
            return new anjj(anjhVar.a(), a, apply, alzz.bd(arrayList));
        }
        throw new ankm();
    }

    public static final List n(aqdw aqdwVar) {
        String str;
        aqfi aqfiVar;
        String str2;
        apax apaxVar = aqdwVar.c;
        apaxVar.getClass();
        int i = 10;
        ArrayList arrayList = new ArrayList(aqjn.J(apaxVar, 10));
        Iterator it = apaxVar.iterator();
        while (it.hasNext()) {
            aqgh aqghVar = (aqgh) it.next();
            aqfn aqfnVar = aqghVar.b;
            if (aqfnVar == null) {
                aqfnVar = aqfn.a;
            }
            aqfnVar.getClass();
            apax<aqga> apaxVar2 = aqghVar.c;
            apaxVar2.getClass();
            ArrayList arrayList2 = new ArrayList(aqjn.J(apaxVar2, i));
            for (aqga aqgaVar : apaxVar2) {
                aqgaVar.getClass();
                aozb aozbVar = aqgaVar.c;
                aozbVar.getClass();
                aqfu aqfuVar = aqgaVar.f;
                if (aqfuVar == null) {
                    aqfuVar = aqfu.a;
                }
                aqfu aqfuVar2 = aqfuVar;
                aqfuVar2.getClass();
                long j = aqgaVar.g;
                apax<aqfh> apaxVar3 = aqgaVar.e;
                apaxVar3.getClass();
                ArrayList arrayList3 = new ArrayList(aqjn.J(apaxVar3, i));
                for (aqfh aqfhVar : apaxVar3) {
                    aqfhVar.getClass();
                    aqfi aqfiVar2 = aqfhVar.c;
                    if (aqfiVar2 == null) {
                        aqfiVar2 = aqfi.a;
                    }
                    String str3 = "";
                    Iterator it2 = it;
                    if (aqfiVar2.b != 1) {
                        str = "";
                    } else {
                        str = (String) aqfiVar2.c;
                    }
                    str.getClass();
                    if ((aqfhVar.b & 2) != 0) {
                        aqfiVar = aqfhVar.d;
                        if (aqfiVar == null) {
                            aqfiVar = aqfi.a;
                        }
                    } else {
                        aqfiVar = null;
                    }
                    if (aqfiVar != null) {
                        if (aqfiVar.b == 1) {
                            str3 = (String) aqfiVar.c;
                        }
                        str2 = str3;
                    } else {
                        str2 = null;
                    }
                    arrayList3.add(new anlr(str, str2));
                    it = it2;
                }
                apao apaoVar = aqgaVar.d;
                apaoVar.getClass();
                arrayList2.add(new anls(aozbVar, aqfuVar2, j, arrayList3, apaoVar));
                it = it;
                i = 10;
            }
            arrayList.add(new anlu(aqfnVar, arrayList2));
            it = it;
            i = 10;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    public final void A(int i, int i2, String str) {
        ((aixy) this.c.get()).b(Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    public final void B(int i, int i2, String str) {
        ((aixy) this.a.get()).b(Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    public final void C(int i, int i2, String str) {
        ((aixy) this.d.get()).b(Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, aegu] */
    public final acir D(aibl aiblVar, int i) {
        if (!TextUtils.isEmpty(aiblVar.a)) {
            if (aiblVar.b.isEmpty()) {
                return actx.r(new abra(new Status(9012, "Place Fields must not be empty.")));
            }
            Object obj = this.c;
            ahyr ahyrVar = (ahyr) obj;
            ahyd ahydVar = new ahyd(aiblVar, ahyrVar.b(), ahyrVar.a(), (agxw) this.d);
            ?? r10 = this.a;
            return ((agrk) this.e).k(ahydVar, ahye.class).a(new acca(7)).a(new ahyj(this, r10.a(), i, 0));
        }
        return actx.r(new abra(new Status(9012, "Place ID must not be empty.")));
    }

    public final String a() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(((aodi) this.a).e().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v4, types: [anjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v7, types: [anky] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [anjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [anjr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.anky r5, defpackage.arqr r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.anle
            if (r0 == 0) goto L13
            r0 = r7
            anle r0 = (defpackage.anle) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            anle r0 = new anle
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.a
            aogy r6 = r0.e
            defpackage.aqil.P(r7)     // Catch: defpackage.aniv -> L2b io.grpc.StatusException -> L2d
            goto L48
        L2b:
            r7 = move-exception
            goto L55
        L2d:
            r7 = move-exception
            goto L62
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.aqil.P(r7)
            r0.e = r4     // Catch: defpackage.aniv -> L52 io.grpc.StatusException -> L5f
            r0.a = r5     // Catch: defpackage.aniv -> L52 io.grpc.StatusException -> L5f
            r0.c = r3     // Catch: defpackage.aniv -> L52 io.grpc.StatusException -> L5f
            java.lang.Object r7 = r6.a(r0)     // Catch: defpackage.aniv -> L52 io.grpc.StatusException -> L5f
            if (r7 != r1) goto L47
            return r1
        L47:
            r6 = r4
        L48:
            java.lang.Object r0 = r6.d     // Catch: defpackage.aniv -> L2b io.grpc.StatusException -> L2d
            aptx r1 = r5.c()     // Catch: defpackage.aniv -> L2b io.grpc.StatusException -> L2d
            r0.a(r1)     // Catch: defpackage.aniv -> L2b io.grpc.StatusException -> L2d
            return r7
        L52:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L55:
            java.lang.Object r6 = r6.d
            aptx r5 = r5.a(r7)
            r6.a(r5)
            throw r7
        L5f:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L62:
            ankx r0 = new ankx
            java.lang.Object r1 = r6.c
            io.grpc.Status r1 = r7.a
            r1.getClass()
            aqut r2 = r7.b
            anit r1 = defpackage.anme.d(r1, r2)
            io.grpc.Status r2 = r7.a
            r2.getClass()
            java.lang.String r3 = "GRPC error in TachygramTransport"
            r0.<init>(r3, r1, r7, r2)
            java.lang.Object r6 = r6.d
            aptx r5 = r5.a(r0)
            r6.a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogy.b(anky, arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.anji r13, java.lang.Iterable r14, defpackage.arpe r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.anlf
            if (r0 == 0) goto L13
            r0 = r15
            anlf r0 = (defpackage.anlf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            anlf r0 = new anlf
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r15)
            goto L5b
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            defpackage.aqil.P(r15)
            boolean r15 = defpackage.aqjn.aG(r14)
            if (r15 != 0) goto L3b
            arnv r13 = defpackage.arnv.a
            return r13
        L3b:
            java.lang.String r6 = i()
            ankz r15 = new ankz
            apts r2 = defpackage.apts.ADD_GROUP_USERS
            r15.<init>(r2, r6)
            icy r2 = new icy
            r10 = 0
            r11 = 5
            r4 = r2
            r5 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.b = r3
            java.lang.Object r15 = r12.b(r15, r2, r0)
            if (r15 != r1) goto L5b
            return r1
        L5b:
            r15.getClass()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogy.c(anji, java.lang.Iterable, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, anil] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r7, defpackage.anix r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogy.d(java.lang.String, anix, arpe):java.lang.Object");
    }

    public final Object e(anji anjiVar, arpe arpeVar) {
        String i = i();
        ankz ankzVar = new ankz(apts.GET_GROUP_INFO, i);
        return b(ankzVar, new anli(this, i, anjiVar, ankzVar, (arpe) null, 1), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.anji r16, java.lang.Iterable r17, defpackage.arpe r18) {
        /*
            r15 = this;
            r9 = r15
            r0 = r18
            boolean r1 = r0 instanceof defpackage.anll
            if (r1 == 0) goto L16
            r1 = r0
            anll r1 = (defpackage.anll) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.b = r2
            goto L1b
        L16:
            anll r1 = new anll
            r1.<init>(r15, r0)
        L1b:
            r10 = r1
            java.lang.Object r0 = r10.a
            arpl r11 = defpackage.arpl.a
            int r1 = r10.b
            r12 = 1
            if (r1 == 0) goto L33
            if (r1 != r12) goto L2b
            defpackage.aqil.P(r0)
            goto L62
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            defpackage.aqil.P(r0)
            boolean r0 = defpackage.aqjn.aG(r17)
            if (r0 != 0) goto L3f
            arnv r0 = defpackage.arnv.a
            return r0
        L3f:
            java.lang.String r2 = i()
            ankz r13 = new ankz
            apts r0 = defpackage.apts.KICK_GROUP_USERS
            r13.<init>(r0, r2)
            icy r14 = new icy
            r7 = 6
            r8 = 0
            r6 = 0
            r0 = r14
            r1 = r15
            r3 = r16
            r4 = r17
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.b = r12
            java.lang.Object r0 = r15.b(r13, r14, r10)
            if (r0 != r11) goto L62
            return r11
        L62:
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogy.f(anji, java.lang.Iterable, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.anjw r12, defpackage.arpe r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.anlm
            if (r0 == 0) goto L13
            r0 = r13
            anlm r0 = (defpackage.anlm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            anlm r0 = new anlm
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r13)
            goto L54
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            defpackage.aqil.P(r13)
            java.lang.String r13 = "Revoking message"
            l(r12, r13)
            java.lang.String r6 = i()
            anlc r13 = new anlc
            r13.<init>(r12, r6)
            zcn r2 = new zcn
            r9 = 0
            r10 = 5
            r4 = r2
            r5 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.b = r3
            java.lang.Object r13 = r11.b(r13, r2, r0)
            if (r13 != r1) goto L54
            return r1
        L54:
            aqev r13 = (defpackage.aqev) r13
            arnb r12 = defpackage.arnb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogy.g(anjw, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.anji r13, defpackage.anjp r14, defpackage.arpe r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.anlo
            if (r0 == 0) goto L13
            r0 = r15
            anlo r0 = (defpackage.anlo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            anlo r0 = new anlo
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r15)
            goto L5a
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            defpackage.aqil.P(r15)
            boolean r15 = r14.a()
            if (r15 != 0) goto L5f
            anix r15 = r14.c
            java.lang.String r6 = i()
            ankz r2 = new ankz
            apts r4 = defpackage.apts.GROUP_PROFILE_UPDATED
            r2.<init>(r4, r6, r15)
            icy r15 = new icy
            r10 = 0
            r11 = 7
            r4 = r15
            r5 = r12
            r7 = r14
            r8 = r13
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.b = r3
            java.lang.Object r15 = r12.b(r2, r15, r0)
            if (r15 != r1) goto L5a
            return r1
        L5a:
            aqgq r15 = (defpackage.aqgq) r15
            arnb r13 = defpackage.arnb.a
            return r13
        L5f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Must provide at least one property to update."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogy.h(anji, anjp, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.aqfn r12, int r13, defpackage.arpe r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.anlj
            if (r0 == 0) goto L13
            r0 = r14
            anlj r0 = (defpackage.anlj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            anlj r0 = new anlj
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r14)
            goto L50
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            defpackage.aqil.P(r14)
            java.lang.String r6 = i()
            anld r14 = new anld
            r2 = 5
            r14.<init>(r2, r6)
            anlk r2 = new anlk
            r10 = 0
            r4 = r2
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.b = r3
            java.lang.Object r14 = r11.b(r14, r2, r0)
            if (r14 != r1) goto L50
            return r1
        L50:
            aqdz r14 = (defpackage.aqdz) r14
            arnb r12 = defpackage.arnb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogy.k(aqfn, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, akda] */
    public final ListenableFuture p(String str) {
        return ((ahiy) this.c).u(this.b.b(str), new akdk(0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, akda] */
    public final ListenableFuture q(UUID uuid) {
        return ((ahiy) this.c).u(this.b.c(uuid), new akdk(3));
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, akda] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, akda] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, akda] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, akda] */
    public final ListenableFuture r(akcx akcxVar) {
        ListenableFuture f;
        gso gsoVar;
        Pattern pattern = akdl.a;
        aluq listIterator = akcxVar.i.listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if (akdl.a.matcher(str).matches()) {
                throw new akde("Tag " + str + " is reserved by AccountWorkManager.");
            }
        }
        aluq listIterator2 = akcxVar.i.listIterator();
        while (listIterator2.hasNext()) {
            String str2 = (String) listIterator2.next();
            if (akdl.b.matcher(str2).matches()) {
                throw new akde("Tag " + str2 + " is reserved by TikTokWorkManager.");
            }
        }
        if (akcxVar.l.f()) {
            algw algwVar = akcxVar.l;
            Object obj = this.e;
            albo.U(!((String) algwVar.b()).equals(((Context) obj).getPackageName()), "Default process must be targeted using shorthand '' empty string, not the package name.");
            albo.U(false, "You must depend upon //java/com/google/apps/tiktok/contrib/work/impl:multiprocess_module in order to use .setTargetProcess");
            albo.X(((alha) this.f).a.containsKey(akcxVar.l.b()), "You must generate remote worker services using java/com/google/apps/tiktok/contrib/work/codegen/generated_remote_worker_service.bzl before targeting them by process name and include the service target in every scheduling process's dagger deps. Could not find [%s]", akcxVar.l.b());
            d.t(Collections.disjoint(akcxVar.f.e().keySet(), alpt.s("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME")), "You may not specify RemoteListenableWorker arguments at the same time as TikTok's targetProcess feature.");
        }
        Class cls = akcxVar.a;
        String str3 = (String) this.a.get(cls);
        cls.toString();
        str3.getClass();
        altx altxVar = new altx(akdl.b(str3));
        akct akctVar = new akct(akcxVar);
        akctVar.d(alzz.I(akcxVar.i, altxVar));
        akcx a = akctVar.a();
        Object obj2 = this.c;
        if (a.g.f()) {
            albo.T(a.g.f());
            if (a.h.f()) {
                albo.T(a.g.f());
                albo.T(a.h.f());
                akcv akcvVar = ((akcu) a.g.b()).a;
                a.g.b();
                kkc F = F(a, akcvVar);
                f = ancj.f(this.b.h(((akcw) a.h.b()).a, ((akcw) a.h.b()).b, F), new ajyn(F, 15), andi.a);
            } else {
                albo.T(a.g.f());
                albo.T(true ^ a.h.f());
                akcv akcvVar2 = ((akcu) a.g.b()).a;
                a.g.b();
                kkc F2 = F(a, akcvVar2);
                f = ancj.f(this.b.g(F2), new ajyn(F2, 16), andi.a);
            }
        } else {
            albo.T(!a.g.f());
            if (a.h.f()) {
                albo.T(!a.g.f());
                albo.T(a.h.f());
                kkc G = G(a);
                ?? r3 = this.b;
                String str4 = ((akcw) a.h.b()).a;
                int i = ((akcw) a.h.b()).b - 1;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            throw new IllegalArgumentException("One-time unique work does not support ExistingPeriodicWorkPolicy UPDATE. Use CANCEL_AND_REENQUEUE or KEEP instead");
                        }
                    } else {
                        gsoVar = gso.KEEP;
                        f = ancj.f(r3.i(str4, gsoVar, G), new ajyn(G, 13), andi.a);
                    }
                }
                gsoVar = gso.REPLACE;
                f = ancj.f(r3.i(str4, gsoVar, G), new ajyn(G, 13), andi.a);
            } else {
                albo.T(!a.g.f());
                albo.T(true ^ a.h.f());
                kkc G2 = G(a);
                f = ancj.f(this.b.g(G2), new ajyn(G2, 14), andi.a);
            }
        }
        return ((ahiy) obj2).u(f, new akdk(2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, akda] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture s(String str) {
        return ancj.f(this.b.f(ico.L(str)), new akdg(1), this.d);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final alog t(List list) {
        if (list != null) {
            if (list.isEmpty()) {
                return alsx.a;
            }
            alob d = alog.d(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                armf armfVar = (armf) this.a.get((Class) it.next());
                armfVar.getClass();
                d.h((agxw) armfVar.b());
            }
            return d.g();
        }
        armf armfVar2 = ((ajyc) this.e).b;
        int i = alog.d;
        return alsx.a;
    }

    public final ListenableFuture u(ajwt ajwtVar, List list, Intent intent, ajxb ajxbVar) {
        return ancj.g(((ansy) this.b).A(ajwtVar), akto.d(new qcf(this, ajwtVar, list, intent, ajxbVar, 16)), andi.a);
    }

    public final ListenableFuture v(ListenableFuture listenableFuture, List list, Intent intent) {
        return ancj.g(listenableFuture, akto.d(new ajym(this, list, intent, listenableFuture, 2)), andi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.Map, java.lang.Object] */
    public final ListenableFuture w(ajyi ajyiVar, List list, ajxb ajxbVar) {
        Object obj;
        ArrayList arrayList = new ArrayList(((alsx) list).c);
        alur it = ((alog) list).iterator();
        while (true) {
            byte[] bArr = null;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                if (ajyf.class.isAssignableFrom(cls)) {
                    albo.X(!ajyh.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                    albo.X(this.c.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                    obj = this.c.get(cls);
                } else if (ajyh.class.isAssignableFrom(cls)) {
                    albo.X(!ajyf.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                    albo.X(this.f.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                    obj = this.f.get(cls);
                } else {
                    throw new IllegalArgumentException("No selector registered for key: ".concat(String.valueOf(String.valueOf(cls))));
                }
                arrayList.add(new xpx((armf) obj, ajyiVar, 17, bArr));
            } else {
                return ancj.g(ajki.s(arrayList, new evp(14), andi.a), akto.d(new ahsi(this, ajxbVar, 6, bArr)), andi.a);
            }
        }
    }

    public final ListenableFuture x(ajwt ajwtVar, List list, Intent intent, ajxb ajxbVar) {
        alog t = t(list);
        akrh e = aktp.e("Validate Requirements");
        try {
            ListenableFuture g = ancj.g(((ajyc) this.e).e.p(ajwtVar), akto.d(new ahsi(t, ajwtVar, 5, null)), andi.a);
            e.b(g);
            e.close();
            return ancj.g(g, akto.d(new xrd(this, ajwtVar, ajxbVar, 17, (char[]) null)), andi.a);
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.lang.Object] */
    public final List y(OutputStream outputStream) {
        aiuv aiuvVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        if (!this.e.isEmpty()) {
            ?? r1 = this.e;
            Object obj = this.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                ahix b = ((ahiy) it.next()).b((Uri) obj);
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            if (!arrayList2.isEmpty()) {
                aiuvVar = new aiuv(outputStream, arrayList2);
            } else {
                aiuvVar = null;
            }
            if (aiuvVar != null) {
                arrayList.add(aiuvVar);
            }
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            arrayList.add(((aiwg) it2.next()).b((Uri) this.b, (OutputStream) alzz.aO(arrayList)));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final boolean z() {
        if (!this.d.isEmpty()) {
            return true;
        }
        return false;
    }

    public aogy(ajqe ajqeVar) {
        this.c = ajqeVar.f;
        this.a = ajqeVar.c;
        this.d = ajqeVar.a;
        this.e = ajqeVar.e;
        this.b = ajqeVar.b;
        this.f = ajqeVar.d;
    }

    public aogy(Context context, akda akdaVar, Map map, Executor executor, algw algwVar, ahiy ahiyVar) {
        this.e = context;
        this.b = akdaVar;
        this.a = map;
        this.d = executor;
        this.f = algwVar;
        this.c = ahiyVar;
    }

    public aogy(aodi aodiVar, aogz aogzVar, abpn abpnVar, aohf aohfVar, aohf aohfVar2, aohi aohiVar) {
        this.a = aodiVar;
        this.b = aogzVar;
        this.c = abpnVar;
        this.d = aohfVar;
        this.e = aohfVar2;
        this.f = aohiVar;
    }

    public aogy(ansy ansyVar, Map map, Map map2, Map map3, Set set, ajyc ajycVar) {
        this.b = ansyVar;
        this.c = map;
        this.f = map2;
        this.a = map3;
        this.d = set;
        this.e = ajycVar;
        Boolean bool = false;
        bool.getClass();
    }

    public aogy(Readable readable) {
        CharBuffer allocate = CharBuffer.allocate(2048);
        this.f = allocate;
        this.a = allocate.array();
        this.b = new ArrayDeque();
        this.e = new amcv(this);
        this.c = readable;
        this.d = readable;
    }

    public aogy(ScheduledExecutorService scheduledExecutorService, agcp agcpVar) {
        this.d = albo.D(new ahsz(this, 8));
        this.c = albo.D(new ahsz(this, 9));
        this.e = albo.D(new ahsz(this, 10));
        this.a = albo.D(new ahsz(this, 11));
        aiya c = aiya.c();
        this.b = c;
        aixz aixzVar = c.c;
        if (aixzVar != null) {
            this.f = aixzVar;
            ((aiyc) aixzVar).f = agcpVar;
        } else {
            aiyc aiycVar = new aiyc(agcpVar, scheduledExecutorService, c);
            c.c = aiycVar;
            this.f = aiycVar;
        }
    }

    public aogy(anio anioVar, ankt anktVar, anil anilVar, anjr anjrVar, vyv vyvVar, xdj xdjVar) {
        anioVar.getClass();
        anktVar.getClass();
        this.e = anioVar;
        this.f = anktVar;
        this.b = anilVar;
        this.d = anjrVar;
        this.a = vyvVar;
        this.c = xdjVar;
    }
}
