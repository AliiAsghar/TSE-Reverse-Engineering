package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vth {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final armf b;
    public final armf c;
    public final armf d;
    public final nfx e;
    public final armf f;
    public final arwe g;
    public final osp h;

    public vth(armf armfVar, armf armfVar2, armf armfVar3, nfx nfxVar, armf armfVar4, arwe arweVar, osp ospVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        nfxVar.getClass();
        armfVar4.getClass();
        arweVar.getClass();
        ospVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = nfxVar;
        this.f = armfVar4;
        this.g = arweVar;
        this.h = ospVar;
    }

    public static final boolean c(alog alogVar) {
        if (alogVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = alogVar.iterator();
        while (it.hasNext()) {
            if (!((nfw) it.next()).p()) {
                return true;
            }
        }
        return false;
    }

    public final Object a(arpe arpeVar) {
        if (this.h.a()) {
            akul b = this.e.a().b();
            b.getClass();
            return arro.F(b, arpeVar);
        }
        int i = alog.d;
        return alsx.a;
    }

    public final void b(qez qezVar, qbs qbsVar, aplo aploVar) {
        qezVar.getClass();
        aploVar.getClass();
        ConversationIdType conversationIdType = qbsVar.a;
        if (conversationIdType.b()) {
            ((alwl) a.i()).q("Propagating invalid groupConversationId. Impossible to log participant count.");
        } else {
            qjh.l(this.g, null, new vtg(this, qezVar, conversationIdType, aploVar, null), 3);
        }
    }
}
