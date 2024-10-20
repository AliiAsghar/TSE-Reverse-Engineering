package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sux extends agpc {
    public sux(String[] strArr) {
        super("message_labels", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final suw b() {
        l();
        return new suw(this.a.b());
    }

    public final void c(suu... suuVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (((Integer) suz.b.getOrDefault(suuVarArr[0].toString(), -1)).intValue() > intValue) {
            agnc.t("columnReference.toString()", intValue);
        }
        m(suuVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new suy());
        k(new agpw((suy) apply));
    }
}
