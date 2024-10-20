package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class soq extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(String str) {
        U(new agmd("desktop.desktop_id", 1, String.valueOf(str)));
    }

    public final void c() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 58010) {
            agnc.t("is_active", intValue);
        }
        U(new agoi("desktop.is_active", 1, 1));
    }

    public final void d(tqm tqmVar) {
        Integer valueOf;
        int ordinal;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 58960) {
            agnc.t("pairing_type", intValue);
        }
        if (tqmVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqmVar.ordinal();
        }
        U(new agoi("desktop.pairing_type", 1, Integer.valueOf(ordinal)));
    }
}
