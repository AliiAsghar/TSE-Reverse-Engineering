package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sbb implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ sbb(int i) {
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
        agmh agmhVar15;
        switch (this.b) {
            case 0:
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 1:
                throw null;
            case 2:
                return d.M();
            case 3:
                return d.ae();
            case 4:
                agmhVar2 = sni.c.a;
                return agmhVar2;
            case 5:
                agmhVar3 = sni.c.a;
                return agmhVar3;
            case 6:
                agmhVar4 = MessagesTable.c.a;
                return agmhVar4;
            case 7:
                agmhVar5 = MessagesTable.c.a;
                return agmhVar5;
            case 8:
                agmhVar6 = MessagesTable.c.a;
                return agmhVar6;
            case 9:
                agmhVar7 = MessagesTable.c.a;
                return agmhVar7;
            case 10:
                agmhVar8 = MessagesTable.c.a;
                return agmhVar8;
            case 11:
                return PartsTable.d.a;
            case 12:
                agmhVar9 = MessagesTable.c.a;
                return agmhVar9;
            case 13:
                agmhVar10 = ParticipantsTable.c.a;
                return agmhVar10;
            case 14:
                agmhVar11 = MessagesTable.c.a;
                return agmhVar11;
            case 15:
                return d.M();
            case 16:
                agmhVar12 = ParticipantsTable.c.a;
                return agmhVar12;
            case 17:
                agmhVar13 = MessagesTable.c.a;
                return agmhVar13;
            case 18:
                return d.M();
            case 19:
                agmhVar14 = ParticipantsTable.c.a;
                return agmhVar14;
            default:
                agmhVar15 = MessagesTable.c.a;
                return agmhVar15;
        }
    }
}
