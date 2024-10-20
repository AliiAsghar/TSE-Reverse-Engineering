package defpackage;

import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class zru implements akgh<kpe> {
    final /* synthetic */ apwt a;
    final /* synthetic */ zrt b;

    public zru(apwt apwtVar, zrt zrtVar) {
        this.a = apwtVar;
        this.b = zrtVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        if (((kpe) obj) == kpe.REMOTE) {
            ((Optional) this.a.b()).ifPresent(new zrg(this.b, 12));
            this.b.F().finish();
        } else {
            this.b.E().d();
        }
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
    }
}
