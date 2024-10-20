package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksu implements uvn {
    public amej a = amej.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_UNKNOWN;

    public final String a() {
        int ordinal = this.a.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return "unknown";
                }
                return "false";
            }
            return "true";
        }
        return "not required";
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        return uvl.b();
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul c() {
        return uvl.c();
    }

    @Override // defpackage.uvn
    public final akul d() {
        xou xouVar = new xou((short[]) null);
        xouVar.j("share_with_partner_consent");
        xouVar.k(a());
        return aktp.ag(alog.r(xouVar.i()));
    }
}
