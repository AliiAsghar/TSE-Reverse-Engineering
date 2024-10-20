package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mcb implements BinaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ mcb(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                return BiFunction$CC.$default$andThen(this, function);
            case 1:
                return BiFunction$CC.$default$andThen(this, function);
            case 2:
                return BiFunction$CC.$default$andThen(this, function);
            case 3:
                return BiFunction$CC.$default$andThen(this, function);
            case 4:
                return BiFunction$CC.$default$andThen(this, function);
            case 5:
                return BiFunction$CC.$default$andThen(this, function);
            case 6:
                return BiFunction$CC.$default$andThen(this, function);
            case 7:
                return BiFunction$CC.$default$andThen(this, function);
            case 8:
                return BiFunction$CC.$default$andThen(this, function);
            case 9:
                return BiFunction$CC.$default$andThen(this, function);
            case 10:
                return BiFunction$CC.$default$andThen(this, function);
            case 11:
                return BiFunction$CC.$default$andThen(this, function);
            case 12:
                return BiFunction$CC.$default$andThen(this, function);
            case 13:
                return BiFunction$CC.$default$andThen(this, function);
            case 14:
                return BiFunction$CC.$default$andThen(this, function);
            case 15:
                return BiFunction$CC.$default$andThen(this, function);
            case 16:
                return BiFunction$CC.$default$andThen(this, function);
            default:
                return BiFunction$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return (Integer) obj2;
            case 1:
                return (Integer) obj2;
            case 2:
                return (ParticipantsTable.BindData) obj;
            case 3:
                pto ptoVar = (pto) obj;
                alwo alwoVar = pul.a;
                return ptoVar;
            case 4:
                msh mshVar = (msh) obj;
                alvw g = qqw.a.g();
                g.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findParticipantsForDestinations", 1096, "TelephonyCompatibleMatcher.java")).q("findRecipientsForDestinations duplicate search destinations; discarding duplicate.");
                return mshVar;
            case 5:
                Stream concat = Stream.CC.concat(Collection.EL.stream((alog) obj), Collection.EL.stream((alog) obj2));
                int i = alog.d;
                return (alog) concat.collect(alls.a);
            case 6:
                return (ParticipantsTable.BindData) obj;
            case 7:
                return (ParticipantsTable.BindData) obj;
            case 8:
                return (sku) obj;
            case 9:
                return (smh) obj;
            case 10:
                return CustomUpgradeSteps.lambda$applyDeduplicationAndConvert$2((sku) obj, (sku) obj2);
            case 11:
                return (vmn) obj;
            case 12:
                return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
            case 13:
                return (Optional) obj;
            case 14:
                ahlp ahlpVar = (ahlp) obj;
                Iterator it = ((ahlp) obj2).a.iterator();
                while (it.hasNext()) {
                    ahlpVar.M((alst) it.next());
                }
                return ahlpVar;
            case 15:
                alob alobVar = (alob) obj;
                alob alobVar2 = (alob) obj2;
                alobVar.a(alobVar2.a, alobVar2.b);
                return alobVar;
            case 16:
                alpr alprVar = (alpr) obj;
                alprVar.k((alpr) obj2);
                return alprVar;
            default:
                alok alokVar = (alok) obj;
                alokVar.j((alok) obj2);
                return alokVar;
        }
    }
}
