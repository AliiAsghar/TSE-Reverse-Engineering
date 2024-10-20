package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfm {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/waker/RcsEngineWaker");
    public final wty b;
    public final xnv c;
    public final vqu d;
    public final Duration e;
    private final armf f;

    public wfm(wty wtyVar, xnv xnvVar, vqu vquVar, armf armfVar) {
        xnvVar.getClass();
        vquVar.getClass();
        armfVar.getClass();
        this.b = wtyVar;
        this.c = xnvVar;
        this.d = vquVar;
        this.f = armfVar;
        Object b = armfVar.b();
        b.getClass();
        this.e = Duration.ofSeconds(((Number) b).longValue());
    }
}
