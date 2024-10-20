package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aacm implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aacm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [zxp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [zxp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v31, types: [xun, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        Object obj2;
        ?? r1;
        switch (this.b) {
            case 0:
                zfh zfhVar = (zfh) obj;
                aacp aacpVar = (aacp) this.a;
                zfhVar.b(aacpVar.o, R.dimen.conversation_message_text_size);
                zfhVar.b(aacpVar.p, R.dimen.conversation_message_text_size);
                return;
            case 1:
                ((zfh) obj).b(((ConversationMessageMetadataView) this.a).j, R.dimen.message_metadata_text_size);
                return;
            case 2:
                ((zxq) obj).k(((aacp) this.a).y);
                return;
            case 3:
                akul c = ((zhc) obj).c();
                Object obj3 = this.a;
                zet zetVar = new zet(obj3, 10);
                aacp aacpVar2 = (aacp) obj3;
                aacpVar2.B = c.h(zetVar, aacpVar2.c);
                return;
            case 4:
                RepliedToDataAdapter repliedToDataAdapter = ((aacp) this.a).i.r;
                ((luf) obj).a();
                return;
            case 5:
                ((zxq) obj).b(((aacp) this.a).y);
                return;
            case 6:
                wyp wypVar = (wyp) this.a;
                ((mag) obj).c(((rry) wypVar.f).u(), ((aacp) wypVar.e).q);
                return;
            case 7:
                ConversationMessageView conversationMessageView = (ConversationMessageView) this.a;
                xcs xcsVar = (xcs) conversationMessageView.N.b();
                String f = ((rve) obj).f();
                ashu m = ((kor) conversationMessageView.T.b()).m(conversationMessageView.e);
                int c2 = conversationMessageView.e.c();
                conversationMessageView.e.ak();
                xcsVar.j(f, m, c2);
                return;
            case 8:
                ConversationMessageView conversationMessageView2 = (ConversationMessageView) this.a;
                xcs xcsVar2 = (xcs) conversationMessageView2.N.b();
                ashu m2 = ((kor) conversationMessageView2.T.b()).m(conversationMessageView2.e);
                int c3 = conversationMessageView2.e.c();
                conversationMessageView2.e.ak();
                xcsVar2.m((String) obj, m2, c3);
                return;
            case 9:
                ConversationMessageView conversationMessageView3 = (ConversationMessageView) this.a;
                xcs xcsVar3 = (xcs) conversationMessageView3.N.b();
                ashu m3 = ((kor) conversationMessageView3.T.b()).m(conversationMessageView3.e);
                int c4 = conversationMessageView3.e.c();
                conversationMessageView3.e.ak();
                xcsVar3.n((String) obj, m3, c4);
                return;
            case 10:
                ConversationMessageView conversationMessageView4 = (ConversationMessageView) this.a;
                xcs xcsVar4 = (xcs) conversationMessageView4.N.b();
                ashu m4 = ((kor) conversationMessageView4.T.b()).m(conversationMessageView4.e);
                int c5 = conversationMessageView4.e.c();
                conversationMessageView4.e.ak();
                xcsVar4.l((String) obj, m4, c5);
                return;
            case 11:
                ConversationMessageView conversationMessageView5 = (ConversationMessageView) this.a;
                xcs xcsVar5 = (xcs) conversationMessageView5.N.b();
                ashu m5 = ((kor) conversationMessageView5.T.b()).m(conversationMessageView5.e);
                int c6 = conversationMessageView5.e.c();
                conversationMessageView5.e.ak();
                xcsVar5.k((String) obj, m5, c6);
                return;
            case 12:
                ((zxq) obj).k(this.a);
                return;
            case 13:
                abao abaoVar = (abao) obj;
                ConversationMessageView conversationMessageView6 = (ConversationMessageView) this.a;
                aack aackVar = conversationMessageView6.s;
                MessageIdType u = conversationMessageView6.e.u();
                itb itbVar = (itb) aackVar;
                ece eceVar = (ece) itbVar.au.get(u);
                if (eceVar != null && (obj2 = eceVar.b) != null && eceVar.a != null) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    if (itbVar.av.contains(u)) {
                        itbVar.av.remove(u);
                        itbVar.au.put(u, new ece((Long) eceVar.a, false));
                        xzb.c("ReminderAnimation", "Playing reminder reverse ".concat(String.valueOf(u.a())));
                    } else if (itbVar.C(((Long) eceVar.a).longValue())) {
                        if (!booleanValue) {
                            itbVar.au.put(u, new ece((Long) eceVar.a, true));
                            xzb.c("ReminderAnimation", "Playing reminder forward ".concat(String.valueOf(u.a())));
                        } else {
                            xzb.c("ReminderAnimation", "Showing stopped reminder fired ".concat(String.valueOf(u.a())));
                        }
                    } else if (booleanValue) {
                        xzb.c("ReminderAnimation", "Showing stopped reminder fired ".concat(String.valueOf(u.a())));
                    } else {
                        xzb.c("ReminderAnimation", "Showing stopped reminder waiting ".concat(String.valueOf(u.a())));
                    }
                } else {
                    xzb.c("ReminderAnimation", "Showing stopped reminder waiting ".concat(String.valueOf(u.a())));
                }
                abaoVar.a();
                return;
            case 14:
                ((zfh) obj).b(((ConversationMessageView) this.a).h, R.dimen.message_metadata_text_size);
                return;
            case 15:
                ((zfh) obj).b(((ConversationMessageView) this.a).i, R.dimen.message_metadata_text_size);
                return;
            case 16:
                uuf uufVar = ConversationMessageView.a;
                ((MessageAttachmentsView) obj).d.b(Optional.of((xog) this.a));
                return;
            case 17:
                ((zxq) obj).b(this.a);
                return;
            case 18:
                MessageAttachmentContainer messageAttachmentContainer = ((MessageAttachmentsView) ((xvy) ((zof) this.a).b).b()).c;
                for (znj znjVar : messageAttachmentContainer.d) {
                    if (znjVar != null && (r1 = znjVar.a) != 0) {
                        r1.c();
                    }
                }
                messageAttachmentContainer.removeAllViews();
                messageAttachmentContainer.d.clear();
                messageAttachmentContainer.a.clear();
                return;
            case 19:
                this.a.a(obj);
                return;
            default:
                ((zxq) obj).k(((aafk) this.a).l);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
