package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfh implements jcu {
    public final armf a;
    private final asai b;
    private final asai c;
    private final Set d;

    public jfh(Context context, ascg ascgVar, jsy jsyVar, ConversationId conversationId, armf armfVar, asai asaiVar) {
        context.getClass();
        ascgVar.getClass();
        jsyVar.getClass();
        conversationId.getClass();
        armfVar.getClass();
        asaiVar.getClass();
        this.a = armfVar;
        this.b = asaiVar;
        this.c = new jdn(asar.a(new akee((arqv) new jcx((arpe) null, 2, (char[]) null), (asai) new ifm(new ifm(ascgVar, 5), 6), 4)), asaiVar, new jfe(this, context, jsyVar, null), 17, null);
        this.d = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.c;
    }
}
