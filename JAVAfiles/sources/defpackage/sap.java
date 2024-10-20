package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sap implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ sap(int i) {
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
        switch (this.b) {
            case 0:
                agmhVar = ParticipantsTable.c.a;
                return agmhVar;
            case 1:
                throw null;
            case 2:
                return d.M();
            case 3:
                return d.M();
            case 4:
                agmhVar2 = ParticipantsTable.c.a;
                return agmhVar2;
            case 5:
                agmhVar3 = ParticipantsTable.c.a;
                return agmhVar3;
            case 6:
                return PartsTable.d.a;
            case 7:
                agmhVar4 = MessagesTable.c.a;
                return agmhVar4;
            case 8:
                agmhVar5 = sni.c.a;
                return agmhVar5;
            case 9:
                agmhVar6 = MessagesTable.c.a;
                return agmhVar6;
            case 10:
                agmhVar7 = MessagesTable.c.a;
                return agmhVar7;
            case 11:
                agmhVar8 = sni.c.a;
                return agmhVar8;
            case 12:
                return d.ae();
            case 13:
                agmhVar9 = sni.c.a;
                return agmhVar9;
            case 14:
                agmhVar10 = sni.c.a;
                return agmhVar10;
            case 15:
                agmhVar11 = ParticipantsTable.c.a;
                return agmhVar11;
            case 16:
                agmhVar12 = MessagesTable.c.a;
                return agmhVar12;
            case 17:
                return d.M();
            case 18:
                return d.M();
            case 19:
                return new ArrayList();
            default:
                throw null;
        }
    }
}
