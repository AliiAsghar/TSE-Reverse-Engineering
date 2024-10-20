package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sld extends aglo {
    public static final String[] a = {"conversation_participants._id", "conversation_participants.conversation_id", "conversation_participants.participant_id", "conversation_participants.is_normalized", "conversation_participants.rcs_group_join_status", "conversation_participants.last_modified_by_key"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final jat e;

    static {
        alok alokVar = new alok();
        alokVar.h("conversation_participants.is_normalized", 58090);
        alokVar.h("conversation_participants.rcs_group_join_status", 58570);
        alokVar.h("conversation_participants.last_modified_by_key", 59440);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("conversation_id", "index_conversation_participants_conversation_id");
        alokVar2.h("participant_id", "index_conversation_participants_participant_id");
        alokVar2.b();
        e = new jat((char[]) null);
        c = new int[]{58090, 58460, 58570, 59440};
        d = new int[]{58600};
    }

    public static final sla a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversation_participants._id");
            alobVar.h("conversation_participants.conversation_id");
            alobVar.h("conversation_participants.participant_id");
            if (valueOf.intValue() >= 58090) {
                alobVar.h("conversation_participants.is_normalized");
            }
            if (valueOf.intValue() >= 58570) {
                alobVar.h("conversation_participants.rcs_group_join_status");
            }
            if (valueOf.intValue() >= 59440) {
                alobVar.h("conversation_participants.last_modified_by_key");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sla(strArr);
    }

    public static slb b() {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        slb slbVar = new slb();
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() >= 59440) {
            rxg m = vcp.m();
            valueOf2 = Integer.valueOf(a.bp().c());
            int intValue = valueOf2.intValue();
            valueOf3 = Integer.valueOf(a.bp().c());
            int intValue2 = valueOf3.intValue();
            if (intValue2 < 59440) {
                agnc.t("last_modified_by_key", intValue2);
            }
            if (intValue >= 59440) {
                slbVar.a.put("last_modified_by_key", vcp.n(m));
            }
            slbVar.e.c().c("last_modified_by_key");
        }
        return slbVar;
    }

    public static String c(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_normalized INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0)");
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(conversation_id,participant_id,is_normalized) ON CONFLICT FAIL FOREIGN KEY (conversation_id) REFERENCES conversations (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id));");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_participants_conversation_id ON conversation_participants(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_participant_id");
        arrayList.add("CREATE INDEX index_conversation_participants_participant_id ON conversation_participants(participant_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
