package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yms extends arpw implements arqv {
    int a;
    final /* synthetic */ ymt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yms(ymt ymtVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = ymtVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yms) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        String str;
        alcs alcsVar;
        arpl arplVar = arpl.a;
        int i = this.a;
        String str2 = null;
        aqil.P(obj);
        if (i == 0) {
            arml armlVar = ymt.a;
            String str3 = (String) yyb.X().e();
            if (str3 != null && str3.length() != 0) {
                ymp ympVar = (ymp) this.b.l.get();
                if (ympVar != null) {
                    str = ympVar.d();
                } else {
                    str = null;
                }
                if (!d.F(str, str3)) {
                    ymt ymtVar = this.b;
                    this.a = 1;
                    Object e = yyb.W().e();
                    e.getClass();
                    if (((CharSequence) e).length() > 0) {
                        aozy createBuilder = alcs.a.createBuilder();
                        String str4 = (String) yyb.W().e();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        alcs alcsVar2 = (alcs) createBuilder.b;
                        str4.getClass();
                        alcsVar2.b |= 2;
                        alcsVar2.d = str4;
                        apag s = createBuilder.s();
                        s.getClass();
                        alcsVar = (alcs) s;
                    } else {
                        aozy createBuilder2 = alcs.a.createBuilder();
                        aozy createBuilder3 = alct.a.createBuilder();
                        Object a = ymt.b.a();
                        a.getClass();
                        String str5 = (String) ((utz) a).e();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        alct alctVar = (alct) createBuilder3.b;
                        str5.getClass();
                        alctVar.b |= 1;
                        alctVar.c = str5;
                        Object a2 = ymt.a.a();
                        a2.getClass();
                        String str6 = (String) ((utz) a2).e();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        alct alctVar2 = (alct) createBuilder3.b;
                        str6.getClass();
                        alctVar2.b |= 2;
                        alctVar2.d = str6;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        alcs alcsVar3 = (alcs) createBuilder2.b;
                        alct alctVar3 = (alct) createBuilder3.s();
                        alctVar3.getClass();
                        alcsVar3.c = alctVar3;
                        alcsVar3.b = 1 | alcsVar3.b;
                        apag s2 = createBuilder2.s();
                        s2.getClass();
                        alcsVar = (alcs) s2;
                    }
                    obj = arro.F(ancd.f(albo.f(alcsVar).d(new lpx(xmr.m, 5), (Executor) ymtVar.k.b()).l(), IOException.class, new yez(xih.h, 11), (Executor) ymtVar.j.b()), this);
                    if (obj == arplVar) {
                        return arplVar;
                    }
                }
            }
            return arnb.a;
        }
        ymq ymqVar = (ymq) obj;
        if (ymqVar != null) {
            ymt ymtVar2 = this.b;
            if (!d.F((String) yyb.X().e(), ymqVar.d)) {
                yyb.V().q("The new configuration's id doesn't match the target id.");
            } else {
                ymp ympVar2 = (ymp) ymtVar2.l.get();
                if (ympVar2 != null) {
                    str2 = ympVar2.d();
                }
                if (!d.F(str2, ymqVar.d)) {
                    ymtVar2.l.set(new ymp(ymqVar));
                }
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new yms(this.b, arpeVar);
    }
}
