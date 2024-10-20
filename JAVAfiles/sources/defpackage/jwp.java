package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl");
    public final arwe b;
    public final arwe c;
    public final armf d;
    public final ConversationId e;
    public final asai f;
    public final armf g;
    public final ico h;
    private final Context i;
    private final arwe j;
    private final asai k;
    private final asai l;
    private final asai m;
    private final asai n;
    private final asai o;

    public jwp(Context context, arwe arweVar, arwe arweVar2, arwe arweVar3, armf armfVar, ConversationId conversationId, asai asaiVar, asai asaiVar2, asai asaiVar3, ico icoVar, armf armfVar2, lfl lflVar) {
        context.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        arweVar3.getClass();
        armfVar.getClass();
        conversationId.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        asaiVar3.getClass();
        icoVar.getClass();
        armfVar2.getClass();
        lflVar.getClass();
        this.i = context;
        this.j = arweVar;
        this.b = arweVar2;
        this.c = arweVar3;
        this.d = armfVar;
        this.e = conversationId;
        this.f = asaiVar;
        this.k = asaiVar2;
        this.l = asaiVar3;
        this.h = icoVar;
        this.g = armfVar2;
        aghw aghwVar = new aghw(new jtf(asaiVar2, 17), 11);
        this.m = aghwVar;
        asai P = arrn.P(aghwVar, asaiVar3, asaiVar, new jit(this, (arpe) null, 3));
        this.n = P;
        this.o = new jdn(P, lflVar.c(jza.a), new jwo(null, 0), 17, null);
    }

    public final ascv a() {
        String string = this.i.getString(R.string.unwanted_messages_toolstone_link);
        string.getClass();
        String string2 = this.i.getString(R.string.unwanted_messages_toolstone_text, string);
        string2.getClass();
        jdn jdnVar = new jdn(arrn.P(this.m, this.f, this.o, new jwm(string2, string, this, null)), new akee(new jtf(this.n, 16), new jsu(this, (arpe) null, 7, (byte[]) null), 10), new jwk(null, 0), 17, null);
        int i = ascp.a;
        return arrn.T(jdnVar, this.j, asco.a, null);
    }
}
