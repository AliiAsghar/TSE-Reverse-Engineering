package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class iwo implements akgh<Optional<ime>> {
    final /* synthetic */ ixd a;

    public iwo(ixd ixdVar) {
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        if (!this.a.aV()) {
            alvw i = ixd.a.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) ((alvg) i).g(th);
            alvgVar.X(ydl.p, this.a.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$27", "onError", 3085, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to read draft from storage.");
            this.a.Q(null, new ivn(17));
        }
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        final Optional optional = (Optional) obj;
        this.a.Q(null, new Consumer() { // from class: iwn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void q(Object obj2) {
                iwo iwoVar = iwo.this;
                ixd ixdVar = iwoVar.a;
                ComposeMessageView composeMessageView = (ComposeMessageView) obj2;
                ixdVar.cF.e(ixdVar.bE, ixdVar.M.fe());
                Optional optional2 = optional;
                if (optional2.isPresent()) {
                    ime imeVar = (ime) optional2.get();
                    rsr rsrVar = (rsr) composeMessageView.E().s().a();
                    String b = composeMessageView.E().s().b();
                    MessageCoreData messageCoreData = imeVar.a;
                    rto rtoVar = imeVar.b;
                    Context x = iwoVar.a.M.x();
                    x.getClass();
                    rsrVar.L(b, messageCoreData, rtoVar, x);
                    if (imeVar.c != null) {
                        zrb E = composeMessageView.E();
                        imeVar.c.getClass();
                        E.ab();
                    }
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
