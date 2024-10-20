package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpc implements rkg {
    private final agpj a;
    private final Map b;
    private final Map c;

    public rpc() {
        agpk agpkVar = new agpk("(CASE $V WHEN $V THEN $V ELSE $V END)", new Object[]{ParticipantsTable.c.d, -2, 0, 1});
        this.a = agpkVar;
        this.b = aqjn.j(new armo(rpb.e.h, agpkVar));
        rpd rpdVar = rpd.a;
        this.c = rpd.b;
    }

    @Override // defpackage.rkd
    public final void a() {
        rpd.a.a();
    }

    @Override // defpackage.rkd
    public final void b(rkc rkcVar) {
        agof agofVar = new agof("participants_backup", "backup");
        ArrayList arrayList = new ArrayList(2);
        arro.e(this.c.keySet().toArray(new rou[0]), arrayList);
        arro.e(this.b.keySet().toArray(new rou[0]), arrayList);
        agofVar.b((agmh[]) arrayList.toArray(new agmh[arrayList.size()]));
        rpd rpdVar = rpd.a;
        Map map = this.b;
        taz c = rpd.c();
        for (Map.Entry entry : map.entrySet()) {
            c.n((agpj) entry.getValue(), String.valueOf(((rou) entry.getKey()).d()).concat("_expression"));
        }
        agofVar.c = c.b();
        agofVar.a().a();
    }
}
