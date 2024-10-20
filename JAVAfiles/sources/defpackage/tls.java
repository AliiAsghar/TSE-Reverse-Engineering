package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tls implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ tls(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        agmh agmhVar3;
        agmh agmhVar4;
        agmh agmhVar5;
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                throw null;
            case 10:
                return new tnd();
            case 11:
                return new tnd();
            case 12:
                throw null;
            case 13:
                return d.M();
            case 14:
                agmhVar = ParticipantsTable.c.a;
                return agmhVar;
            case 15:
                agmhVar2 = MessagesTable.c.a;
                return agmhVar2;
            case 16:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 17:
                agmhVar4 = ParticipantsTable.c.a;
                return agmhVar4;
            case 18:
                agmhVar5 = ParticipantsTable.c.a;
                return agmhVar5;
            case 19:
                return d.M();
            default:
                throw null;
        }
    }
}
