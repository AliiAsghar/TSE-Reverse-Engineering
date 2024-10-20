package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUsageStatisticsState;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iwj extends ijy<rsa> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwj(ixd ixdVar) {
        super("Conversation participants");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        boolean z;
        cj fe;
        boolean z2;
        Compose2oFragment compose2oFragment;
        rsa rsaVar = (rsa) obj;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$23", "onNewData", 2977, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Conversation participants");
        ixd ixdVar = this.a;
        ixdVar.aX.b(ixdVar.bE, ixdVar.M.fe());
        rrl rrlVar = (rrl) this.a.ca.a();
        int i = 0;
        if (rsaVar.e().count() > 0) {
            z = true;
        } else {
            z = false;
        }
        rrlVar.d = z;
        rrlVar.e = rsaVar;
        ixd ixdVar2 = this.a;
        if (((rrl) ixdVar2.ca.a()).d) {
            ixdVar2.Y();
            rrl rrlVar2 = (rrl) ixdVar2.ca.a();
            Context x = ixdVar2.M.x();
            x.getClass();
            ixdVar2.cb = rrlVar2.b(x);
            if (ixdVar2.C == null && (compose2oFragment = (Compose2oFragment) ixdVar2.M.G().e("c2oFragment")) != null) {
                ixdVar2.C = compose2oFragment.E();
            }
            ParticipantsTable.BindData a = ((rrl) ixdVar2.ca.a()).e.a();
            int i2 = ((rrl) ixdVar2.ca.a()).e.e;
            lex lexVar = ixdVar2.cB;
            boolean r = ((rrl) ixdVar2.ca.a()).r();
            rrl rrlVar3 = (rrl) ixdVar2.ca.a();
            ParticipantsTable.BindData a2 = rrlVar3.e.a();
            int i3 = 6;
            if (!rrlVar3.b.b() && a2 != null) {
                i3 = a2.r();
            }
            tqc tqcVar = ((rrl) ixdVar2.ca.a()).b.a;
            List r2 = ixdVar2.cY.r(((rrl) ixdVar2.ca.a()).e.f());
            tqcVar.getClass();
            lexVar.v.isPresent();
            ConversationActivityUsageStatisticsState m = lexVar.m();
            if (m.c < 0 && !lexVar.d().c()) {
                m.c = i2;
                m.h = r;
                m.l = yzc.g(i3);
                m.m = tqc.i(tqcVar);
                m.k = r2;
                lexVar.z();
            }
            ixdVar2.cB.g();
            itb itbVar = ixdVar2.bX;
            rsa rsaVar2 = ((rrl) ixdVar2.ca.a()).e;
            itbVar.u.a = true;
            ird irdVar = itbVar.aq;
            if (irdVar != null) {
                if (rsaVar2.a() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                irdVar.j(z2, true);
            }
            itbVar.ao.setVisibility(0);
            ixdVar2.Q(null, new ivb(i2, i));
            ixdVar2.ci = true;
            ixdVar2.ad();
            ixdVar2.ac();
            ixdVar2.aN((rsr) ixdVar2.cl.a());
            if (a != null && ((rrl) ixdVar2.ca.a()).r()) {
                irb irbVar = ixdVar2.bX.aq.d;
                irbVar.F(irbVar.c, a);
                ixdVar2.aB(a);
            }
            ixdVar2.aL();
            ArrayList f = ((rrl) ixdVar2.ca.a()).e.f();
            int size = f.size();
            if (!((ConversationIdType) ixdVar2.I.getAndSet(ixdVar2.L)).equals(ixdVar2.L) && size != 1) {
                int size2 = f.size();
                while (true) {
                    if (i < size2) {
                        if (((ParticipantsTable.BindData) f.get(i)).R() && (fe = ixdVar2.M.fe()) != null && !fe.isFinishing()) {
                            ixdVar2.bN = ixdVar2.av.h(R.string.in_conversation_blocked_contact_text);
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            ixdVar2.ab();
        }
    }
}
