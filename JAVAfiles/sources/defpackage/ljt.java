package defpackage;

import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.apps.messaging.multishare.viewmodel.MultiShareViewModel;
import com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ljt implements AutoCloseable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((apxa) this.a).b();
                        return;
                    } else {
                        ((apxa) this.a).b();
                        return;
                    }
                }
                ((ifq) ((StartChatViewModel) this.a).c.b()).f();
                return;
            }
            Iterator it = ((Set) ((ConversationViewModel) this.a).e.b()).iterator();
            while (it.hasNext()) {
                ((kkl) it.next()).close();
            }
            return;
        }
        ((ifq) ((MultiShareViewModel) this.a).b.b()).f();
    }
}
