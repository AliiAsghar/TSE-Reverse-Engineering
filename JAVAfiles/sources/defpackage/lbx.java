package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lbx implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ lbx(int i) {
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
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 1:
                agmhVar2 = ParticipantsTable.c.a;
                return agmhVar2;
            case 2:
                agmhVar3 = sni.c.a;
                return agmhVar3;
            case 3:
                agmhVar4 = sni.c.a;
                return agmhVar4;
            case 4:
                agmhVar5 = sni.c.a;
                return agmhVar5;
            case 5:
                return d.M();
            case 6:
                return d.ae();
            case 7:
                agmhVar6 = sni.c.a;
                return agmhVar6;
            case 8:
                agmhVar7 = sni.c.a;
                return agmhVar7;
            case 9:
                agmhVar8 = ParticipantsTable.c.a;
                return agmhVar8;
            case 10:
                agmhVar9 = MessagesTable.c.a;
                return agmhVar9;
            case 11:
                return d.M();
            case 12:
                return d.M();
            case 13:
                agmhVar10 = MessagesTable.c.a;
                return agmhVar10;
            case 14:
                return d.M();
            case 15:
                return tnl.c.d;
            case 16:
                agmhVar11 = ParticipantsTable.c.a;
                return agmhVar11;
            case 17:
                agmhVar12 = MessagesTable.c.a;
                return agmhVar12;
            case 18:
                return d.M();
            case 19:
                return d.ae();
            default:
                agmhVar13 = sni.c.a;
                return agmhVar13;
        }
    }
}
