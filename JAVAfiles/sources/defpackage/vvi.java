package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vvi implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ vvi(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object e;
        Object e2;
        Object e3;
        switch (this.a) {
            case 0:
                syc sycVar = (syc) obj;
                sycVar.R();
                return sycVar;
            case 1:
                return ((smu) obj).at;
            case 2:
                syc sycVar2 = (syc) obj;
                sycVar2.N();
                return sycVar2;
            case 3:
                e = ((msh) obj).e();
                return e;
            case 4:
                return (qei) ((Optional) obj).get();
            case 5:
                alwo alwoVar = vxd.a;
                return new smv[]{((smu) obj).a, sni.c.aa, sni.c.ab};
            case 6:
                e2 = ((msh) obj).e();
                return e2;
            case 7:
                return ((Optional) obj).stream();
            case 8:
                saz sazVar = (saz) obj;
                xze xzeVar = vyd.a;
                sazVar.ao(139, "participant_normalized_destination");
                return Optional.ofNullable(sazVar.bP);
            case 9:
                return wam.b((qei) obj);
            case 10:
                return ((wbj) obj).c;
            case 11:
                return ((wbj) obj).d;
            case 12:
                return a.aE(obj);
            case 13:
                return wam.b((qei) obj);
            case 14:
                return wam.b((qei) obj);
            case 15:
                return ParticipantsTable.g((String) obj);
            case 16:
                e3 = ((msh) obj).e();
                return e3;
            case 17:
                int i = wfl.a;
                return ((sxo) obj).o;
            case 18:
                wfs wfsVar = (wfs) obj;
                aozy createBuilder = amkr.a.createBuilder();
                long j = wfsVar.b + 1;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                amkr amkrVar = (amkr) apagVar;
                amkrVar.b = 1 | amkrVar.b;
                amkrVar.c = j;
                long j2 = wfsVar.a;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                amkr amkrVar2 = (amkr) createBuilder.b;
                amkrVar2.b = 2 | amkrVar2.b;
                amkrVar2.d = j2;
                return (amkr) createBuilder.s();
            case 19:
                xze xzeVar2 = wft.a;
                apct apctVar = ((wfq) obj).f;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                return Long.valueOf(apds.a(apctVar));
            default:
                apct apctVar2 = ((wfq) obj).f;
                if (apctVar2 == null) {
                    return apct.a;
                }
                return apctVar2;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
