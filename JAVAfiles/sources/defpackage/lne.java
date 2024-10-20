package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lne extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lne(lnf lnfVar, String str, String str2, ConversationIdType conversationIdType, ConversationId conversationId, Recipient recipient, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.h = i;
        this.b = lnfVar;
        this.c = str;
        this.d = str2;
        this.e = conversationIdType;
        this.f = conversationId;
        this.g = recipient;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                return ((lne) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((lne) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((lne) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r2 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fa, code lost:
    
        if (r2 == r1) goto L37;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [nbg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [nbg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lne.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [nbg, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = this.b;
                Object obj3 = this.g;
                Object obj4 = this.f;
                Object obj5 = this.c;
                return new lne((mdc) obj2, (amqh) obj3, (amqd) obj4, (Integer) obj5, (Duration) this.d, (amqi) this.e, arpeVar, 2);
            }
            Object obj6 = this.d;
            ?? r4 = this.g;
            ?? r5 = this.f;
            ?? r6 = this.e;
            Object obj7 = this.c;
            return new lne((wkv) obj6, (mjg) r4, (MessageId) r5, (nbg) r6, (atok) obj7, (kjp) this.b, arpeVar, 1);
        }
        Object obj8 = this.b;
        Object obj9 = this.c;
        Object obj10 = this.d;
        return new lne((lnf) obj8, (String) obj9, (String) obj10, (ConversationIdType) this.e, (ConversationId) this.f, (Recipient) this.g, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lne(mdc mdcVar, amqh amqhVar, amqd amqdVar, Integer num, Duration duration, amqi amqiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.h = i;
        this.b = mdcVar;
        this.g = amqhVar;
        this.f = amqdVar;
        this.c = num;
        this.d = duration;
        this.e = amqiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lne(wkv wkvVar, mjg mjgVar, MessageId messageId, nbg nbgVar, atok atokVar, kjp kjpVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.h = i;
        this.d = wkvVar;
        this.g = mjgVar;
        this.f = messageId;
        this.e = nbgVar;
        this.c = atokVar;
        this.b = kjpVar;
    }
}
