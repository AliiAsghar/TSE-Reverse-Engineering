package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbe {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/startchat/groupname/GroupNameUiAdapterImpl");
    private final ascv A;
    public final Context b;
    public final zaw c;
    public final ConversationId d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final zbk j;
    public final obu k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final ascd q;
    public final ascd r;
    public final ascv s;
    public final ascd t;
    public final ascv u;
    public final AtomicBoolean v;
    public final zen w;
    private final arwe x;
    private final arpi y;
    private final ascv z;

    public zbe(arwe arweVar, Context context, arpi arpiVar, zaw zawVar, ConversationId conversationId, armf armfVar, armf armfVar2, armf armfVar3, zen zenVar, armf armfVar4, armf armfVar5, zbk zbkVar, obu obuVar, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        arweVar.getClass();
        context.getClass();
        arpiVar.getClass();
        zawVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        zenVar.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        zbkVar.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        this.x = arweVar;
        this.b = context;
        this.y = arpiVar;
        this.c = zawVar;
        this.d = conversationId;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.w = zenVar;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = zbkVar;
        this.k = obuVar;
        this.l = armfVar6;
        this.m = armfVar7;
        this.n = armfVar8;
        this.o = armfVar9;
        this.p = armfVar10;
        if (zawVar.b && conversationId == null) {
            throw new IllegalStateException("Check failed.");
        }
        qkk qkkVar = new qkk(zenVar.e, this, 10);
        int i = ascp.a;
        ascv T = arrn.T(qkkVar, arweVar, asco.a(0L, 3), null);
        this.z = T;
        ascd a2 = ascy.a(zawVar.a);
        this.q = a2;
        ascv T2 = arrn.T(new qkk(zenVar.e, this, 11), arweVar, asco.a(0L, 3), context.getString(R.string.group_name_description_rcs_pending));
        this.A = T2;
        ascd a3 = ascy.a(Boolean.valueOf(zawVar.b));
        this.r = a3;
        ascv T3 = arrn.T(asar.a(new lhh(a2, 12)), arweVar, asco.a(0L, 3), false);
        this.s = T3;
        ascd a4 = ascy.a(null);
        this.t = a4;
        this.u = arrn.T(new qkk(new asai[]{T, a2, T2, a3, T3, a4}, this, 9), arweVar, asco.a(0L, 3), new zbg(null));
        this.v = new AtomicBoolean();
    }

    public final void a() {
        if (this.v.getAndSet(true)) {
            return;
        }
        qjh.l(this.x, null, new yqs(this, (String) this.q.c(), (arpe) null, 15), 3);
    }

    public final boolean b() {
        if (!this.c.b && !((Boolean) yyv.c.e()).booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (b() && !((Boolean) this.r.c()).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.zem r26, java.lang.String r27, defpackage.arpe r28) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbe.d(zem, java.lang.String, arpe):java.lang.Object");
    }

    public final Object e(zem zemVar, arpe arpeVar) {
        return arro.q(this.y, new zaz(this, zemVar, null), arpeVar);
    }
}
