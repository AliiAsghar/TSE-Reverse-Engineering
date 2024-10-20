package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iwm extends ijy<psk> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwm(ixd ixdVar) {
        super("RBM Metadata");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ParticipantsTable.BindData a;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$26", "onNewData", 3030, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: RBM Metadata");
        ((rrl) this.a.ca.a()).l = (psk) obj;
        if (((rrl) this.a.ca.a()).r() && (a = ((rrl) this.a.ca.a()).e.a()) != null) {
            this.a.aB(a);
        }
    }
}
