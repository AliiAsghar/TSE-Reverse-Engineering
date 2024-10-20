package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeb implements jcu {
    public final arwe a;
    public final armf b;
    public final armf c;
    public final arqv d;
    public final lkd e;
    public final lfx f;
    private final Context g;
    private final asai h;
    private final asai i;
    private final Optional j;
    private final asai k;
    private final asai l;
    private final Set m;

    /* JADX WARN: Multi-variable type inference failed */
    public jeb(Context context, arwe arweVar, asai asaiVar, lfx lfxVar, asai asaiVar2, ConversationId conversationId, lkd lkdVar, Optional optional, armf armfVar, armf armfVar2) {
        aghw aghwVar;
        aghw aghwVar2;
        aghw aghwVar3;
        context.getClass();
        arweVar.getClass();
        asaiVar.getClass();
        lfxVar.getClass();
        asaiVar2.getClass();
        conversationId.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.g = context;
        this.a = arweVar;
        this.h = asaiVar;
        this.f = lfxVar;
        this.i = asaiVar2;
        this.e = lkdVar;
        this.j = optional;
        this.b = armfVar;
        this.c = armfVar2;
        zxy zxyVar = (zxy) arsd.k(optional);
        if (zxyVar != null) {
            aghwVar = zxyVar.c;
        } else {
            aghwVar = new aghw(null, 9);
        }
        zxy zxyVar2 = (zxy) arsd.k(optional);
        if (zxyVar2 != null) {
            aghwVar2 = zxyVar2.b;
        } else {
            aghwVar2 = new aghw(null, 9);
        }
        asdn asdnVar = new asdn(new jcw((arpe) null, 2, (char[]) null), new ifm(new idx(qkq.h(aghwVar, aghwVar2, arweVar, new jdy(null, 0)), this, 6), 4));
        this.k = asdnVar;
        zxy zxyVar3 = (zxy) arsd.k(optional);
        if (zxyVar3 != null) {
            aghwVar3 = zxyVar3.c;
        } else {
            aghwVar3 = new aghw(null, 9);
        }
        this.l = qkq.g(asaiVar, asaiVar2, aghwVar3, asdnVar, arweVar, new jdx(this, null));
        this.d = qkf.g(new ifp((Object) this, 2, (char[]) null), arweVar);
        this.m = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.m;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.l;
    }

    public final aehz c(miu miuVar) {
        int i;
        if (miuVar.b() == mit.GROUP) {
            i = R.string.action_people_and_options_group;
        } else {
            i = R.string.action_people_and_options;
        }
        String string = this.g.getString(i);
        string.getClass();
        return new aehz(string, aerb.br, false, true, true, false, null, null, new jdr(this, miuVar, 4), 996);
    }
}
