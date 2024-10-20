package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yuj implements wvc {
    final /* synthetic */ mbl a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public yuj(Object obj, mbl mblVar, int i) {
        this.c = i;
        this.b = obj;
        this.a = mblVar;
    }

    @Override // defpackage.wvc
    public final /* synthetic */ akul a() {
        if (this.c != 0) {
            return wcm.B();
        }
        return wcm.B();
    }

    @Override // defpackage.wvc
    public final akul b() {
        if (this.c != 0) {
            return akul.g(((aiwu) ((ryg) this.b).a).a());
        }
        return akul.g(((aiwu) this.b).a());
    }

    @Override // defpackage.wvd
    public final void c() {
        if (this.c != 0) {
            this.a.c("Bugle.Tachyon.Gaia_Registration.Data.Migration.Counts");
        } else {
            this.a.c("Bugle.VerifiedSms.Registration.Data.Migration.Counts");
        }
    }
}
