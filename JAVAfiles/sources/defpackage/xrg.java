package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrg {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    private final anen c;
    private final xrk d;

    public xrg(anen anenVar, armf armfVar, xrk xrkVar) {
        this.c = anenVar;
        this.b = armfVar;
        this.d = xrkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akul a(rve rveVar) {
        if (!((Boolean) ((utz) pyl.a.get()).e()).booleanValue()) {
            return aktp.ai(new xfb(this, rveVar, 10), this.c);
        }
        xrk xrkVar = this.d;
        alwl alwlVar = (alwl) xrk.a.g();
        alwlVar.X(ydl.e, rveVar.b);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "getfutureForRcsMessage", 67, "TelephonyInsertionFutureRepository.java")).q("Retrieving Telephony insertion future for finalizing file transfer.");
        akul akulVar = (akul) xrkVar.b.get(rveVar);
        if (akulVar == null) {
            alwl alwlVar2 = (alwl) xrk.a.g();
            alwlVar2.X(ydl.e, rveVar.b);
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "getfutureForRcsMessage", 81, "TelephonyInsertionFutureRepository.java")).q("No Telephony insertion future found.");
            akulVar = aktp.ag(null);
        }
        return akulVar.h(new xpm(this, rveVar, 6), this.c);
    }
}
