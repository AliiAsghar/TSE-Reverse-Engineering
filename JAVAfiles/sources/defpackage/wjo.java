package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjo implements wjz {
    public static final utz a = uuh.e(uuh.b, "exponential_backoff_max_seconds", 86400);
    public static final utz b = uuh.e(uuh.b, "provisioning_exponential_backoff_delay", 60);
    public final armf c;
    public final anen d;

    public wjo(armf armfVar, anen anenVar) {
        this.c = armfVar;
        this.d = anenVar;
    }

    @Override // defpackage.wjz
    public final int a(String str) {
        try {
            return ((Integer) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) ((whj) this.c.b()).d.l()).j), str, 0)).intValue();
        } catch (apba e) {
            xzb.n("Bugle", "Exception when getting retry count: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @Override // defpackage.wjz
    public final akul b(String str) {
        return ((whj) this.c.b()).h(str, 0);
    }

    @Override // defpackage.wjz
    public final akul c(String str) {
        return ((whj) this.c.b()).e().h(new whg(str, 1), andi.a).i(new wkh(this, str, 1), this.d);
    }
}
