package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdp implements jcu {
    public final Context a;
    public final miw b;
    public final yti c;
    public final xzu d;
    public final abco e;
    public final aksr f;
    public final armf g;
    public final armf h;
    public final asai i;
    public final Set j;
    public final lre k;
    public final lkd l;
    private final arwe m;
    private final asai n;

    public jdp(Context context, arwe arweVar, miw miwVar, lre lreVar, yti ytiVar, xzu xzuVar, abco abcoVar, aksr aksrVar, lkd lkdVar, asai asaiVar, asai asaiVar2, armf armfVar, armf armfVar2) {
        context.getClass();
        arweVar.getClass();
        miwVar.getClass();
        lreVar.getClass();
        ytiVar.getClass();
        xzuVar.getClass();
        abcoVar.getClass();
        aksrVar.getClass();
        lkdVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = context;
        this.m = arweVar;
        this.b = miwVar;
        this.k = lreVar;
        this.c = ytiVar;
        this.d = xzuVar;
        this.e = abcoVar;
        this.f = aksrVar;
        this.l = lkdVar;
        this.n = asaiVar2;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = new jdn(asaiVar, asaiVar2, new jdu(this, (arpe) null, 1), 17, null);
        this.j = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.j;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.i;
    }

    public final void c(ConversationId conversationId) {
        qjh.l(this.m, null, new gbv(this, conversationId, (arpe) null, 20), 3);
    }
}
