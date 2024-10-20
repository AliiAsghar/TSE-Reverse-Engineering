package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twj {
    public static final sxx a(Set set) {
        sxy d = MessagesTable.d();
        d.w("BugleEtouffee");
        d.g(new ttr(set, 13));
        return d.b();
    }

    public static final sxx b(Set set) {
        sxy d = MessagesTable.d();
        d.w("BugleEtouffee");
        d.g(new ttr(set, 14));
        return d.b();
    }

    public static String c(anid anidVar) {
        return String.format("scytale_%s_", abvg.a(anidVar.a.H()));
    }

    public static final aqfn d(String str) {
        aozy createBuilder = aqfn.a.createBuilder();
        asku askuVar = asku.DITTO;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aqfn) createBuilder.b).b = askuVar.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        str.getClass();
        ((aqfn) apagVar).c = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aqfn) createBuilder.b).d = "Bugle";
        return (aqfn) createBuilder.s();
    }

    public static final aqfn e(String str, tqm tqmVar) {
        asku askuVar = asku.DITTO;
        if (tqmVar.equals(tqm.GAIA)) {
            askuVar = asku.EMAIL;
        }
        if (askuVar.equals(asku.EMAIL)) {
            aozy createBuilder = aqfn.a.createBuilder();
            asku askuVar2 = asku.EMAIL;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aqfn) createBuilder.b).b = askuVar2.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            str.getClass();
            ((aqfn) apagVar).c = str;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ((aqfn) createBuilder.b).d = "GDitto";
            return (aqfn) createBuilder.s();
        }
        return d(str);
    }

    public static agmh[] f() {
        return (agmh[]) svz.d.e;
    }
}
