package defpackage;

import j$.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tru extends unp {
    public static final uuf a = uuh.r(164486593, "use_attachment_to_blobstore_uploader_worker");
    public final armf b;
    public final armf c;
    public final vby d;
    public final ibi e;
    private final anen f;
    private final anen g;
    private final apwt h;

    public tru(armf armfVar, armf armfVar2, anen anenVar, anen anenVar2, ibi ibiVar, vby vbyVar, apwt apwtVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.f = anenVar;
        this.g = anenVar2;
        this.e = ibiVar;
        this.d = vbyVar;
        this.h = apwtVar;
    }

    private final boolean j() {
        return Collection.EL.stream((Set) this.h.b()).allMatch(new trt(0));
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        a2.d(5);
        a2.g(gry.EXPONENTIAL);
        return a2.b();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("UploadAttachmentsToBlobstoreHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        trv trvVar = (trv) apbtVar;
        if (!j()) {
            return aktp.ag(upm.d());
        }
        return aktp.aj(new imi(this, trvVar, 16), this.g).h(new rgh(6), this.f);
    }

    @Override // defpackage.unx
    public final apca e() {
        return trv.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final /* synthetic */ boolean h(apbt apbtVar) {
        return j();
    }
}
