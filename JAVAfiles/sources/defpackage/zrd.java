package defpackage;

import com.google.android.apps.messaging.conversation.messagelist.tombstone.ConversationTombstoneView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zrd implements zxp {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zrd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.zxp
    public final void fT() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        aafk aafkVar = (aafk) this.a;
                        if (!aafkVar.o.isEmpty()) {
                            Iterator it = aafkVar.o.iterator();
                            while (it.hasNext()) {
                                aafkVar.m((aahj) it.next());
                            }
                            return;
                        }
                        return;
                    }
                    aacp aacpVar = (aacp) this.a;
                    aacpVar.f();
                    aacpVar.d();
                    aacpVar.g();
                    return;
                }
                ((ConversationMessageMetadataView) this.a).c();
                return;
            }
            ((ConversationTombstoneView) this.a).f();
            return;
        }
        ((zri) this.a).L();
    }
}
