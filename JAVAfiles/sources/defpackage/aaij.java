package defpackage;

import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaij extends oo implements xux {
    public final rru s;
    public final rtu t;
    final /* synthetic */ zpu u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaij(zpu zpuVar, VCardAttachmentView vCardAttachmentView) {
        super(vCardAttachmentView);
        this.u = zpuVar;
        this.s = (rru) zpuVar.g.b();
        this.t = new aaii(this);
    }

    @Override // defpackage.xux
    public final void c(rtu rtuVar) {
        this.u.h.k.b(this.s);
    }

    @Override // defpackage.xux
    public final void d() {
    }
}
