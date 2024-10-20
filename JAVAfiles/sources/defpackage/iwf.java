package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class iwf extends ijy<Optional<san>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwf(ixd ixdVar) {
        super("Conversation metadata");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        final Optional optional = (Optional) obj;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$20", "onNewData", 2783, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Conversation metadata");
        if (optional.isPresent()) {
            this.a.x = true;
            rrl rrlVar = (rrl) this.a.ca.a();
            san sanVar = (san) optional.get();
            if (!rrlVar.g.c.equals(sanVar)) {
                rrlVar.g.O(sanVar);
                rrlVar.b = rrl.d(rrlVar.g, rrlVar.c);
                if (!rrlVar.r() && !rrlVar.b.d()) {
                    if (rrlVar.b.c()) {
                        rrlVar.o(rrlVar.c(lga.W(sanVar.n())));
                    } else {
                        rrlVar.j = false;
                    }
                } else {
                    rrlVar.j = true;
                }
                rrlVar.k = lga.W(sanVar.n());
            }
            alvw d2 = ixd.a.d();
            d2.X(alwp.a, "Bugle");
            alvg alvgVar2 = (alvg) d2;
            alvgVar2.X(ydl.p, this.a.L);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$20", "onNewData", 2791, "ConversationFragmentPeer.java")).q("ConversationFragment: Updating Magic Compose visibility on conversation metadata new data");
            this.a.aI();
            ixd ixdVar = this.a;
            ixdVar.aX.a(ixdVar.bE, ixdVar.M.fe(), ixdVar.aW(), ((rrl) ixdVar.ca.a()).j);
            this.a.Q(null, new Consumer() { // from class: iwe
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj2) {
                    SelfIdentityId W = lga.W(((san) optional.get()).n());
                    if (W != null) {
                        iwf iwfVar = iwf.this;
                        if (iwfVar.a.cl.g() && !W.equals(((rsr) iwfVar.a.cl.a()).s())) {
                            ((rsr) iwfVar.a.cl.a()).R(W, ((rrl) iwfVar.a.ca.a()).c(W));
                        }
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.a.ag();
            this.a.ak(null);
            aluq listIterator = ((altx) this.a.aG).listIterator();
            while (listIterator.hasNext()) {
                ((iin) listIterator.next()).a((rrl) this.a.ca.a());
            }
            if (!((rrl) this.a.ca.a()).b.c() || ((rrl) this.a.ca.a()).r()) {
                ixd ixdVar2 = this.a;
                ixdVar2.cB.E(((rrl) ixdVar2.ca.a()).j, this.a.bg());
            }
            if (this.a.bd()) {
                ixd ixdVar3 = this.a;
                if (!ixdVar3.M.az()) {
                    ((abay) ixdVar3.aw.b()).a(R.string.email_convo_not_available_due_to_trusted_contacts, false);
                    this.a.cB.M();
                    return;
                } else {
                    ((abay) ixdVar3.aw.b()).a(R.string.email_convo_not_available_due_to_trusted_contacts, false);
                    this.a.O();
                    return;
                }
            }
            return;
        }
        ixd ixdVar4 = this.a;
        if (!ixdVar4.M.az()) {
            ixdVar4.cB.M();
        } else {
            ixdVar4.O();
        }
    }
}
