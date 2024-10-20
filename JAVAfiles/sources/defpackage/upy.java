package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upy extends agpc {
    public upy(String[] strArr) {
        super("work_queue", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final upx b() {
        l();
        return new upx(this.a.b());
    }

    public final void c(upu... upuVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (upu upuVar : upuVarArr) {
            if (((Integer) uqb.b.getOrDefault(upuVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(upuVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new uqa());
        k(new agpw((uqa) apply));
    }

    public final void e(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new unt(9)).collect(Collectors.joining(", ")));
    }
}
