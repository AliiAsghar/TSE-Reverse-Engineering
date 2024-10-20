package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class toe implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ toe(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 3:
                agmhVar2 = ParticipantsTable.c.a;
                return agmhVar2;
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
                return PartsTable.d.a;
            case 15:
                return new ArrayList();
            case 16:
                return new ArrayList();
            case 17:
                return new IllegalStateException("No normalized phone number.");
            case 18:
                return new ArrayList();
            case 19:
                return new vef();
            default:
                return new IllegalArgumentException("Missing recipient registration from the headers.");
        }
    }
}
