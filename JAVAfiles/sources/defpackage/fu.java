package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fu implements iu {
    final /* synthetic */ fv a;
    private boolean b;

    public fu(fv fvVar) {
        this.a = fvVar;
    }

    @Override // defpackage.iu
    public final void a(ij ijVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.c.c();
        this.a.a.onPanelClosed(108, ijVar);
        this.b = false;
    }

    @Override // defpackage.iu
    public final boolean b(ij ijVar) {
        this.a.a.onMenuOpened(108, ijVar);
        return true;
    }
}
