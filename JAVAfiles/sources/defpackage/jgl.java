package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jgl implements BiFunction {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jgl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return BiFunction$CC.$default$andThen(this, function);
                            }
                            return BiFunction$CC.$default$andThen(this, function);
                        }
                        return BiFunction$CC.$default$andThen(this, function);
                    }
                    return BiFunction$CC.$default$andThen(this, function);
                }
                return BiFunction$CC.$default$andThen(this, function);
            }
            return BiFunction$CC.$default$andThen(this, function);
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.function.BiFunction, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        long j;
        Object apply;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                Long l = (Long) obj;
                                Optional optional = (Optional) obj2;
                                alvi alviVar = aidd.a;
                                if (!optional.isEmpty() && !((agxw) optional.get()).h()) {
                                    aieg g = ((agxw) optional.get()).g();
                                    if (g.b == 1) {
                                        j = ((Long) g.c).longValue();
                                    } else {
                                        j = 0;
                                    }
                                    ?? r6 = this.a;
                                    Long valueOf = Long.valueOf(j);
                                    apply = r6.apply(l, valueOf);
                                    Long l2 = (Long) apply;
                                    if (l2.equals(valueOf)) {
                                        return Optional.empty();
                                    }
                                    return Optional.of(agxw.i(l2.longValue()));
                                }
                                return Optional.of(agxw.i(l.longValue()));
                            }
                            return ((uuv) this.a).d((aqfn) obj);
                        }
                        Integer num = (Integer) obj;
                        ((AtomicInteger) this.a).set(num.intValue());
                        return Integer.valueOf(Math.max(num.intValue(), ((Integer) obj2).intValue()));
                    }
                    MessageCoreData messageCoreData = (MessageCoreData) obj;
                    mkz mkzVar = (mkz) obj2;
                    messageCoreData.bo(mkzVar.g);
                    sya J = messageCoreData.J();
                    J.aj("MessageStatusControllerImpl#failOrExpireSentMessage");
                    mkzVar.b.ifPresent(new mht(J, 18));
                    mkzVar.l.ifPresent(new mht(J, 19));
                    mlb.d(J, mkzVar);
                    boolean z = mkzVar.m;
                    Object obj3 = this.a;
                    if (z) {
                        ((mlb) obj3).b(messageCoreData, mkzVar.h);
                    }
                    return Boolean.valueOf(((mlb) obj3).h(messageCoreData, J));
                }
                MessageCoreData messageCoreData2 = (MessageCoreData) obj;
                mkz mkzVar2 = (mkz) obj2;
                Optional optional2 = mkzVar2.c;
                messageCoreData2.getClass();
                optional2.ifPresent(new mht(messageCoreData2, 12));
                mkzVar2.d.ifPresent(new mht(messageCoreData2, 13));
                mkzVar2.e.ifPresent(new mht(messageCoreData2, 14));
                messageCoreData2.bo(mkzVar2.g);
                mkzVar2.j.ifPresent(new mht(messageCoreData2, 15));
                messageCoreData2.bI(mkzVar2.i);
                mkzVar2.f.ifPresent(new mht(messageCoreData2, 16));
                sya J2 = messageCoreData2.J();
                J2.aj("MessageStatusControllerImpl#failSendingMessage");
                mkzVar2.f.ifPresent(new mht(J2, 17));
                mlb.d(J2, mkzVar2);
                mlb mlbVar = (mlb) this.a;
                boolean h = mlbVar.h(messageCoreData2, J2);
                if (mkzVar2.m) {
                    mlbVar.c(messageCoreData2, mkzVar2);
                }
                return Boolean.valueOf(h);
            }
            return this.a.a(obj, obj2);
        }
        return this.a.a(obj, obj2);
    }
}
