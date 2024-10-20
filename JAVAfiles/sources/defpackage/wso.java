package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wso implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ wso(int i) {
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
                agmhVar = sni.c.a;
                return agmhVar;
            case 1:
                return d.M();
            case 2:
                agmhVar2 = ParticipantsTable.c.a;
                return agmhVar2;
            case 3:
                agmhVar3 = MessagesTable.c.a;
                return agmhVar3;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                agmhVar4 = MessagesTable.c.a;
                return agmhVar4;
            case 7:
                agmhVar5 = sni.c.a;
                return agmhVar5;
            case 8:
                return new ArrayList();
            case 9:
                return new ArrayList();
            case 10:
                xac.c.q("Resuming full sync but no sync id was found.");
                return UUID.randomUUID();
            case 11:
                return new LruCache(((Integer) xfz.a.e()).intValue());
            case 12:
                return new LruCache(((Integer) xfz.a.e()).intValue());
            case 13:
                return new xhr();
            case 14:
                return amvq.a.createBuilder();
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                throw null;
            case 18:
                agmhVar6 = MessagesTable.c.a;
                return agmhVar6;
            case 19:
                alwo alwoVar = xqb.a;
                return null;
            default:
                return ruy.a;
        }
    }
}
