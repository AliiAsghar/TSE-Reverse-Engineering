package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jei implements jcu {
    public final Optional a;
    public final lkd b;
    private final khb c;
    private final armf d;
    private final asai e;
    private final asai f;
    private final Set g;

    public jei(Context context, ConversationId conversationId, khb khbVar, lkd lkdVar, armf armfVar, asai asaiVar, Optional optional, lre lreVar) {
        context.getClass();
        conversationId.getClass();
        khbVar.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        asaiVar.getClass();
        lreVar.getClass();
        this.c = khbVar;
        this.b = lkdVar;
        this.d = armfVar;
        this.e = asaiVar;
        this.a = optional;
        this.f = new jdn(asaiVar, khbVar.a(), new jeh(context, this, null), 17, null);
        this.g = aqjn.e(khe.b);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.f;
    }
}
