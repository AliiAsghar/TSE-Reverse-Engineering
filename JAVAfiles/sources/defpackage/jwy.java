package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwy {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/customthemes/SelectedThemeTracker");
    public final ConversationId b;
    public final miw c;
    public final xnv d;
    public final khl e;
    public final ascv f;
    public final ascv g;
    private final asai h;
    private final arwe i;
    private final Context j;
    private final boolean k;
    private final ahhm l;
    private final asai m;
    private final asai n;

    public jwy(asai asaiVar, asai asaiVar2, ConversationId conversationId, arwe arweVar, Context context, miw miwVar, xnv xnvVar, khl khlVar) {
        boolean z;
        asaiVar.getClass();
        asaiVar2.getClass();
        conversationId.getClass();
        arweVar.getClass();
        context.getClass();
        miwVar.getClass();
        xnvVar.getClass();
        khlVar.getClass();
        this.h = asaiVar2;
        this.b = conversationId;
        this.i = arweVar;
        this.j = context;
        this.c = miwVar;
        this.d = xnvVar;
        this.e = khlVar;
        boolean r = d.r();
        this.k = r;
        ahhm ahhmVar = (ahhm) afac.a.a(context, Boolean.valueOf(r));
        this.l = ahhmVar;
        afab afabVar = afab.a;
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        afabVar.a(Boolean.valueOf(z), ahhmVar, Boolean.valueOf(r));
        jtf jtfVar = new jtf(asar.a(new jtf(asaiVar2, 19)), 20);
        this.m = jtfVar;
        int i = ascp.a;
        this.f = arrn.T(jtfVar, arweVar, asco.b, null);
        asai a2 = asar.a(new jxj(asaiVar, 1));
        this.n = a2;
        this.g = arrn.T(new jdn(a2, jtfVar, new jdu(this, (arpe) null, 6), 17, null), arweVar, asco.b, afac.a);
    }
}
