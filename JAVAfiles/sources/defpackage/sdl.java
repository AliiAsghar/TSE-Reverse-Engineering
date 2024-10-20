package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sdl implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ sdl(int i) {
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
        switch (this.b) {
            case 0:
                return d.M();
            case 1:
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 2:
                agmhVar2 = ParticipantsTable.c.a;
                return agmhVar2;
            case 3:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 4:
                throw null;
            case 5:
                return thk.c.i;
            case 6:
                return d.M();
            case 7:
                agmhVar4 = ParticipantsTable.c.a;
                return agmhVar4;
            case 8:
                agmhVar5 = MessagesTable.c.a;
                return agmhVar5;
            case 9:
                return d.M();
            case 10:
                return d.M();
            case 11:
                return d.ae();
            case 12:
                agmhVar6 = sni.c.a;
                return agmhVar6;
            case 13:
                agmhVar7 = sni.c.a;
                return agmhVar7;
            case 14:
                agmhVar8 = ParticipantsTable.c.a;
                return agmhVar8;
            case 15:
                agmhVar9 = MessagesTable.c.a;
                return agmhVar9;
            case 16:
                agmhVar10 = sni.c.a;
                return agmhVar10;
            case 17:
                agmhVar11 = sni.c.a;
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
