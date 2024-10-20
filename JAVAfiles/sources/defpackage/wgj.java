package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class wgj implements akbp<apdj<wgi>, Void> {
    final /* synthetic */ xze a;

    public wgj(xze xzeVar) {
        this.a = xzeVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        this.a.q(String.format("Error while trying to store PhoneNumberRecord, Failure: %s", th.getMessage()));
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.l("Successfully stored PhoneNumberRecord");
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
