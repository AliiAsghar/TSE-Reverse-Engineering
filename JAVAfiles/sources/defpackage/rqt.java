package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqt {
    public static final agpj a;
    public static final agpj b;
    public static final agpj c;
    public static final agpj d;

    static {
        String[] strArr = PartsTable.a;
        tbi tbiVar = PartsTable.d.b;
        a = new agpk("SELECT COUNT(*) FROM $V AS parts_1 WHERE $V{J:bugle_parts} = $V{X:parts_1}", new Object[]{"parts", tbiVar, tbiVar});
        String[] strArr2 = rnx.a;
        yzk yzkVar = rnx.e;
        Object obj = yzkVar.e;
        b = new agpk("SELECT COUNT(*) FROM $V AS backup_parts_1 WHERE $V = $V{X:backup_parts_1}", new Object[]{"parts_backup", obj, obj});
        tbh tbhVar = PartsTable.d;
        tbi tbiVar2 = tbhVar.a;
        tbi tbiVar3 = tbhVar.e;
        tbi tbiVar4 = tbhVar.b;
        c = new agpk("SELECT part_order FROM (SELECT $V{X:parts_2} AS pid, (ROW_NUMBER() OVER(ORDER BY $V{X:parts_2}, $V{X:parts_2})) AS part_order FROM $V AS parts_2 WHERE $V{J:bugle_parts} = $V{X:parts_2}) WHERE pid = $V{J:bugle_parts}", new Object[]{tbiVar2, tbiVar3, tbiVar2, "parts", tbiVar4, tbiVar4, tbiVar2});
        Object obj2 = yzkVar.n;
        d = new agpk("SELECT part_order FROM (SELECT $V{X:backup_parts_2} AS pid, (ROW_NUMBER() OVER(ORDER BY $V{X:backup_parts_2}, $V{X:backup_parts_2})) AS part_order FROM $V AS backup_parts_2 WHERE $V = $V{X:backup_parts_2}) WHERE pid = $V", new Object[]{obj2, yzkVar.h, obj2, "parts_backup", obj, obj, obj2});
    }
}
