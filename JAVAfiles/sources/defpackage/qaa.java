package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qaa implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ qaa(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        agmh agmhVar3;
        agmh agmhVar4;
        agmh agmhVar5;
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                return new psr("Group endpoint must have a conference URI");
            case 4:
                return null;
            case 5:
                return new qie();
            case 6:
                return new HashSet();
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                throw null;
            case 10:
                agmhVar = sni.c.a;
                return agmhVar;
            case 11:
                return d.M();
            case 12:
                agmhVar2 = ParticipantsTable.c.a;
                return agmhVar2;
            case 13:
                return d.M();
            case 14:
                return d.ae();
            case 15:
                agmhVar3 = sni.c.a;
                return agmhVar3;
            case 16:
                agmhVar4 = sni.c.a;
                return agmhVar4;
            case 17:
                return d.M();
            case 18:
                agmhVar5 = ParticipantsTable.c.a;
                return agmhVar5;
            case 19:
                return d.M();
            default:
                return d.ae();
        }
    }
}
