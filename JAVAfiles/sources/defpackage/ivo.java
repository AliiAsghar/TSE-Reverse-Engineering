package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivo implements Consumer {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ivo(amvm amvmVar, amvl amvlVar, boolean z, int i) {
        this.d = i;
        this.c = amvmVar;
        this.b = amvlVar;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            xyo c = xac.c.c();
                            c.H("Logged syncRequestFailed to clearcut.");
                            c.z("reason", this.c);
                            c.z("problem", this.b);
                            c.A("isFullSync", this.a);
                            c.q();
                            return;
                        }
                        adiw adiwVar = new adiw(((wxb) obj).c);
                        Object obj2 = this.b;
                        vrj vrjVar = (vrj) obj2;
                        vrjVar.l(adiwVar, (vrk) this.c, this.a);
                        return;
                    }
                    SelectedConversation L = lga.L((kzx) obj);
                    ConversationIdType conversationIdType = L.a;
                    if (conversationIdType == null) {
                        return;
                    }
                    Object obj3 = this.b;
                    boolean z = this.a;
                    aaig aaigVar = (aaig) this.c;
                    aaigVar.b = ((kvw) obj3).aP;
                    if (z) {
                        aaigVar.a.put(conversationIdType, L);
                    } else {
                        aaigVar.a.remove(conversationIdType);
                    }
                    aaigVar.d();
                    return;
                }
                int m = ((rsr) ((ComposeMessageView) obj).E().s().a()).m();
                ((ixd) this.b).cz.c((ConversationIdType) this.c, this.a, m);
                return;
            }
            ((rsr) ((ComposeMessageView) obj).E().s().a()).F();
            imk imkVar = ((ixd) this.b).bG;
            imkVar.getClass();
            imkVar.d(this.c, this.a);
            return;
        }
        int m2 = ((ila) obj).d().m();
        ((ixd) this.b).cz.c((ConversationIdType) this.c, this.a, m2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                    return Consumer$CC.$default$andThen(this, consumer);
                }
                return Consumer$CC.$default$andThen(this, consumer);
            }
            return Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ ivo(Object obj, Object obj2, boolean z, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }
}
