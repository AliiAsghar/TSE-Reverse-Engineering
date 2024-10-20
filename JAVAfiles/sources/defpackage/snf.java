package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class snf extends agpc<sna, sne, snf, smr, smv> {
    public snf(String[] strArr) {
        super("conversations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sne b() {
        l();
        return new sne(this.a.b());
    }

    public final void c(smv... smvVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (smv smvVar : smvVarArr) {
            if (((Integer) sni.b.getOrDefault(smvVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(smvVarArr);
    }

    public final void d() {
        this.a.m = true;
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(sni.c);
        c((smv[]) apply);
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(sni.c);
        c((smv) apply);
    }

    public final void g(snh snhVar) {
        k(new agpw(snhVar));
    }

    public final void h(Function function) {
        Object apply;
        apply = function.apply(new snh());
        k(new agpw((snh) apply));
    }

    public final void i(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sho(4)).collect(Collectors.joining(", ")));
    }
}
