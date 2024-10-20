package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tif implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ tif(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        switch (this.b) {
            case 0:
                return new tie();
            case 1:
                return new tie();
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                return new tiq();
            case 5:
                return new tiq();
            case 6:
                return tip.d.i;
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                agmhVar = MessagesTable.c.a;
                return agmhVar;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                return new tkh();
            case 15:
                return new tkh();
            case 16:
                throw null;
            case 17:
                return d.M();
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
