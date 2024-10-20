package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnb implements Supplier {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rnb(aglz aglzVar, int i) {
        this.b = i;
        this.a = aglzVar;
    }

    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                MessageIdType messageIdType = ((rnc) this.a).a;
                if (messageIdType == null || messageIdType.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((rnc) this.a).a));
            case 1:
                MessageIdType messageIdType2 = ((rmt) this.a).b;
                if (messageIdType2 == null || messageIdType2.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((rmt) this.a).b));
            case 2:
                Optional optional = ((rnc) this.a).b;
                if (optional == null || optional.equals(rvg.a)) {
                    return null;
                }
                return rvg.b(((rnc) this.a).b);
            case 3:
                qwe qweVar = ((rnc) this.a).c;
                if (qweVar == null || qweVar.equals(null)) {
                    return null;
                }
                return riw.n(((rnc) this.a).c);
            case 4:
                ConversationIdType conversationIdType = ((rnc) this.a).g;
                if (conversationIdType == null || conversationIdType.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((rnc) this.a).g));
            case 5:
                MessageIdType messageIdType3 = ((rno) this.a).b;
                if (messageIdType3 == null || messageIdType3.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((rno) this.a).b));
            case 6:
                qwe qweVar2 = ((ros) this.a).b;
                if (qweVar2 == null || qweVar2.equals(null)) {
                    return null;
                }
                return riw.n(((ros) this.a).b);
            case 7:
                ((alwl) ((alwl) rul.b.i()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "createConversation", 884, "ConversationDatabaseOperationsImpl.java")).q("selfId is not provided, fallback on default.");
                return ((ryg) ((rul) this.a).c.b()).d().g();
            case 8:
                ?? r0 = ((wyj) this.a).c;
                if (!TextUtils.isEmpty(r0)) {
                    return Optional.of(vcp.h((String) r0));
                }
                return Optional.empty();
            case 9:
                ConversationIdType conversationIdType2 = ((sff) this.a).b;
                if (conversationIdType2 == null || conversationIdType2.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((sff) this.a).b));
            case 10:
                ConversationIdType conversationIdType3 = ((sga) this.a).b;
                if (conversationIdType3 == null || conversationIdType3.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((sga) this.a).b));
            case 11:
                ConversationIdType conversationIdType4 = ((sjn) this.a).b;
                if (conversationIdType4 == null || conversationIdType4.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((sjn) this.a).b));
            case 12:
                ConversationIdType conversationIdType5 = ((skc) this.a).b;
                if (conversationIdType5 == null || conversationIdType5.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((skc) this.a).b));
            case 13:
                MessageIdType messageIdType4 = ((skc) this.a).d;
                if (messageIdType4 == null || messageIdType4.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((skc) this.a).d));
            case 14:
                ConversationIdType conversationIdType6 = ((sku) this.a).b;
                if (conversationIdType6 == null || conversationIdType6.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((sku) this.a).b));
            case 15:
                ConversationIdType conversationIdType7 = ((sle) this.a).b;
                if (conversationIdType7 == null || conversationIdType7.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((sle) this.a).b));
            case 16:
                MessageIdType messageIdType5 = ((sln) this.a).b;
                if (messageIdType5 == null || messageIdType5.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((sln) this.a).b));
            case 17:
                ConversationIdType conversationIdType8 = ((smh) this.a).a;
                if (conversationIdType8 == null || conversationIdType8.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((smh) this.a).a));
            case 18:
                qwe qweVar3 = ((smr) this.a).B;
                if (qweVar3 == null || qweVar3.equals(null)) {
                    return null;
                }
                return riw.n(((smr) this.a).B);
            case 19:
                qss qssVar = ((smr) this.a).C;
                if (qssVar == null || qssVar.equals(null)) {
                    return null;
                }
                return qta.e(((smr) this.a).C);
            default:
                ConversationIdType conversationIdType9 = ((smr) this.a).ai;
                if (conversationIdType9 == null || conversationIdType9.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((smr) this.a).ai));
        }
    }

    public /* synthetic */ rnb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
