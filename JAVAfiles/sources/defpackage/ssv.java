package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ssv implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ ssv(int i) {
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
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 6:
                throw null;
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                agmhVar2 = MessagesTable.c.a;
                return agmhVar2;
            case 10:
                throw null;
            case 11:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 12:
                throw null;
            case 13:
                return new suc();
            case 14:
                return new suc();
            case 15:
                return swk.c.m;
            case 16:
                throw null;
            case 17:
                agmhVar4 = MessagesTable.c.a;
                return agmhVar4;
            case 18:
                agmhVar5 = MessagesTable.c.a;
                return agmhVar5;
            case 19:
                throw null;
            default:
                agmhVar6 = MessagesTable.c.a;
                return agmhVar6;
        }
    }
}
