package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srw extends agpc {
    public srw(String[] strArr) {
        super("lighter_conversations_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final srv b() {
        l();
        return new srv(this.a.b());
    }

    public final void c(srs... srsVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (((Integer) srz.b.getOrDefault(srsVarArr[0].toString(), -1)).intValue() > intValue) {
            agnc.t("columnReference.toString()", intValue);
        }
        m(srsVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new sry());
        k(new agpw((sry) apply));
    }
}
