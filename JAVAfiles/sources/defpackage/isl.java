package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class isl implements akgh<Boolean> {
    final /* synthetic */ itb a;

    public isl(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        xzb.p("Bugle", th, "Couldn't get CanUseLinkPreviewByDefault capability");
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.at = ((Boolean) obj).booleanValue();
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
