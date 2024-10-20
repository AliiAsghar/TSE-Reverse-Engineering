package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfz implements vfy {
    private final osk a;

    public vfz(osk oskVar) {
        this.a = oskVar;
    }

    @Override // defpackage.vfy
    public final akul a(aozy aozyVar, msh mshVar) {
        aozyVar.getClass();
        if (((ansy) ((nvn) this.a).a.b()).e("bugle.enable24hr_auth_token")) {
            aozyVar.bN(askr.SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN);
            aozyVar.bN(askr.SUPPORTS_24_HOUR_RCS_AUTH_TOKEN);
            akul ag = aktp.ag(aozyVar);
            ag.getClass();
            return ag;
        }
        aozyVar.bN(askr.SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN);
        akul ag2 = aktp.ag(aozyVar);
        ag2.getClass();
        return ag2;
    }
}
