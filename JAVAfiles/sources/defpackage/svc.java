package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class svc implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ svc(int i) {
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
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                return tnl.c.d;
            case 2:
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                return new svj();
            case 6:
                return new svj();
            case 7:
                agmhVar2 = MessagesTable.c.a;
                return agmhVar2;
            case 8:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                return new svr();
            case 12:
                return new svr();
            case 13:
                agmhVar4 = MessagesTable.c.a;
                return agmhVar4;
            case 14:
                agmhVar5 = MessagesTable.c.a;
                return agmhVar5;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                return new swd();
            case 18:
                return new swd();
            case 19:
                agmhVar6 = MessagesTable.c.a;
                return agmhVar6;
            default:
                throw null;
        }
    }
}
