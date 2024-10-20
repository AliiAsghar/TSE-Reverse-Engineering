package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class say {
    public static final /* synthetic */ int a = 0;
    private static final String b = d("%PARTS_JOIN_TIMESTAMP_CHECK%");
    private static final String c = d("%REPORTS_JOIN_TIMESTAMP_CHECK%");
    private static final String d = sdp.b.a.toString() + " = " + MessagesTable.c.a.toString();
    private final Set e;

    public say(Set set) {
        this.e = set;
    }

    private static String d(String str) {
        return str.substring(1, str.length() - 1);
    }

    private static void e(sbf sbfVar) {
        if (lbp.a()) {
            sux a2 = suz.a();
            a2.c((suu) suz.d.c);
            a2.d(new sal(5));
            sbfVar.n(a2.b(), "label_subquery_expression");
            if (lbp.b()) {
                sux a3 = suz.a();
                a3.c((suu) suz.d.f);
                a3.d(new sal(6));
                sbfVar.n(a3.b(), "intent_subquery_expression");
            }
        }
    }

    private final void f(sbf sbfVar) {
        String str;
        if (this.e.contains(seu.a)) {
            str = d;
        } else {
            str = "0";
        }
        sbfVar.o("REPLIES_VIEW_JOIN", str);
    }

    public final sbf a() {
        sbf b2 = sbi.b();
        b2.w("+getBasicQuery");
        b2.o(b, "1");
        b2.o(c, "1");
        if (((Boolean) ((utz) xww.a.get()).e()).booleanValue()) {
            szr b3 = szu.a().b();
            Object obj = szu.c.h;
            Object obj2 = sbi.c.m;
            szt sztVar = new szt();
            sztVar.b(aqbc.ASSISTANT_QUERY);
            agmh agmhVar = (agmh) obj;
            b2.D(b3.q(agmhVar, (agmh) obj2, new agpw(sztVar)).a());
        }
        sbh sbhVar = new sbh();
        sbhVar.f(16);
        sbhVar.f(3);
        sbhVar.c();
        b2.d(sbhVar);
        b2.q();
        e(b2);
        f(b2);
        return b2;
    }

    public final sbf b(boolean z, boolean z2, ConversationIdType conversationIdType, agoz agozVar) {
        sbf c2 = c(z, z2, conversationIdType);
        c2.q();
        sbh sbhVar = new sbh();
        sbhVar.U(new agme("messages._id", 3, agozVar));
        c2.d(sbhVar);
        return c2;
    }

    public final sbf c(boolean z, boolean z2, ConversationIdType conversationIdType) {
        Integer valueOf;
        sbf b2 = sbi.b();
        b2.w("+queryConversationMessagesInternal");
        b2.o(b, "1");
        b2.o(c, "1");
        if (((Boolean) ((utz) xww.a.get()).e()).booleanValue()) {
            szr b3 = szu.a().b();
            Object obj = szu.c.h;
            Object obj2 = sbi.c.m;
            szt sztVar = new szt();
            sztVar.b(aqbc.ASSISTANT_QUERY);
            agmh agmhVar = (agmh) obj;
            b2.D(b3.q(agmhVar, (agmh) obj2, new agpw(sztVar)).a());
        }
        sbh sbhVar = new sbh();
        sbhVar.f(16);
        if (!conversationIdType.b()) {
            sbhVar.U(new agmd("messages.conversation_id", 1, Long.valueOf(ruy.a(conversationIdType))));
        }
        if (z) {
            sbhVar.f(3);
        }
        if (z2) {
            agpx[] agpxVarArr = new sbh[2];
            sbh sbhVar2 = new sbh();
            sbhVar2.c();
            agpxVarArr[0] = sbhVar2;
            agpx sbhVar3 = new sbh();
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            if (intValue < 46020) {
                agnc.t("reacted_message_id", intValue);
            }
            sbhVar3.U(new agmg("message_reactions.reacted_message_id", 6));
            agpxVarArr[1] = sbhVar3;
            sbhVar.V(agpxVarArr);
            b2.q();
        } else {
            sbhVar.c();
        }
        b2.d(sbhVar);
        e(b2);
        f(b2);
        return b2;
    }
}
