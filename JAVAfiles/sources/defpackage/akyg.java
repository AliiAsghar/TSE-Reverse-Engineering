package defpackage;

import j$.time.Duration;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akyg implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ akyg(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        alqs alqsVar;
        almp almpVar;
        almp almpVar2;
        switch (this.a) {
            case 0:
                return ((Duration) obj).toString();
            case 1:
                return ((Enum) obj).toString();
            case 2:
                return ((LocalDate) obj).toString();
            case 3:
                return ((ZoneId) obj).toString();
            case 4:
                return aohs.g((apcr) obj);
            case 5:
                return ((LocalTime) obj).toString();
            case 6:
                return ((Period) obj).toString();
            case 7:
                return (String) ((Map.Entry) obj).getKey();
            case 8:
                return (List) Collection.EL.stream((List) ((Map.Entry) obj).getValue()).filter(new adru(16)).map(new akyg(9)).collect(albo.l());
            case 9:
                albi albiVar = ((albc) obj).c;
                if (albiVar == null) {
                    return albi.a;
                }
                return albiVar;
            case 10:
                return (alay) ((Optional) obj).get();
            case 11:
                return DesugarCollections.unmodifiableList((List) obj);
            case 12:
                return DesugarCollections.unmodifiableMap((Map) obj);
            case 13:
                return ((akzb) obj).a();
            case 14:
                atii atiiVar = akzd.a;
                throw null;
            case 15:
                return ((akzc) obj).a;
            case 16:
                return ((akzc) obj).b;
            case 17:
                return ((akzc) obj).c;
            case 18:
                return ((akzc) obj).d;
            case 19:
                ahlp ahlpVar = (ahlp) obj;
                alob alobVar = new alob(ahlpVar.a.size());
                Collections.sort(ahlpVar.a, alss.a);
                Iterator it = ahlpVar.a.iterator();
                if (it instanceof alqs) {
                    alqsVar = (alqs) it;
                } else {
                    alqsVar = new alqs(it);
                }
                while (alqsVar.hasNext()) {
                    alst alstVar = (alst) alqsVar.next();
                    while (alqsVar.hasNext()) {
                        if (!alqsVar.b) {
                            alqsVar.c = alqsVar.a.next();
                            alqsVar.b = true;
                        }
                        alst alstVar2 = (alst) alqsVar.c;
                        if (alstVar.h(alstVar2)) {
                            albo.Q(alstVar.f(alstVar2).i(), "Overlapping ranges not permitted but found %s overlapping %s", alstVar, alstVar2);
                            alst alstVar3 = (alst) alqsVar.next();
                            int compareTo = alstVar.b.compareTo(alstVar3.b);
                            int compareTo2 = alstVar.c.compareTo(alstVar3.c);
                            if (compareTo > 0 || compareTo2 < 0) {
                                if (compareTo < 0 || compareTo2 > 0) {
                                    if (compareTo <= 0) {
                                        almpVar = alstVar.b;
                                    } else {
                                        almpVar = alstVar3.b;
                                    }
                                    if (compareTo2 >= 0) {
                                        almpVar2 = alstVar.c;
                                    } else {
                                        almpVar2 = alstVar3.c;
                                    }
                                    alstVar3 = new alst(almpVar, almpVar2);
                                }
                                alstVar = alstVar3;
                            }
                        }
                    }
                    alobVar.h(alstVar);
                }
                alog g = alobVar.g();
                if (g.isEmpty()) {
                    return alpq.a;
                }
                if (((alsx) g).c == 1 && ((alst) alzz.aP(g)).equals(alst.a)) {
                    return alpq.b;
                }
                return new alpq(g);
            default:
                return ((alob) obj).g();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
