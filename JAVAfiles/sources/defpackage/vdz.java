package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdz implements wvc {
    final /* synthetic */ anen a;
    final /* synthetic */ mbl b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public vdz(Object obj, anen anenVar, mbl mblVar, int i) {
        this.d = i;
        this.c = obj;
        this.a = anenVar;
        this.b = mblVar;
    }

    @Override // defpackage.wvc
    public final /* synthetic */ akul a() {
        if (this.d != 0) {
            return wcm.B();
        }
        return wcm.B();
    }

    @Override // defpackage.wvc
    public final akul b() {
        if (this.d != 0) {
            return aktp.ai(new uvp(this.c, 16), this.a);
        }
        int i = 20;
        return akul.g(((aiwu) ((ryg) this.c).a).a()).h(new vbj(i), andi.a).h(new uzs(vds.a.createBuilder(), i), this.a);
    }

    @Override // defpackage.wvd
    public final void c() {
        if (this.d != 0) {
            this.b.c("Bugle.Tachyon.Anonymous.Registration.Data.Migration.Counts");
        } else {
            this.b.c("Bugle.Firebase.Registration.Data.Migration.Counts");
        }
    }
}
