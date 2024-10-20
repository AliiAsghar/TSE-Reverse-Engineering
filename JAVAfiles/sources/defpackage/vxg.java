package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vxg implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vxg(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 14;
        int i2 = 10;
        int i3 = 11;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                snh snhVar = (snh) obj;
                alwo alwoVar = vxh.a;
                snhVar.u((String) this.a);
                return snhVar;
            case 1:
                snh snhVar2 = (snh) obj;
                alwo alwoVar2 = vxh.a;
                snhVar2.j((ConversationIdType) this.a);
                snhVar2.e(2);
                return snhVar2;
            case 2:
                return ((msk) ((vxx) this.a).z.b()).x((ParticipantsTable.BindData) obj);
            case 3:
                return ((msk) ((vxx) this.a).z.b()).q((ParticipantsTable.BindData) obj);
            case 4:
                return ((msk) ((vyd) this.a).o.b()).r((String) ((Optional) obj).get());
            case 5:
                Object obj2 = this.a;
                vyd vydVar = (vyd) obj2;
                msh mshVar = (msh) obj;
                if (vydVar.q.a()) {
                    return akul.g(vydVar.d.b(akto.c(new uvj(obj2, mshVar, i2, bArr)), vydVar.f)).i(new vfj(obj2, mshVar, 13), vydVar.g).e(psx.class, new vsw(12), vydVar.g);
                }
                return akul.g(vydVar.d.b(akto.c(new uvj(obj2, mshVar, i3, bArr)), vydVar.f)).i(new vfj(obj2, mshVar, i), vydVar.g).e(psx.class, new vuu(mshVar, 8), vydVar.g);
            case 6:
                syc sycVar = (syc) obj;
                xze xzeVar = vyd.a;
                sycVar.f((ConversationIdType) this.a);
                sycVar.w(3);
                sycVar.O(vyd.c);
                return sycVar;
            case 7:
                return (qfn) ((algf) this.a).fu((ajqo) obj);
            case 8:
                wbz wbzVar = (wbz) obj;
                wag wagVar = wal.a;
                aozy createBuilder = qff.a.createBuilder();
                wct wctVar = (wct) this.a;
                wbk wbkVar = wctVar.e;
                if (wbkVar == null) {
                    wbkVar = wbk.a;
                }
                wcz wczVar = wbzVar.d;
                if (wczVar == null) {
                    wczVar = wcz.a;
                }
                qei a = wam.a(wbkVar, wczVar);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qff qffVar = (qff) createBuilder.b;
                a.getClass();
                qffVar.c = a;
                qffVar.b |= 1;
                wag wagVar2 = wal.a;
                wby b = wby.b(wbzVar.g);
                if (b == null) {
                    b = wby.UNKNOWN_TYPE;
                }
                qfe qfeVar = (qfe) wagVar2.fu(b);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qff qffVar2 = (qff) createBuilder.b;
                qffVar2.d = qfeVar.e;
                qffVar2.b |= 2;
                if ((wbzVar.b & 4) != 0) {
                    aozy createBuilder2 = qfm.a.createBuilder();
                    wbk wbkVar2 = wctVar.e;
                    if (wbkVar2 == null) {
                        wbkVar2 = wbk.a;
                    }
                    wcz wczVar2 = wbzVar.e;
                    if (wczVar2 == null) {
                        wczVar2 = wcz.a;
                    }
                    qei a2 = wam.a(wbkVar2, wczVar2);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    qfm qfmVar = (qfm) createBuilder2.b;
                    a2.getClass();
                    qfmVar.c = a2;
                    qfmVar.b |= 1;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    qff qffVar3 = (qff) createBuilder.b;
                    qfm qfmVar2 = (qfm) createBuilder2.s();
                    qfmVar2.getClass();
                    qffVar3.e = qfmVar2;
                    qffVar3.b |= 4;
                }
                return (qff) createBuilder.s();
            case 9:
                return (qfn) ((algf) this.a).fu((wbp) obj);
            case 10:
                return ((xgj) this.a).f((qei) obj);
            case 11:
                int i4 = wfl.a;
                return this.a.a(obj);
            case 12:
                syc sycVar2 = (syc) obj;
                int i5 = wfl.a;
                Object obj3 = this.a;
                obj3.getClass();
                sycVar2.m((Iterable) Collection.EL.stream(((wfg) obj3).b).map(new vxg(vnk.j, i3)).collect(Collectors.toCollection(new vtc(i2))));
                return sycVar2;
            case 13:
                String str = (String) obj;
                wgd wgdVar = (wgd) this.a;
                return wgdVar.d(str).h(new weh(str, 5), wgdVar.f);
            case 14:
                return new wgc((String) this.a, (wfx) obj);
            case 15:
                return this.a.a(obj);
            case 16:
                return this.a.a(obj);
            case 17:
                return d.U(this.a, obj);
            case 18:
                return d.U(this.a, obj);
            case 19:
                Object obj4 = this.a;
                ancr c = akto.c(new uvj(obj4, (MessageCoreData) obj, i, bArr));
                wjn wjnVar = (wjn) obj4;
                return akul.g(wjnVar.c.b(c, wjnVar.d));
            default:
                return ((wkc) this.a).h((adiv) obj);
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
