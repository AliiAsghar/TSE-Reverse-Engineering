package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.work.WorkerParameters;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahsi implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahsi(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v73, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, anen] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        Object obj2;
        ListenableFuture g;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ListenableFuture f;
        ListenableFuture f2;
        ListenableFuture bI;
        int i = 3;
        int i2 = 8;
        int i3 = 20;
        int i4 = 16;
        int i5 = 5;
        int i6 = 2;
        byte[] bArr = null;
        int i7 = 0;
        int i8 = 1;
        switch (this.c) {
            case 0:
                apaa apaaVar = (apaa) ((ahsb) obj).toBuilder();
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                Object obj3 = this.a;
                Object obj4 = this.b;
                ahsb ahsbVar = (ahsb) apaaVar.b;
                obj4.getClass();
                ahsbVar.c = (asjt) obj4;
                ahsbVar.b |= 1;
                akkw akkwVar = (akkw) obj3;
                return ((ClearcutMetricSnapshotTransmitter) akkwVar.e).a((Context) akkwVar.d, (ahsb) apaaVar.s());
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj5 = this.b;
                adec adecVar = (adec) this.a;
                if (booleanValue) {
                    obj2 = adecVar.b;
                } else {
                    obj2 = adecVar.a;
                }
                return ((aiim) obj2).d((String) obj5);
            case 2:
                ConcurrentMap concurrentMap = ahux.a;
                alob alobVar = new alob();
                ahta ahtaVar = (ahta) this.a;
                alobVar.h(ahtaVar.d);
                int i9 = agqa.a;
                alobVar.h(agqa.a(ahtaVar.d));
                alog g2 = alobVar.g();
                int i10 = ((alsx) g2).c;
                while (i7 < i10) {
                    Object obj6 = this.b;
                    File file = new File(String.valueOf(((Context) g2.get(i7)).getFilesDir()) + "/phenotype/shared/" + ((String) obj6));
                    Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
                    if (file.exists()) {
                        i8 = ahux.a(file) ? 1 : 0;
                    }
                    i7++;
                }
                if (i8 != 0) {
                    return aneh.a;
                }
                return albo.bH(new IOException("Unable to remove snapshots for removed user"));
            case 3:
                atsg atsgVar = (atsg) this.a;
                aows aowsVar = (aows) ((arlb) atsgVar.e).i(new arll(((adxs) atsgVar.a).d("", ((ahyr) atsgVar.g).a()), 0), ahji.ay());
                aozy createBuilder = aovz.a.createBuilder();
                aibo aiboVar = (aibo) this.b;
                String str = aiboVar.c.e;
                str.getClass();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aovz) createBuilder.b).b = str.concat("/media");
                Integer num = aiboVar.b;
                if (num != null) {
                    int intValue = num.intValue();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aovz) createBuilder.b).d = intValue;
                }
                Integer num2 = aiboVar.a;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aovz) createBuilder.b).c = intValue2;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aovz) createBuilder.b).e = true;
                aovz aovzVar = (aovz) createBuilder.s();
                aqrs aqrsVar = aowsVar.a;
                aqux aquxVar = aowt.c;
                if (aquxVar == null) {
                    synchronized (aowt.class) {
                        aquxVar = aowt.c;
                        if (aquxVar == null) {
                            aquu a = aqux.a();
                            a.e = aquw.UNARY;
                            a.a = aqux.c("google.maps.places.v1.Places", "GetPhotoMedia");
                            a.b();
                            aovz aovzVar2 = aovz.a;
                            aozs aozsVar = arkx.a;
                            a.c = new arkw(aovzVar2);
                            a.d = new arkw(aowd.a);
                            aquxVar = a.a();
                            aowt.c = aquxVar;
                        }
                    }
                }
                return arlj.a(aqrsVar.a(aquxVar, aowsVar.b), aovzVar);
            case 4:
                Object obj7 = this.a;
                aiws aiwsVar = (aiws) obj7;
                aiwsVar.c((Uri) albo.bQ(aiwsVar.b), obj);
                Object obj8 = aiwsVar.e;
                ?? r2 = this.b;
                synchronized (obj8) {
                    ((aiws) obj7).f = r2;
                }
                return albo.bI(obj);
            case 5:
                ?? r13 = this.b;
                ArrayList arrayList = new ArrayList(r13.size());
                Iterator it = r13.iterator();
                while (it.hasNext()) {
                    arrayList.add(new xpx((agxw) it.next(), this.a, i4, bArr));
                }
                return ancj.f(ajki.s(arrayList, new evp(13), andi.a), akto.a(new ajwz(i5)), andi.a);
            case 6:
                Pair pair = (Pair) obj;
                Object obj9 = this.b;
                Object obj10 = this.a;
                akrh e = aktp.e("AccountUiService handle selection result");
                if (pair != null) {
                    try {
                        if (pair.first instanceof ajyg) {
                            g = ancj.f(((ajyg) pair.first).b(), akto.a(new ajyn(obj10, i7)), andi.a);
                            e.b(g);
                        } else if (pair.first instanceof ajye) {
                            ajwt ajwtVar = (ajwt) pair.second;
                            g = ancj.g(((ansy) ((aogy) obj9).b).B(ajwtVar), akto.d(new ajym((aogy) obj9, (ajxb) obj10, (ajye) pair.first, ajwtVar, 0)), andi.a);
                            e.b(g);
                        }
                        e.close();
                        return g;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                g = albo.bI(new ajxc(null, ajzb.a, null, null, (ajxb) obj10));
                e.b(g);
                e.close();
                return g;
            case 7:
                Object obj11 = this.b;
                alog<ajzb> alogVar = (alog) obj;
                alpt alptVar = (alpt) obj11;
                d.s(!alptVar.isEmpty());
                Object obj12 = ((ajzk) this.a).d;
                aluq listIterator = alptVar.listIterator();
                Object obj13 = ((ansy) obj12).b;
                while (listIterator.hasNext()) {
                    ((String) listIterator.next()).getClass();
                    d.s(!r5.isEmpty());
                }
                for (ajzb ajzbVar : alogVar) {
                    if ((ajzbVar.b & 256) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d.s(z);
                    if (1 != (ajzbVar.b & 1)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    d.s(z2);
                    if ((ajzbVar.b & 16) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    d.s(z3);
                    if (ajzbVar.g) {
                        int i11 = ajzbVar.b;
                        if ((i11 & 128) == 0 || (i11 & 1) == 0) {
                            z4 = false;
                            d.s(z4);
                            albo.Q(alptVar.contains(ajzbVar.i), "Unexpected account type provided! Accepted account types: %s, provided account type: %s", obj11, ajzbVar.i);
                        }
                    }
                    z4 = true;
                    d.s(z4);
                    albo.Q(alptVar.contains(ajzbVar.i), "Unexpected account type provided! Accepted account types: %s, provided account type: %s", obj11, ajzbVar.i);
                }
                akrh e2 = aktp.e("Sync Accounts for Types");
                try {
                    akul h = akul.g(((akkd) obj13).d((ahiy) ((akkd) obj13).c, new ajzr(obj11, alogVar, i8))).i(new ajzp(obj13, i6), ((akkd) obj13).e).h(new algm(null), andi.a);
                    e2.b(h);
                    e2.close();
                    return h;
                } finally {
                    try {
                        e2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            case 8:
                Object obj14 = this.b;
                Set set = (Set) ((akkd) obj14).a.b();
                Object obj15 = this.a;
                return akkd.c((ajzd) obj15, set).b(akto.c(new xpx(obj14, obj15, i3, bArr)), andi.a);
            case 9:
                Object obj16 = this.a;
                ajwt ajwtVar2 = (ajwt) obj16;
                ajzz v = ansy.v((ajzw) obj, ajwtVar2);
                int R = a.R(v.e);
                if (R != 0 && R == 2) {
                    return albo.bI(null);
                }
                Object obj17 = this.b;
                ajzd ajzdVar = new ajzd(ajwtVar2, ansy.x(v).b);
                Set set2 = (Set) ((akkd) obj17).b.b();
                ArrayList arrayList2 = new ArrayList(set2.size());
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    try {
                        Object obj18 = ((asqc) it2.next()).a;
                        arrayList2.add(((ansy) obj18).a.submit(new ajnt(obj18, ajzdVar.a, i5)));
                    } catch (Exception e3) {
                        arrayList2.add(albo.bH(e3));
                    }
                }
                return ancj.g(albo.bX(arrayList2).b(akto.c(new xpx(obj17, obj16, 19, bArr)), andi.a), akto.d(new ahsi(obj17, ajzdVar, i2, bArr)), andi.a);
            case 10:
                alpt o = alpt.o(alzz.G(this.b, (Set) obj));
                ansy ansyVar = ((akad) this.a).h;
                return ansyVar.u(ansyVar.s(o, null, true));
            case 11:
                akai akaiVar = (akai) obj;
                Object obj19 = this.a;
                Object obj20 = this.b;
                if (obj19 == null) {
                    aozy builder = akaiVar.toBuilder();
                    builder.az(((akag) obj20).a);
                    return albo.bI((akai) builder.s());
                }
                return ancj.f(((akag) obj20).d.B((ajwt) obj19), akto.a(new yxu(obj20, akaiVar, obj19, 8, null)), andi.a);
            case 12:
                ahtu ahtuVar = (ahtu) obj;
                akrh f3 = aktp.f("ConsistencyTierState.setNewValues", akrk.a);
                Object obj21 = this.b;
                Object obj22 = this.a;
                try {
                    akic akicVar = (akic) ((akkd) obj22).b.get(obj21);
                    if (akicVar != null) {
                        int ordinal = akicVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 2) {
                                Object obj23 = ((akkd) obj22).e;
                                ahtuVar.getClass();
                                f = ((asqe) obj23).o((String) obj21, ahtuVar);
                            }
                        } else {
                            Object obj24 = ((akkd) obj22).f;
                            ahtuVar.getClass();
                            f = ancj.f(((asqe) obj24).o((String) obj21, ahtuVar), akto.a(new akez(obj22, i5)), andi.a);
                        }
                        f3.b(f);
                        armd.i(f3, null);
                        return f;
                    }
                    throw new UnsupportedOperationException();
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 13:
                return aktp.Y(((akjb) this.b).p.b(akto.a(new akez(this.a, 9)), andi.a), akto.a(new akez((akix) obj, 11)), andi.a);
            case 14:
                String str2 = (String) obj;
                str2.getClass();
                return ((akyr) this.b).k(str2, (ajwt) this.a);
            case 15:
                ahtu ahtuVar2 = (ahtu) obj;
                akrh f4 = aktp.f("ConsistencyTierState.setNewValues", akrk.a);
                Object obj25 = this.b;
                Object obj26 = this.a;
                try {
                    akic akicVar2 = (akic) ((akkd) obj26).b.get(obj25);
                    if (akicVar2 != null) {
                        int ordinal2 = akicVar2.ordinal();
                        if (ordinal2 != 1) {
                            if (ordinal2 == 3) {
                                Object obj27 = ((akkd) obj26).e;
                                ahtuVar2.getClass();
                                f2 = ((asqe) obj27).o((String) obj25, ahtuVar2);
                            }
                        } else {
                            Object obj28 = ((akkd) obj26).f;
                            ahtuVar2.getClass();
                            f2 = ancj.f(((asqe) obj28).o((String) obj25, ahtuVar2), akto.a(new akez(obj26, i4)), andi.a);
                        }
                        f4.b(f2);
                        armd.i(f4, null);
                        return f2;
                    }
                    throw new UnsupportedOperationException();
                } finally {
                }
            case 16:
                String str3 = (String) obj;
                str3.getClass();
                return ((akyr) this.b).k(str3, (ajwt) this.a);
            case 17:
                aknh aknhVar = (aknh) this.b;
                ansy a2 = aknhVar.a(obj);
                Object obj29 = this.a;
                obj29.getClass();
                Intent intent = (Intent) obj29;
                String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                akrh f5 = aktp.f("Updating experiments", akrk.a);
                try {
                    if (stringExtra == null) {
                        bI = ((akyr) a2.b).j(false);
                    } else if (a2.a.contains(stringExtra)) {
                        bI = ((akyr) a2.b).i(stringExtra, false);
                    } else {
                        bI = albo.bI(null);
                    }
                    akat.c(bI, "Failed updating experiments for package %s", stringExtra);
                    ListenableFuture T = aktp.T(bI, Exception.class, new akez(agdl.l, i), andi.a);
                    armd.i(f5, null);
                    intent.getFlags();
                    return aktp.U(albo.bP(T, 25000 - (aknhVar.b.e().toMillis() - aknhVar.c), TimeUnit.MILLISECONDS, aknhVar.d), TimeoutException.class, new akdk(4), andi.a);
                } finally {
                }
            case 18:
                Set keySet = ((HashMap) this.b).keySet();
                akom akomVar = ((akos) this.a).f;
                return akomVar.d.submit(new ahes(akomVar, keySet, i3));
            case 19:
                ?? r0 = this.b;
                akos akosVar = (akos) this.a;
                return aktp.ac(akosVar.h(r0), new akon(akosVar, (ListenableFuture) r0, (Long) obj, i7), akosVar.c);
            default:
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = ((List) obj).iterator();
                while (true) {
                    Object obj30 = this.a;
                    Object obj31 = this.b;
                    if (it3.hasNext()) {
                        gtl gtlVar = (gtl) it3.next();
                        if (!((WorkerParameters) obj30).a.equals(gtlVar.a)) {
                            arrayList3.add(((akoy) obj31).b.q(gtlVar.a));
                        }
                    } else {
                        return albo.bV(arrayList3).b(akto.c(new akiq(obj31, obj30, i2, bArr)), ((akoy) obj31).a);
                    }
                }
        }
    }

    public /* synthetic */ ahsi(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
