package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxc implements rsm {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public zxc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    private final boolean a(rsr rsrVar) {
        int o = rsrVar.o();
        if (o != ((zxf) this.a).h) {
            ((alwl) zxf.a.m().h("com/google/android/apps/messaging/ui/conversation/conversationbottombar/ConversationBottomBarDataService$3", "updateIfProtocolChanged", 165, "ConversationBottomBarDataService.java")).u("Protocol changed: from %d to %d.", ((zxf) this.a).h, o);
            ((zxf) this.a).h = o;
            return true;
        }
        return false;
    }

    @Override // defpackage.rsm
    public final void ah() {
        if (this.b != 0) {
            alvw i = ixd.a.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) i;
            alvgVar.X(ydl.p, ((ixd) this.a).L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$31", "onDraftAttachmentLoadFailed", 5230, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to load an attachment while trying to send message.");
        }
    }

    @Override // defpackage.rsm
    public final void ai(rsr rsrVar, int i) {
        Optional empty;
        if (this.b != 0) {
            if (!((ixd) this.a).M.aA() && (i & 1) == 1 && uvl.m(rsrVar) && rsrVar.t.isEmpty()) {
                if (rsrVar.ad()) {
                    rsrVar.J(false);
                }
                ((ixd) this.a).at(rsrVar);
                return;
            }
            return;
        }
        if (a(rsrVar)) {
            ((zxf) this.a).a();
        }
        int q = rsrVar.q();
        zxf zxfVar = (zxf) this.a;
        int i2 = zxfVar.i;
        if (q != i2) {
            zxfVar.i = rsrVar.q();
            empty = Optional.of(Integer.valueOf(i2));
        } else {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            ((zxf) this.a).c(((Integer) empty.get()).intValue());
            zxf zxfVar2 = (zxf) this.a;
            zxfVar2.b(zxfVar2.i);
            ((zxf) this.a).a();
            ((alwl) zxf.a.m().h("com/google/android/apps/messaging/ui/conversation/conversationbottombar/ConversationBottomBarDataService$3", "onDraftChanged", 143, "ConversationBottomBarDataService.java")).B("Subscription changed: old subId %d, new subId %d.", empty.get(), ((zxf) this.a).i);
        }
    }

    @Override // defpackage.rsm
    public final void al(rsr rsrVar) {
        if (this.b == 0 && a(rsrVar)) {
            ((zxf) this.a).a();
        }
    }

    @Override // defpackage.rsm
    public final void bp(rsr rsrVar) {
        if (this.b != 0) {
            alvw i = ixd.a.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) i;
            alvgVar.X(ydl.p, ((ixd) this.a).L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$31", "onDraftAttachmentLimitReached", 5220, "ConversationFragmentPeer.java")).q("ConversationFragment: Trying to send too many attachments! Attachments will be truncated.");
        }
    }
}
