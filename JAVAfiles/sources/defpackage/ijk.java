package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ijk implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ ijk(int i) {
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
        switch (this.a) {
            case 0:
                return (amqm) amqn.a.createBuilder();
            case 1:
                return (amfa) amfb.a.createBuilder();
            case 2:
                return new ArrayList();
            case 3:
                return (ammm) ammn.a.createBuilder();
            case 4:
                return d.M();
            case 5:
                agmhVar = ParticipantsTable.c.a;
                return agmhVar;
            case 6:
                agmhVar2 = MessagesTable.c.a;
                return agmhVar2;
            case 7:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 8:
                agmhVar4 = MessagesTable.c.a;
                return agmhVar4;
            case 9:
                return new iuj();
            case 10:
                return amll.a.createBuilder();
            case 11:
                return new ArrayList();
            case 12:
                int i = alog.d;
                return alsx.a;
            case 13:
                return new ArrayList();
            case 14:
                return new ArrayList();
            case 15:
                return new ArrayList();
            case 16:
                return null;
            case 17:
                return new ArrayList();
            case 18:
                agmhVar5 = ParticipantsTable.c.a;
                return agmhVar5;
            case 19:
                return d.M();
            default:
                agmhVar6 = ParticipantsTable.c.a;
                return agmhVar6;
        }
    }
}
