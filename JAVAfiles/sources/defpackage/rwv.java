package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwv {
    public static final alhr a = uuh.x(184269564, "enable_outgoing_message_insertion_listeners");
    public final arpi b;
    public final arpi c;
    public final arwe d;
    public final armf e;
    private final arml f;
    private final arml g;

    public rwv(arpi arpiVar, arpi arpiVar2, arwe arweVar, armf armfVar, apwt apwtVar) {
        arpiVar.getClass();
        arpiVar2.getClass();
        arweVar.getClass();
        armfVar.getClass();
        apwtVar.getClass();
        this.b = arpiVar;
        this.c = arpiVar2;
        this.d = arweVar;
        this.e = armfVar;
        this.f = armd.a(tzt.b);
        this.g = armd.a(new quz(this, apwtVar, 7));
    }

    public final Boolean a() {
        return (Boolean) this.f.a();
    }

    public final Collection b() {
        return (Collection) this.g.a();
    }

    public final void c(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        akrh e = aktp.e("OutgoingMessageInsertionListenersManager::onSplitIntoMessage");
        try {
            Iterator it = b().iterator();
            while (it.hasNext()) {
                ((rwt) it.next()).fL();
            }
            armd.i(e, null);
        } finally {
        }
    }
}
