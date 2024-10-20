package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ivt extends ijy<Optional<BusinessInfoData>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivt(ixd ixdVar) {
        super("Business Info");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$10", "onNewData", 2373, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Business Info");
        if (optional.isPresent()) {
            this.a.aF((BusinessInfoData) optional.get());
            Context x = this.a.M.x();
            x.getClass();
            x.getContentResolver().notifyChange(upb.q(this.a.M.x()), null);
        }
    }
}
