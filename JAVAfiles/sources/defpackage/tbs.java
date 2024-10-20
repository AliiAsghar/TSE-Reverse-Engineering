package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbs extends agpc<tbn, tbr, tbs, PartsTable.BindData, tbi> {
    public tbs(String[] strArr) {
        super("parts", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tbr b() {
        l();
        return new tbr(this.a.b());
    }

    public final void c(tbi... tbiVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (tbi tbiVar : tbiVarArr) {
            if (((Integer) PartsTable.b.getOrDefault(tbiVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(tbiVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(PartsTable.d);
        c((tbi[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(PartsTable.d);
        c((tbi) apply);
    }

    public final void f(tbu tbuVar) {
        k(new agpw(tbuVar));
    }

    public final void g(Function function) {
        Object apply;
        apply = function.apply(new tbu());
        k(new agpw((tbu) apply));
    }

    public final void h(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sho(16)).collect(Collectors.joining(", ")));
    }
}
