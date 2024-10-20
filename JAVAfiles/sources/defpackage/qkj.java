package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkj extends arpw implements arqv {
    /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkj(arpe arpeVar, arqr arqrVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((qkj) c((upr) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((qkj) c((Map) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((qkj) c((gjd) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((qkj) c(obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        String obj2;
        uou uouVar;
        int i = this.c;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    aqil.P(obj);
                    return Boolean.valueOf(d.F(((upr) this.a).p(), this.b));
                }
                aqil.P(obj);
                Map map = (Map) this.a;
                if (map != null) {
                    uouVar = (uou) map.get(this.b);
                } else {
                    uouVar = null;
                }
                if (uouVar != uou.b) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            aqil.P(obj);
            gjd gjdVar = (gjd) this.a;
            gjdVar.getClass();
            return this.b.a(gjdVar.a.a);
        }
        aqil.P(obj);
        Object obj3 = this.b;
        Object obj4 = this.a;
        if (obj3 instanceof qke) {
            obj2 = ((qke) obj3).a;
        } else {
            obj2 = obj3.toString();
        }
        ((alvg) qjs.a.g().h("com/google/android/apps/messaging/shared/concurrent/flow/LogEmissionsKt$logEmissions$withOnEach$1", "invokeSuspend", 20, "LogEmissions.kt")).D("%s emitted: %s", obj2, yyb.bh(String.valueOf(obj4)).toString());
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v0, types: [asai, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    qkj qkjVar = new qkj((String) this.b, arpeVar, 3, null);
                    qkjVar.a = obj;
                    return qkjVar;
                }
                qkj qkjVar2 = new qkj((String) this.b, arpeVar, 2);
                qkjVar2.a = obj;
                return qkjVar2;
            }
            qkj qkjVar3 = new qkj(arpeVar, (arqr) this.b, 1);
            qkjVar3.a = obj;
            return qkjVar3;
        }
        qkj qkjVar4 = new qkj((asai) this.b, arpeVar, 0);
        qkjVar4.a = obj;
        return qkjVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkj(asai asaiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = asaiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkj(String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkj(String str, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.b = str;
    }
}
