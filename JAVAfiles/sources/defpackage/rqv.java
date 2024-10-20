package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqv {
    public static final Map a;
    public static final Set b;
    public static final Map c;
    private static final agog d;
    private static final agog e;
    private static final agpj f;
    private static final agpj g;
    private static final agpj h;

    static {
        rnk rnkVar;
        rny rnyVar = rny.a;
        Map map = rny.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!d.F(entry.getKey(), rnx.e.n) && !d.F(entry.getKey(), rnx.e.e)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a = aqjn.r(linkedHashMap);
        b = aqjn.e(new rpn((agmh) rnx.e.e, PartsTable.d.b, rpk.b));
        sfw sfwVar = new sfw(sfz.a);
        sfwVar.c((sfs) sfz.d.f);
        sfwVar.d(new rqr(16));
        agog b2 = agoh.b(sfwVar.b(), (agmh) sfz.d.e, rnm.c.g);
        b2.f = "convo_id_map";
        d = b2;
        sfw sfwVar2 = new sfw(sfz.a);
        sfwVar2.c((sfs) sfz.d.f);
        sfwVar2.d(new rqr(17));
        agog b3 = agoh.b(sfwVar2.b(), (agmh) sfz.d.e, rnm.c.g);
        e = b3;
        rnv a2 = rnx.a();
        a2.s();
        if (pzm.b()) {
            a2.a.s = "bp";
        }
        rnk a3 = rnm.a();
        a3.s();
        if (pzm.b()) {
            rnkVar = (rnk) a3.j(b2);
        } else {
            rnkVar = (rnk) a3.j(b3);
        }
        agog b4 = agoh.b(rnkVar.b(), rnm.c.a, (agmh) rnx.e.e);
        b4.f = "bm";
        rnu b5 = ((rnv) a2.j(b4)).b();
        f = b5;
        agpk agpkVar = new agpk("(SELECT bugle_id FROM ($V))", new Object[]{b5});
        g = agpkVar;
        agpk agpkVar2 = new agpk("($V)", new Object[]{1});
        h = agpkVar2;
        tbh tbhVar = PartsTable.d;
        c = aqjn.m(new armo(tbhVar.o, agpkVar), new armo(tbhVar.P, agpkVar2));
    }
}
