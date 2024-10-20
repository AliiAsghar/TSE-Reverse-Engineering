package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ske implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ ske(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        agmh agmhVar3;
        switch (this.b) {
            case 0:
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 1:
                throw null;
            case 2:
                agmhVar2 = sni.c.a;
                return agmhVar2;
            case 3:
                return tnl.c.d;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                return new sku();
            case 8:
                return new sku();
            case 9:
                throw null;
            case 10:
                agmhVar3 = sni.c.a;
                return agmhVar3;
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                return new smh();
            case 18:
                return new smh();
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
