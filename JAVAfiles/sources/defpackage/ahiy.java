package defpackage;

import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahiy {
    public final Object a;
    public final Object b;
    public final Object c;

    public ahiy(aicq aicqVar, aicm aicmVar, ahyr ahyrVar) {
        this.b = aicqVar;
        this.a = aicmVar;
        this.c = ahyrVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, java.lang.Object] */
    private final void F(Object obj, akfz akfzVar) {
        alpi alpiVar = new alpi();
        alpl alplVar = (alpl) this.a.get(obj);
        if (alplVar != null) {
            alpiVar.b(alplVar);
        }
        alpiVar.c(akfzVar);
        this.a.put(obj, alpiVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void G(java.lang.Object r6, defpackage.akfz r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            java.lang.Object r0 = r0.get(r6)
            alpl r0 = (defpackage.alpl) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r2
        Lf:
            java.lang.String r4 = "Failed to remove a subscription key. State is corrupted."
            defpackage.albo.U(r3, r4)
            alpi r3 = new alpi
            r3.<init>()
            r3.b(r0)
            int r0 = r0.b(r7)
            int r0 = r0 + (-1)
            alsp r4 = r3.a
            r4.getClass()
            if (r0 != 0) goto L39
            boolean r0 = r3.c
            if (r0 != 0) goto L38
            alsq r0 = new alsq
            r0.<init>(r4)
            r3.a = r0
            r3.c = r1
            r0 = r2
            goto L46
        L38:
            r0 = r2
        L39:
            boolean r1 = r3.b
            if (r1 == 0) goto L46
            alsp r1 = new alsp
            r1.<init>(r4)
            r3.a = r1
            r3.c = r2
        L46:
            r3.b = r2
            r7.getClass()
            if (r0 != 0) goto L57
            alsp r0 = r3.a
            int r1 = defpackage.alzz.bg(r7)
            r0.f(r7, r1)
            goto L5c
        L57:
            alsp r1 = r3.a
            r1.o(r7, r0)
        L5c:
            java.lang.Object r7 = r5.a
            alpl r0 = r3.a()
            r7.put(r6, r0)
            java.lang.Object r7 = r5.a
            java.lang.Object r7 = r7.get(r6)
            alpl r7 = (defpackage.alpl) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L78
            java.lang.Object r7 = r5.a
            r7.remove(r6)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahiy.G(java.lang.Object, akfz):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, alsj] */
    private final boolean H(akfx akfxVar) {
        if (this.c.a(akfxVar, 1) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, alsj] */
    private final boolean I(akfx akfxVar) {
        boolean z;
        int d = this.c.d(akfxVar, 1);
        if (d > 0) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        if (d == 1) {
            return true;
        }
        return false;
    }

    public static final int i(acir acirVar) {
        abra abraVar;
        if (acirVar.l()) {
            return 2;
        }
        Exception g = acirVar.g();
        g.getClass();
        if (g instanceof abra) {
            abraVar = (abra) g;
        } else {
            abraVar = new abra(new Status(13, g.getMessage()));
        }
        int a = abraVar.a();
        if (a != 7) {
            if (a != 15) {
                return 1;
            }
            return 3;
        }
        return 4;
    }

    public final akfb A(ajwt ajwtVar) {
        return new akfk((ansy) this.c, new izd(this, ajwtVar, 17, null), "com.google.apps.tiktok.account.data.AllAccounts", 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final /* bridge */ /* synthetic */ akfb B() {
        return (ajzh) this.a.b();
    }

    public final ListenableFuture C(ajwt ajwtVar) {
        return aktp.Y(((ansy) this.b).B(ajwtVar), new ajwz(7), andi.a);
    }

    public final ListenableFuture D() {
        return ((ansy) this.b).C();
    }

    public final void E(ajwt ajwtVar) {
        try {
            Object obj = ((ansy) ((ansy) this.b).a).a;
            Object obj2 = ((ahiy) obj).b;
            Object obj3 = ((ahiy) obj).c;
            obj3.getClass();
            ansy.x(ansy.v((ajzw) ((apbt) ((aazm) obj2).b(new aarj(obj3, 18))), ajwtVar));
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public final void a(Uri uri) {
        synchronized (ahiy.class) {
            ((HashMap) this.b).remove(uri);
        }
    }

    public final ahix b(Uri uri) {
        synchronized (ahiy.class) {
            if (((HashMap) this.b).get(uri) == null) {
                return null;
            }
            return (ahix) ((HashMap) this.b).get(uri);
        }
    }

    public final void c(agtv agtvVar) {
        int andIncrement = ((AtomicInteger) this.c).getAndIncrement() % 64;
        synchronized (this.b) {
            ((agtv[]) this.a)[andIncrement] = agtvVar;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void d(agri agriVar) {
        this.a.execute(new agrj(this, agriVar.a(true)));
    }

    public final void e(anah anahVar) {
        aozy createBuilder = amob.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amob amobVar = (amob) apagVar;
        amobVar.c = 1;
        amobVar.b = 1 | amobVar.b;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amob amobVar2 = (amob) createBuilder.b;
        anahVar.getClass();
        amobVar2.d = anahVar;
        amobVar2.b |= 2;
        amob amobVar3 = (amob) createBuilder.s();
        ((aicp) this.b).b.d(new abii(amobVar3, new abij(aicp.a)));
    }

    public final void f(anac anacVar, int i) {
        m(anacVar, 2, i);
    }

    public final void g(aibl aiblVar, int i, int i2) {
        aozy createBuilder = anai.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anai.a((anai) createBuilder.b);
        aozy createBuilder2 = anam.a.createBuilder();
        createBuilder2.aO(ahyo.b(aiblVar.b));
        anam anamVar = (anam) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anai anaiVar = (anai) createBuilder.b;
        anamVar.getClass();
        anaiVar.c = anamVar;
        anaiVar.b |= 4;
        anai anaiVar2 = (anai) createBuilder.s();
        aozy j = j();
        if (!j.b.isMutable()) {
            j.u();
        }
        anan ananVar = (anan) j.b;
        anan ananVar2 = anan.a;
        ananVar.c = 4;
        ananVar.b |= 1;
        if (!j.b.isMutable()) {
            j.u();
        }
        anan ananVar3 = (anan) j.b;
        anaiVar2.getClass();
        ananVar3.f = anaiVar2;
        ananVar3.b |= 128;
        anan ananVar4 = (anan) j.s();
        aozy d = ahop.d((aicm) this.a, i, i2);
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar = (anah) d.b;
        anah anahVar2 = anah.a;
        anahVar.d = 1;
        anahVar.b |= 2;
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar3 = (anah) d.b;
        ananVar4.getClass();
        anahVar3.f = ananVar4;
        anahVar3.b |= 64;
        String a = ((ahyr) this.c).a();
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar4 = (anah) d.b;
        a.getClass();
        anahVar4.b |= 1073741824;
        anahVar4.m = a;
        e((anah) d.s());
    }

    public final void h(acir acirVar, long j, long j2, int i, int i2, ahws ahwsVar) {
        boolean l = acirVar.l();
        aozy createBuilder = anab.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        anab anabVar = (anab) apagVar;
        anabVar.b |= 1;
        anabVar.c = 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        anab anabVar2 = (anab) createBuilder.b;
        anabVar2.b |= 2;
        anabVar2.d = l ? 1 : 0;
        anab anabVar3 = (anab) createBuilder.s();
        aozy createBuilder2 = anac.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        anac anacVar = (anac) apagVar2;
        anacVar.c = 7;
        anacVar.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        anac anacVar2 = (anac) createBuilder2.b;
        anabVar3.getClass();
        anacVar2.f = anabVar3;
        anacVar2.b |= 32;
        int i3 = i(acirVar);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        anac anacVar3 = (anac) apagVar3;
        anacVar3.d = i3 - 1;
        anacVar3.b |= 2;
        long j3 = j2 - j;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        anac anacVar4 = (anac) createBuilder2.b;
        anacVar4.b |= 4;
        anacVar4.e = (int) j3;
        m((anac) createBuilder2.s(), i, i2);
    }

    public final aozy j() {
        Locale b = ((ahyr) this.c).b();
        Locale locale = Locale.getDefault();
        aozy createBuilder = anan.a.createBuilder();
        String locale2 = b.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anan ananVar = (anan) createBuilder.b;
        locale2.getClass();
        ananVar.b |= 2;
        ananVar.d = locale2;
        if (!b.equals(locale)) {
            String locale3 = locale.toString();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anan ananVar2 = (anan) createBuilder.b;
            locale3.getClass();
            ananVar2.b |= 4;
            ananVar2.e = locale3;
        }
        return createBuilder;
    }

    public final void k(aibq aibqVar, int i) {
        aozy createBuilder = anad.a.createBuilder();
        List<String> list = aibqVar.a;
        if (!list.isEmpty()) {
            for (String str : list) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anad anadVar = (anad) createBuilder.b;
                str.getClass();
                apax apaxVar = anadVar.b;
                if (!apaxVar.c()) {
                    anadVar.b = apag.mutableCopy(apaxVar);
                }
                anadVar.b.add(str);
            }
        }
        anad anadVar2 = (anad) createBuilder.s();
        aozy createBuilder2 = anag.a.createBuilder();
        if (anadVar2 != null) {
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            anag anagVar = (anag) createBuilder2.b;
            anagVar.c = anadVar2;
            anagVar.b |= 4;
        }
        anag anagVar2 = (anag) createBuilder2.s();
        aozy j = j();
        if (!j.b.isMutable()) {
            j.u();
        }
        anan ananVar = (anan) j.b;
        anan ananVar2 = anan.a;
        ananVar.c = 5;
        ananVar.b |= 1;
        if (!j.b.isMutable()) {
            j.u();
        }
        anan ananVar3 = (anan) j.b;
        anagVar2.getClass();
        ananVar3.g = anagVar2;
        ananVar3.b |= 256;
        anan ananVar4 = (anan) j.s();
        aozy d = ahop.d((aicm) this.a, i, 3);
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar = (anah) d.b;
        anah anahVar2 = anah.a;
        anahVar.d = 1;
        anahVar.b |= 2;
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar3 = (anah) d.b;
        ananVar4.getClass();
        anahVar3.f = ananVar4;
        anahVar3.b |= 64;
        String a = ((ahyr) this.c).a();
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar4 = (anah) d.b;
        a.getClass();
        anahVar4.b |= 1073741824;
        anahVar4.m = a;
        e((anah) d.s());
    }

    public final void l(aibl aiblVar, int i) {
        aozy createBuilder = anai.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anai.a((anai) createBuilder.b);
        aozy createBuilder2 = anam.a.createBuilder();
        createBuilder2.aO(ahyo.b(aiblVar.b));
        anam anamVar = (anam) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anai anaiVar = (anai) createBuilder.b;
        anamVar.getClass();
        anaiVar.c = anamVar;
        anaiVar.b |= 4;
        anai anaiVar2 = (anai) createBuilder.s();
        aozy j = j();
        if (!j.b.isMutable()) {
            j.u();
        }
        anan ananVar = (anan) j.b;
        anan ananVar2 = anan.a;
        ananVar.c = 4;
        ananVar.b |= 1;
        if (!j.b.isMutable()) {
            j.u();
        }
        anan ananVar3 = (anan) j.b;
        anaiVar2.getClass();
        ananVar3.j = anaiVar2;
        ananVar3.b |= 2097152;
        anan ananVar4 = (anan) j.s();
        aozy d = ahop.d((aicm) this.a, i, 3);
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar = (anah) d.b;
        anah anahVar2 = anah.a;
        anahVar.d = 1;
        anahVar.b |= 2;
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar3 = (anah) d.b;
        ananVar4.getClass();
        anahVar3.f = ananVar4;
        anahVar3.b |= 64;
        String a = ((ahyr) this.c).a();
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar4 = (anah) d.b;
        a.getClass();
        anahVar4.b |= 1073741824;
        anahVar4.m = a;
        e((anah) d.s());
    }

    public final void m(anac anacVar, int i, int i2) {
        aozy d = ahop.d((aicm) this.a, i, i2);
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar = (anah) d.b;
        anah anahVar2 = anah.a;
        anahVar.d = 16;
        anahVar.b |= 2;
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar3 = (anah) d.b;
        anacVar.getClass();
        anahVar3.i = anacVar;
        anahVar3.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        String a = ((ahyr) this.c).a();
        if (!d.b.isMutable()) {
            d.u();
        }
        anah anahVar4 = (anah) d.b;
        a.getClass();
        anahVar4.b |= 1073741824;
        anahVar4.m = a;
        e((anah) d.s());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean n(ahlw ahlwVar) {
        if (((Boolean) this.c.b()).booleanValue()) {
            if (((ahlm) this.b).c.a == 2) {
                return true;
            }
            return false;
        }
        return ahlv.e((Context) this.a, ahlwVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ahtx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final ListenableFuture o(String str, ajwt ajwtVar, boolean z) {
        akkd f = ((akik) akec.x((Context) this.c, akik.class, ajwtVar)).f();
        String g = ((ahlp) this.b).g();
        akrh f2 = aktp.f("Fetching experiments for account", akrk.a);
        try {
            f2 = aktp.f("PhenotypeApi.getConfigurationSnapshot", akrk.a);
            try {
                ListenableFuture c = f.c.c(str, g);
                if (z) {
                    c = aktu.a(c, 25L, TimeUnit.SECONDS, f.a);
                }
                f2.b(c);
                armd.i(f2, null);
                int i = 15;
                ListenableFuture Z = aktp.Z(c, akto.d(new ahsi(f, str, i)), andi.a);
                armd.i(f2, null);
                return ancj.f(akec.B(aqjn.B(aktp.T(((atqq) f.g).i(), abrn.class, new akez(agdl.s, i), andi.a), Z)), akto.a(new akez(Z, 17)), andi.a);
            } finally {
            }
        } finally {
        }
    }

    public final void p(ListenableFuture listenableFuture, Object obj, akfy akfyVar, algw algwVar, Executor executor) {
        aktp.d();
        albo.bR(listenableFuture, akto.h(new akfv(this, obj, akfyVar, algwVar)), executor);
    }

    public final void q(ListenableFuture listenableFuture, Object obj) {
        p(listenableFuture, obj, akfy.a, alfd.a, andi.a);
    }

    public final void r(ListenableFuture listenableFuture, Object obj) {
        p(listenableFuture, obj, akfy.b, alfd.a, andi.a);
    }

    public final void s(Object obj, akfz akfzVar) {
        aiut.c();
        obj.getClass();
        to toVar = new to();
        synchronized (this.b) {
            if (obj instanceof akfd) {
                aluq listIterator = ((akfd) obj).b().listIterator();
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    F(next, akfzVar);
                    if (next instanceof akfx) {
                        akfx akfxVar = (akfx) next;
                        if (H(akfxVar)) {
                            toVar.add(akfxVar);
                        }
                    }
                }
            } else {
                F(obj, akfzVar);
                if (obj instanceof akfx) {
                    akfx akfxVar2 = (akfx) obj;
                    if (H(akfxVar2)) {
                        toVar.add(akfxVar2);
                    }
                }
            }
        }
        tn tnVar = new tn(toVar);
        while (tnVar.hasNext()) {
            ((akfx) tnVar.next()).d();
        }
    }

    public final void t(Object obj, akfz akfzVar) {
        aiut.c();
        obj.getClass();
        to toVar = new to();
        synchronized (this.b) {
            if (obj instanceof akfd) {
                aluq listIterator = ((akfd) obj).b().listIterator();
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    G(next, akfzVar);
                    if (next instanceof akfx) {
                        akfx akfxVar = (akfx) next;
                        if (I(akfxVar)) {
                            toVar.add(akfxVar);
                        }
                    }
                }
            } else {
                G(obj, akfzVar);
                if (obj instanceof akfx) {
                    akfx akfxVar2 = (akfx) obj;
                    if (I(akfxVar2)) {
                        toVar.add(akfxVar2);
                    }
                }
            }
        }
        tn tnVar = new tn(toVar);
        while (tnVar.hasNext()) {
            ((akfx) tnVar.next()).c();
        }
    }

    public final ListenableFuture u(ListenableFuture listenableFuture, ancs ancsVar) {
        Set set = (Set) ((apxx) this.b).a;
        alpr i = alpt.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i.c(new akpf(ancsVar, (akcs) it.next(), 1));
        }
        return ((alhm) this.c).c(new akdj(listenableFuture, 0), i.g());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arpi, java.lang.Object] */
    public final Object v(Uri uri, String str, String[] strArr, arpe arpeVar) {
        return arro.q(aktp.a(this.b), new akbw(null, this, uri, str, strArr), arpeVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final akbd w(Class cls) {
        akbd akbdVar;
        cls.getClass();
        synchronized (this.b) {
            ?? r1 = this.a;
            Object obj = r1.get(cls);
            if (obj == null) {
                Object obj2 = this.c;
                obj = new akbd((Context) ((kru) ((qdq) obj2).a).a.n.b(), (akaw) ((kru) ((qdq) obj2).a).a.bd.b(), (aneo) ((kru) ((qdq) obj2).a).a.m.b(), (NotificationManager) ((kru) ((qdq) obj2).a).a.be.b(), ((kru) ((qdq) obj2).a).a.hC(), cls);
                r1.put(cls, obj);
            }
            akbdVar = (akbd) obj;
        }
        return akbdVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture x() {
        Object obj = this.b;
        return ancj.g(ancj.g(anee.o(ancj.f(((aiwu) ((ajzk) obj).h).a(), akto.a(new ajyn(obj, 2)), andi.a)), akto.d(new ajzp(this, 3)), this.a), akto.d(new ajzp(this, 4)), this.a);
    }

    public final ListenableFuture y() {
        ListenableFuture a = ((aiwu) this.c).a();
        if (a.isDone()) {
            return a;
        }
        return new ajzu(this, a);
    }

    public final ListenableFuture z(algk algkVar, Executor executor) {
        return new ajzu(this, ((aiwu) this.c).b(algkVar, new ajzt((Object) this, executor, 0)));
    }

    public ahiy(aiwu aiwuVar, Executor executor, aazm aazmVar) {
        this.c = aiwuVar;
        this.a = executor;
        this.b = aazmVar;
    }

    public ahiy(alhm alhmVar, armf armfVar, armf armfVar2) {
        this.c = alhmVar;
        this.b = armfVar;
        this.a = armfVar2;
    }

    public ahiy(Context context, ahlm ahlmVar, armf armfVar) {
        this.a = context;
        this.b = ahlmVar;
        this.c = armfVar;
    }

    public ahiy(ansy ansyVar, ansy ansyVar2, armf armfVar) {
        this.b = ansyVar;
        this.c = ansyVar2;
        this.a = armfVar;
    }

    public ahiy(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public ahiy(aegu aeguVar, Executor executor) {
        adwv adwvVar = new adwv(aeguVar);
        this.b = new HashMap();
        this.c = adwvVar;
        this.a = new anew(executor);
    }

    public ahiy(algw algwVar, algw algwVar2) {
        this.c = new AtomicBoolean(false);
        this.a = algwVar;
        this.b = algwVar2;
    }

    public ahiy(String str, agrk agrkVar) {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        if (str == null) {
            throw new NullPointerException("Answer URL was missing");
        }
        if (agrkVar == null) {
            throw new NullPointerException("HaTS cookie store was missing");
        }
        if (executor != null) {
            this.c = str;
            this.b = agrkVar;
            this.a = executor;
            return;
        }
        throw new NullPointerException("Executor was missing");
    }

    public ahiy(qdq qdqVar) {
        qdqVar.getClass();
        this.c = qdqVar;
        this.b = new Object();
        this.a = new LinkedHashMap();
    }

    public ahiy(byte[] bArr, byte[] bArr2) {
        this.b = new Object();
        this.a = new tm();
        this.c = new alno();
    }

    public ahiy(aozb aozbVar, String str, String str2) {
        this.b = amcn.f;
        this.c = albo.D(new ylq(this, aozbVar, 16));
        this.a = albo.D(new ahvu(this, str, str2, 1));
    }

    public ahiy(apwt apwtVar, ahlp ahlpVar, Context context) {
        apwtVar.getClass();
        context.getClass();
        this.a = apwtVar;
        this.b = ahlpVar;
        this.c = context;
    }

    public ahiy(arpi arpiVar, ContentResolver contentResolver, ansy ansyVar) {
        arpiVar.getClass();
        this.b = arpiVar;
        this.c = contentResolver;
        this.a = ansyVar;
    }

    public ahiy() {
        this.a = new agtv[64];
        this.b = new Object();
        this.c = new AtomicInteger(0);
    }
}
