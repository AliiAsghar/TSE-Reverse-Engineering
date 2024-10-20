package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqy {
    public static final Map a;
    public static final Map b;

    static {
        rpd rpdVar = rpd.a;
        Map map = rpd.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!d.F(entry.getKey(), rpb.e.j) && !d.F(entry.getKey(), rpb.e.c)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a = aqjn.r(linkedHashMap);
        b = aqjn.j(new armo(ParticipantsTable.c.d, rqw.a));
    }
}
