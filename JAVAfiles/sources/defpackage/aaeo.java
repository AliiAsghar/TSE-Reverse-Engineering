package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaeo implements hxb {
    final /* synthetic */ Uri a;
    final /* synthetic */ RichCardMediaAttachmentView b;

    public aaeo(RichCardMediaAttachmentView richCardMediaAttachmentView, Uri uri) {
        this.a = uri;
        this.b = richCardMediaAttachmentView;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [armf, java.lang.Object] */
    @Override // defpackage.hxb
    public final boolean eV(hpp hppVar, Object obj) {
        xyo e = RichCardMediaAttachmentView.a.e();
        e.H("Rich card media loading failed for resource");
        e.z("resource", this.a);
        e.q();
        RichCardMediaAttachmentView richCardMediaAttachmentView = this.b;
        if (richCardMediaAttachmentView.m != null) {
            uli uliVar = (uli) richCardMediaAttachmentView.g.b();
            aozy createBuilder = ujl.a.createBuilder();
            String uri = this.a.toString();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ujl ujlVar = (ujl) createBuilder.b;
            uri.getClass();
            ujlVar.b = uri;
            String a = this.b.m.g.u().a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ujl ujlVar2 = (ujl) createBuilder.b;
            a.getClass();
            ujlVar2.c = a;
            ((uof) uliVar.a.b()).b(upk.a("rich_card_media_uri_cleanup", (ujl) createBuilder.s()));
            return false;
        }
        return false;
    }

    @Override // defpackage.hxb
    public final /* bridge */ /* synthetic */ boolean eW(Object obj, Object obj2) {
        this.b.j = this.a;
        return false;
    }
}
