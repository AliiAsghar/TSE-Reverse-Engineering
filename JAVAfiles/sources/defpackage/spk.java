package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class spk implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ spk(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        agmh agmhVar3;
        agmh agmhVar4;
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                agmhVar = sni.c.a;
                return agmhVar;
            case 2:
                throw null;
            case 3:
                return new spm();
            case 4:
                return new spm();
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                return new spw();
            case 8:
                return new spw();
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                throw null;
            case 12:
                agmhVar2 = MessagesTable.c.a;
                return agmhVar2;
            case 13:
                throw null;
            case 14:
                agmhVar3 = sni.c.a;
                return agmhVar3;
            case 15:
                return d.M();
            case 16:
                throw null;
            case 17:
                agmhVar4 = sni.c.a;
                return agmhVar4;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
