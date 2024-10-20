package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class scs implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ scs(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        agmh agmhVar3;
        agmh agmhVar4;
        agmh agmhVar5;
        agmh agmhVar6;
        agmh agmhVar7;
        agmh agmhVar8;
        agmh agmhVar9;
        agmh agmhVar10;
        agmh agmhVar11;
        agmh agmhVar12;
        agmh agmhVar13;
        agmh agmhVar14;
        switch (this.b) {
            case 0:
                return d.M();
            case 1:
                agmhVar = sni.c.a;
                return agmhVar;
            case 2:
                agmhVar2 = ParticipantsTable.c.a;
                return agmhVar2;
            case 3:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 4:
                return d.M();
            case 5:
                agmhVar4 = ParticipantsTable.c.a;
                return agmhVar4;
            case 6:
                agmhVar5 = MessagesTable.c.a;
                return agmhVar5;
            case 7:
                return d.M();
            case 8:
                agmhVar6 = ParticipantsTable.c.a;
                return agmhVar6;
            case 9:
                agmhVar7 = MessagesTable.c.a;
                return agmhVar7;
            case 10:
                return d.M();
            case 11:
                agmhVar8 = ParticipantsTable.c.a;
                return agmhVar8;
            case 12:
                agmhVar9 = MessagesTable.c.a;
                return agmhVar9;
            case 13:
                agmhVar10 = MessagesTable.c.a;
                return agmhVar10;
            case 14:
                agmhVar11 = MessagesTable.c.a;
                return agmhVar11;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                agmhVar12 = MessagesTable.c.a;
                return agmhVar12;
            case 18:
                agmhVar13 = MessagesTable.c.a;
                return agmhVar13;
            case 19:
                return d.M();
            default:
                agmhVar14 = ParticipantsTable.c.a;
                return agmhVar14;
        }
    }
}
