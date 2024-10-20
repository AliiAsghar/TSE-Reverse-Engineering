package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rqr implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rqr(int i) {
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
        Object apply;
        int i = 2;
        switch (this.a) {
            case 0:
                tjh tjhVar = (tjh) obj;
                tjhVar.b(tjj.a);
                return tjhVar;
            case 1:
                rnl rnlVar = (rnl) obj;
                int intValue = rnm.b().intValue();
                if (intValue < 0) {
                    agnc.t("received_timestamp", intValue);
                }
                rnlVar.U(new agoi("messages_backup.received_timestamp", 7, 0L));
                return rnlVar;
            case 2:
                tjy tjyVar = (tjy) obj;
                tjyVar.W(new agpk("$V = 0", new Object[]{tjz.c.c}));
                return tjyVar;
            case 3:
                tjy tjyVar2 = (tjy) obj;
                tjyVar2.W(new agpk("$V{J:bugle_scratch} = 0", new Object[]{tjz.c.c}));
                return tjyVar2;
            case 4:
                tbu tbuVar = (tbu) obj;
                tbuVar.m();
                return tbuVar;
            case 5:
                rnw rnwVar = (rnw) obj;
                rnwVar.b();
                return rnwVar;
            case 6:
                tjh tjhVar2 = (tjh) obj;
                tjhVar2.W(new agpk("$V{J:bugle_parts} = $V{J:backup_parts}", new Object[]{PartsTable.d.c, rnx.e.a}));
                return tjhVar2;
            case 7:
                tjy tjyVar3 = (tjy) obj;
                tjyVar3.c(tpz.b);
                tjyVar3.b();
                tjyVar3.W(new agpk("$V + $V{J:bugle_scratch} <> 0", new Object[]{tjz.c.c, tjz.c.c}));
                Function[] functionArr = {new rqr(i), new rqr(3)};
                tjy[] tjyVarArr = new tjy[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    apply = functionArr[i2].apply(new tjy());
                    tjyVarArr[i2] = (tjy) apply;
                }
                tjyVar3.V(tjyVarArr);
                return tjyVar3;
            case 8:
                tjy tjyVar4 = (tjy) obj;
                tjyVar4.b();
                tjyVar4.c(tpz.a);
                return tjyVar4;
            case 9:
                tjh tjhVar3 = (tjh) obj;
                tjhVar3.b(tjj.a);
                return tjhVar3;
            case 10:
                tjq tjqVar = (tjq) obj;
                tjqVar.b(tpz.a);
                return tjqVar;
            case 11:
                tjq tjqVar2 = (tjq) obj;
                tjqVar2.b(tpz.b);
                return tjqVar2;
            case 12:
                tjh tjhVar4 = (tjh) obj;
                tjhVar4.W(new agpk("$V{J:bugle_destination_suffix} = $V{J:backup_destination_suffix}", new Object[]{tjr.c.b, tjr.c.b}));
                return tjhVar4;
            case 13:
                sfy sfyVar = (sfy) obj;
                agpj agpjVar = rqt.a;
                sfyVar.f(rpk.b.a);
                sfyVar.c(-1L);
                return sfyVar;
            case 14:
                tbu tbuVar2 = (tbu) obj;
                agpj agpjVar2 = rqt.a;
                tbuVar2.W(new agpk("($V) = ($V)", new Object[]{rqt.b, rqt.a}));
                tbuVar2.W(new agpk("($V) = ($V)", new Object[]{rqt.d, rqt.c}));
                tbuVar2.W(new agpk("$V{J:bugle_parts} <> $V", new Object[]{PartsTable.d.e, "text/plain"}));
                tbi tbiVar = PartsTable.d.d;
                tbuVar2.W(new agpk("($V{J:bugle_parts} IS NULL OR $V{J:bugle_parts} = \"\")", new Object[]{tbiVar, tbiVar}));
                return tbuVar2;
            case 15:
                sfy sfyVar2 = (sfy) obj;
                agpj agpjVar3 = rqt.a;
                sfyVar2.f(rpk.b.a);
                sfyVar2.c(-1L);
                return sfyVar2;
            case 16:
                sfy sfyVar3 = (sfy) obj;
                Map map = rqv.a;
                sfyVar3.W(new agpk("$V{J:convo_id_map} = $V", new Object[]{sfz.d.d, rpk.a.a}));
                return sfyVar3;
            case 17:
                sfy sfyVar4 = (sfy) obj;
                Map map2 = rqv.a;
                sfyVar4.f(rpk.a.a);
                return sfyVar4;
            case 18:
                return Integer.valueOf(((qwm) obj).e());
            case 19:
                String U = ((MessagePartCoreData) obj).U();
                U.getClass();
                return U;
            default:
                return ((atok) obj).b;
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
