package defpackage;

import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpc implements xux {
    final /* synthetic */ VCardAttachmentView a;

    public zpc(VCardAttachmentView vCardAttachmentView) {
        this.a = vCardAttachmentView;
    }

    @Override // defpackage.xux
    public final void c(rtu rtuVar) {
        if (rtuVar instanceof rtl) {
            rtl rtlVar = (rtl) rtuVar;
            if (rtlVar.q()) {
                VCardAttachmentView vCardAttachmentView = this.a;
                vCardAttachmentView.a.c(vCardAttachmentView.getContext(), rtlVar.o());
            }
        }
    }

    @Override // defpackage.xux
    public final void d() {
    }
}
