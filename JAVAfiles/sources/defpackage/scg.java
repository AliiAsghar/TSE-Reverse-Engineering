package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class scg implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ scg(int i) {
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
        switch (this.a) {
            case 0:
                agmhVar = ParticipantsTable.c.a;
                return agmhVar;
            case 1:
                return d.M();
            case 2:
                agmhVar2 = MessagesTable.c.a;
                return agmhVar2;
            case 3:
                agmhVar3 = sni.c.a;
                return agmhVar3;
            case 4:
                return d.M();
            case 5:
                return d.ae();
            case 6:
                return d.M();
            case 7:
                return d.ae();
            case 8:
                agmhVar4 = sni.c.a;
                return agmhVar4;
            case 9:
                agmhVar5 = sni.c.a;
                return agmhVar5;
            case 10:
                return d.M();
            case 11:
                return d.M();
            case 12:
                agmhVar6 = ParticipantsTable.c.a;
                return agmhVar6;
            case 13:
                agmhVar7 = ParticipantsTable.c.a;
                return agmhVar7;
            case 14:
                agmhVar8 = MessagesTable.c.a;
                return agmhVar8;
            case 15:
                agmhVar9 = MessagesTable.c.a;
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
                return d.ae();
            default:
                agmhVar12 = sni.c.a;
                return agmhVar12;
        }
    }
}
