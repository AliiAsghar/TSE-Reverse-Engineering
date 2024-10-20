package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxy extends agpc<sxt, sxx, sxy, MessagesTable.BindData, sxp> {
    public sxy(String[] strArr) {
        super("messages", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sxx b() {
        l();
        return new sxx(this.a.b());
    }

    public final void c(sxp... sxpVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (sxp sxpVar : sxpVarArr) {
            if (((Integer) MessagesTable.b.getOrDefault(sxpVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(sxpVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(MessagesTable.c);
        c((sxp[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(MessagesTable.c);
        c((sxp) apply);
    }

    public final void f(syc sycVar) {
        k(new syb(sycVar));
    }

    public final void g(Function function) {
        Object apply;
        apply = function.apply(new syc());
        k(new syb((syc) apply));
    }

    public final void h(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sho(12)).collect(Collectors.joining(", ")));
    }
}
