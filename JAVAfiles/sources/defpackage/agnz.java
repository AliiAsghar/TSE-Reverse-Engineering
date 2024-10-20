package defpackage;

import android.util.Pair;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agnz implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ agnz(int i) {
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

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String str;
        int i = 0;
        switch (this.a) {
            case 0:
                String str2 = (String) obj;
                if (str2.startsWith("group_concat(quote(")) {
                    String substring = str2.substring(19);
                    return substring.substring(0, substring.indexOf("), '|')"));
                }
                return str2;
            case 1:
                Object obj2 = agnc.a;
                return String.format(Locale.US, "length(CAST(%s AS BLOB))", (String) obj);
            case 2:
                return (String) obj;
            case 3:
                return (String) obj;
            case 4:
                return new ArrayList();
            case 5:
                ThreadLocal threadLocal = agoz.a;
                return (agmc) ((Pair) obj).first;
            case 6:
                return ((agmh) obj).toString();
            case 7:
                return aglo.w((String) obj);
            case 8:
                aovr aovrVar = (aovr) obj;
                return adef.j(adef.h(aovrVar.c), aovrVar.b);
            case 9:
                aowg aowgVar = (aowg) obj;
                return adef.j(adef.h(aowgVar.c), aowgVar.b);
            case 10:
                return Collection.EL.stream((List) obj);
            case 11:
                java.util.Collection collection = (java.util.Collection) obj;
                d.t(!collection.isEmpty(), "There must be at least one AggregateData");
                aicv aicvVar = (aicv) collection.iterator().next();
                alex alexVar = aicvVar.c;
                Stream map = Collection.EL.stream(collection).peek(new aidg(aicvVar, i)).sorted(Comparator.CC.comparingInt(new kmb(11))).map(new agnz(12));
                int i2 = alog.d;
                alog alogVar = (alog) map.collect(alls.a);
                d.t(!alogVar.isEmpty(), "There must be at least one event record");
                return new aidh(alexVar, alogVar);
            case 12:
                aicv aicvVar2 = (aicv) obj;
                Optional.empty();
                aidj a = aidj.a(aicvVar2.a.a);
                Optional optional = aicvVar2.f;
                if (optional != null) {
                    return new aidi(a, optional);
                }
                throw new NullPointerException("Null aggregateValue");
            case 13:
                return ((Integer) obj).toString();
            case 14:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 15:
                return Collection.EL.stream(((aidk) obj).b);
            case 16:
                try {
                    aocy aocyVar = (aocy) apag.parseFrom(aocy.a, (aozb) obj);
                    int i3 = aocyVar.b;
                    int Y = a.Y(i3);
                    if (Y == 0) {
                        Y = 1;
                    }
                    if (Y - 1 != 3) {
                        int Y2 = a.Y(i3);
                        if (Y2 != 0 && Y2 != 1) {
                            if (Y2 != 2) {
                                if (Y2 != 3) {
                                    str = "VERSION_3";
                                } else {
                                    str = "VERSION_2";
                                }
                            } else {
                                str = "VERSION_1";
                            }
                        } else {
                            str = "UNKNOWN";
                        }
                        throw new IllegalArgumentException("Unsupported token format version: ".concat(str));
                    }
                    byte[] H = aocyVar.c.H();
                    while (i < H.length) {
                        H[i] = (byte) (H[i] ^ 7);
                        i++;
                    }
                    try {
                        aocx aocxVar = (aocx) apag.parseFrom(aocx.a, H);
                        aozy createBuilder = aoct.a.createBuilder();
                        List b = aode.b(aocxVar.b);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aoct aoctVar = (aoct) createBuilder.b;
                        apao apaoVar = aoctVar.b;
                        if (!apaoVar.c()) {
                            aoctVar.b = apag.mutableCopy(apaoVar);
                        }
                        aoyj.addAll(b, aoctVar.b);
                        List b2 = aode.b(aocxVar.c);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aoct aoctVar2 = (aoct) createBuilder.b;
                        apao apaoVar2 = aoctVar2.c;
                        if (!apaoVar2.c()) {
                            aoctVar2.c = apag.mutableCopy(apaoVar2);
                        }
                        aoyj.addAll(b2, aoctVar2.c);
                        List b3 = aode.b(aocxVar.d);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aoct aoctVar3 = (aoct) createBuilder.b;
                        apao apaoVar3 = aoctVar3.d;
                        if (!apaoVar3.c()) {
                            aoctVar3.d = apag.mutableCopy(apaoVar3);
                        }
                        aoyj.addAll(b3, aoctVar3.d);
                        List b4 = aode.b(aocxVar.e);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        aoct aoctVar4 = (aoct) createBuilder.b;
                        apao apaoVar4 = aoctVar4.e;
                        if (!apaoVar4.c()) {
                            aoctVar4.e = apag.mutableCopy(apaoVar4);
                        }
                        aoyj.addAll(b4, aoctVar4.e);
                        return (aoct) createBuilder.s();
                    } catch (apba e) {
                        throw new IllegalArgumentException("Unable to decode the v2 device experiment token", e);
                    }
                } catch (apba e2) {
                    throw new IllegalArgumentException("Unable to parse the given token.", e2);
                }
            case 17:
                aoct aoctVar5 = (aoct) obj;
                return Stream.CC.of((Object[]) new Stream[]{Collection.EL.stream(aoctVar5.d), Collection.EL.stream(aoctVar5.b), Collection.EL.stream(aoctVar5.e), Collection.EL.stream(aoctVar5.c)});
            case 18:
                return Long.valueOf(((Integer) obj).intValue());
            case 19:
                return (alem) ((aozy) obj).s();
            default:
                return Long.valueOf(((aidm) obj).a);
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
