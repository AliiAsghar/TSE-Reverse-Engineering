package defpackage;

import android.text.TextUtils;
import android.util.LruCache;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class prq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever");
    public static final uuf b = uuh.m(uuh.b, "rbm_business_info_retrieval_version_parameter", "1.5");
    public static final uuf c = uuh.e(uuh.b, "rbm_business_info_retrieval_short_code_http_timeout_millis", 5000);
    public static final uuf d = uuh.i(uuh.b, "rbm_business_info_retrieval_enable_short_code_http_timeout", true);
    public static final Duration e = Duration.ofDays(7);
    public final pru f;
    public final prb g;
    public final aneo h;
    public final anen i;
    public final xnv j;
    public final oqn k;
    public final LruCache l;
    public final aplg m;
    public volatile boolean n;
    private final anen o;

    public prq(pru pruVar, prb prbVar, aneo aneoVar, anen anenVar, anen anenVar2, xnv xnvVar, LruCache lruCache, oqn oqnVar, aplg aplgVar) {
        this.f = pruVar;
        this.g = prbVar;
        this.h = aneoVar;
        this.o = anenVar;
        this.i = anenVar2;
        this.j = xnvVar;
        this.l = lruCache;
        this.k = oqnVar;
        this.m = aplgVar;
    }

    public static alog b(String str) {
        Object obj;
        int ordinal;
        tdt a2 = tdv.a();
        Object obj2 = tdv.c.f;
        agmh agmhVar = (agmh) obj2;
        if (agmhVar.c() != null) {
            boolean equals = agmhVar.e().equals(a2.a.a());
            agmh c2 = agmhVar.c();
            if (!equals) {
                boolean equals2 = c2.e().equals(a2.a.a());
                obj = c2;
                if (!equals2) {
                    throw new IllegalArgumentException("joining column to unrelated table");
                }
            } else {
                obj = obj2;
                obj2 = c2;
            }
            agmh agmhVar2 = (agmh) obj2;
            agoz a3 = agmhVar2.a();
            a2.a.c().h(new agoa(a3, agmhVar2, (agmh) obj, "=", null, 4, true, a3.k));
            tdu tduVar = new tdu();
            qku qkuVar = qku.PROPERTY_X_GOOGLE_SHORT_CODE;
            if (qkuVar == null) {
                ordinal = 0;
            } else {
                ordinal = qkuVar.ordinal();
            }
            tduVar.U(new agoi("rbm_business_info_properties.type", 1, Integer.valueOf(ordinal)));
            tduVar.U(new agmd("rbm_business_info_properties.property_value", 1, String.valueOf(str)));
            a2.k(new agpw(tduVar));
            a2.w("getBusinessInfoDataSync-rbm_business_info_properties_by_short_code");
            Stream map = Collection.EL.stream(a2.b().t()).map(new prj(4));
            int i = alog.d;
            return (alog) map.collect(alls.a);
        }
        throw new IllegalArgumentException(a.bX(obj2, "column ", " is not a foreign key"));
    }

    public final akul a(String str, boolean z) {
        pro proVar;
        if (TextUtils.isEmpty(str)) {
            return aktp.af(new prr("Retrieval requested for invalid bot ID", 2));
        }
        if (((Objects.equals(b.e(), "2") && this.k.a()) || this.f.b(str)) && (proVar = (pro) this.l.get(str)) != null) {
            if (proVar.c > this.j.f().toEpochMilli()) {
                return aktp.ag(proVar);
            }
            this.l.remove(str);
        }
        return aktp.ai(new mig(str, 11), this.i).i(new prn(this, z, str, 0), this.i).h(new mmq(this, str, 10), this.o);
    }
}
