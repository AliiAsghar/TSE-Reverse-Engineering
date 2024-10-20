package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swc implements Supplier {
    final /* synthetic */ aglz a;
    private final /* synthetic */ int b;

    public swc(aglz aglzVar, int i) {
        this.b = i;
        this.a = aglzVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                MessageIdType messageIdType = ((swd) this.a).b;
                if (messageIdType == null || messageIdType.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((swd) this.a).b));
            case 1:
                MessageIdType messageIdType2 = ((svr) this.a).b;
                if (messageIdType2 == null || messageIdType2.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((svr) this.a).b));
            case 2:
                MessageIdType messageIdType3 = ((swl) this.a).b;
                if (messageIdType3 == null || messageIdType3.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((swl) this.a).b));
            case 3:
                ConversationIdType conversationIdType = ((swl) this.a).c;
                if (conversationIdType == null || conversationIdType.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((swl) this.a).c));
            case 4:
                MessageIdType messageIdType4 = ((swx) this.a).b;
                if (messageIdType4 == null || messageIdType4.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((swx) this.a).b));
            case 5:
                ConversationIdType conversationIdType2 = ((MessagesTable.BindData) this.a).b;
                if (conversationIdType2 == null || conversationIdType2.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((MessagesTable.BindData) this.a).b));
            case 6:
                qwe qweVar = ((MessagesTable.BindData) this.a).z;
                if (qweVar == null || qweVar.equals(null)) {
                    return null;
                }
                return riw.n(((MessagesTable.BindData) this.a).z);
            case 7:
                MessageIdType messageIdType5 = ((MessagesTable.BindData) this.a).Y;
                if (messageIdType5 == null || messageIdType5.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((MessagesTable.BindData) this.a).Y));
            case 8:
                Optional optional = ((MessagesTable.BindData) this.a).ab;
                if (optional == null || optional.equals(rvg.a)) {
                    return null;
                }
                return rvg.b(((MessagesTable.BindData) this.a).ab);
            case 9:
                ruz ruzVar = ((MessagesTable.BindData) this.a).am;
                if (ruzVar == null || ruzVar.equals(ruz.a)) {
                    return null;
                }
                return ruz.d(((MessagesTable.BindData) this.a).am);
            case 10:
                Optional optional2 = ((MessagesTable.BindData) this.a).ao;
                if (optional2 == null || optional2.equals(rvg.a)) {
                    return null;
                }
                return rvg.b(((MessagesTable.BindData) this.a).ao);
            case 11:
                rvh rvhVar = ((syk) this.a).a;
                if (rvhVar == null || rvhVar.equals(rvh.a)) {
                    return null;
                }
                return Long.valueOf(rvh.a(((syk) this.a).a));
            case 12:
                Instant instant = ((syk) this.a).b;
                if (instant == null || instant.equals(Instant.EPOCH)) {
                    return null;
                }
                return Long.valueOf(uxi.h(((syk) this.a).b));
            case 13:
                rvi rviVar = ((sys) this.a).b;
                if (rviVar == null || rviVar.equals(rvi.a)) {
                    return null;
                }
                return rvi.d(((sys) this.a).b);
            case 14:
                Instant instant2 = ((syy) this.a).a;
                if (instant2 == null || instant2.equals(Instant.EPOCH)) {
                    return null;
                }
                return Long.valueOf(uxi.h(((syy) this.a).a));
            case 15:
                MessageIdType messageIdType6 = ((sze) this.a).b;
                if (messageIdType6 == null || messageIdType6.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((sze) this.a).b));
            case 16:
                MessageIdType messageIdType7 = ((szn) this.a).b;
                if (messageIdType7 == null || messageIdType7.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((szn) this.a).b));
            case 17:
                ConversationIdType conversationIdType3 = ((szv) this.a).a;
                if (conversationIdType3 == null || conversationIdType3.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((szv) this.a).a));
            case 18:
                qwe qweVar2 = ((tad) this.a).f;
                if (qweVar2 == null || qweVar2.equals(null)) {
                    return null;
                }
                return riw.n(((tad) this.a).f);
            case 19:
                qwe qweVar3 = ((ParticipantsTable.BindData) this.a).c;
                if (qweVar3 == null || qweVar3.equals(null)) {
                    return null;
                }
                return riw.n(((ParticipantsTable.BindData) this.a).c);
            default:
                MessageIdType messageIdType8 = ((PartsTable.BindData) this.a).b;
                if (messageIdType8 == null || messageIdType8.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((PartsTable.BindData) this.a).b));
        }
    }
}
