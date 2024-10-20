package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztz implements ieb {
    public final Context a;
    public final arwe b;
    public final ConversationId c;
    public final xwr d;
    public final armf e;
    public final armf f;
    public final zum g;
    public final lkd h;
    public final iek i;
    private final arpi j;
    private final boolean k;
    private final ico l;

    public ztz(Context context, arpi arpiVar, arwe arweVar, ConversationId conversationId, zum zumVar, lkd lkdVar, xwr xwrVar, armf armfVar, ico icoVar, iek iekVar, @oqd armf armfVar2) {
        context.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        conversationId.getClass();
        lkdVar.getClass();
        xwrVar.getClass();
        armfVar.getClass();
        icoVar.getClass();
        iekVar.getClass();
        armfVar2.getClass();
        this.a = context;
        this.j = arpiVar;
        this.b = arweVar;
        this.c = conversationId;
        this.g = zumVar;
        this.h = lkdVar;
        this.d = xwrVar;
        this.e = armfVar;
        this.l = icoVar;
        this.i = iekVar;
        this.f = armfVar2;
        Object e = zub.c.e();
        e.getClass();
        this.k = ((Boolean) e).booleanValue();
    }

    public static final boolean f(ndn ndnVar) {
        String str;
        if (ndnVar != null && (str = ((voo) ndnVar).f.e) != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ieb
    public final ascv a() {
        akrh e = aktp.e("AddContactBanner2DataServiceImpl#getAddContactBanner2LoadedDataFlow");
        zum zumVar = this.g;
        try {
            jdn jdnVar = new jdn(zumVar.c, zumVar.d, new zui(zumVar, null), 17, null);
            armd.i(e, null);
            return akec.a(armd.n(jdnVar, this.j), this.b, new zty(this, 0));
        } finally {
        }
    }

    @Override // defpackage.ieb
    public final boolean b() {
        return this.k;
    }

    public final void c() {
        qjh.l(this.b, this.j, new uxs(this, (arpe) null, 18), 2);
    }

    public final void d() {
        qjh.l(this.b, this.j, new uxs(this, (arpe) null, 19, (byte[]) null), 2);
    }

    public final void e(ResolvedRecipient resolvedRecipient, ConversationId conversationId) {
        this.l.g(new iha(resolvedRecipient, conversationId, 2, 14));
    }
}
