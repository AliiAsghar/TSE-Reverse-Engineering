package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class taq implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        switch (this.b) {
            case 0:
                return d.M();
            case 1:
                return new tao();
            case 2:
                agmhVar = ParticipantsTable.c.a;
                return agmhVar;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                return new tbf();
            case 7:
                return new tbf();
            case 8:
                return new tbf();
            case 9:
                return new ArrayList();
            case 10:
                throw null;
            case 11:
                throw null;
            case 12:
                return new tbw();
            case 13:
                return new tbw();
            case 14:
                return new tbw();
            case 15:
                return new ArrayList();
            case 16:
                throw null;
            case 17:
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
