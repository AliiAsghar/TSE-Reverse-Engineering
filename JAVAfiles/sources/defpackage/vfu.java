package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfu implements arlq {
    public arld a;
    public final arlq b;
    public final /* synthetic */ vfv c;

    public vfu(vfv vfvVar) {
        this.c = vfvVar;
        this.b = new vfr(vfvVar);
    }

    @Override // defpackage.arlq
    public final void a() {
        throw null;
    }

    @Override // defpackage.arlq
    public final void b(Throwable th) {
        throw null;
    }

    @Override // defpackage.arlq
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void d() {
        if (this.a != null) {
            alvw g = vfv.c.g();
            g.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$ReceiveMessagesResponseObserver", "disconnect", 715, "BindHandlerImpl.java")).t("%s BindHandler: Cancelling stream intentionally. onError will be called but no-op", akec.aD(this.c.E));
            this.a.d("Closing Bind channel", new vfs());
        }
    }
}
