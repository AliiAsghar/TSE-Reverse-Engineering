package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hu extends ees {
    final /* synthetic */ hv a;
    private boolean b = false;
    private int c = 0;

    public hu(hv hvVar) {
        this.a = hvVar;
    }

    @Override // defpackage.ees, defpackage.eer
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            eer eerVar = this.a.b;
            if (eerVar != null) {
                eerVar.a();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override // defpackage.ees, defpackage.eer
    public final void b() {
        if (!this.b) {
            this.b = true;
            eer eerVar = this.a.b;
            if (eerVar != null) {
                eerVar.b();
            }
        }
    }
}
