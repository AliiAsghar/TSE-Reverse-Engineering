package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class swm implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ swm(int i) {
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
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 3:
                agmhVar2 = sni.c.a;
                return agmhVar2;
            case 4:
                return new ArrayList();
            case 5:
                throw null;
            case 6:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                return new sxd();
            case 10:
                return new sxd();
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                return new sxm();
            case 15:
                return new sxm();
            case 16:
                return d.M();
            case 17:
                agmhVar4 = ParticipantsTable.c.a;
                return agmhVar4;
            case 18:
                agmhVar5 = MessagesTable.c.a;
                return agmhVar5;
            case 19:
                return new ArrayList();
            default:
                throw null;
        }
    }
}
