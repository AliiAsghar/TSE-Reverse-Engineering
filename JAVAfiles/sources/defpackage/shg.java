package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class shg implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ shg(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        agmh agmhVar3;
        agmh agmhVar4;
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                return new shh();
            case 3:
                return new shh();
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
                throw null;
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                agmhVar = sni.c.a;
                return agmhVar;
            case 16:
                agmhVar2 = ParticipantsTable.c.a;
                return agmhVar2;
            case 17:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 18:
                return d.M();
            case 19:
                agmhVar4 = ParticipantsTable.c.a;
                return agmhVar4;
            default:
                return d.M();
        }
    }
}
