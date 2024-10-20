package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sfw extends agpc {
    public sfw(String[] strArr) {
        super("backup_id_map", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sfv b() {
        l();
        return new sfv(this.a.b());
    }

    public final void c(sfs... sfsVarArr) {
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (sfs sfsVar : sfsVarArr) {
            if (((Integer) sfz.b.getOrDefault(sfsVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        m(sfsVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new sfy());
        k(new agpw((sfy) apply));
    }
}
