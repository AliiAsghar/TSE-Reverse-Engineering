package defpackage;

import android.content.res.Resources;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agoq implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ agoq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [ahtx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, akye] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, java.util.function.Function] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        aovv aovvVar;
        Integer num;
        Integer num2;
        Map map;
        Object apply;
        Object apply2;
        Object apply3;
        boolean z = true;
        int i = 17;
        int i2 = 0;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                String str = (String) obj;
                if (((agoz) this.a).L()) {
                    return agnc.k(str);
                }
                return str;
            case 1:
                String str2 = (String) obj;
                ThreadLocal threadLocal = agoz.a;
                if (((akkw) this.a).b) {
                    return a.bW(str2, "group_concat(quote(", "), '|')");
                }
                return str2;
            case 2:
                return ((Resources) this.a).getString(((Integer) obj).intValue());
            case 3:
                aovx aovxVar = (aovx) obj;
                switch (aovxVar.b) {
                    case 0:
                        obj2 = aovw.FUEL_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        obj2 = aovw.DIESEL;
                        break;
                    case 2:
                        obj2 = aovw.REGULAR_UNLEADED;
                        break;
                    case 3:
                        obj2 = aovw.MIDGRADE;
                        break;
                    case 4:
                        obj2 = aovw.PREMIUM;
                        break;
                    case 5:
                        obj2 = aovw.SP91;
                        break;
                    case 6:
                        obj2 = aovw.SP91_E10;
                        break;
                    case 7:
                        obj2 = aovw.SP92;
                        break;
                    case 8:
                        obj2 = aovw.SP95;
                        break;
                    case 9:
                        obj2 = aovw.SP95_E10;
                        break;
                    case 10:
                        obj2 = aovw.SP98;
                        break;
                    case 11:
                        obj2 = aovw.SP99;
                        break;
                    case 12:
                        obj2 = aovw.SP100;
                        break;
                    case 13:
                        obj2 = aovw.LPG;
                        break;
                    case 14:
                        obj2 = aovw.E80;
                        break;
                    case 15:
                        obj2 = aovw.E85;
                        break;
                    case 16:
                        obj2 = aovw.METHANE;
                        break;
                    case 17:
                        obj2 = aovw.BIO_DIESEL;
                        break;
                    case 18:
                        obj2 = aovw.TRUCK_DIESEL;
                        break;
                }
                if (obj2 == null) {
                    obj2 = aovw.UNRECOGNIZED;
                }
                aiag aiagVar = (aiag) ((alor) ((adef) this.a).e).getOrDefault(obj2, aiag.FUEL_TYPE_UNSPECIFIED);
                apuq apuqVar = aovxVar.c;
                if (apuqVar == null) {
                    apuqVar = apuq.a;
                }
                String str3 = apuqVar.b;
                long j = apuqVar.c;
                Long valueOf = Long.valueOf(j);
                int i3 = apuqVar.d;
                Integer valueOf2 = Integer.valueOf(i3);
                if (str3 != null) {
                    valueOf.getClass();
                    if (j > 0) {
                        valueOf2.getClass();
                        if (i3 < 0) {
                            z = false;
                        }
                        albo.N(z, "Unit is positive and nano must be positive or zero, but was: %s.", valueOf2);
                    } else if (j < 0) {
                        valueOf2.getClass();
                        if (i3 > 0) {
                            z = false;
                        }
                        albo.N(z, "Unit is negative and nano must be negative or zero, but was: %s.", valueOf2);
                    }
                    ahzk ahzkVar = new ahzk(str3, valueOf, valueOf2);
                    apct apctVar = aovxVar.d;
                    if (apctVar == null) {
                        apctVar = apct.a;
                    }
                    Instant i4 = adef.i(apctVar);
                    if (aiagVar != null) {
                        if (i4 != null) {
                            return new ahzg(aiagVar, ahzkVar, i4);
                        }
                        throw new NullPointerException("Null updateTime");
                    }
                    throw new NullPointerException("Null type");
                }
                throw new NullPointerException("Null currencyCode");
            case 4:
                aovt aovtVar = (aovt) obj;
                switch (aovtVar.c) {
                    case 0:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_OTHER;
                        break;
                    case 2:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_J1772;
                        break;
                    case 3:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_TYPE_2;
                        break;
                    case 4:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_CHADEMO;
                        break;
                    case 5:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                        break;
                    case 6:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                        break;
                    case 7:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_TESLA;
                        break;
                    case 8:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                        break;
                    case 9:
                        aovvVar = aovv.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                        break;
                    default:
                        aovvVar = null;
                        break;
                }
                if (aovvVar == null) {
                    aovvVar = aovv.UNRECOGNIZED;
                }
                aiae aiaeVar = (aiae) ((alor) ((adef) this.a).b).getOrDefault(aovvVar, aiae.EV_CONNECTOR_TYPE_UNSPECIFIED);
                Double valueOf3 = Double.valueOf(aovtVar.d);
                Integer valueOf4 = Integer.valueOf(aovtVar.e);
                if (aiaeVar != null) {
                    if ((aovtVar.b & 1) != 0) {
                        num = Integer.valueOf(aovtVar.f);
                    } else {
                        num = null;
                    }
                    if ((aovtVar.b & 2) != 0) {
                        num2 = Integer.valueOf(aovtVar.g);
                    } else {
                        num2 = null;
                    }
                    if ((aovtVar.b & 4) != 0) {
                        apct apctVar2 = aovtVar.h;
                        if (apctVar2 == null) {
                            apctVar2 = apct.a;
                        }
                        obj2 = adef.i(apctVar2);
                    }
                    return new ahzd(aiaeVar, valueOf3, valueOf4, num, num2, obj2);
                }
                throw new NullPointerException("Null type");
            case 5:
                return this.a.d((String) obj);
            case 6:
                return ((aifm) this.a).a((InputStream) obj);
            case 7:
                return ((aifm) this.a).b((OutputStream) obj);
            case 8:
                return ((aifn) this.a).b((OutputStream) obj);
            case 9:
                return ((aifn) this.a).a((InputStream) obj);
            case 10:
                return aihq.d((Optional) this.a, (aihx) obj);
            case 11:
                Object obj3 = this.a;
                aihw aihwVar = (aihw) obj3;
                return new aihq(aihwVar.i, alog.r((aihx) obj), new aihr(obj3, i2), new aiht(obj3, i2), aihw.b, (ahlp) aihwVar.l.orElse(new ahlp((char[]) null)), aihwVar.j, aihwVar.k);
            case 12:
                return (atmx) ((Class) this.a).cast((atmx) obj);
            case 13:
                String str4 = (String) obj;
                Object obj4 = this.a;
                Map map2 = algg.a;
                str4.getClass();
                synchronized (algg.a) {
                    map = (Map) algg.a.get(obj4);
                    if (map == null) {
                        map = new HashMap();
                        Iterator it = EnumSet.allOf((Class) obj4).iterator();
                        while (it.hasNext()) {
                            Enum r4 = (Enum) it.next();
                            map.put(r4.name(), new WeakReference(r4));
                        }
                        algg.a.put(obj4, map);
                    }
                }
                WeakReference weakReference = (WeakReference) map.get(str4);
                if (weakReference == null) {
                    return alfd.a;
                }
                return algw.h((Enum) ((Class) obj4).cast(weakReference.get()));
            case 14:
                return (ajqo) ((algf) this.a).fu((wbp) obj);
            case 15:
                return (ajqo) ((algf) this.a).fu((wbp) obj);
            case 16:
                apply = this.a.apply(obj);
                return ((Optional) apply).map(new akyg(3)).map(new akya(i));
            case 17:
                apply2 = this.a.apply(obj);
                return ((Optional) apply2).map(new akyg(5)).map(new akya(i));
            case 18:
                return Optional.ofNullable(obj).map(new agoq(this.a, 19));
            case 19:
                return aohs.g(this.a.a(obj));
            default:
                apply3 = this.a.apply(obj);
                return ((Optional) apply3).map(new akya(i));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
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
