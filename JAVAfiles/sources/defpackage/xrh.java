package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrh implements apxw {
    public static xrg a(anen anenVar, armf armfVar, Object obj) {
        return new xrg(anenVar, armfVar, (xrk) obj);
    }

    public static xyt c(apwt apwtVar) {
        ((yaq) apwtVar.b()).g();
        return new xyu(apwtVar, 0);
    }

    public static ybv d(Context context, Object obj, adwu adwuVar, armf armfVar) {
        ybv ybvVar = new ybv(context, (ybu) obj, adwuVar, armfVar);
        ybvVar.a();
        return ybvVar;
    }

    public static aonx e(Set set) {
        aony aonyVar = new aony();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aooo aoooVar = (aooo) it.next();
            aoooVar.getClass();
            aonyVar.a.add(aoooVar);
        }
        return aonyVar.a();
    }

    public static aknt f() {
        akns a = aknt.a();
        a.a = "HappinessTrackingData";
        a.c(yey.a);
        return a.a();
    }

    public static anhn g(armf armfVar) {
        return ((ansy) armfVar.b()).d();
    }

    public static aibx h(Context context) {
        if (!ahwr.c()) {
            ahwr.e(context);
        }
        return ahwr.a(context);
    }

    public static Optional i() {
        return Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public static ylk j(Object obj) {
        aair aairVar = (aair) obj;
        uub uubVar = (uub) aairVar.e.b();
        uubVar.getClass();
        xyt xytVar = (xyt) aairVar.g.b();
        xytVar.getClass();
        Executor executor = (Executor) aairVar.c.b();
        executor.getClass();
        ylt yltVar = (ylt) aairVar.a.b();
        yltVar.getClass();
        wfh wfhVar = (wfh) aairVar.d.b();
        wfhVar.getClass();
        mbl mblVar = (mbl) aairVar.b.b();
        mblVar.getClass();
        return new ylk(aairVar.f, uubVar, xytVar, executor, yltVar, wfhVar, mblVar, aairVar.h);
    }

    public static Set k(yrf yrfVar, yrz yrzVar, yrp yrpVar, yqp yqpVar) {
        aroy aroyVar = new aroy();
        aroyVar.add(yrfVar);
        aroyVar.add(yrzVar);
        aroyVar.add(yrpVar);
        aroyVar.add(yqpVar);
        Set d = aqjn.d(aroyVar);
        d.getClass();
        return d;
    }

    public static Set l(yrp yrpVar) {
        aroy aroyVar = new aroy();
        aroyVar.add(yrpVar);
        Set d = aqjn.d(aroyVar);
        d.getClass();
        return d;
    }

    public static abnr m(Context context) {
        context.getClass();
        return abnr.j(context, "BUGLE_SPAM");
    }

    public static aknt n() {
        akns a = aknt.a();
        a.a = "SpamLoggingIdsDataStoreConfig";
        a.c(yns.a);
        return a.a();
    }

    public static agmh[] o() {
        return (agmh[]) yoc.c.d;
    }

    public static agns p() {
        return new agnf(yoc.b, "spam_logging_ids_table", new tpd(9));
    }

    public static abrc q(Context context, akbm akbmVar) {
        context.getClass();
        akbmVar.getClass();
        return new abrc(context, yyb.f(akbmVar).a());
    }

    public static abrc r(Context context, akbm akbmVar) {
        context.getClass();
        akbmVar.getClass();
        return new abrc(context, ackk.a, ackj.a, yyb.f(akbmVar).a());
    }

    public static zxy s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new zxy((yyt) obj, (wpp) obj2, (yyt) obj3, (znj) obj4, (znj) obj5);
    }

    public static aiwu t(aknt akntVar, alhm alhmVar, agcp agcpVar) {
        return alhmVar.e(akntVar, agcpVar);
    }

    public static aiwu u(aknt akntVar, alhm alhmVar, agcp agcpVar) {
        return alhmVar.e(akntVar, agcpVar);
    }

    public static xrf v(anen anenVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, wze wzeVar, qnu qnuVar, vsh vshVar, armf armfVar8, agnq agnqVar, tqx tqxVar, armf armfVar9, zai zaiVar, tzn tznVar, rys rysVar, xnv xnvVar, vqm vqmVar, rjm rjmVar, zxy zxyVar, yxx yxxVar, prd prdVar, uac uacVar, armf armfVar10, armf armfVar11, apwt apwtVar, armf armfVar12, armf armfVar13, lpg lpgVar, armf armfVar14, armf armfVar15, armf armfVar16, xqc xqcVar, armf armfVar17, Object obj, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24) {
        return new xrf(anenVar, armfVar, armfVar2, armfVar3, armfVar4, armfVar5, armfVar6, armfVar7, wzeVar, qnuVar, vshVar, armfVar8, agnqVar, tqxVar, armfVar9, zaiVar, tznVar, rysVar, xnvVar, vqmVar, rjmVar, zxyVar, yxxVar, prdVar, uacVar, armfVar10, armfVar11, apwtVar, armfVar12, armfVar13, lpgVar, armfVar14, armfVar15, armfVar16, xqcVar, armfVar17, (xrk) obj, armfVar18, armfVar19, armfVar20, armfVar21, armfVar22, armfVar23, armfVar24);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
