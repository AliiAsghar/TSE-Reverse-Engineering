package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class snj implements Supplier {
    final /* synthetic */ aglz a;
    private final /* synthetic */ int b;

    public snj(aglz aglzVar, int i) {
        this.b = i;
        this.a = aglzVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                ConversationIdType conversationIdType = ((snk) this.a).a;
                if (conversationIdType == null || conversationIdType.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((snk) this.a).a));
            case 1:
                ConversationIdType conversationIdType2 = ((smr) this.a).aj;
                if (conversationIdType2 == null || conversationIdType2.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((smr) this.a).aj));
            case 2:
                ConversationIdType conversationIdType3 = ((spa) this.a).a;
                if (conversationIdType3 == null || conversationIdType3.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((spa) this.a).a));
            case 3:
                rve rveVar = ((spm) this.a).a;
                if (rveVar == null || rveVar.equals(rve.a)) {
                    return null;
                }
                return rve.d(((spm) this.a).a);
            case 4:
                MessageIdType messageIdType = ((sqf) this.a).b;
                if (messageIdType == null || messageIdType.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((sqf) this.a).b));
            case 5:
                ConversationIdType conversationIdType4 = ((sqq) this.a).a;
                if (conversationIdType4 == null || conversationIdType4.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((sqq) this.a).a));
            case 6:
                qwe qweVar = ((sqq) this.a).b;
                if (qweVar == null || qweVar.equals(null)) {
                    return null;
                }
                return riw.n(((sqq) this.a).b);
            case 7:
                ConversationIdType conversationIdType5 = ((sqw) this.a).a;
                if (conversationIdType5 == null || conversationIdType5.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((sqw) this.a).a));
            case 8:
                ConversationIdType conversationIdType6 = ((srp) this.a).b;
                if (conversationIdType6 == null || conversationIdType6.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((srp) this.a).b));
            case 9:
                MessageIdType messageIdType2 = ((ssi) this.a).b;
                if (messageIdType2 == null || messageIdType2.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((ssi) this.a).b));
            case 10:
                MessageIdType messageIdType3 = ((stc) this.a).c;
                if (messageIdType3 == null || messageIdType3.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((stc) this.a).c));
            case 11:
                MessageIdType messageIdType4 = ((stm) this.a).a;
                if (messageIdType4 == null || messageIdType4.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((stm) this.a).a));
            case 12:
                MessageIdType messageIdType5 = ((stu) this.a).b;
                if (messageIdType5 == null || messageIdType5.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((stu) this.a).b));
            case 13:
                UUID uuid = ((suc) this.a).b;
                if (uuid == null || uuid.equals(uzz.i())) {
                    return null;
                }
                return uzz.h(((suc) this.a).b);
            case 14:
                MessageIdType messageIdType6 = ((suj) this.a).a;
                if (messageIdType6 == null || messageIdType6.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((suj) this.a).a));
            case 15:
                MessageIdType messageIdType7 = ((suj) this.a).b;
                if (messageIdType7 == null || messageIdType7.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((suj) this.a).b));
            case 16:
                MessageIdType messageIdType8 = ((sus) this.a).b;
                if (messageIdType8 == null || messageIdType8.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((sus) this.a).b));
            case 17:
                MessageIdType messageIdType9 = ((svd) this.a).a;
                if (messageIdType9 == null || messageIdType9.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((svd) this.a).a));
            case 18:
                MessageIdType messageIdType10 = ((svj) this.a).b;
                if (messageIdType10 == null || messageIdType10.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((svj) this.a).b));
            case 19:
                MessageIdType messageIdType11 = ((svj) this.a).d;
                if (messageIdType11 == null || messageIdType11.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((svj) this.a).d));
            default:
                MessageIdType messageIdType12 = ((svr) this.a).a;
                if (messageIdType12 == null || messageIdType12.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((svr) this.a).a));
        }
    }
}
