package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtk extends algf {
    static final algf a = new ajts();

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        Conversation conversation = (Conversation) obj;
        aozy createBuilder = wbk.a.createBuilder();
        aozy createBuilder2 = wcy.a.createBuilder();
        String b = conversation.b();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        wcy wcyVar = (wcy) createBuilder2.b;
        wcyVar.b |= 1;
        wcyVar.c = b;
        wcy wcyVar2 = (wcy) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbk wbkVar = (wbk) createBuilder.b;
        wcyVar2.getClass();
        wbkVar.e = wcyVar2;
        wbkVar.b |= 4;
        wcz wczVar = (wcz) a.m().fu(conversation.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        wbk wbkVar2 = (wbk) apagVar;
        wczVar.getClass();
        wbkVar2.d = wczVar;
        int i = 2;
        wbkVar2.b |= 2;
        if (conversation.c() - 1 != 0) {
            i = 3;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        wbk wbkVar3 = (wbk) createBuilder.b;
        wbkVar3.c = i - 1;
        wbkVar3.b |= 1;
        return (wbk) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* synthetic */ Object b(Object obj) {
        wbk wbkVar = (wbk) obj;
        atkm atkmVar = new atkm();
        algf algfVar = a;
        wcz wczVar = wbkVar.d;
        if (wczVar == null) {
            wczVar = wcz.a;
        }
        atkmVar.b((RcsDestinationId) algfVar.fu(wczVar));
        int Y = a.Y(wbkVar.c);
        int i = 1;
        if (Y == 0) {
            Y = 1;
        }
        int i2 = Y - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalArgumentException("Conversation type not supported");
                }
            } else {
                i = 2;
            }
        }
        atkmVar.d(i);
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        atkmVar.c(wcyVar.c);
        return atkmVar.a();
    }
}
