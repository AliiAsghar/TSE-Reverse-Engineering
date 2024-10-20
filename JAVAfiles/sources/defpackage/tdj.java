package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tdj extends agpc<tdh, tdi, tdj, ProfilesTable.BindData, tdf> {
    public tdj(String[] strArr) {
        super("profiles_table", strArr, null, null, null, "$primary");
    }

    private final void f(tdf... tdfVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (tdf tdfVar : tdfVarArr) {
            if (((Integer) ProfilesTable.b.getOrDefault(tdfVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        m(tdfVarArr);
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tdi b() {
        l();
        return new tdi(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(ProfilesTable.c);
        f((tdf[]) apply);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(ProfilesTable.c);
        f((tdf) apply);
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(new tdm());
        k(new tdl((tdm) apply));
    }
}
