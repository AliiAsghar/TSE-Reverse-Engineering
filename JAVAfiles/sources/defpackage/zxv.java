package defpackage;

import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxv {
    public final ConversationDetailsActivity a;
    public final armf b;
    public final armf c;

    public zxv(ConversationDetailsActivity conversationDetailsActivity, armf armfVar, armf armfVar2, ajxd ajxdVar, akag akagVar) {
        armfVar.getClass();
        armfVar2.getClass();
        ajxdVar.getClass();
        akagVar.getClass();
        this.a = conversationDetailsActivity;
        this.b = armfVar;
        this.c = armfVar2;
        ((Optional) armfVar.b()).ifPresent(new zrg(new aaoa(ajxdVar, this, akagVar, 1), 15));
    }

    public final void a() {
        this.a.finishAfterTransition();
    }

    public final void b() {
        da a = this.a.a();
        cg e = a.e("GroupRenameFragment");
        if (e == null) {
            a();
            return;
        }
        bd bdVar = new bd(a);
        bdVar.n(e);
        bdVar.b();
        cg e2 = a.e("ConversationDetailsFragment");
        if (e2 == null) {
            return;
        }
        a.ak(e2.H);
    }
}
