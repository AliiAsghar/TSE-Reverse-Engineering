package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class soo extends agpc {
    public soo(String[] strArr) {
        super("desktop", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final son b() {
        l();
        return new son(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        Integer valueOf;
        apply = function.apply(sor.c);
        soj[] sojVarArr = {(soj) apply};
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (((Integer) sor.b.getOrDefault(sojVarArr[0].toString(), -1)).intValue() > intValue) {
            agnc.t("columnReference.toString()", intValue);
        }
        m(sojVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new soq());
        k(new agpw((soq) apply));
    }
}
