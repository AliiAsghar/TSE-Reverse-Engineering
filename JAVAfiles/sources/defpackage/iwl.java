package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iwl extends ijy<alog<ParticipantsTable.BindData>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwl(ixd ixdVar) {
        super("Subscription");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        alog alogVar = (alog) obj;
        if (((Boolean) ryf.a.e()).booleanValue()) {
            return;
        }
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$25", "onNewData", 3016, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Subscription");
        rrl rrlVar = (rrl) this.a.ca.a();
        rrlVar.f.i(alogVar);
        rrlVar.h = rrlVar.o.o(rrlVar.f.g());
        this.a.ao();
    }
}
