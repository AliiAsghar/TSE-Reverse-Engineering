package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqw {
    public static final agpj a;
    public static final agpj b;
    public static final agpj c;

    static {
        agpk agpkVar = new agpk("(CASE $V WHEN $V THEN $V ELSE ($V + $V) END)", new Object[]{rpb.e.h, 0, -2, rpb.e.j, 1073745920});
        a = agpkVar;
        b = new agpk("$V{J:bugle_participants} = $V", new Object[]{ParticipantsTable.c.d, agpkVar});
        c = new agpk("($V{J:bugle_participants} IS NULL AND $V IS NULL)", new Object[]{ParticipantsTable.c.f, rpb.e.g});
    }
}
