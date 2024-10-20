package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcx extends agpc {
    public lcx(String[] strArr) {
        super("conversations LEFT JOIN conversation_pin ON (conversation_pin.conversation_id=conversations._id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lcv b() {
        l();
        return new lcv(this.a.b());
    }

    public final void c(lcu... lcuVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        int intValue = valueOf.intValue();
        if (((Integer) lcz.b.getOrDefault(lcuVarArr[0].toString(), -1)).intValue() > intValue) {
            agnc.t("columnReference.toString()", intValue);
        }
        m(lcuVarArr);
    }

    public final void d() {
        this.a.m = true;
    }

    public final void e(lcy lcyVar) {
        k(new agpw(lcyVar));
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(new lcy());
        k(new agpw((lcy) apply));
    }

    public final void g(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new lcw(0)).collect(Collectors.joining(", ")));
    }
}
