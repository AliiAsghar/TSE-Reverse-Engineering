package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ken {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter");
    public final arwe b;
    public final Context c;
    public final arpi d;
    public final armf e;
    public final pjy f;
    public final jxn g;
    public final mjg h;
    public final Set i;
    public final arqy j;
    public final arqr k;
    public final arqr l;
    public final lkd m;
    public final lnb n;
    private final Conversation o;
    private final qdq p;

    public ken(arwe arweVar, Context context, arpi arpiVar, Conversation conversation, armf armfVar, lkd lkdVar, qdq qdqVar, lnb lnbVar, armf armfVar2, armf armfVar3, pjy pjyVar, jxn jxnVar) {
        arweVar.getClass();
        context.getClass();
        arpiVar.getClass();
        conversation.getClass();
        armfVar.getClass();
        lkdVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.b = arweVar;
        this.c = context;
        this.d = arpiVar;
        this.o = conversation;
        this.e = armfVar;
        this.m = lkdVar;
        this.p = qdqVar;
        this.n = lnbVar;
        this.f = pjyVar;
        this.g = jxnVar;
        armd.a(new kdz(armfVar3, 4));
        this.h = conversation.b();
        this.i = new LinkedHashSet();
        qjh.l(arweVar, null, new kbl(this, (arpe) null, 4), 3);
        this.j = new qjm(new arsb(), arweVar, new kem(this));
        this.k = qkf.f(new jya((Object) this, 14, (char[][][]) null), arweVar);
        this.l = qkf.f(new jya((Object) this, 13, (byte[][][]) null), arweVar);
    }

    public final void a(loq loqVar) {
        afsx H = afwv.H(loqVar.a);
        if (H == null) {
            return;
        }
        this.p.u(new jgw(H, loqVar.b, null, afco.a));
    }
}
