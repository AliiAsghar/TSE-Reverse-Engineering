package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class taz extends agpc<tav, tay, taz, ParticipantsTable.BindData, tas> {
    public taz(String[] strArr) {
        super("participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tay b() {
        l();
        return new tay(this.a.b());
    }

    public final void c(tas... tasVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (tas tasVar : tasVarArr) {
            if (((Integer) ParticipantsTable.b.getOrDefault(tasVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(tasVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(ParticipantsTable.c);
        c((tas[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(ParticipantsTable.c);
        c((tas) apply);
    }

    public final void f(tbd tbdVar) {
        k(new tbc(tbdVar));
    }

    public final void g(Function function) {
        Object apply;
        apply = function.apply(new tbd());
        k(new tbc((tbd) apply));
    }

    public final void h(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sho(15)).collect(Collectors.joining(", ")));
    }
}
