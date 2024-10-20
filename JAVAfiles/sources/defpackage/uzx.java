package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uzx extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/message/delete/DeletePartCmsAttachmentHandler");
    private final arwe b;
    private final uvi c;

    public uzx(arwe arweVar, uvi uviVar) {
        arweVar.getClass();
        uviVar.getClass();
        this.b = arweVar;
        this.c = uviVar;
    }

    public static /* synthetic */ Object k(uzx uzxVar, String str, String str2, arpe arpeVar) {
        return uzxVar.j(str, str2, null, arpeVar);
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("DeletePartCmsAttachmentHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        uzy uzyVar = (uzy) apbtVar;
        uzyVar.getClass();
        c = qjh.c(this.b, arpj.a, arwf.a, new jog(uzyVar, this, (arpe) null, 4));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = uzy.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    public final Object j(String str, String str2, Throwable th, arpe arpeVar) {
        Object F;
        alvg a2 = a.a(Level.WARNING);
        a2.X(alwp.a, "BugleCmsMedia");
        a2.X(ulf.a, str2);
        ((alvg) a2.g(th).h("com/google/android/apps/messaging/shared/message/delete/DeletePartCmsAttachmentHandler", "processFailure", 103, "DeletePartCmsAttachmentHandler.kt")).q(str);
        if (th != null && (F = arro.F(this.c.b(th), arpeVar)) == arpl.a) {
            return F;
        }
        return arnb.a;
    }
}
