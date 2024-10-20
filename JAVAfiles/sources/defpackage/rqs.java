package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqs {
    public static final Map a;
    public static final Set b;

    static {
        rnn rnnVar = rnn.a;
        Map map = rnn.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!d.F(entry.getKey(), rnm.c.a) && !d.F(entry.getKey(), rnm.c.g) && !d.F(entry.getKey(), rnm.c.h) && !d.F(entry.getKey(), rnm.c.k) && !d.F(entry.getKey(), rnm.c.c)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a = aqjn.r(linkedHashMap);
        b = aqil.r(new rpn[]{new rpn(rnm.c.g, MessagesTable.c.b, rpk.a), new rpn(rnm.c.h, MessagesTable.c.c, rpk.c), new rpn(rnm.c.k, MessagesTable.c.y, rpk.c)});
    }
}
