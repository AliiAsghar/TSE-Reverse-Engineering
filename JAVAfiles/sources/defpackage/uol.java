package defpackage;

import android.content.ContentValues;
import androidx.work.WorkerParameters;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Date;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uol implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uol(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        switch (this.b) {
            case 0:
                uqa uqaVar = (uqa) obj;
                uqaVar.g(((upv) this.a).k());
                return uqaVar;
            case 1:
                uqa uqaVar2 = (uqa) obj;
                uqaVar2.getClass();
                this.a.a(uqaVar2);
                return uqaVar2;
            case 2:
                uqa uqaVar3 = (uqa) obj;
                uqaVar3.g((String) this.a);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 46060) {
                    agnc.t("workmanager_id", intValue);
                }
                uqaVar3.U(new agmg("work_queue.workmanager_id", 6));
                return uqaVar3;
            case 3:
                urc urcVar = (urc) obj;
                Object obj2 = this.a;
                obj2.getClass();
                urcVar.U(new agmd("work_queue_work_manager_ids.workmanager_id", 1, rvg.b(Optional.of(((WorkerParameters) obj2).a))));
                return urcVar;
            case 4:
                uqa uqaVar4 = (uqa) obj;
                uqaVar4.b(((upr) this.a).k());
                return uqaVar4;
            case 5:
                uqa uqaVar5 = (uqa) obj;
                uqaVar5.b(((upr) this.a).k());
                return uqaVar5;
            case 6:
                uqa uqaVar6 = (uqa) obj;
                uqaVar6.f();
                uqaVar6.h(this.a);
                return uqaVar6;
            case 7:
                uqa uqaVar7 = (uqa) obj;
                uqaVar7.f();
                uqaVar7.h(this.a);
                return uqaVar7;
            case 8:
                urc urcVar2 = (urc) obj;
                urcVar2.b((String) this.a);
                return urcVar2;
            case 9:
                return Long.valueOf(this.a.P("work_queue_work_manager_ids", (ContentValues) obj));
            case 10:
                urc urcVar3 = (urc) obj;
                uuf uufVar = urm.a;
                urcVar3.c(this.a);
                return urcVar3;
            case 11:
                uqa uqaVar8 = (uqa) obj;
                uuf uufVar2 = urm.a;
                uqaVar8.e(this.a);
                return uqaVar8;
            case 12:
                uqa uqaVar9 = (uqa) obj;
                uuf uufVar3 = urm.a;
                uqaVar9.c(this.a);
                return uqaVar9;
            case 13:
                uqa uqaVar10 = (uqa) obj;
                uqaVar10.U(new agmf("work_queue.type", 3, uqa.X(this.a), false));
                uqaVar10.W(new agpk("$V{wm} is NULL", new Object[]{urd.c.a}));
                return uqaVar10;
            case 14:
                uqa uqaVar11 = (uqa) obj;
                xze xzeVar = urr.a;
                uqaVar11.b(((upr) this.a).k());
                return uqaVar11;
            case 15:
                uqa uqaVar12 = (uqa) obj;
                uqaVar12.d((String) this.a);
                Date date = new Date(0L);
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 46070) {
                    agnc.t("minimum_start_time", intValue2);
                }
                uqaVar12.U(new agmd("work_queue.minimum_start_time", 1, Long.valueOf(rva.a(date))));
                return uqaVar12;
            case 16:
                urc urcVar4 = (urc) obj;
                urcVar4.b((String) this.a);
                return urcVar4;
            case 17:
                uqa uqaVar13 = (uqa) obj;
                Object obj3 = this.a;
                obj3.getClass();
                uqaVar13.d((String) obj3);
                return uqaVar13;
            case 18:
                uqa uqaVar14 = (uqa) obj;
                usz.f(this.a, uqaVar14);
                return uqaVar14;
            case 19:
                uqa uqaVar15 = (uqa) obj;
                uqaVar15.d((String) this.a);
                return uqaVar15;
            default:
                uqa uqaVar16 = (uqa) obj;
                usz.f(this.a, uqaVar16);
                return uqaVar16;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
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
