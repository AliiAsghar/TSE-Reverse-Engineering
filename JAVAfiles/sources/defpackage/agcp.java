package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.rcs.client.events.EventService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agcp {
    public final Object a;
    public final Object b;
    public final Object c;

    public agcp(afft afftVar, Set set, affq affqVar) {
        this.c = afftVar;
        this.a = set;
        this.b = affqVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    private final void C(agcl agclVar) {
        ?? r0;
        Object c;
        agcl agclVar2;
        do {
            r0 = this.b;
            c = r0.c();
            agclVar2 = (agcl) c;
        } while (!r0.g(c, agclVar));
        if (agclVar2 != null) {
            agclVar2.b.v(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    public final ahmn A(String str, akyr akyrVar) {
        Context context = (Context) this.b.b();
        context.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.b();
        scheduledExecutorService.getClass();
        ahmn ahmnVar = (ahmn) this.a.b();
        ahmnVar.getClass();
        aarj aarjVar = new aarj(str, 15);
        akyrVar.getClass();
        return new ahmn(new aixj(context, scheduledExecutorService, ahmnVar, aarjVar, akyrVar), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map, java.lang.Object] */
    public final aogy B(Uri uri) {
        alog alogVar;
        alob alobVar = new alob();
        Pattern pattern = aivv.a;
        alob alobVar2 = new alob();
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment) && encodedFragment.startsWith("transform=")) {
            alogVar = alog.j(anna.g("+").d().a(encodedFragment.substring(10)));
        } else {
            alogVar = alsx.a;
        }
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) alogVar.get(i);
            Matcher matcher = aivv.a.matcher(str);
            if (matcher.matches()) {
                alobVar2.h(matcher.group(1));
            } else {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
        }
        alog g = alobVar2.g();
        int i2 = ((alsx) g).c;
        for (int i3 = 0; i3 < i2; i3++) {
            String str2 = (String) g.get(i3);
            aiwg aiwgVar = (aiwg) this.a.get(str2);
            if (aiwgVar != null) {
                alobVar.h(aiwgVar);
            } else {
                throw new aivn("Requested transform isn't registered: " + str2 + ": " + String.valueOf(uri));
            }
        }
        alog a = alobVar.g().a();
        ajqe ajqeVar = new ajqe((char[]) null);
        ajqeVar.f = this;
        String scheme = uri.getScheme();
        aiwd aiwdVar = (aiwd) this.b.get(scheme);
        if (aiwdVar != null) {
            ajqeVar.c = aiwdVar;
            ajqeVar.e = this.c;
            ajqeVar.a = a;
            ajqeVar.b = uri;
            if (!a.isEmpty()) {
                ArrayList arrayList = new ArrayList(uri.getPathSegments());
                if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                    String str3 = (String) arrayList.get(arrayList.size() - 1);
                    ListIterator<E> listIterator = a.listIterator(a.size());
                    while (listIterator.hasPrevious()) {
                        ((aiwg) listIterator.previous()).e();
                    }
                    arrayList.set(arrayList.size() - 1, str3);
                    uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
                }
            }
            ajqeVar.d = uri;
            return new aogy(ajqeVar);
        }
        throw new aivn(String.format("Requested backend isn't registered: %s", scheme));
    }

    public final void a() {
        C(null);
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [armf, java.lang.Object] */
    public final void b(jkg jkgVar) {
        ascv qjrVar;
        Object obj;
        aryj aryjVar = new aryj((arxm) this.a.b().get(arxm.c));
        arwe e = arwi.e(this.a.b().plus(aryjVar));
        zay zayVar = new zay((Object) this, 8, (char[][]) null);
        jkk jkkVar = jkgVar.a;
        jkkVar.c.d();
        jjv jjvVar = new jjv(jkkVar.f.a, 3);
        int i = ascp.a;
        ascv T = arrn.T(jjvVar, e, asco.b, arnv.a);
        jjp jjpVar = new jjp(ipf.s);
        jkkVar.e.b();
        jkkVar.b(new jkj(zayVar));
        arwi.v(((asep) e).a).s(new ipk(jkkVar, 12));
        byu byuVar = new byu(null, cav.a);
        asai a = cao.a(new kdy(byuVar, 1));
        nei neiVar = jkkVar.j;
        ascv T2 = arrn.T(new jdn(new idx(neiVar.b, neiVar, 13), a, new jjz(neiVar, ((lig) neiVar.f).b(), jjpVar, null), 17, null), e, asco.b, new jka(null, neiVar.i(), arnv.a));
        ascv d = qkf.d(T, e, new geg(jkkVar, e, 8, null));
        jjr jjrVar = jkkVar.b;
        mgu mguVar = jjrVar.e;
        ascv T3 = arrn.T(new jdn(new jjv(((jxv) mguVar.b).a, 0), asar.a(mguVar.j), new igb(mguVar, (arpe) null, 7), 17, null), e, asco.b, mguVar.o());
        jkd jkdVar = (jkd) jjrVar.d.a();
        ascd a2 = ascy.a(agfg.a);
        ascv d2 = qkf.d(a2, e, new eiw((Object) jkdVar, (Object) new jkc(new arsb(), a2, jkdVar), (Object) a2, 4, (char[]) null));
        jrv jrvVar = jjrVar.b;
        ascp ascpVar = asco.b;
        ascv a3 = jrvVar.a();
        jwz jwzVar = new jwz(1);
        a3.getClass();
        int i2 = 3;
        ascv[] ascvVarArr = {T3, a3, d2};
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                ascv ascvVar = ascvVarArr[i3];
                if (ascvVar != null && !(ascvVar instanceof qjr)) {
                    ascv[] ascvVarArr2 = (ascv[]) aqil.o(ascvVarArr).toArray(new ascv[0]);
                    jdn jdnVar = new jdn((asai[]) Arrays.copyOf(ascvVarArr2, ascvVarArr2.length), ascvVarArr, (Object) jwzVar, 12);
                    ArrayList arrayList = new ArrayList(3);
                    int i4 = 0;
                    for (int i5 = 3; i4 < i5; i5 = 3) {
                        ascv ascvVar2 = ascvVarArr[i4];
                        if (ascvVar2 != null) {
                            obj = ascvVar2.c();
                        } else {
                            obj = null;
                        }
                        arrayList.add(obj);
                        i4++;
                    }
                    Object[] array = arrayList.toArray(new Object[0]);
                    qjrVar = arrn.T(jdnVar, e, ascpVar, jwzVar.a(array[0], array[1], array[2]));
                } else {
                    i3++;
                    i2 = 3;
                }
            } else {
                qjrVar = new qjr(new qjz(ascvVarArr, jwzVar, 2));
                break;
            }
        }
        agcp agcpVar = jkkVar.g;
        afxz afxzVar = (afxz) agcpVar.c.b();
        afxzVar.getClass();
        aodz aodzVar = (aodz) agcpVar.a.b();
        aodzVar.getClass();
        afdl afdlVar = (afdl) agcpVar.b.b();
        afdlVar.getClass();
        afhd afhdVar = new afhd(afxzVar, aodzVar, afdlVar, e);
        jjv jjvVar2 = new jjv(T2, 4);
        eiw eiwVar = new eiw((Object) e, (Object) jkkVar, (Object) T, 5, (short[]) null);
        C(new agcl(new agcj(new jkl(T2, byuVar, d, jjpVar, qjrVar, new afhe(new afho(afhdVar, eiwVar, 1), new aetz(afhdVar, 20), afhdVar.e, T, jjvVar2, eiwVar)), new agcw(cga.e, jjo.a, new cdj(1521199541, true, new jke(0)), new cdj(1542683090, true, new jkf(jkgVar, 1)), agcd.a, new cdj(1393449701, true, new jkf(jkgVar, 0)), jjo.b), new agcm(jkgVar, this)), aryjVar));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.function.Supplier] */
    public final int c() {
        Object obj;
        Thread thread = (Thread) ((AtomicReference) this.a).get();
        if (thread == null || thread != Thread.currentThread()) {
            return Integer.MAX_VALUE;
        }
        obj = this.b.get();
        return ((Integer) obj).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final afjy d(afji afjiVar) {
        arwe arweVar = (arwe) this.c.b();
        arweVar.getClass();
        afke afkeVar = (afke) this.a.b();
        afkeVar.getClass();
        return new afjy(this.b, arweVar, afkeVar, afjiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.afey
            if (r0 == 0) goto L13
            r0 = r7
            afey r0 = (defpackage.afey) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afey r0 = new afey
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.aqil.P(r7)
            goto L87
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.a
            agcp r5 = r0.e
            defpackage.aqil.P(r7)
            goto L5c
        L3d:
            agcp r2 = r0.e
            defpackage.aqil.P(r7)
            r5 = r2
            goto L56
        L44:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.c
            r0.e = r6
            r0.c = r5
            afft r7 = (defpackage.afft) r7
            java.lang.Object r7 = r7.a(r0)
            if (r7 == r1) goto L8a
            r5 = r6
        L56:
            java.lang.Object r7 = r5.a
            java.util.Iterator r2 = r7.iterator()
        L5c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r2.next()
            affb r7 = (defpackage.affb) r7
            r0.e = r5
            r0.a = r2
            r0.c = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L5c
            return r1
        L75:
            java.lang.Object r7 = r5.b
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.c = r3
            affq r7 = (defpackage.affq) r7
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L87
            return r1
        L87:
            arnb r7 = defpackage.arnb.a
            return r7
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcp.e(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.afez
            if (r0 == 0) goto L13
            r0 = r7
            afez r0 = (defpackage.afez) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afez r0 = new afez
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.aqil.P(r7)
            goto L87
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.a
            agcp r5 = r0.e
            defpackage.aqil.P(r7)
            goto L5c
        L3d:
            agcp r2 = r0.e
            defpackage.aqil.P(r7)
            r5 = r2
            goto L56
        L44:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.c
            r0.e = r6
            r0.c = r5
            afft r7 = (defpackage.afft) r7
            java.lang.Object r7 = r7.b(r0)
            if (r7 == r1) goto L8a
            r5 = r6
        L56:
            java.lang.Object r7 = r5.a
            java.util.Iterator r2 = r7.iterator()
        L5c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r2.next()
            affb r7 = (defpackage.affb) r7
            r0.e = r5
            r0.a = r2
            r0.c = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L5c
            return r1
        L75:
            java.lang.Object r7 = r5.b
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.c = r3
            affq r7 = (defpackage.affq) r7
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L87
            return r1
        L87:
            arnb r7 = defpackage.arnb.a
            return r7
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcp.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Set, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.affa
            if (r0 == 0) goto L13
            r0 = r7
            affa r0 = (defpackage.affa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            affa r0 = new affa
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.aqil.P(r7)
            goto L87
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.a
            agcp r5 = r0.e
            defpackage.aqil.P(r7)
            goto L5c
        L3d:
            agcp r2 = r0.e
            defpackage.aqil.P(r7)
            r5 = r2
            goto L56
        L44:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.b
            r0.e = r6
            r0.c = r5
            affq r7 = (defpackage.affq) r7
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L8a
            r5 = r6
        L56:
            java.lang.Object r7 = r5.a
            java.util.Iterator r2 = r7.iterator()
        L5c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r2.next()
            affb r7 = (defpackage.affb) r7
            r0.e = r5
            r0.a = r2
            r0.c = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L5c
            return r1
        L75:
            java.lang.Object r7 = r5.c
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.c = r3
            afft r7 = (defpackage.afft) r7
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L87
            return r1
        L87:
            arnb r7 = defpackage.arnb.a
            return r7
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcp.g(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final void h(ajyk ajykVar) {
        ((ArrayList) this.b).add(ajykVar);
        Collections.shuffle(this.b, (Random) this.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.lang.Object] */
    public final void i(ajzb ajzbVar) {
        boolean z;
        boolean z2 = true;
        if (ajzbVar != null) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        albo.T(!ajzbVar.equals(ajzb.a));
        if ((ajzbVar.b & 256) == 0) {
            z2 = false;
        }
        albo.T(z2);
        String str = ajzbVar.i;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ajyk) it.next()).c();
        }
        ?? r4 = this.b;
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            ((ajyk) r4.get(i)).c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Set, java.lang.Object] */
    public final void j(ajzb ajzbVar) {
        akrh e = aktp.e("onBeforeActivityAccountReady");
        try {
            String str = ajzbVar.i;
            for (ajyk ajykVar : this.c) {
                if (ajykVar instanceof ajyl) {
                    ((ajyl) ajykVar).g();
                }
            }
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                ajyk ajykVar2 = (ajyk) it.next();
                if (ajykVar2 instanceof ajyl) {
                    ((ajyl) ajykVar2).g();
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    public final void k() {
        akrh e = aktp.e("onBeforeNoAccountAvailable");
        try {
            for (ajyk ajykVar : this.c) {
                if (ajykVar instanceof ajyl) {
                    ((ajyl) ajykVar).f();
                }
            }
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                ajyk ajykVar2 = (ajyk) it.next();
                if (ajykVar2 instanceof ajyl) {
                    ((ajyl) ajykVar2).f();
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    public final void l() {
        akrh e = aktp.e("onBeforeAccountLoading");
        try {
            for (ajyk ajykVar : this.c) {
                if (ajykVar instanceof ajyl) {
                    ((ajyl) ajykVar).e();
                }
            }
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                ajyk ajykVar2 = (ajyk) it.next();
                if (ajykVar2 instanceof ajyl) {
                    ((ajyl) ajykVar2).e();
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set, java.lang.Object] */
    public final void m(ajxt ajxtVar) {
        akrh e = aktp.e("onNoAccountAvailable");
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ajyk) it.next()).b(ajxtVar);
            }
            Iterator it2 = ((ArrayList) this.b).iterator();
            while (it2.hasNext()) {
                ((ajyk) it2.next()).b(ajxtVar);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    public final void n() {
        akrh e = aktp.e("onAccountLoading");
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ajyk) it.next()).a();
            }
            Iterator it2 = ((ArrayList) this.b).iterator();
            while (it2.hasNext()) {
                ((ajyk) it2.next()).a();
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Set, java.lang.Object] */
    public final void o(ajwt ajwtVar, ajzb ajzbVar) {
        boolean z;
        boolean z2 = false;
        if (ajzbVar != null) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        albo.T(!ajzbVar.equals(ajzb.a));
        if ((ajzbVar.b & 256) != 0) {
            z2 = true;
        }
        albo.T(z2);
        akrh e = aktp.e("onAccountReady");
        try {
            agxw agxwVar = new agxw(new ansy(ajwtVar, ajzbVar.i));
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ajyk) it.next()).d(agxwVar);
            }
            Iterator it2 = ((ArrayList) this.b).iterator();
            while (it2.hasNext()) {
                ((ajyk) it2.next()).d(agxwVar);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    public final EventService p(Context context, ajoa ajoaVar) {
        aksr aksrVar = (aksr) this.c.b();
        aksrVar.getClass();
        uub uubVar = (uub) this.a.b();
        uubVar.getClass();
        ajnw ajnwVar = (ajnw) this.b.b();
        ajnwVar.getClass();
        context.getClass();
        ajoaVar.getClass();
        return new EventService(aksrVar, uubVar, ajnwVar, context, ajoaVar);
    }

    public final void q() {
        Object obj = this.b;
        if (obj != null) {
            ((ajin) obj).c((View) this.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aiwd, java.lang.Object] */
    public final long r(Uri uri) {
        aogy B = B(uri);
        return B.a.m((Uri) B.f);
    }

    public final Object s(Uri uri, aiuw aiuwVar) {
        return aiuwVar.a(B(uri));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aiwd, java.lang.Object] */
    public final void t(Uri uri, Uri uri2) {
        aogy B = B(uri);
        Object obj = B.a;
        aogy B2 = B(uri2);
        if (obj == B2.a) {
            B.a.j((Uri) B.f, (Uri) B2.f);
            return;
        }
        throw new aivn("Cannot rename file across backends");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aiwd, java.lang.Object] */
    public final boolean u(Uri uri) {
        aogy B = B(uri);
        return B.a.f((Uri) B.f);
    }

    public final List v() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(((aiqm) this.b).a());
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    public final void w(String str, boolean z) {
        synchronized (this.b) {
            if (z) {
                if (!((aiqm) this.b).a().contains(str)) {
                    ((aiqm) this.b).a().add(str);
                    ((aiqm) this.b).c();
                }
            } else {
                ((aiqm) this.b).a().remove(str);
                ((aiqm) this.b).c();
            }
            ((aiqm) this.b).d(false);
        }
        for (aiql aiqlVar : this.a) {
            ((Handler) this.c).post(new ldv(aiqlVar, str, z, 5));
        }
    }

    public final void x(boolean z) {
        synchronized (this.b) {
            ((aiqm) this.b).d(z);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Set, java.lang.Object] */
    public final void y(List list) {
        synchronized (this.b) {
            if (((aiqm) this.b).a().equals(list)) {
                return;
            }
            ((aiqm) this.b).a().clear();
            ((aiqm) this.b).a().addAll(list);
            ((aiqm) this.b).c();
            for (aiql aiqlVar : this.a) {
                Object obj = this.c;
                aiqlVar.getClass();
                ((Handler) obj).post(new zth(18));
            }
        }
    }

    public final boolean z() {
        boolean z;
        synchronized (this.b) {
            Object obj = this.b;
            ((aiqm) obj).b();
            z = ((aiqm) obj).b;
        }
        return z;
    }

    public agcp(ajim ajimVar, View view) {
        this.b = Build.VERSION.SDK_INT >= 34 ? new ajip() : Build.VERSION.SDK_INT >= 33 ? new ajin() : null;
        this.c = ajimVar;
        this.a = view;
    }

    public agcp(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, char[] cArr) {
        this.b = armfVar;
        this.c = armfVar2;
        this.a = armfVar3;
    }

    public agcp(arwe arweVar, cg cgVar, afgq afgqVar) {
        this.a = arweVar;
        this.b = cgVar;
        this.c = afgqVar;
    }

    public agcp(String str, String str2, String[] strArr) {
        this.b = str;
        this.a = str2;
        this.c = strArr;
    }

    public agcp(Context context) {
        abnr abnrVar = new abnr(context, "STREAMZ_TURQUOISE_COBALT_ANDROID_INTERNAL_MONITORING", null);
        this.b = new CopyOnWriteArrayList();
        this.a = abnrVar;
        this.c = "STREAMZ_TURQUOISE_COBALT_ANDROID_INTERNAL_MONITORING";
    }

    public agcp(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
    }

    public agcp(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }

    public agcp(armf armfVar, armf armfVar2, armf armfVar3, short[] sArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        this.b = armfVar3;
    }

    public agcp(Set set) {
        this.a = new Random();
        this.c = set;
        this.b = new ArrayList(2);
    }

    public agcp(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public agcp(arwe arweVar) {
        arweVar.getClass();
        this.a = arweVar;
        ascd a = ascy.a(null);
        this.b = a;
        this.c = new lhh(a, 19);
    }

    public agcp(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public agcp(Supplier supplier) {
        this.a = new AtomicReference();
        this.c = new AtomicInteger();
        this.b = supplier;
    }

    public agcp(Context context, byte[] bArr) {
        this.a = new HashSet();
        this.c = new Handler(Looper.getMainLooper());
        this.b = new aiqm(context);
    }

    public agcp(List list) {
        this(list, Collections.emptyList(), Collections.emptyList());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    public agcp(List list, List list2, List list3) {
        this.b = new HashMap();
        this.a = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aiwd aiwdVar = (aiwd) it.next();
            if (TextUtils.isEmpty(aiwdVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                aiwd aiwdVar2 = (aiwd) this.b.put(aiwdVar.e(), aiwdVar);
                if (aiwdVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + aiwdVar2.getClass().getCanonicalName() + " with " + aiwdVar.getClass().getCanonicalName());
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            aiwg aiwgVar = (aiwg) it2.next();
            if (TextUtils.isEmpty(aiwgVar.c())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                aiwg aiwgVar2 = (aiwg) this.a.put(aiwgVar.c(), aiwgVar);
                if (aiwgVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + aiwgVar2.getClass().getCanonicalName() + " with " + aiwgVar.getClass().getCanonicalName());
                }
            }
        }
        this.c.addAll(list3);
    }
}
