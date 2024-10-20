package defpackage;

import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uvk implements uvi, xyk {
    public static final alwo d = alwo.o("Bugle");
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    private final anen i;
    private final String j = ".PHONE_SILENT_FEEDBACK";

    public uvk(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, anen anenVar) {
        this.e = armfVar;
        this.f = armfVar2;
        this.h = armfVar3;
        this.g = armfVar4;
        this.i = anenVar;
    }

    private final akul e(Throwable th, boolean z) {
        alwo alwoVar = d;
        ((alwl) ((alwl) ((alwl) alwoVar.i()).g(th)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedbackForAssert", (char) 133, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Messages automatically detected an error.");
        if (!((Boolean) uvi.a.e()).booleanValue()) {
            ((alwl) ((alwl) alwoVar.m().g(th)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "sendSilentFeedbackForAssert", 136, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Silent assert uploading disabled. Not reporting");
            return aktp.ag(null);
        }
        return f(th);
    }

    private final akul f(Throwable th) {
        return aktp.aj(new uvj(this, th, 0), this.i);
    }

    @Override // defpackage.uvi, defpackage.xyk
    public final akul a(Throwable th) {
        return e(th, false).i(new twe(this, th, 13), andi.a);
    }

    @Override // defpackage.uvi
    public final akul b(Throwable th) {
        return f(th).i(new twe(this, th, 11), andi.a);
    }

    @Override // defpackage.uvi
    public final void c(Throwable th) {
        if (utw.a(ThreadLocalRandom.current(), utw.r)) {
            e(th, true);
        } else {
            ((alwl) ((alwl) d.m().g(th)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "onSlowCode", 157, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Throttling reporting");
            aktp.ag(null);
        }
    }

    public final akul d(Throwable th) {
        return b.b().i(new tsz(th, 20), andi.a).i(new twe(this, th, 12), this.i);
    }
}
