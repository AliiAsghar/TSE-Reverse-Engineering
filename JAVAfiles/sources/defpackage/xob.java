package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xob implements wpj {
    public static final utz a = uuh.a("file_transfer_timeout", 86400000);
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/transfer/FileTransferConnectionMonitor");
    public final armf c;
    public final armf d;
    private final anen e;
    private final odj f;

    public xob(anen anenVar, odj odjVar, armf armfVar, armf armfVar2) {
        this.e = anenVar;
        this.f = odjVar;
        this.c = armfVar;
        this.d = armfVar2;
    }

    @Override // defpackage.wpj
    public final void e(qwe qweVar) {
        if (!((ansy) ((nlz) this.f).a.b()).e("bugle.enable_auto_resume_transfer_on_terrestrial")) {
            return;
        }
        qiu.h(aktp.ah(new wuo(this, 10), this.e));
    }

    @Override // defpackage.wpj
    public final void a(qwe qweVar) {
    }

    @Override // defpackage.wpj
    public final void b(qwe qweVar) {
    }

    @Override // defpackage.wpj
    public final void c(qwe qweVar) {
    }

    @Override // defpackage.wpj
    public final void d(qwe qweVar) {
    }
}
