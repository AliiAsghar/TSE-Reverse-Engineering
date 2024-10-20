package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mqr implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ mqr(int i) {
        this.a = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        agmh agmhVar3;
        switch (this.a) {
            case 0:
                agmhVar = ParticipantsTable.c.a;
                return agmhVar;
            case 1:
                return d.M();
            case 2:
                return d.M();
            case 3:
                return d.ae();
            case 4:
                agmhVar2 = sni.c.a;
                return agmhVar2;
            case 5:
                agmhVar3 = sni.c.a;
                return agmhVar3;
            case 6:
                alwo alwoVar = mwf.a;
                return null;
            case 7:
                return arnb.a;
            case 8:
            case 9:
            case 10:
                return null;
            case 11:
                return new UnsupportedOperationException("Reactions module is absent");
            case 12:
                return new ArrayList();
            case 13:
                return amtp.a.createBuilder();
            case 14:
                return null;
            case 15:
                return aktp.ag(false);
            case 16:
                return new LinkedHashMap();
            default:
                psv psvVar = ney.a;
            case 17:
            case 18:
            case 19:
                return null;
        }
    }
}
