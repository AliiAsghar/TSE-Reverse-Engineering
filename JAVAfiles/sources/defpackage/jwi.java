package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwi implements jwe {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl");
    public static final aeom b = new aeom(arnv.a, null, jld.u);
    public final ConversationId c;
    public final arpi d;
    public final miw e;
    public final jwd f;
    public final armf g;
    public final ovl h;
    public final jxv i;
    private final arwe j;
    private final arpi k;
    private final asai l;
    private final ascv m;

    public jwi(ConversationId conversationId, arwe arweVar, arpi arpiVar, arpi arpiVar2, miw miwVar, jwd jwdVar, asai asaiVar, asai asaiVar2, ascg ascgVar, armf armfVar, ovl ovlVar, jxv jxvVar) {
        conversationId.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        miwVar.getClass();
        asaiVar2.getClass();
        ascgVar.getClass();
        armfVar.getClass();
        jxvVar.getClass();
        this.c = conversationId;
        this.j = arweVar;
        this.k = arpiVar;
        this.d = arpiVar2;
        this.e = miwVar;
        this.f = jwdVar;
        this.g = armfVar;
        this.h = ovlVar;
        this.i = jxvVar;
        asai a2 = asar.a(new jtf(new jtf(ascgVar, 14), 15));
        this.l = a2;
        qjh.l(arweVar, arpiVar, new jvr(asaiVar, this, (arpe) null, 6), 2);
        asai P = arrn.P(a2, asaiVar2, asaiVar, new jwh(this, null));
        int i = ascp.a;
        this.m = arrn.T(P, arweVar, asco.b, b);
    }

    @Override // defpackage.jwe
    public final ascv a() {
        return this.m;
    }

    public final void b(nfw nfwVar) {
        qjh.l(this.j, this.k, new jvr(nfwVar, this, (arpe) null, 7), 2);
    }
}
