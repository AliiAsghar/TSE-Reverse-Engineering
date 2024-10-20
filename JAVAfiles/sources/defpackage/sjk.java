package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjk extends agpc<sjh, sjj, sjk, sjd, sjf> {
    public sjk(String[] strArr) {
        super("contacts", strArr, null, null, null, "$primary");
    }

    private final void f(sjf... sjfVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (sjf sjfVar : sjfVarArr) {
            if (((Integer) sjm.b.getOrDefault(sjfVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(sjfVarArr);
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sjj b() {
        l();
        return new sjj(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(sjm.e);
        f((sjf[]) apply);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(sjm.e);
        f((sjf) apply);
    }

    public final void e(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sho(2)).collect(Collectors.joining(", ")));
    }
}
