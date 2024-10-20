package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wxt {
    private static final alwo a = alwo.o("BugleBCM");

    public final void a(wxs wxsVar) {
        if (((Boolean) qpf.a.e()).booleanValue() && !wxsVar.a()) {
            if (!((Boolean) qpf.f.e()).booleanValue()) {
                alwl alwlVar = (alwl) a.h();
                alwlVar.Z(alwk.FULL);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/sms/CallerApiAccessChecker", "checkApiAccess", 36, "CallerApiAccessChecker.java")).q("BCM is used, but legacy access to telephony was performed. Calling getOrCreateThreadId when BCM is used is not allowed");
            } else {
                alwl alwlVar2 = (alwl) a.h();
                alwlVar2.Z(alwk.FULL);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/sms/CallerApiAccessChecker", "checkApiAccess", 30, "CallerApiAccessChecker.java")).q("BCM is used, but legacy access to telephony was performed.");
                throw new wxu();
            }
        }
    }
}
