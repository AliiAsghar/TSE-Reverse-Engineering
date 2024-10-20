package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class srr implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        switch (this.b) {
            case 0:
                agmhVar = sni.c.a;
                return agmhVar;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                return new ssi();
            case 8:
                return new ssi();
            case 9:
                agmhVar2 = MessagesTable.c.a;
                return agmhVar2;
            default:
                throw null;
        }
    }
}
