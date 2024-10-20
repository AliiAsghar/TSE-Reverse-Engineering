package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpz {
    public static final rpm a;
    private static final Map b;
    private static final agpj c;
    private static final agpj d;
    private static final Map e;

    static {
        agpk agpkVar;
        Map j;
        rll rllVar = rll.a;
        Map map = rll.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            rld rldVar = (rld) entry.getKey();
            if (!d.F(rldVar, rlk.e.u) && !d.F(rldVar, rlk.e.p)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        b = linkedHashMap;
        if (!anfi.a("bugle.restore_current_self_id_during_d2_d", "bugle") && !anfi.a("bugle.dsdr_restore_current_self_id_during_d2_d", "bugle")) {
            agpkVar = new agpk("\"\"", new Object[0]);
        } else {
            agpkVar = new agpk("SELECT IFNULL((SELECT $V FROM $V WHERE $V = $V LIMIT 1), \"\" )", new Object[]{ParticipantsTable.c.a, "participants", ParticipantsTable.c.d, -1});
        }
        c = agpkVar;
        agpk agpkVar2 = new agpk("$V", new Object[]{-1L});
        d = agpkVar2;
        if (anfi.a("bugle.set_default_thread_id_to_unknown_during_d2_d", "bugle")) {
            j = aqjn.m(new armo(sni.c.A, agpkVar), new armo(sni.c.b, agpkVar2));
        } else {
            j = aqjn.j(new armo(sni.c.A, agpkVar));
        }
        Map map2 = j;
        e = map2;
        a = new rpm(rpp.d, rpr.d, rpy.b, linkedHashMap, map2, arnx.a, 0, 64);
    }
}
