package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lct implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ lct(int i) {
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
                agmhVar = sni.c.a;
                return agmhVar;
            case 1:
                agmhVar2 = sni.c.a;
                return agmhVar2;
            case 2:
                return new ArrayList();
            case 3:
                agmhVar3 = ParticipantsTable.c.a;
                return agmhVar3;
            case 4:
                return d.M();
            case 5:
                agmhVar4 = ParticipantsTable.c.a;
                return agmhVar4;
            case 6:
                agmhVar5 = ParticipantsTable.c.a;
                return agmhVar5;
            case 7:
                agmhVar6 = MessagesTable.c.a;
                return agmhVar6;
            case 8:
                agmhVar7 = sni.c.a;
                return agmhVar7;
            case 9:
                agmhVar8 = sni.c.a;
                return agmhVar8;
            case 10:
                agmhVar9 = sni.c.a;
                return agmhVar9;
            case 11:
                return d.M();
            case 12:
                return d.ae();
            case 13:
                agmhVar10 = sni.c.a;
                return agmhVar10;
            case 14:
                agmhVar11 = sni.c.a;
                return agmhVar11;
            case 15:
                agmhVar12 = ParticipantsTable.c.a;
                return agmhVar12;
            case 16:
                agmhVar13 = MessagesTable.c.a;
                return agmhVar13;
            case 17:
                return d.M();
            case 18:
                return d.M();
            case 19:
                return (amwc) amwg.a.createBuilder();
            default:
                return a.by();
        }
    }
}
