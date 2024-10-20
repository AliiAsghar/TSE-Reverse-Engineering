package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jed implements jcu {
    public final Context a;
    public final arwe b;
    public final lre c;
    private final khb d;
    private final armf e;
    private final asai f;
    private final Set g;

    public jed(Context context, arwe arweVar, khb khbVar, lre lreVar, armf armfVar, oeu oeuVar, lkd lkdVar, ConversationId conversationId) {
        Object aghwVar;
        context.getClass();
        arweVar.getClass();
        khbVar.getClass();
        lreVar.getClass();
        armfVar.getClass();
        oeuVar.getClass();
        lkdVar.getClass();
        conversationId.getClass();
        this.a = context;
        this.b = arweVar;
        this.d = khbVar;
        this.c = lreVar;
        this.e = armfVar;
        asai a = khbVar.a();
        if (((Optional) ((apxx) armfVar).a).isPresent()) {
            aghwVar = ((jev) ((Optional) ((apxx) armfVar).a).get()).a();
        } else {
            aghwVar = new aghw(false, 9);
        }
        this.f = new jdn(a, aghwVar, new jdu(this, (arpe) null, 2), 17, null);
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
