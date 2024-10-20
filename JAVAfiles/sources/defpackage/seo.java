package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class seo implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ seo(int i) {
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
        switch (this.b) {
            case 0:
                return d.M();
            case 1:
                agmhVar = ParticipantsTable.c.a;
                return agmhVar;
            case 2:
                agmhVar2 = MessagesTable.c.a;
                return agmhVar2;
            case 3:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 4:
                agmhVar4 = sni.c.a;
                return agmhVar4;
            case 5:
                return d.M();
            case 6:
                return d.ae();
            case 7:
                throw null;
            case 8:
                agmhVar5 = ParticipantsTable.c.a;
                return agmhVar5;
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                throw null;
            case 12:
                agmhVar6 = sni.c.a;
                return agmhVar6;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                agmhVar7 = sni.c.a;
                return agmhVar7;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
