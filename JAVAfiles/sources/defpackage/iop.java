package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iop implements affv {
    private static final alwo a = alwo.o("BugleCamera");
    private final armf b;

    public iop(armf armfVar) {
        armfVar.getClass();
        this.b = armfVar;
    }

    @Override // defpackage.affv
    public final void a() {
        ((mbl) this.b.b()).c("Bugle.Compose.Gallery.PageLoadRequested.Count");
    }

    @Override // defpackage.affv
    public final void b(afgj afgjVar, afsw afswVar) {
        if (d.F(afgjVar, afgi.a)) {
            if (d.F(afswVar, afsu.a)) {
                ((mbl) this.b.b()).c("Bugle.Compose.Gallery.Camera.System.Photo.CaptureFailed.Count");
            } else if (d.F(afswVar, afsv.a)) {
                ((mbl) this.b.b()).c("Bugle.Compose.Gallery.Camera.System.Video.CaptureFailed.Count");
            } else {
                ((alwl) a.g()).t("Unexpected media type: %s", afswVar);
            }
        }
    }
}
