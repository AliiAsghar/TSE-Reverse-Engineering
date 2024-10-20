package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akls extends aklw {
    public akls(cg cgVar, boolean z) {
        super(cgVar, z);
    }

    @Override // defpackage.aklw
    protected final void a(cg cgVar) {
        super.a(cgVar);
        Class<?> cls = cgVar.getClass();
        cj fe = cgVar.fe();
        cls.getSimpleName();
        fe.getClass();
        albo.Z(cgVar.fe() instanceof aklg, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", cgVar.getClass().getSimpleName(), cgVar.fe().getClass().getSimpleName());
    }
}
