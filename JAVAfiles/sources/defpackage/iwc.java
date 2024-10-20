package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iwc extends ijy<atal> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwc(ixd ixdVar) {
        super("Verified SMS brand info");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String str;
        atal atalVar = (atal) obj;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$19", "onNewData", 2759, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Verified SMS brand info");
        int i = atalVar.a;
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            ixd ixdVar = this.a;
            if (i != 3) {
                if (i != 1) {
                    str = "REMOVE_DATA";
                } else {
                    str = "DO_NOTHING";
                }
                throw new IllegalStateException("Cannot get brand data from current operation: ".concat(str));
            }
            Object obj2 = atalVar.b;
            obj2.getClass();
            ixdVar.aF((BusinessInfoData) obj2);
            return;
        }
        this.a.aF(null);
    }
}
