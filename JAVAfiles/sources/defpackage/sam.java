package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sam {
    public static final String a = sni.c.O.toString() + "=0 AND " + sni.c.a.toString() + "=" + sld.e.d.toString();
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final agpj f;
    public static final agpj g;
    public static final agpj h;

    static {
        agov agovVar;
        smu smuVar = sni.c;
        b = smuVar.O.toString() + "=0 AND " + smuVar.a.toString() + "=" + smp.d.a.toString();
        c = a("%ONE_ON_ONE_JOIN%");
        d = "messages._id=conversations.latest_message_id";
        e = a("%MESSAGES_JOIN%");
        if (ody.a()) {
            taz e2 = ParticipantsTable.e();
            e2.w("ConversationListSubQueries.containsVerifiedSmsParticipantsSubquery");
            e2.e(new rzq(12));
            e2.g(new rzq(14));
            agovVar = new agov(e2.b());
        } else {
            taz e3 = ParticipantsTable.e();
            e3.w("ConversationListSubQueries.containsVerifiedSmsParticipantsSubquery");
            e3.e(new rzq(15));
            e3.g(new rzq(16));
            agovVar = new agov(e3.b());
        }
        f = agovVar;
        tgo a2 = tgr.a();
        a2.c(new rzq(17));
        a2.d(new rzq(18));
        tgm b2 = a2.b();
        String[] strArr = b2.i;
        if (strArr.length == 1) {
            g = new agpk("SELECT MIN($R) FROM ($R)", new Object[]{agnc.l(strArr[0]), b2.B()});
            sxy d2 = MessagesTable.d();
            d2.g(new rzq(19));
            h = new agov(d2.b());
            return;
        }
        throw new IllegalStateException("cannot do min on a projection with length other than 1");
    }

    private static String a(String str) {
        return str.substring(1, str.length() - 1);
    }
}
