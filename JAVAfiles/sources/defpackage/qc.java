package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qc extends ees {
    final /* synthetic */ int a;
    final /* synthetic */ qd b;
    private boolean c = false;

    public qc(qd qdVar, int i) {
        this.b = qdVar;
        this.a = i;
    }

    @Override // defpackage.ees, defpackage.eer
    public final void a() {
        if (!this.c) {
            qd qdVar = this.b;
            qdVar.a.setVisibility(this.a);
        }
    }

    @Override // defpackage.ees, defpackage.eer
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.ees, defpackage.eer
    public final void c() {
        this.c = true;
    }
}
