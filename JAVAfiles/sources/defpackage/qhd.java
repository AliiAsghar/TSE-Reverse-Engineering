package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qhd {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler");
    public final arpi b;
    public final armf c;
    public final qdx d;
    public final kkg e;
    private final armf f;
    private final armf g;
    private final armf h;

    public qhd(arpi arpiVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, kkg kkgVar, qdx qdxVar, armf armfVar6, armf armfVar7, arwe arweVar, lgg lggVar, yyb yybVar) {
        arpiVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        qdxVar.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        arweVar.getClass();
        lggVar.getClass();
        yybVar.getClass();
        this.b = arpiVar;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.c = armfVar5;
        this.e = kkgVar;
        this.d = qdxVar;
    }

    public final Object a(BugleConversationId bugleConversationId, arpe arpeVar) {
        return arro.F(((mlt) this.g.b()).a(bugleConversationId).b(), arpeVar);
    }

    public final Object b(BugleConversationId bugleConversationId, arpe arpeVar) {
        vpk vpkVar = (vpk) this.h.b();
        boolean a2 = ((pce) vpkVar.d.b()).a();
        ConversationIdType conversationIdType = bugleConversationId.a;
        if (a2) {
            return arro.q(vpkVar.e, new uwn(vpkVar, conversationIdType, (arpe) null, 19, (char[]) null), arpeVar);
        }
        return arro.q(vpkVar.f, new uwn(vpkVar, conversationIdType, (arpe) null, 20, (short[]) null), arpeVar);
    }

    public final Object c(mll mllVar) {
        Object c = ((ndi) this.f.b()).d(mllVar.c()).c();
        c.getClass();
        Iterable iterable = (Iterable) c;
        ArrayList arrayList = new ArrayList(aqjn.J(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolvedRecipient) it.next()).f());
        }
        alog aZ = alzz.aZ(arrayList);
        mllVar.getClass();
        if (mllVar.b() == mit.ONE_ON_ONE) {
            E e = aZ.get(0);
            e.getClass();
            msh mshVar = (msh) e;
            if (mshVar.e().isPresent()) {
                return new aoia((qei) mshVar.e().get());
            }
            return ((qnu) this.c.b()).d(mshVar.o(true));
        }
        String B = mllVar.B();
        if (B != null && B.length() > 0) {
            String A = mllVar.A();
            if (A != null && A.length() > 0) {
                if (!aZ.isEmpty()) {
                    qnu qnuVar = (qnu) this.c.b();
                    String B2 = mllVar.B();
                    B2.getClass();
                    String A2 = mllVar.A();
                    A2.getClass();
                    return qnuVar.h(B2, A2, aZ);
                }
                throw new IllegalArgumentException("No group participants provided.");
            }
            throw new IllegalArgumentException("RCS conference uri is missing.");
        }
        throw new IllegalArgumentException("RCS group id is missing.");
    }
}
