package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akyr {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public akyr(algw algwVar, alog alogVar, alog alogVar2, atal atalVar) {
        this.b = algwVar;
        this.a = alogVar;
        this.c = alogVar2;
        this.d = atalVar;
    }

    public static akyr a(String str) {
        return new akyr(str, new akxz(10));
    }

    public static String n(String str) {
        String[] split = str.split("/");
        int length = split.length - 1;
        split[length] = Uri.encode(split[length]);
        return algs.c('/').e(split);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, java.lang.Object] */
    public final void b(Function function, Function function2) {
        this.d.put("executionStatus", new agpp(function, function2, 7, null));
    }

    public final void c(String str, Function function, akys akysVar) {
        ((ArrayList) this.c).add(new akyt(str, function, akysVar));
    }

    public final akyr d(Supplier supplier) {
        return new akyr((String) this.a, supplier);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.function.Supplier] */
    public final akyr e() {
        return new akyr((String) this.a, this.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.function.Supplier] */
    public final akyr f() {
        return new akyr((String) this.a, this.b);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture g(final Set set, final long j, final Map map) {
        return ancj.f(((akom) this.d).b(), akto.a(new algk() { // from class: akow
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v28, types: [algw] */
            /* JADX WARN: Type inference failed for: r0v32, types: [algw] */
            /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, aegu] */
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                boolean z;
                long j2;
                ArrayList arrayList;
                akyr akyrVar;
                alfd alfdVar;
                akow akowVar = this;
                Map map2 = (Map) obj;
                ArrayList arrayList2 = new ArrayList();
                akyr akyrVar2 = akyr.this;
                long epochMilli = akyrVar2.a.f().toEpochMilli();
                for (Map.Entry entry : map.entrySet()) {
                    Set set2 = set;
                    akot akotVar = (akot) entry.getKey();
                    aknv a = ((akob) entry.getValue()).a();
                    Long l = (Long) map2.get(akotVar);
                    if (set2.contains(akotVar)) {
                        j2 = epochMilli;
                    } else {
                        j2 = j;
                        if (l != null) {
                            j2 = l.longValue();
                        }
                    }
                    alpr alprVar = new alpr();
                    long j3 = a.a;
                    Map map3 = a.c;
                    alfd alfdVar2 = alfd.a;
                    for (aknx aknxVar : ((alor) map3).values()) {
                        Map map4 = map2;
                        long j4 = aknxVar.b;
                        if (j4 != -1) {
                            arrayList = arrayList2;
                            akyrVar = akyrVar2;
                            long j5 = j4 + j2 + a.a;
                            if (epochMilli <= j5) {
                                if (!alfdVar2.f()) {
                                    alfdVar = algw.i(Long.valueOf(j5));
                                } else {
                                    alfdVar = algw.i(Long.valueOf(Math.min(((Long) alfdVar2.b()).longValue(), j5)));
                                }
                                alfdVar2 = alfdVar;
                                alprVar.c(aknxVar.a);
                            }
                        } else {
                            arrayList = arrayList2;
                            akyrVar = akyrVar2;
                            alprVar.c(aknxVar.a);
                        }
                        map2 = map4;
                        arrayList2 = arrayList;
                        akyrVar2 = akyrVar;
                    }
                    ArrayList arrayList3 = arrayList2;
                    HashSet hashSet = new HashSet();
                    aktp.v(alprVar.g(), hashSet);
                    arrayList3.add(new akou(hashSet, j3 + j2, alfdVar2));
                    map2 = map2;
                    arrayList2 = arrayList3;
                    akowVar = this;
                }
                ArrayList<akou> arrayList4 = arrayList2;
                akyr akyrVar3 = akyrVar2;
                for (int i = 0; i < arrayList4.size(); i++) {
                    akou akouVar = (akou) arrayList4.get(i);
                    long convert = TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES);
                    long j6 = akouVar.b;
                    long j7 = convert + epochMilli;
                    if (j6 < j7) {
                        long max = Math.max(epochMilli, j6);
                        HashSet hashSet2 = new HashSet();
                        algw algwVar = alfd.a;
                        aktp.v(akouVar.a, hashSet2);
                        if (akouVar.c.f()) {
                            long j8 = j7 - max;
                            boolean z2 = true;
                            if (j8 > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            albo.T(z);
                            if (j8 > convert) {
                                z2 = false;
                            }
                            albo.T(z2);
                            algwVar = algw.i(Long.valueOf(((Long) akouVar.c.b()).longValue() + j8));
                        }
                        arrayList4.set(i, new akou(hashSet2, j7, algwVar));
                    }
                }
                long abs = Math.abs(((SecureRandom) ((asqc) akyrVar3.c).a.b()).nextLong()) % TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES);
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    akou akouVar2 = (akou) arrayList4.get(i2);
                    HashSet hashSet3 = new HashSet();
                    algw algwVar2 = alfd.a;
                    aktp.v(akouVar2.a, hashSet3);
                    long j9 = akouVar2.b + abs;
                    if (akouVar2.c.f()) {
                        algwVar2 = algw.i(Long.valueOf(((Long) akouVar2.c.b()).longValue() + abs));
                    }
                    arrayList4.set(i2, new akou(hashSet3, j9, algwVar2));
                }
                tm tmVar = new tm();
                for (akou akouVar3 : arrayList4) {
                    Set set3 = akouVar3.a;
                    akou akouVar4 = (akou) tmVar.get(set3);
                    if (akouVar4 == null) {
                        tmVar.put(set3, akouVar3);
                    } else {
                        tmVar.put(set3, akou.a(akouVar4, akouVar3));
                    }
                }
                algw algwVar3 = alfd.a;
                for (akou akouVar5 : tmVar.values()) {
                    if (akouVar5.c.f()) {
                        if (algwVar3.f()) {
                            algwVar3 = algw.i(Long.valueOf(Math.min(((Long) algwVar3.b()).longValue(), ((Long) akouVar5.c.b()).longValue())));
                        } else {
                            algwVar3 = akouVar5.c;
                        }
                    }
                }
                if (algwVar3.f()) {
                    HashMap hashMap = new HashMap(tmVar);
                    altg altgVar = altg.a;
                    HashSet hashSet4 = new HashSet();
                    long longValue = ((Long) algwVar3.b()).longValue();
                    aktp.v(altgVar, hashSet4);
                    akou akouVar6 = new akou(hashSet4, longValue, algwVar3);
                    akou akouVar7 = (akou) hashMap.get(altgVar);
                    if (akouVar7 == null) {
                        hashMap.put(altgVar, akouVar6);
                    } else {
                        hashMap.put(altgVar, akou.a(akouVar7, akouVar6));
                    }
                    return DesugarCollections.unmodifiableMap(hashMap);
                }
                return tmVar;
            }
        }), this.b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    public final ListenableFuture h(String str) {
        str.getClass();
        String h = ((asqc) this.d).h(str);
        akic akicVar = (akic) this.c.get(h);
        if (akicVar != akic.c && akicVar != akic.a) {
            throw new IllegalStateException(a.ci(akicVar, h, "Package ", " was not a device package. Instead was "));
        }
        return ((akkd) this.b.b()).a(h, true);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [apwt, java.lang.Object] */
    public final ListenableFuture i(String str, boolean z) {
        asqc asqcVar = (asqc) this.d;
        ?? r1 = this.c;
        String h = asqcVar.h(str);
        akic akicVar = (akic) r1.get(h);
        if (akicVar == null) {
            Log.w("ConfigurationUpdater", "No Mendel package registered for ".concat(h));
            return albo.bI(null);
        }
        int ordinal = akicVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new armm();
                    }
                }
            }
            Object obj = this.a;
            return ancj.g(((ahiy) ((ahiy) obj).a.b()).D(), akto.d(new prn(obj, h, z, 8)), andi.a);
        }
        return ((akkd) this.b.b()).a(h, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final ListenableFuture j(boolean z) {
        Set keySet = this.c.keySet();
        ArrayList arrayList = new ArrayList(aqjn.J(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(i((String) it.next(), z));
        }
        return akec.B(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [apwt, java.lang.Object] */
    public final ListenableFuture k(String str, ajwt ajwtVar) {
        asqc asqcVar = (asqc) this.d;
        ?? r1 = this.c;
        String h = asqcVar.h(str);
        akic akicVar = (akic) r1.get(h);
        if (akicVar != akic.d && akicVar != akic.b) {
            throw new IllegalStateException(a.ci(akicVar, h, "Package ", " was not a user package. Instead was "));
        }
        Object obj = this.a;
        return ancj.g(((ahiy) ((ahiy) obj).a.b()).C(ajwtVar), akto.d(new xrd(obj, h, (Object) ajwtVar, 18)), andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arqg] */
    public final void l(apbt apbtVar, ajsm ajsmVar) {
        ajsn ajsnVar = (ajsn) this.a.a();
        Object cast = ((Class) this.c).cast(apbtVar);
        cast.getClass();
        ajsnVar.a((apbt) cast, ajsmVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, aegu] */
    public final void m(aiza aizaVar, boolean z) {
        aprc aprcVar;
        String ag = albo.ag(aizaVar.f);
        final aizi v = aiyw.a.d.v((Context) this.b, (String) this.d, aizaVar.b, ag);
        aozy createBuilder = aprd.a.createBuilder();
        long epochMilli = this.c.f().toEpochMilli() - aizaVar.d;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(epochMilli);
        long nanos = TimeUnit.MILLISECONDS.toNanos(epochMilli - (TimeUnit.SECONDS.toMillis(1L) * seconds));
        aozy createBuilder2 = aozn.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        ((aozn) apagVar).b = seconds;
        int i = (int) nanos;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        ((aozn) createBuilder2.b).c = i;
        aozn aoznVar = (aozn) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        aprd aprdVar = (aprd) apagVar2;
        aoznVar.getClass();
        aprdVar.e = aoznVar;
        aprdVar.b |= 1;
        int i2 = aizaVar.g;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                Log.e("SurveyAnswerTransmitter", "Invalid survey answer type specified.");
                            } else {
                                aprb aprbVar = aprb.a;
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                aprd aprdVar2 = (aprd) createBuilder.b;
                                aprbVar.getClass();
                                aprdVar2.d = aprbVar;
                                aprdVar2.c = 6;
                            }
                        } else {
                            apqz apqzVar = aizaVar.a;
                            if (!apagVar2.isMutable()) {
                                createBuilder.u();
                            }
                            aprd aprdVar3 = (aprd) createBuilder.b;
                            apqzVar.getClass();
                            aprdVar3.d = apqzVar;
                            aprdVar3.c = 5;
                        }
                    } else {
                        aozy createBuilder3 = apqt.a.createBuilder();
                        boolean z2 = aizaVar.e;
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        ((apqt) createBuilder3.b).b = z2;
                        apqt apqtVar = (apqt) createBuilder3.s();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aprd aprdVar4 = (aprd) createBuilder.b;
                        apqtVar.getClass();
                        aprdVar4.d = apqtVar;
                        aprdVar4.c = 4;
                    }
                } else {
                    aozy createBuilder4 = apra.a.createBuilder();
                    aprm aprmVar = aizaVar.c;
                    if (aprmVar != null) {
                        if (!z) {
                            aozy builder = aprmVar.toBuilder();
                            if (!builder.b.isMutable()) {
                                builder.u();
                            }
                            aprm aprmVar2 = (aprm) builder.b;
                            aprmVar2.c = null;
                            aprmVar2.b &= -2;
                            aprmVar = (aprm) builder.s();
                        }
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apra apraVar = (apra) createBuilder4.b;
                        aprmVar.getClass();
                        apraVar.c = aprmVar;
                        apraVar.b |= 2;
                    }
                    apra apraVar2 = (apra) createBuilder4.s();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aprd aprdVar5 = (aprd) createBuilder.b;
                    apraVar2.getClass();
                    aprdVar5.d = apraVar2;
                    aprdVar5.c = 3;
                }
            } else {
                Object obj = this.a;
                if (((aizd) aiyy.a.e.get(((aprx) obj).b)) == aizd.EMBEDDED) {
                    aozy createBuilder5 = aprc.a.createBuilder();
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    aprc aprcVar2 = (aprc) createBuilder5.b;
                    aprcVar2.c = a.ak(3);
                    aprcVar2.b |= 1;
                    aprcVar = (aprc) createBuilder5.s();
                } else {
                    aprcVar = aprc.a;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aprd aprdVar6 = (aprd) createBuilder.b;
                aprcVar.getClass();
                aprdVar6.d = aprcVar;
                aprdVar6.c = 2;
            }
            Object obj2 = this.a;
            long j = aizr.a;
            if (obj2 != null) {
                aprx aprxVar = (aprx) obj2;
                if (!aprxVar.b.isEmpty() && !aprxVar.c.G()) {
                    aozy createBuilder6 = apqc.a.createBuilder();
                    Object obj3 = this.a;
                    if (!createBuilder6.b.isMutable()) {
                        createBuilder6.u();
                    }
                    apqc apqcVar = (apqc) createBuilder6.b;
                    obj3.getClass();
                    apqcVar.d = (aprx) obj3;
                    apqcVar.b |= 2;
                    aprd aprdVar7 = (aprd) createBuilder.s();
                    if (!createBuilder6.b.isMutable()) {
                        createBuilder6.u();
                    }
                    apqc apqcVar2 = (apqc) createBuilder6.b;
                    aprdVar7.getClass();
                    apqcVar2.c = aprdVar7;
                    apqcVar2.b |= 1;
                    final apqc apqcVar3 = (apqc) createBuilder6.s();
                    final asgf asgfVar = new asgf();
                    if (apqcVar3 == null) {
                        Log.e("NetworkCallerGrpc", "Survey record event request was null");
                    } else {
                        aize.a().execute(new Runnable() { // from class: aizf
                            @Override // java.lang.Runnable
                            public final void run() {
                                ListenableFuture a;
                                ListenableFuture a2;
                                aizi aiziVar = aizi.this;
                                alce c = aiziVar.c();
                                aqrs d = aiziVar.d(c);
                                if (d == null) {
                                    Log.e("NetworkCallerGrpc", "Could not get channel for recordEvent.");
                                    return;
                                }
                                asgf asgfVar2 = asgfVar;
                                apqc apqcVar4 = apqcVar3;
                                if (aiyw.a.b) {
                                    try {
                                        aqjh aqjhVar = (aqjh) apag.parseFrom(aqjh.a, apqcVar4.toByteString(), aozs.a());
                                        if (c != null) {
                                            aqjm aqjmVar = (aqjm) aqjn.a(d).k(new aqwm(c));
                                            aqrs aqrsVar = aqjmVar.a;
                                            aqux aquxVar = aqjn.c;
                                            if (aquxVar == null) {
                                                synchronized (aqjn.class) {
                                                    aquxVar = aqjn.c;
                                                    if (aquxVar == null) {
                                                        aquu a3 = aqux.a();
                                                        a3.e = aquw.UNARY;
                                                        a3.a = aqux.c("google.internal.feedback.v1.SurveyService", "RecordEvent");
                                                        a3.b();
                                                        aqjh aqjhVar2 = aqjh.a;
                                                        aozs aozsVar = arkx.a;
                                                        a3.c = new arkw(aqjhVar2);
                                                        a3.d = new arkw(aqji.a);
                                                        aquxVar = a3.a();
                                                        aqjn.c = aquxVar;
                                                    }
                                                }
                                            }
                                            a = arlj.a(aqrsVar.a(aquxVar, aqjmVar.b), aqjhVar);
                                        } else {
                                            aqjm a4 = aqjn.a(d);
                                            aqrs aqrsVar2 = a4.a;
                                            aqux aquxVar2 = aqjn.d;
                                            if (aquxVar2 == null) {
                                                synchronized (aqjn.class) {
                                                    aquxVar2 = aqjn.d;
                                                    if (aquxVar2 == null) {
                                                        aquu a5 = aqux.a();
                                                        a5.e = aquw.UNARY;
                                                        a5.a = aqux.c("google.internal.feedback.v1.SurveyService", "RecordEventAnonymous");
                                                        a5.b();
                                                        aqjh aqjhVar3 = aqjh.a;
                                                        aozs aozsVar2 = arkx.a;
                                                        a5.c = new arkw(aqjhVar3);
                                                        a5.d = new arkw(aqji.a);
                                                        aquxVar2 = a5.a();
                                                        aqjn.d = aquxVar2;
                                                    }
                                                }
                                            }
                                            a = arlj.a(aqrsVar2.a(aquxVar2, a4.b), aqjhVar);
                                        }
                                        albo.bR(a, new ahjd(aiziVar, (apag) apqcVar4, asgfVar2, 4), aize.a());
                                        return;
                                    } catch (apba e) {
                                        Log.e("NetworkCallerGrpc", "Failed to convert scone record event request to feedback1p.", e);
                                        return;
                                    }
                                }
                                if (c != null) {
                                    apsc apscVar = (apsc) apsd.i(d).k(new aqwm(c));
                                    aqrs aqrsVar3 = apscVar.a;
                                    aqux aquxVar3 = apsd.h;
                                    if (aquxVar3 == null) {
                                        synchronized (apsd.class) {
                                            aquxVar3 = apsd.h;
                                            if (aquxVar3 == null) {
                                                aquu a6 = aqux.a();
                                                a6.e = aquw.UNARY;
                                                a6.a = aqux.c("scone.v1.SurveyService", "RecordEvent");
                                                a6.b();
                                                apqc apqcVar5 = apqc.a;
                                                aozs aozsVar3 = arkx.a;
                                                a6.c = new arkw(apqcVar5);
                                                a6.d = new arkw(apqd.a);
                                                aquxVar3 = a6.a();
                                                apsd.h = aquxVar3;
                                            }
                                        }
                                    }
                                    a2 = arlj.a(aqrsVar3.a(aquxVar3, apscVar.b), apqcVar4);
                                } else {
                                    apsc i4 = apsd.i(d);
                                    aqrs aqrsVar4 = i4.a;
                                    aqux aquxVar4 = apsd.i;
                                    if (aquxVar4 == null) {
                                        synchronized (apsd.class) {
                                            aquxVar4 = apsd.i;
                                            if (aquxVar4 == null) {
                                                aquu a7 = aqux.a();
                                                a7.e = aquw.UNARY;
                                                a7.a = aqux.c("scone.v1.SurveyService", "RecordEventAnonymous");
                                                a7.b();
                                                apqc apqcVar6 = apqc.a;
                                                aozs aozsVar4 = arkx.a;
                                                a7.c = new arkw(apqcVar6);
                                                a7.d = new arkw(apqd.a);
                                                aquxVar4 = a7.a();
                                                apsd.i = aquxVar4;
                                            }
                                        }
                                    }
                                    a2 = arlj.a(aqrsVar4.a(aquxVar4, i4.b), apqcVar4);
                                }
                                albo.bR(a2, new ahjd(aiziVar, (apag) apqcVar4, asgfVar2, 3), aize.a());
                            }
                        });
                    }
                    aizaVar.a = apqz.a;
                    aizaVar.g = 1;
                    return;
                }
            }
            Log.e("SurveyAnswerTransmitter", "Session is invalid, dropping event.");
            aizaVar.a = apqz.a;
            aizaVar.g = 1;
            return;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final atii o() {
        return new atii(this.a, this.b, DesugarCollections.unmodifiableList(this.c), this.d);
    }

    public akyr(ContentResolver contentResolver, Uri uri, Uri uri2, Uri uri3) {
        this.d = contentResolver;
        this.c = uri;
        this.a = uri2;
        this.b = uri3;
    }

    public akyr(Context context, String str, aprx aprxVar) {
        this.c = new aegx();
        this.b = context;
        this.d = str;
        this.a = aprxVar;
    }

    public akyr(Class cls, ContentType contentType, arqg arqgVar, arqg arqgVar2) {
        this.c = cls;
        this.b = contentType;
        this.d = arqgVar;
        this.a = arqgVar2;
    }

    public akyr(algw algwVar, asqc asqcVar, armf armfVar, Map map) {
        asqcVar.getClass();
        map.getClass();
        this.d = asqcVar;
        this.b = armfVar;
        this.c = map;
        this.a = (ahiy) ((alha) algwVar).a;
    }

    public akyr(aegu aeguVar, akom akomVar, asqc asqcVar, anen anenVar) {
        this.a = aeguVar;
        this.d = akomVar;
        this.c = asqcVar;
        this.b = anenVar;
        Boolean bool = false;
        bool.getClass();
    }

    public akyr(akri akriVar) {
        if (akriVar.b()) {
            Object obj = ((akyr) akriVar.a()).b;
        }
        this.b = null;
        this.d = new akum(akriVar.b() ? (alzk) ((akup) ((akyr) akriVar.a()).d).b() : null);
        this.c = new akun(akriVar.b() ? (alyx) ((akup) ((akyr) akriVar.a()).c).b() : null);
        this.a = new akuo(akriVar.b() ? (alzz) ((akup) ((akyr) akriVar.a()).a).b() : null);
    }

    private akyr(String str, Supplier supplier) {
        this.c = new ArrayList();
        this.d = new HashMap();
        this.a = str;
        this.b = supplier;
    }
}
