package defpackage;

import android.content.Context;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgu {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public mgu(byte[] bArr) {
        this.i = new ico((byte[]) null);
        this.d = new hwt();
        hyz hyzVar = new hyz(new ech(20), new hqx(2), new hyx());
        this.h = hyzVar;
        this.g = new ico((ecf) hyzVar);
        this.a = new hmk(null, null, null);
        this.c = new ico();
        this.j = new hmk((char[]) null);
        this.f = new hnx();
        this.b = new hgj((byte[]) null);
        this.e = new hmk((byte[]) null, (byte[]) null);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        ((ico) this.c).d(arrayList);
    }

    public final void A(Class cls, Class cls2, hvq hvqVar) {
        ((hgj) this.b).e(cls, cls2, hvqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    public final amge a(String str) {
        if (this.d.containsKey(str)) {
            return (amge) this.d.get(str);
        }
        return amge.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    public final amgh b(String str) {
        if (this.f.containsKey(str)) {
            return (amgh) this.f.get(str);
        }
        return amgh.UNKNOWN_RCS_STATUS_REASON;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    public final amgi c(String str) {
        amgi amgiVar;
        if (this.c.containsKey(str) && (amgiVar = (amgi) this.c.remove(str)) != null) {
            return amgiVar;
        }
        return amgi.UNKNOWN_RESEND_ATTEMPT;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Integer d(String str) {
        return (Integer) this.b.get(str);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Map, java.lang.Object] */
    public final void e(MessageCoreData messageCoreData) {
        if (messageCoreData != null && !messageCoreData.B().b() && messageCoreData.y() != null) {
            String a = messageCoreData.B().a();
            MessageUsageStatisticsData y = messageCoreData.y();
            this.i.put(a, new lqn(messageCoreData));
            if (y.d() != null) {
                ?? r5 = this.a;
                DeviceData d = y.d();
                d.getClass();
                r5.put(a, d);
            }
            this.b.put(a, Integer.valueOf(y.a()));
            this.c.put(a, y.i());
            this.d.put(a, y.g());
            this.e.put(a, y.k());
            this.f.put(a, y.h());
            this.g.put(a, Integer.valueOf(y.b()));
            amjk l = y.l();
            if (l != null) {
                this.h.put(a, l);
            }
            this.j.put(a, Long.valueOf(y.c()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.mdg r5, long r6, defpackage.arpe r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.mdk
            if (r0 == 0) goto L13
            r0 = r8
            mdk r0 = (defpackage.mdk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mdk r0 = new mdk
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            mdg r5 = r0.c
            mgu r6 = r0.e
            defpackage.aqil.P(r8)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r8)
            r0.e = r4
            r0.c = r5
            r0.b = r3
            java.lang.Object r6 = defpackage.arwi.m(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r6 = r4
        L44:
            r7 = 6
            r6.i(r5, r7)
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgu.f(mdg, long, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    public final void g(int i, amty amtyVar) {
        qjh.l(this.e, null, new mdi(i, amtyVar, this, (arpe) null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [arwe, java.lang.Object] */
    public final mdg h(int i, Duration duration) {
        Long l;
        int andIncrement = ((AtomicInteger) this.f).getAndIncrement();
        mdg mdgVar = new mdg(this, andIncrement, i, ((xnv) this.b).a());
        this.j.put(Integer.valueOf(andIncrement), mdgVar);
        if (duration != null) {
            l = Long.valueOf(duration.toMillis());
        } else {
            l = (Long) this.c.b();
        }
        this.i.put(Integer.valueOf(mdgVar.a), qjh.l(this.e, null, new jyw(this, mdgVar, l, (arpe) null, 12), 3));
        return mdgVar;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [arwe, java.lang.Object] */
    public final void i(mdg mdgVar, int i) {
        arxm arxmVar = (arxm) ((ConcurrentHashMap) this.i).remove(Integer.valueOf(mdgVar.b));
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        if (((mdg) ((ConcurrentHashMap) this.j).remove(Integer.valueOf(mdgVar.a))) == null) {
            ((alwl) ((aluw) this.a).i()).q("Received stop event for a CUI tracker that was not started or is already stopped!");
            return;
        }
        Object obj = this.b;
        long a = ((xnv) obj).a() - mdgVar.c;
        qjh.l(this.e, null, new mdh(mdgVar.b, i, a, this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final lqn k(String str) {
        return (lqn) this.i.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(final defpackage.ahow r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mdj
            if (r0 == 0) goto L13
            r0 = r6
            mdj r0 = (defpackage.mdj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mdj r0 = new mdj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ahow r5 = r0.e
            mgu r0 = r0.d
            defpackage.aqil.P(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r4.g
            java.lang.Object r6 = r6.b()
            lru r6 = (defpackage.lru) r6
            r0.d = r4
            r0.e = r5
            r0.b = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L66
            r0 = r4
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L63
            java.lang.Object r6 = r0.d
            ahdp r0 = new ahdp
            ahow r6 = (defpackage.ahow) r6
            r0.<init>()
            java.lang.Object r5 = r6.a
            ahcg r5 = (defpackage.ahcg) r5
            r5.b(r0)
        L63:
            arnb r5 = defpackage.arnb.a
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgu.l(ahow, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, arqg] */
    public final kjo m(boolean z) {
        String string = ((Context) this.e).getString(R.string.top_app_bar_back);
        string.getClass();
        return new kjo(string, aerb.n, false, z, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [afqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [afqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [afqj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [afqd, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.ru r18, com.google.android.apps.messaging.shared.api.messaging.MessageId r19, defpackage.arqg r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgu.n(ru, com.google.android.apps.messaging.shared.api.messaging.MessageId, arqg, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final aeno o() {
        return (aeno) this.i.a();
    }

    public final hnu p(Object obj) {
        return ((hnx) this.f).a(obj);
    }

    public final List q() {
        List e = ((hmk) this.e).e();
        if (!e.isEmpty()) {
            return e;
        }
        throw new hlj();
    }

    public final List r(Object obj) {
        List q = ((ico) this.g).q(obj.getClass());
        if (!q.isEmpty()) {
            int size = q.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                hse hseVar = (hse) q.get(i);
                if (hseVar.a(obj)) {
                    if (z) {
                        emptyList = new ArrayList(size - i);
                    }
                    emptyList.add(hseVar);
                    z = false;
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new hlk(obj, q);
        }
        throw new hlk(obj);
    }

    public final void s(Class cls, hmx hmxVar) {
        ((hmk) this.a).h(cls, hmxVar);
    }

    public final void t(Class cls, hnm hnmVar) {
        ((hmk) this.j).d(cls, hnmVar);
    }

    public final void u(Class cls, Class cls2, hnl hnlVar) {
        w("legacy_append", cls, cls2, hnlVar);
    }

    public final void v(Class cls, Class cls2, hsf hsfVar) {
        ((ico) this.g).r(cls, cls2, hsfVar);
    }

    public final void w(String str, Class cls, Class cls2, hnl hnlVar) {
        ((ico) this.c).c(str, hnlVar, cls, cls2);
    }

    public final void x(Class cls, Class cls2, hsf hsfVar) {
        ((ico) this.g).s(cls, cls2, hsfVar);
    }

    public final void y(ImageHeaderParser imageHeaderParser) {
        ((hmk) this.e).f(imageHeaderParser);
    }

    public final void z(hnt hntVar) {
        ((hnx) this.f).b(hntVar);
    }

    public mgu(Context context, ascg ascgVar, jxv jxvVar, ioy ioyVar, joe joeVar, aflb aflbVar, owj owjVar) {
        context.getClass();
        ascgVar.getClass();
        jxvVar.getClass();
        ioyVar.getClass();
        aflbVar.getClass();
        this.h = context;
        this.b = jxvVar;
        this.f = ioyVar;
        this.g = joeVar;
        this.e = aflbVar;
        this.a = owjVar;
        this.j = new jjv(ascgVar, 2);
        this.c = armd.a(new jjw(this, 3));
        this.i = armd.a(new jjw(this, 2));
        this.d = armd.a(new jjw(this, 0));
    }

    public mgu(Context context, arwe arweVar, armf armfVar, kjp kjpVar, eog eogVar, asai asaiVar, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        context.getClass();
        arweVar.getClass();
        armfVar.getClass();
        eogVar.getClass();
        asaiVar.getClass();
        this.j = arweVar;
        this.d = armfVar;
        this.i = kjpVar;
        this.e = eogVar;
        this.c = asaiVar;
        afqd afqdVar = (afqd) arsd.k(optional);
        this.g = afqdVar;
        this.a = (afqi) arsd.k(optional2);
        this.f = (afqj) arsd.k(optional3);
        afqa afqaVar = (afqa) arsd.k(optional4);
        this.h = afqaVar;
        asaa asaaVar = new asaa(new eig(this, (arpe) null, 20));
        this.b = asaaVar;
        if (yig.c() && afqdVar != null && afqaVar != null) {
            arml a = armd.a(new kdz(this, 15));
            new asdn(new kea((arpe) null, a, 2), new jdn(asaaVar, asaiVar, new jwo((arpe) null, 2, (char[]) null), 17, null));
        }
        if (yig.c() && afqdVar != null && d.F(eogVar.a("has_pending_emotify_result"), true)) {
            qjh.l(arweVar, null, new kbl(this, (arpe) null, 7), 3);
        }
    }

    public mgu(Context context, arwe arweVar, khb khbVar, kke kkeVar, lkd lkdVar) {
        context.getClass();
        arweVar.getClass();
        khbVar.getClass();
        lkdVar.getClass();
        this.e = context;
        this.j = arweVar;
        this.i = khbVar;
        this.a = kkeVar;
        this.f = lkdVar;
        this.d = qkf.e(new kjm(this, 3), arweVar);
        String string = context.getString(android.R.string.cancel);
        string.getClass();
        this.g = new kjo(string, aerb.ac, new kjm(this, 2));
        String string2 = context.getString(android.R.string.cancel);
        string2.getClass();
        this.h = new kjo(string2, aerb.n, new kjm(this, 0));
        asai P = arrn.P(khbVar.a(), kkeVar.l, lkdVar.b, new kgf(this, (arpe) null, 4));
        int i = ascp.a;
        ascv T = arrn.T(P, arweVar, asco.a(0L, 3), m(lkdVar.f(llg.a)));
        this.b = T;
        this.c = arrn.T(new jxj(T, 14), arweVar, asco.a(0L, 3), Boolean.valueOf(m(lkdVar.f(llg.a)).c));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [arpi, java.lang.Object] */
    public mgu(Context context, arwe arweVar, jxv jxvVar, armf armfVar, ghw ghwVar, lfl lflVar, ovg ovgVar, ovm ovmVar, oxa oxaVar) {
        context.getClass();
        arweVar.getClass();
        jxvVar.getClass();
        armfVar.getClass();
        ghwVar.getClass();
        lflVar.getClass();
        this.b = context;
        this.i = arweVar;
        this.c = jxvVar;
        this.f = armfVar;
        this.h = ovgVar;
        this.g = ovmVar;
        this.d = new AtomicBoolean(false);
        qjh.l(lflVar.d, lflVar.b, new lgp(lflVar, (arpe) null, 0), 2);
        jtm jtmVar = new jtm(this, 2);
        this.e = jtmVar;
        afzk afzkVar = new afzk(jtmVar, 6);
        this.a = afzkVar;
        jdn jdnVar = new jdn(new lhh(jxvVar.a, 2), ghwVar.a, new lgx(this, (arpe) null, 2), 17, null);
        int i = ascp.a;
        ascp ascpVar = asco.b;
        String string = context.getString(R.string.multi_share_bottom_compose_row_text_placeholder);
        string.getClass();
        this.j = arrn.T(jdnVar, arweVar, ascpVar, new aeno(afzkVar, (CharSequence) "", string, (Integer) null, false, new aenn(ovgVar.a(), false, oxaVar.a(), 2), 56));
        qjh.l(arweVar, null, new lgp(this, (arpe) null, 2), 3);
    }

    public mgu(arwe arweVar, ahow ahowVar, xnv xnvVar, armf armfVar, armf armfVar2, ngu nguVar) {
        arweVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        nguVar.getClass();
        this.e = arweVar;
        this.d = ahowVar;
        this.b = xnvVar;
        this.c = armfVar;
        this.g = armfVar2;
        this.h = nguVar;
        this.a = alwo.o("BugleSemanticLogger");
        this.j = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.f = new AtomicInteger(1);
    }

    public mgu() {
        this.i = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
    }
}
