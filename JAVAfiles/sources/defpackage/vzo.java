package defpackage;

import io.grpc.Status;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzo implements Function {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public vzo(int i) {
        this.b = i;
    }

    public static final wbg a(qec qecVar) {
        aozy createBuilder = wbg.a.createBuilder();
        aozy createBuilder2 = aoyo.a.createBuilder();
        aozb aozbVar = qecVar.e;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aoyo aoyoVar = (aoyo) createBuilder2.b;
        aozbVar.getClass();
        aoyoVar.b = aozbVar;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbg wbgVar = (wbg) createBuilder.b;
        aoyo aoyoVar2 = (aoyo) createBuilder2.s();
        aoyoVar2.getClass();
        wbgVar.c = aoyoVar2;
        wbgVar.b |= 1;
        qfb qfbVar = qecVar.c;
        if (qfbVar == null) {
            qfbVar = qfb.a;
        }
        qei qeiVar = qfbVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        qfb qfbVar2 = qecVar.c;
        if (qfbVar2 == null) {
            qfbVar2 = qfb.a;
        }
        wbk c = wam.c(qeiVar, qfbVar2.c);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbg wbgVar2 = (wbg) createBuilder.b;
        c.getClass();
        wbgVar2.d = c;
        wbgVar2.b |= 4;
        Stream map = Collection.EL.stream(qecVar.d).map(new vvi(9));
        int i = alog.d;
        Iterable iterable = (Iterable) map.collect(alls.a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbg wbgVar3 = (wbg) createBuilder.b;
        apax apaxVar = wbgVar3.e;
        if (!apaxVar.c()) {
            wbgVar3.e = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, wbgVar3.e);
        return (wbg) createBuilder.s();
    }

    public static final qed b(wbe wbeVar) {
        aozy createBuilder = qed.a.createBuilder();
        wcq wcqVar = wbeVar.d;
        if (wcqVar == null) {
            wcqVar = wcq.a;
        }
        qeg d = wam.d(wcqVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qed qedVar = (qed) createBuilder.b;
        d.getClass();
        qedVar.c = d;
        qedVar.b |= 1;
        if ((wbeVar.b & 1) != 0) {
            aoyo aoyoVar = wbeVar.c;
            if (aoyoVar == null) {
                aoyoVar = aoyo.a;
            }
            aozb aozbVar = aoyoVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qed qedVar2 = (qed) createBuilder.b;
            aozbVar.getClass();
            qedVar2.b |= 2;
            qedVar2.d = aozbVar;
        }
        return (qed) createBuilder.s();
    }

    public static final wbn c(qen qenVar) {
        aozy createBuilder = wbn.a.createBuilder();
        aozy createBuilder2 = aoyo.a.createBuilder();
        aozb aozbVar = qenVar.h;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aoyo aoyoVar = (aoyo) createBuilder2.b;
        aozbVar.getClass();
        aoyoVar.b = aozbVar;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbn wbnVar = (wbn) createBuilder.b;
        aoyo aoyoVar2 = (aoyo) createBuilder2.s();
        aoyoVar2.getClass();
        wbnVar.c = aoyoVar2;
        wbnVar.b |= 1;
        int i = qenVar.b;
        aozy createBuilder3 = wcy.a.createBuilder();
        String str = qenVar.c;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        wcy wcyVar = (wcy) createBuilder3.b;
        str.getClass();
        wcyVar.b |= 1;
        wcyVar.c = str;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbn wbnVar2 = (wbn) createBuilder.b;
        wcy wcyVar2 = (wcy) createBuilder3.s();
        wcyVar2.getClass();
        wbnVar2.d = wcyVar2;
        wbnVar2.b |= 4;
        if ((qenVar.b & 2) != 0) {
            String str2 = qenVar.d;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbn wbnVar3 = (wbn) createBuilder.b;
            str2.getClass();
            wbnVar3.b |= 8;
            wbnVar3.e = str2;
        }
        Stream map = Collection.EL.stream(qenVar.g).map(new vvi(13));
        int i2 = alog.d;
        Iterable iterable = (Iterable) map.collect(alls.a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbn wbnVar4 = (wbn) createBuilder.b;
        apax apaxVar = wbnVar4.f;
        if (!apaxVar.c()) {
            wbnVar4.f = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, wbnVar4.f);
        return (wbn) createBuilder.s();
    }

    public static final qeo d(wbl wblVar) {
        aozy createBuilder = qeo.a.createBuilder();
        wcq wcqVar = wblVar.d;
        if (wcqVar == null) {
            wcqVar = wcq.a;
        }
        qeg d = wam.d(wcqVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeo qeoVar = (qeo) createBuilder.b;
        d.getClass();
        qeoVar.c = d;
        qeoVar.b |= 1;
        wbk wbkVar = wblVar.e;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wbk wbkVar2 = wblVar.e;
        if (wbkVar2 == null) {
            wbkVar2 = wbk.a;
        }
        wcz wczVar = wbkVar2.d;
        if (wczVar == null) {
            wczVar = wcz.a;
        }
        qei a2 = wam.a(wbkVar, wczVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeo qeoVar2 = (qeo) createBuilder.b;
        a2.getClass();
        qeoVar2.d = a2;
        qeoVar2.b |= 2;
        if ((wblVar.b & 1) != 0) {
            aoyo aoyoVar = wblVar.c;
            if (aoyoVar == null) {
                aoyoVar = aoyo.a;
            }
            aozb aozbVar = aoyoVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeo qeoVar3 = (qeo) createBuilder.b;
            aozbVar.getClass();
            qeoVar3.b |= 4;
            qeoVar3.e = aozbVar;
        }
        amxo amxoVar = amxo.RCS_SMAPI;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeo qeoVar4 = (qeo) createBuilder.b;
        qeoVar4.f = amxoVar.h;
        qeoVar4.b |= 8;
        return (qeo) createBuilder.s();
    }

    public static final wcu e(qeg qegVar) {
        aozy createBuilder = wcu.a.createBuilder();
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3 || ordinal == 4) {
                        wdf wdfVar = wdf.RESPONSE_STATUS_FAILED;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        wcu wcuVar = (wcu) createBuilder.b;
                        wcuVar.c = wdfVar.d;
                        wcuVar.b |= 1;
                    }
                }
            } else {
                wdf wdfVar2 = wdf.RESPONSE_STATUS_OK;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wcu wcuVar2 = (wcu) createBuilder.b;
                wcuVar2.c = wdfVar2.d;
                wcuVar2.b |= 1;
            }
            return (wcu) createBuilder.s();
        }
        wdf wdfVar3 = wdf.RESPONSE_STATUS_UNKNOWN;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wcu wcuVar3 = (wcu) createBuilder.b;
        wcuVar3.c = wdfVar3.d;
        wcuVar3.b |= 1;
        return (wcu) createBuilder.s();
    }

    public static final wcw f(qeg qegVar) {
        aozy createBuilder = wcw.a.createBuilder();
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3 || ordinal == 4) {
                        wdf wdfVar = wdf.RESPONSE_STATUS_FAILED;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        wcw wcwVar = (wcw) createBuilder.b;
                        wcwVar.c = wdfVar.d;
                        wcwVar.b |= 1;
                    }
                }
            } else {
                wdf wdfVar2 = wdf.RESPONSE_STATUS_OK;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wcw wcwVar2 = (wcw) createBuilder.b;
                wcwVar2.c = wdfVar2.d;
                wcwVar2.b |= 1;
            }
            return (wcw) createBuilder.s();
        }
        wdf wdfVar3 = wdf.RESPONSE_STATUS_UNKNOWN;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wcw wcwVar3 = (wcw) createBuilder.b;
        wcwVar3.c = wdfVar3.d;
        wcwVar3.b |= 1;
        return (wcw) createBuilder.s();
    }

    public static final wdd g(qfy qfyVar) {
        aozy createBuilder = wdd.a.createBuilder();
        aozy createBuilder2 = aoyo.a.createBuilder();
        aozb aozbVar = qfyVar.e;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aoyo aoyoVar = (aoyo) createBuilder2.b;
        aozbVar.getClass();
        aoyoVar.b = aozbVar;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wdd wddVar = (wdd) createBuilder.b;
        aoyo aoyoVar2 = (aoyo) createBuilder2.s();
        aoyoVar2.getClass();
        wddVar.c = aoyoVar2;
        wddVar.b |= 1;
        int i = qfyVar.b;
        qfb qfbVar = qfyVar.c;
        if (qfbVar == null) {
            qfbVar = qfb.a;
        }
        qei qeiVar = qfbVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        qfb qfbVar2 = qfyVar.c;
        if (qfbVar2 == null) {
            qfbVar2 = qfb.a;
        }
        wbk c = wam.c(qeiVar, qfbVar2.c);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wdd wddVar2 = (wdd) createBuilder.b;
        c.getClass();
        wddVar2.d = c;
        wddVar2.b |= 4;
        Stream map = Collection.EL.stream(qfyVar.d).map(new vvi(14));
        int i2 = alog.d;
        Iterable iterable = (Iterable) map.collect(alls.a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wdd wddVar3 = (wdd) createBuilder.b;
        apax apaxVar = wddVar3.e;
        if (!apaxVar.c()) {
            wddVar3.e = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, wddVar3.e);
        return (wdd) createBuilder.s();
    }

    public static final qfz h(wdb wdbVar) {
        aozy createBuilder = qfz.a.createBuilder();
        wcq wcqVar = wdbVar.d;
        if (wcqVar == null) {
            wcqVar = wcq.a;
        }
        qeg d = wam.d(wcqVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfz qfzVar = (qfz) createBuilder.b;
        d.getClass();
        qfzVar.c = d;
        qfzVar.b |= 1;
        if ((wdbVar.b & 1) != 0) {
            aoyo aoyoVar = wdbVar.c;
            if (aoyoVar == null) {
                aoyoVar = aoyo.a;
            }
            aozb aozbVar = aoyoVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qfz qfzVar2 = (qfz) createBuilder.b;
            aozbVar.getClass();
            qfzVar2.b |= 2;
            qfzVar2.d = aozbVar;
        }
        return (qfz) createBuilder.s();
    }

    public static final wdj i(qgb qgbVar) {
        aozy createBuilder = wdj.a.createBuilder();
        aozy createBuilder2 = aoyo.a.createBuilder();
        aozb aozbVar = qgbVar.f;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aoyo aoyoVar = (aoyo) createBuilder2.b;
        aozbVar.getClass();
        aoyoVar.b = aozbVar;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wdj wdjVar = (wdj) createBuilder.b;
        aoyo aoyoVar2 = (aoyo) createBuilder2.s();
        aoyoVar2.getClass();
        wdjVar.c = aoyoVar2;
        wdjVar.b |= 1;
        qei qeiVar = qgbVar.c;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        wbk c = wam.c(qeiVar, qgbVar.e);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wdj wdjVar2 = (wdj) createBuilder.b;
        c.getClass();
        wdjVar2.d = c;
        wdjVar2.b |= 4;
        aozy createBuilder3 = wda.a.createBuilder();
        String str = qgbVar.d;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        wda wdaVar = (wda) createBuilder3.b;
        str.getClass();
        wdaVar.b |= 1;
        wdaVar.c = str;
        wda wdaVar2 = (wda) createBuilder3.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wdj wdjVar3 = (wdj) createBuilder.b;
        wdaVar2.getClass();
        wdjVar3.e = wdaVar2;
        wdjVar3.b |= 16;
        return (wdj) createBuilder.s();
    }

    public static final qgc j(wdh wdhVar) {
        aozy createBuilder = qgc.a.createBuilder();
        wcq wcqVar = wdhVar.d;
        if (wcqVar == null) {
            wcqVar = wcq.a;
        }
        qeg d = wam.d(wcqVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgc qgcVar = (qgc) createBuilder.b;
        d.getClass();
        qgcVar.c = d;
        qgcVar.b |= 1;
        if ((wdhVar.b & 1) != 0) {
            aoyo aoyoVar = wdhVar.c;
            if (aoyoVar == null) {
                aoyoVar = aoyo.a;
            }
            aozb aozbVar = aoyoVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qgc qgcVar2 = (qgc) createBuilder.b;
            aozbVar.getClass();
            qgcVar2.b |= 2;
            qgcVar2.d = aozbVar;
        }
        return (qgc) createBuilder.s();
    }

    public static final wdx k(qgt qgtVar) {
        aozy createBuilder = wdx.a.createBuilder();
        aozy createBuilder2 = aoyo.a.createBuilder();
        aozb aozbVar = qgtVar.d;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aoyo aoyoVar = (aoyo) createBuilder2.b;
        aozbVar.getClass();
        aoyoVar.b = aozbVar;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wdx wdxVar = (wdx) createBuilder.b;
        aoyo aoyoVar2 = (aoyo) createBuilder2.s();
        aoyoVar2.getClass();
        wdxVar.c = aoyoVar2;
        wdxVar.b |= 1;
        qfb qfbVar = qgtVar.c;
        if (qfbVar == null) {
            qfbVar = qfb.a;
        }
        qei qeiVar = qfbVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        qfb qfbVar2 = qgtVar.c;
        if (qfbVar2 == null) {
            qfbVar2 = qfb.a;
        }
        wbk c = wam.c(qeiVar, qfbVar2.c);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wdx wdxVar2 = (wdx) createBuilder.b;
        c.getClass();
        wdxVar2.d = c;
        wdxVar2.b |= 4;
        return (wdx) createBuilder.s();
    }

    public static final qgu l(wdv wdvVar) {
        aozy createBuilder = qgu.a.createBuilder();
        wcq wcqVar = wdvVar.d;
        if (wcqVar == null) {
            wcqVar = wcq.a;
        }
        qeg d = wam.d(wcqVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgu qguVar = (qgu) createBuilder.b;
        d.getClass();
        qguVar.c = d;
        qguVar.b |= 1;
        if ((wdvVar.b & 1) != 0) {
            aoyo aoyoVar = wdvVar.c;
            if (aoyoVar == null) {
                aoyoVar = aoyo.a;
            }
            aozb aozbVar = aoyoVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qgu qguVar2 = (qgu) createBuilder.b;
            aozbVar.getClass();
            qguVar2.b |= 2;
            qguVar2.d = aozbVar;
        }
        return (qgu) createBuilder.s();
    }

    public static final web m(qgw qgwVar) {
        aozy createBuilder = web.a.createBuilder();
        aozy createBuilder2 = aoyo.a.createBuilder();
        aozb aozbVar = qgwVar.e;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aoyo aoyoVar = (aoyo) createBuilder2.b;
        aozbVar.getClass();
        aoyoVar.b = aozbVar;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        web webVar = (web) createBuilder.b;
        aoyo aoyoVar2 = (aoyo) createBuilder2.s();
        aoyoVar2.getClass();
        webVar.c = aoyoVar2;
        webVar.b |= 1;
        int i = qgwVar.b;
        qfb qfbVar = qgwVar.c;
        if (qfbVar == null) {
            qfbVar = qfb.a;
        }
        qei qeiVar = qfbVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        qfb qfbVar2 = qgwVar.c;
        if (qfbVar2 == null) {
            qfbVar2 = qfb.a;
        }
        wbk c = wam.c(qeiVar, qfbVar2.c);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        web webVar2 = (web) apagVar;
        c.getClass();
        webVar2.d = c;
        webVar2.b |= 4;
        if ((qgwVar.b & 2) != 0) {
            String str = qgwVar.d;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            web webVar3 = (web) createBuilder.b;
            str.getClass();
            webVar3.b |= 8;
            webVar3.e = str;
        }
        return (web) createBuilder.s();
    }

    public static final qgx n(wdz wdzVar) {
        aozy createBuilder = qgx.a.createBuilder();
        wcq wcqVar = wdzVar.d;
        if (wcqVar == null) {
            wcqVar = wcq.a;
        }
        qeg d = wam.d(wcqVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgx qgxVar = (qgx) createBuilder.b;
        d.getClass();
        qgxVar.c = d;
        qgxVar.b |= 1;
        if ((wdzVar.b & 1) != 0) {
            aoyo aoyoVar = wdzVar.c;
            if (aoyoVar == null) {
                aoyoVar = aoyo.a;
            }
            aozb aozbVar = aoyoVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qgx qgxVar2 = (qgx) createBuilder.b;
            aozbVar.getClass();
            qgxVar2.b |= 2;
            qgxVar2.d = aozbVar;
        }
        return (qgx) createBuilder.s();
    }

    public static final wxn o(Status.Code code) {
        Status.Code code2 = Status.Code.OK;
        switch (code) {
            case OK:
            case CANCELLED:
            case UNKNOWN:
            case NOT_FOUND:
            case ALREADY_EXISTS:
            case RESOURCE_EXHAUSTED:
            case FAILED_PRECONDITION:
            case ABORTED:
            case OUT_OF_RANGE:
            case DATA_LOSS:
            case UNAUTHENTICATED:
                return wxn.UNKNOWN_CAUSE;
            case INVALID_ARGUMENT:
                return wxn.TRANSPORT_INVALID_ARGUMENT;
            case DEADLINE_EXCEEDED:
                return wxn.TRANSPORT_DEADLINE_EXCEEDED;
            case PERMISSION_DENIED:
                return wxn.TRANSPORT_PERMISSION_DENIED;
            case UNIMPLEMENTED:
                return wxn.TRANSPORT_UNIMPLEMENTED;
            case INTERNAL:
                return wxn.TRANSPORT_INTERNAL_ERROR;
            case UNAVAILABLE:
                return wxn.TRANSPORT_UNAVAILABLE;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(code))));
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                throw null;
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
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                return a((qec) obj);
            case 1:
                throw null;
            case 2:
                return b((wbe) obj);
            case 3:
                return c((qen) obj);
            case 4:
                return d((wbl) obj);
            case 5:
                return e((qeg) obj);
            case 6:
                return f((qeg) obj);
            case 7:
                return g((qfy) obj);
            case 8:
                return h((wdb) obj);
            case 9:
                return i((qgb) obj);
            case 10:
                return j((wdh) obj);
            case 11:
                wcq wcqVar = (wcq) obj;
                aozy createBuilder = wxo.a.createBuilder();
                wbr b = wbr.b(wcqVar.c);
                if (b == null) {
                    b = wbr.ERROR_CODE_UNKNOWN;
                }
                int ordinal = b.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        i = 1;
                    } else {
                        wdg wdgVar = wcqVar.e;
                        if (wdgVar == null) {
                            wdgVar = wdg.a;
                        }
                        int Y = a.Y(wdgVar.c);
                        i = 5;
                        if (Y != 0 && Y == 2) {
                            i = 4;
                        }
                    }
                } else {
                    i = 2;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wxo wxoVar = (wxo) createBuilder.b;
                wxoVar.c = i - 1;
                wxoVar.b = 1 | wxoVar.b;
                int[] iArr = wat.b;
                wbq b2 = wbq.b(wcqVar.d);
                if (b2 == null) {
                    b2 = wbq.ERROR_CAUSE_UNKNOWN;
                }
                int i2 = iArr[b2.ordinal()];
                wxn wxnVar = wxn.UNKNOWN_CAUSE;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wxo wxoVar2 = (wxo) createBuilder.b;
                wxoVar2.d = wxnVar.h;
                wxoVar2.b |= 2;
                return (wxo) createBuilder.s();
            case 12:
                return k((qgt) obj);
            case 13:
                return l((wdv) obj);
            case 14:
                return m((qgw) obj);
            case 15:
                return n((wdz) obj);
            case 16:
                return o((Status.Code) obj);
            case 17:
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                throw null;
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
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
