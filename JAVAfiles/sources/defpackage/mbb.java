package defpackage;

import android.content.Context;
import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbb {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl");
    public static final xze b = xze.g("BugleClearcutLogger", "ClearcutLoggerV2");
    public final alor c;
    public final alhr d;
    public final boolean e;
    private final alor f;
    private final Context g;
    private final armf h;
    private final Executor i;
    private final alor j;
    private final alor k;
    private final Long m;
    private final Long o;
    private final boolean p;
    private final kor q;
    private final lfl r;
    private final maw l = new maw();
    private final AtomicLong n = new AtomicLong();

    public mbb(kor korVar, Context context, boolean z, alhr alhrVar, armf armfVar, lfl lflVar, Executor executor, int i, boolean z2) {
        boolean z3;
        alor alorVar;
        this.q = korVar;
        this.g = context;
        this.d = alhrVar;
        this.e = z2;
        this.p = z;
        long max = Math.max(((Long) mbj.b.e()).longValue(), 1L);
        if (max >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        albo.M(z3, "value (%s) is outside the range for an unsigned long value", max);
        anbs anbsVar = new anbs(max);
        long j = new anbs(UUID.randomUUID().getLeastSignificantBits()).a;
        long j2 = anbsVar.a;
        if (j2 < 0) {
            if (albo.cg(j, j2) >= 0) {
                j -= j2;
            }
        } else if (j >= 0) {
            j %= j2;
        } else {
            long j3 = (j >>> 1) / j2;
            long j4 = j - ((j3 + j3) * j2);
            j = j4 - (albo.cg(j4, j2) >= 0 ? j2 : 0L);
        }
        this.m = Long.valueOf(new anbs(j).a);
        this.o = Long.valueOf(Math.max(((Integer) mbj.a.e()).intValue(), 1L));
        this.k = alor.o(mby.PER_EVENT_THROTTLING, new mba(alhrVar), mby.ONCE_PER_APP_START, new maz(), mby.ALWAYS_LOGGING, new may(), mby.NO_LOGGING, new max());
        this.h = armfVar;
        this.r = lflVar;
        this.i = executor;
        try {
            mbv mbvVar = (mbv) apag.parseFrom(mbv.a, (byte[]) mbj.c.e(), aozs.a());
            alok alokVar = new alok();
            for (mbu mbuVar : mbvVar.b) {
                mbt b2 = mbt.b(mbuVar.b);
                if (b2 == null) {
                    b2 = mbt.LOG_SPEC_UNSPECIFIED;
                }
                alokVar.h(b2, mbuVar);
            }
            alorVar = alokVar.g();
        } catch (Exception e) {
            b.r("Failed to parse logging configuration flag", e);
            alorVar = altc.a;
        }
        this.c = alorVar;
        apwa apwaVar = apwa.DEFAULT;
        abnr c = c(i, apwaVar);
        apwa apwaVar2 = apwa.FAST_IF_RADIO_AWAKE;
        abnr c2 = c(i, apwaVar2);
        apwa apwaVar3 = apwa.UNMETERED_OR_DAILY;
        abnr c3 = c(i, apwaVar3);
        apwa apwaVar4 = apwa.UNMETERED_ONLY;
        this.f = alor.o(apwaVar, c, apwaVar2, c2, apwaVar3, c3, apwaVar4, c(i, apwaVar4));
        this.j = (alor) Collection.EL.stream(alorVar.entrySet()).collect(alls.a(new lvo(12), new lvo(13)));
    }

    private final abnr c(int i, apwa apwaVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                abnm m = abnr.m((Context) this.q.a, "ANDROID_MESSAGING");
                m.c(apwaVar);
                return m.a();
            }
            abnm l = abnr.l((Context) this.q.a, "ANDROID_MESSAGING");
            l.c(apwaVar);
            return l.a();
        }
        abnm abnmVar = new abnm((Context) this.q.a, "ANDROID_MESSAGING");
        abnmVar.c(apwaVar);
        return abnmVar.a();
    }

    public final mar a() {
        mar marVar = new mar(null);
        marVar.a = this;
        return marVar;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v16, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [alhr, java.lang.Object] */
    public final void b(mas masVar) {
        boolean a2;
        akul c;
        alor alorVar = this.c;
        mbt mbtVar = masVar.b;
        if (!alorVar.containsKey(mbtVar)) {
            a2 = ((Boolean) mbj.d.e()).booleanValue();
        } else {
            mbu mbuVar = (mbu) this.c.get(mbtVar);
            alor alorVar2 = this.k;
            mbz mbzVar = mbuVar.c;
            if (mbzVar == null) {
                mbzVar = mbz.a;
            }
            mby b2 = mby.b(mbzVar.b);
            if (b2 == null) {
                b2 = mby.UNKNOWN_SAMPLING_MODE;
            }
            a2 = ((mav) alorVar2.getOrDefault(b2, this.l)).a(mbuVar);
        }
        if (a2) {
            aozy createBuilder = amlf.a.createBuilder();
            mbt mbtVar2 = masVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amlf amlfVar = (amlf) apagVar;
            amlfVar.c = mbtVar2.S;
            amlfVar.b |= 1;
            int i = masVar.f;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amlf amlfVar2 = (amlf) createBuilder.b;
            int i2 = i - 1;
            if (i != 0) {
                amlfVar2.d = i2;
                amlfVar2.b |= 2;
                Optional or = masVar.c.or(new mau(this, masVar, 0));
                if (!or.isEmpty()) {
                    for (String str : (List) or.get()) {
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amlf amlfVar3 = (amlf) createBuilder.b;
                        str.getClass();
                        apax apaxVar = amlfVar3.e;
                        if (!apaxVar.c()) {
                            amlfVar3.e = apag.mutableCopy(apaxVar);
                        }
                        amlfVar3.e.add(str);
                    }
                }
                amfq amfqVar = masVar.a;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amlf amlfVar4 = (amlf) createBuilder.s();
                amfr amfrVar2 = amfr.a;
                amlfVar4.getClass();
                amfrVar.br = amlfVar4;
                amfrVar.g |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                if (this.p) {
                    long incrementAndGet = this.n.incrementAndGet();
                    aozy createBuilder2 = apfl.a.createBuilder();
                    long longValue = this.m.longValue();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apfl apflVar = (apfl) createBuilder2.b;
                    apflVar.b |= 4;
                    apflVar.e = longValue;
                    long longValue2 = incrementAndGet % this.o.longValue();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apfl apflVar2 = (apfl) createBuilder2.b;
                    apflVar2.b |= 8;
                    apflVar2.f = longValue2;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar3 = (amfr) amfqVar.b;
                    apfl apflVar3 = (apfl) createBuilder2.s();
                    apflVar3.getClass();
                    amfrVar3.aP = apflVar3;
                    amfrVar3.f |= 4;
                }
                amfp b3 = amfp.b(((amfr) amfqVar.b).i);
                if (b3 == null) {
                    b3 = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
                }
                amrs amrsVar = (amrs) masVar.e.orElse(amrs.UNKNOWN_BUGLE_EVENT_CODE);
                b3.getClass();
                amrsVar.getClass();
                if (amrsVar == amrs.UNKNOWN_BUGLE_EVENT_CODE) {
                    Object fu = new mbo().fu(b3);
                    if (fu != null) {
                        amrsVar = (amrs) fu;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                kor korVar = this.q;
                Object obj = apwa.DEFAULT;
                if (((nxo) korVar.b.b()).a()) {
                    lfl lflVar = (lfl) this.j.get(masVar.b);
                    if (lflVar != null) {
                        amfp b4 = amfp.b(((amfr) amfqVar.b).i);
                        if (b4 == null) {
                            b4 = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
                        }
                        b4.getClass();
                        if (lflVar.b.containsKey(b4)) {
                            Object obj2 = lflVar.b.get(b4);
                            obj2.getClass();
                            obj = (apwa) obj2;
                        } else if (lflVar.d.containsKey(amrsVar)) {
                            Object obj3 = lflVar.d.get(amrsVar);
                            obj3.getClass();
                            obj = (apwa) obj3;
                        } else {
                            obj = lflVar.c;
                            obj.getClass();
                        }
                    } else {
                        ((alvg) b.j().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl", "dispatch", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "BugleClearcutLoggerV2Impl.java")).t("qosTierResolver for %s is null. Using DEFAULT QoS tier as there's no specific QoS configuration for this log spec.", masVar.b.name());
                    }
                }
                abnr abnrVar = (abnr) this.f.get(obj);
                if (abnrVar != null) {
                    abnq h = abnrVar.h(amfqVar.s(), aglt.b(this.g, new amea()));
                    h.i(amrsVar.dk);
                    if (!abnrVar.e()) {
                        h.g("com.google.android.ims.library");
                    }
                    if (masVar.d.isPresent()) {
                        h.j(((mbh) masVar.d.get()).a, ((mbh) masVar.d.get()).b);
                    }
                    lfl lflVar2 = this.r;
                    amfp b5 = amfp.b(((amfr) amfqVar.b).i);
                    if (b5 == null) {
                        b5 = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
                    }
                    if (((osh) lflVar2.b.b()).a()) {
                        if (((alor) lflVar2.d.get()).containsKey(b5)) {
                            if (TimeUnit.MILLISECONDS.toSeconds(((xnv) lflVar2.a).f().toEpochMilli()) > ((Integer) ((alor) lflVar2.d.get()).get(b5)).intValue()) {
                                return;
                            }
                        }
                        if (((alor) lflVar2.c.get()).containsKey(amrsVar)) {
                            if (TimeUnit.MILLISECONDS.toSeconds(((xnv) lflVar2.a).f().toEpochMilli()) > ((Integer) ((alor) lflVar2.c.get()).get(amrsVar)).intValue()) {
                                return;
                            }
                        }
                    }
                    lru lruVar = (lru) this.h.b();
                    amfr amfrVar4 = (amfr) amfqVar.s();
                    amfrVar4.getClass();
                    c = qjh.c(lruVar.c, arpj.a, arwf.a, new jyw(lruVar, amfrVar4, amrsVar, (arpe) null, 11));
                    qiu.h(c.h(new mhr(this, h, amfqVar, amrsVar, 1), this.i));
                    if (!this.e) {
                        amfr amfrVar5 = (amfr) amfqVar.s();
                        alvw e = a.e();
                        e.X(alwp.a, "BugleClearcutLogger");
                        alvg alvgVar = (alvg) e;
                        alvgVar.X(mdu.d, Integer.valueOf(amfrVar5.getSerializedSize()));
                        alvgVar.X(mdu.c, amfrVar5);
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl", "dispatch", 268, "BugleClearcutLoggerV2Impl.java")).t("\nEVENT %s\nprotobuf", amrsVar);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("clearcutLogger for " + ((apwa) obj).name() + " is null. ");
            }
            throw null;
        }
    }
}
