package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class zrv implements akgh<Conversation> {
    final /* synthetic */ zrt a;

    public zrv(zrt zrtVar) {
        this.a = zrtVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        ((abbu) this.a.E().b.b()).k(R.string.conversation_creation_failure);
    }

    /* JADX WARN: Type inference failed for: r4v26, types: [armf, java.lang.Object] */
    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        ConversationIdType conversationIdType;
        zrw E = this.a.E();
        ConversationId c = ((Conversation) obj).c();
        Intent intent = this.a.F().getIntent();
        Optional b = E.b(intent);
        if (b.isPresent()) {
            Object obj2 = b.get();
            if (((obm) E.m.b()).a()) {
                conversationIdType = lgc.H(c);
            } else if (c instanceof RbmConversationId) {
                conversationIdType = ((RbmConversationId) c).a;
            } else {
                conversationIdType = ((BugleConversationId) c).a;
            }
            psi psiVar = (psi) E.c.b();
            aktp.ah(new itl(psiVar, conversationIdType, obj2, 13), psiVar.c).k(qiu.b(), andi.a);
            Uri data = intent.getData();
            if (!conversationIdType.b() && data != null) {
                lpg lpgVar = (lpg) E.e.b();
                aozy createBuilder = umn.a.createBuilder();
                String a = conversationIdType.a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                a.getClass();
                ((umn) apagVar).c = a;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((umn) createBuilder.b).d = (String) obj2;
                String uri = zrw.a(data).toString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                umn umnVar = (umn) createBuilder.b;
                uri.getClass();
                umnVar.b = uri;
                ((uof) lpgVar.a.b()).b(upk.a("rbm_chatbot_directory_welcome_message", (umn) createBuilder.s()));
            } else if (conversationIdType.b()) {
                alvw i = zrw.a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "processWelcomeMessage", 403, "LaunchConversationFragmentPeer.java")).q("Conversation has not been created: id is null.");
            } else {
                alvw i2 = zrw.a.i();
                i2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "processWelcomeMessage", 405, "LaunchConversationFragmentPeer.java")).q("Data URI is absent.");
            }
            lpg lpgVar2 = (lpg) E.d.b();
            aozy createBuilder2 = umk.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            String str = (String) obj2;
            ((umk) apagVar2).b = str;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            ((umk) createBuilder2.b).d = a.am(3);
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((umk) createBuilder2.b).c = a.an(3);
            lpgVar2.F((umk) createBuilder2.s(), new uta(str, str, null, null, null, null));
        }
        E.c(c, b.isPresent(), null);
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}
