package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xsk implements algk {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ xsk(aieo aieoVar, long j, List list, alej alejVar, Consumer consumer, int i) {
        this.f = i;
        this.d = aieoVar;
        this.a = j;
        this.b = list;
        this.e = alejVar;
        this.c = consumer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, unx] */
    /* JADX WARN: Type inference failed for: r8v0, types: [xoj, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z;
        boolean z2;
        alej alejVar;
        int i = this.f;
        if (i != 0) {
            boolean z3 = true;
            if (i != 1) {
                aieo aieoVar = (aieo) this.d;
                if (aieoVar.b.b.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                d.t(z, "must be one customer");
                if (((aldz) aieoVar.b.b.get(0)).c.size() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                d.t(z2, "must be one project");
                this.c.q(1L);
                d.t(Collection.EL.stream(this.b).allMatch(new adru(10)), "event vectors can't contain negative event codes");
                Stream stream = Collection.EL.stream(((alep) ((aldz) aieoVar.b.b.get(0)).c.get(0)).c);
                long j = this.a;
                Optional findFirst = stream.filter(new aien(j, 0)).findFirst();
                albo.M(findFirst.isPresent(), "failed to find metric with ID: %s", j);
                int i2 = ((alek) findFirst.get()).c;
                if (i2 != 0) {
                    switch (i2) {
                        case 8:
                            alejVar = alej.OCCURRENCE;
                            break;
                        case 9:
                            alejVar = alej.INTEGER;
                            break;
                        case 10:
                            alejVar = alej.INTEGER_HISTOGRAM;
                            break;
                        case 11:
                            alejVar = alej.STRING;
                            break;
                        default:
                            alejVar = null;
                            break;
                    }
                } else {
                    alejVar = alej.UNSET;
                }
                if (alejVar == null) {
                    alejVar = alej.UNRECOGNIZED;
                }
                Object obj2 = this.e;
                if (alejVar != obj2) {
                    z3 = false;
                }
                albo.Q(z3, "wrong metric type, input type is %s, found %s", obj2, alejVar);
                return (alek) findFirst.get();
            }
            upm upmVar = (upm) obj;
            xyo d = urr.a.d();
            d.H("handler execution");
            ?? r2 = this.c;
            alog alogVar = (alog) r2;
            d.x("trancheId", urr.c(alogVar));
            ?? r5 = this.e;
            d.z("handlerName", r5.r());
            d.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ((upr) alogVar.get(0)).p());
            urr urrVar = (urr) this.b;
            d.y("duration", urrVar.i.f().toEpochMilli() - this.a);
            d.x("attemptCount", ((urq) this.d).b.b);
            d.x("maxAttempts", r5.a().e);
            d.q();
            uot uotVar = urrVar.h;
            synchronized (uotVar.d) {
                uotVar.e.add(new uos(uotVar.b.f().toEpochMilli(), 7, new uor(uotVar, r5, (Long[]) Collection.EL.stream(r2).map(new unt(3)).toArray(new mlo(10)), upmVar)));
            }
            return upmVar;
        }
        final apus apusVar = (apus) obj;
        final long j2 = this.a;
        Object obj3 = this.c;
        final xtf xtfVar = ((xsl) this.b).c;
        final String str = (String) obj3;
        return aktp.ai(new Callable() { // from class: xtd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                apvk apvkVar = new apvk();
                apvkVar.a = xoo.c().b;
                apvl apvlVar = new apvl(apvkVar);
                xtf xtfVar2 = xtf.this;
                boolean a = ((ogb) xtfVar2.f.b()).a();
                String str2 = str;
                apus apusVar2 = apusVar;
                if (a) {
                    if (xtfVar2.a(apusVar2) <= j2) {
                        return xtfVar2.e.a(str2, apusVar2, apvlVar);
                    }
                }
                return xtfVar2.d.a(str2, apusVar2, apvlVar);
            }
        }, xtfVar.b).h(new wua(xtfVar, (pzn) this.d, apusVar, (xoj) this.e, 7), xtfVar.a);
    }

    public /* synthetic */ xsk(urr urrVar, alog alogVar, unx unxVar, long j, uns unsVar, int i) {
        this.f = i;
        this.b = urrVar;
        this.c = alogVar;
        this.e = unxVar;
        this.a = j;
        this.d = unsVar;
    }

    public /* synthetic */ xsk(xsl xslVar, String str, pzn pznVar, xoj xojVar, long j, int i) {
        this.f = i;
        this.b = xslVar;
        this.c = str;
        this.d = pznVar;
        this.e = xojVar;
        this.a = j;
    }
}
