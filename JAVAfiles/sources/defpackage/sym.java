package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sym implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ sym(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        switch (this.b) {
            case 0:
                return syx.c.c;
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
                return new szn();
            case 8:
                return new szn();
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                throw null;
            case 12:
                agmhVar2 = sni.c.a;
                return agmhVar2;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                return d.M();
            case 16:
                throw null;
            case 17:
                throw null;
            case 18:
                throw null;
            case 19:
                return new tao();
            default:
                return new tao();
        }
    }
}
