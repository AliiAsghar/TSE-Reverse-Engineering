package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ndf implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ndf(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Collection, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 4;
        int i2 = 3;
        int i3 = 0;
        int i4 = 2;
        int i5 = 1;
        switch (this.b) {
            case 0:
                tbd tbdVar = (tbd) obj;
                Stream filter = Collection.EL.stream(this.a).map(new ncy(14)).filter(new nfp(i5));
                int i6 = alog.d;
                tbdVar.m((Iterable) filter.collect(alls.a));
                return tbdVar;
            case 1:
                tbd tbdVar2 = (tbd) obj;
                Stream map = Collection.EL.stream(this.a).map(new ncy(i2));
                int i7 = alog.d;
                tbdVar2.o((Iterable) map.collect(alls.a));
                return tbdVar2;
            case 2:
                tbd tbdVar3 = (tbd) obj;
                Stream map2 = Collection.EL.stream(this.a).map(new ncy(i2));
                int i8 = alog.d;
                tbdVar3.o((Iterable) map2.collect(alls.a));
                return tbdVar3;
            case 3:
                tbd tbdVar4 = (tbd) obj;
                tbdVar4.q(-2);
                Stream map3 = Collection.EL.stream(this.a).map(new ncy(i));
                int i9 = alog.d;
                tbdVar4.j((Iterable) map3.collect(alls.a));
                return tbdVar4;
            case 4:
                tbd tbdVar5 = (tbd) obj;
                tbdVar5.q(-2);
                Stream map4 = Collection.EL.stream(this.a).map(new ncy(i));
                int i10 = alog.d;
                tbdVar5.j((Iterable) map4.collect(alls.a));
                return tbdVar5;
            case 5:
                tbd tbdVar6 = (tbd) obj;
                tbdVar6.q(-2);
                Object obj2 = this.a;
                tbdVar6.b(new mvp(obj2, 20), new ndf(obj2, i5));
                return tbdVar6;
            case 6:
                tbd tbdVar7 = (tbd) obj;
                tbdVar7.q(-2);
                Object obj3 = this.a;
                tbdVar7.b(new ndf(obj3, i3), new ndf(obj3, i4));
                return tbdVar7;
            case 7:
                slc slcVar = (slc) obj;
                slcVar.b(((BugleConversationId) this.a).a);
                return slcVar;
            case 8:
                tbd tbdVar8 = (tbd) obj;
                tbdVar8.q(-2);
                sxy d = MessagesTable.d();
                d.e(new ncy(11));
                d.g(new ndf(this.a, 9));
                tbdVar8.i(d.b());
                return tbdVar8;
            case 9:
                syc sycVar = (syc) obj;
                sycVar.f(((BugleConversationId) this.a).a);
                return sycVar;
            case 10:
                smo smoVar = (smo) obj;
                smoVar.b(((BugleConversationId) this.a).a);
                return smoVar;
            case 11:
                tbd tbdVar9 = (tbd) obj;
                tbdVar9.h(((ndq) this.a).a);
                return tbdVar9;
            case 12:
                slc slcVar2 = (slc) obj;
                int i11 = nea.a;
                slcVar2.e(this.a);
                return slcVar2;
            case 13:
                smo smoVar2 = (smo) obj;
                int i12 = nea.a;
                String M = ((ParticipantsTable.BindData) this.a).M();
                M.getClass();
                smoVar2.d(Long.parseLong(M));
                return smoVar2;
            case 14:
                slc slcVar3 = (slc) obj;
                d.aE((ParticipantsTable.BindData) this.a, slcVar3);
                return slcVar3;
            case 15:
                smo smoVar3 = (smo) obj;
                int i13 = nea.a;
                smoVar3.e(this.a);
                return smoVar3;
            case 16:
                smo smoVar4 = (smo) obj;
                int i14 = neb.a;
                String M2 = ((ParticipantsTable.BindData) this.a).M();
                M2.getClass();
                smoVar4.d(Long.parseLong(M2));
                return smoVar4;
            case 17:
                slc slcVar4 = (slc) obj;
                d.aE((ParticipantsTable.BindData) this.a, slcVar4);
                return slcVar4;
            case 18:
                smo smoVar5 = (smo) obj;
                int i15 = neb.a;
                ?? r0 = this.a;
                r0.getClass();
                smoVar5.e(r0);
                return smoVar5;
            case 19:
                slc slcVar5 = (slc) obj;
                int i16 = neb.a;
                ?? r02 = this.a;
                r02.getClass();
                slcVar5.e(r02);
                return slcVar5;
            default:
                return d.V(this.a, obj);
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
