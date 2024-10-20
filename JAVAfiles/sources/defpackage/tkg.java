package defpackage;

import android.content.ContentValues;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tkg implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tkg(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [agnw, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return Long.valueOf(this.a.P("self_participants", (ContentValues) obj));
            case 1:
                return Long.valueOf(this.a.P("restore_workflow_files", (ContentValues) obj));
            case 2:
                return Long.valueOf(this.a.O("self_participants", (ContentValues) obj));
            case 3:
                return Long.valueOf(this.a.O("settings", (ContentValues) obj));
            case 4:
                return Long.valueOf(this.a.O("supersort_labels", (ContentValues) obj));
            case 5:
                return Long.valueOf(this.a.O("user_references", (ContentValues) obj));
            case 6:
                return Long.valueOf(this.a.Q("verified_sms_blacklisted_senders", (ContentValues) obj, 4));
            case 7:
                return Long.valueOf(this.a.Q("verified_sms_brands", (ContentValues) obj, 5));
            case 8:
                return Long.valueOf(this.a.O("verified_sms_senders", (ContentValues) obj));
            case 9:
                soq soqVar = (soq) obj;
                xze xzeVar = trn.a;
                soqVar.b(((tro) this.a).b);
                return soqVar;
            case 10:
                soq soqVar2 = (soq) obj;
                xze xzeVar2 = trn.a;
                soqVar2.b((String) this.a);
                return soqVar2;
            case 11:
                soq soqVar3 = (soq) obj;
                xze xzeVar3 = trn.a;
                soqVar3.b(((aqfn) this.a).c);
                return soqVar3;
            case 12:
                soq soqVar4 = (soq) obj;
                xze xzeVar4 = trn.a;
                soqVar4.b(((aqfn) this.a).c);
                return soqVar4;
            case 13:
                soq soqVar5 = (soq) obj;
                xze xzeVar5 = trn.a;
                soqVar5.b(((aqfn) this.a).c);
                soqVar5.d(tqm.GAIA);
                return soqVar5;
            case 14:
                soq soqVar6 = (soq) obj;
                xze xzeVar6 = trn.a;
                soqVar6.b(((aqfn) this.a).c);
                return soqVar6;
            case 15:
                soq soqVar7 = (soq) obj;
                xze xzeVar7 = trn.a;
                soqVar7.b(((aqfn) this.a).c);
                soqVar7.c();
                return soqVar7;
            case 16:
                return twj.d((String) obj);
            case 17:
                soq soqVar8 = (soq) obj;
                xze xzeVar8 = trn.a;
                soqVar8.b(((aqfn) this.a).c);
                return soqVar8;
            case 18:
                sef sefVar = (sef) obj;
                Object obj2 = this.a;
                obj2.getClass();
                sefVar.c(((qei) obj2).d);
                return sefVar;
            case 19:
                snh snhVar = (snh) obj;
                snhVar.r((String) this.a);
                return snhVar;
            default:
                spu spuVar = (spu) obj;
                spuVar.b((rve) this.a);
                return spuVar;
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
