package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alyy extends alzc {
    final /* synthetic */ alza a;

    public alyy(alza alzaVar) {
        this.a = alzaVar;
    }

    @Override // defpackage.alzc
    public final alze a() {
        if (this.a.a.compareAndSet(false, true)) {
            alvc alvcVar = (alvc) alyz.a.i();
            alvcVar.Z(alwk.SMALL);
            ((alvc) alvcVar.h("com/google/common/flogger/context/NoOpContextDataProvider$NoOpScopedLoggingContext", "logWarningOnceOnly", 55, "NoOpContextDataProvider.java")).q("Scoped logging contexts are disabled; no context data provider was installed.\nTo enable scoped logging contexts in your application, see the site-specific Platform class used to configure logging behaviour.\nDefault Platform: com.google.common.flogger.backend.system.DefaultPlatform");
        }
        return this.a;
    }
}
