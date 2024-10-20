package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sbg implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ sbg(int i) {
        this.a = i;
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
        switch (this.a) {
            case 0:
                return new ArrayList();
            case 1:
                agmhVar = ParticipantsTable.c.a;
                return agmhVar;
            case 2:
                agmhVar2 = ParticipantsTable.c.a;
                return agmhVar2;
            case 3:
                return d.M();
            case 4:
                return new ArrayList();
            case 5:
                agmhVar3 = ParticipantsTable.c.a;
                return agmhVar3;
            case 6:
                return d.M();
            case 7:
                return new ArrayList();
            case 8:
                return d.M();
            case 9:
                agmhVar4 = ParticipantsTable.c.a;
                return agmhVar4;
            case 10:
                agmhVar5 = MessagesTable.c.a;
                return agmhVar5;
            case 11:
                agmhVar6 = MessagesTable.c.a;
                return agmhVar6;
            case 12:
                return d.M();
            case 13:
                agmhVar7 = ParticipantsTable.c.a;
                return agmhVar7;
            case 14:
                agmhVar8 = MessagesTable.c.a;
                return agmhVar8;
            case 15:
                agmhVar9 = sni.c.a;
                return agmhVar9;
            case 16:
                agmhVar10 = sni.c.a;
                return agmhVar10;
            case 17:
                agmhVar11 = MessagesTable.c.a;
                return agmhVar11;
            case 18:
                return d.M();
            case 19:
                agmhVar12 = ParticipantsTable.c.a;
                return agmhVar12;
            default:
                agmhVar13 = MessagesTable.c.a;
                return agmhVar13;
        }
    }
}
