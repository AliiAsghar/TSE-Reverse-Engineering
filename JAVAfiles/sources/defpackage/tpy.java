package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tpy extends agpc<tpw, tpx, tpy, VmtTable.BindData, tpv> {
    public tpy(String[] strArr) {
        super("vmt", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tpx b() {
        l();
        return new tpx(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(VmtTable.d);
        tpv[] tpvVarArr = (tpv[]) apply;
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (tpv tpvVar : tpvVarArr) {
            if (((Integer) VmtTable.b.getOrDefault(tpvVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        m(tpvVarArr);
    }
}
