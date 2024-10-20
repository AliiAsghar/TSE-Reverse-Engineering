package defpackage;

import android.text.style.URLSpan;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lcw implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ lcw(int i) {
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
        int i = 0;
        switch (this.a) {
            case 0:
                return a.aZ(obj);
            case 1:
                lcy lcyVar = (lcy) obj;
                lcyVar.m();
                return lcyVar;
            case 2:
                return Integer.valueOf(((tqc) obj).h);
            case 3:
                return Integer.valueOf(((tqc) obj).h);
            case 4:
                return a.aZ(obj);
            case 5:
                lcy lcyVar2 = (lcy) obj;
                lcyVar2.l();
                return lcyVar2;
            case 6:
                lcy lcyVar3 = (lcy) obj;
                lcyVar3.m();
                return lcyVar3;
            case 7:
                lcy lcyVar4 = (lcy) obj;
                lcyVar4.l();
                return lcyVar4;
            case 8:
                lcy lcyVar5 = (lcy) obj;
                lcyVar5.k("EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO");
                return lcyVar5;
            case 9:
                return d.ag((URLSpan) obj);
            case 10:
                snh snhVar = (snh) obj;
                snhVar.e(0);
                return snhVar;
            case 11:
                utz utzVar = lqx.a;
                return Boolean.valueOf(((lxw) obj).b());
            case 12:
                e = ((msh) obj).e();
                return e;
            case 13:
                return Integer.valueOf(((adpo) obj).g);
            case 14:
                return ((lsc) obj).a;
            case 15:
                lgc lgcVar = luz.g;
                return tip.d.i;
            case 16:
                tio tioVar = (tio) obj;
                tioVar.getClass();
                luz.r(tioVar);
                return tioVar;
            case 17:
                tio tioVar2 = (tio) obj;
                tioVar2.getClass();
                lgc lgcVar2 = luz.g;
                lwr lwrVar = lwr.COMPLETE_SUCCESS;
                if (lwrVar != null) {
                    i = lwrVar.p;
                }
                tioVar2.U(new agoi("restore_workflow_executions.status", 8, Integer.valueOf(i)));
                return tioVar2;
            case 18:
                tio tioVar3 = (tio) obj;
                tioVar3.getClass();
                luz.r(tioVar3);
                return tioVar3;
            case 19:
                tix tixVar = (tix) obj;
                tixVar.b(tja.b);
                return tixVar;
            default:
                tix tixVar2 = (tix) obj;
                tixVar2.b(tja.b);
                tiz tizVar = tiz.b;
                if (tizVar != null) {
                    i = tizVar.ordinal();
                }
                tixVar2.U(new agoi("restore_workflow_files.status", 2, Integer.valueOf(i)));
                return tixVar2;
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
