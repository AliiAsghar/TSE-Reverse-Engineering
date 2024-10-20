package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mvp implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mvp(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int ordinal;
        int i = 1;
        int i2 = 10;
        switch (this.b) {
            case 0:
                wte wteVar = (wte) obj;
                wtf wtfVar = wtf.SCHEDULED;
                if (wtfVar == null) {
                    ordinal = 0;
                } else {
                    ordinal = wtfVar.ordinal();
                }
                Object obj2 = this.a;
                wteVar.U(new agoi("scheduled_send.status", 1, Integer.valueOf(ordinal)));
                wteVar.U(new agmd("scheduled_send.conversation_id", 1, Long.valueOf(ruy.a(((mvq) obj2).a))));
                return wteVar;
            case 1:
                syc sycVar = (syc) obj;
                sycVar.i((MessageIdType) this.a);
                return sycVar;
            case 2:
                syc sycVar2 = (syc) obj;
                ?? r0 = this.a;
                ArrayList arrayList = new ArrayList(aqjn.J(r0, 10));
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((stc) it.next()).l());
                }
                sycVar2.m(aqjn.aE(arrayList));
                return sycVar2;
            case 3:
                syc sycVar3 = (syc) obj;
                int i3 = mvx.c;
                sycVar3.i(((stc) this.a).l());
                return sycVar3;
            case 4:
                return ((mxc) this.a).a.b((qei) ((Map.Entry) obj).getKey());
            case 5:
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                if (resolvedRecipient != null) {
                    Instant instant = (Instant) ((alor) this.a).get(resolvedRecipient.f());
                    instant.getClass();
                    return new mwt(resolvedRecipient, instant);
                }
                throw new NullPointerException("Null recipient");
            case 6:
                return ((rtb) this.a).g((PartsTable.BindData) obj);
            case 7:
                mxf mxfVar = (mxf) obj;
                int i4 = mzf.d;
                ((alob) this.a).h(mxfVar);
                boolean z = mxfVar instanceof mxi;
                ameb amebVar = ameb.UNKNOWN;
                if (z) {
                    mxi mxiVar = (mxi) mxfVar;
                    mxf mxfVar2 = mxiVar.b;
                    amebVar = mxiVar.a;
                    mxfVar = mxfVar2;
                }
                return new kor(mxfVar, amebVar);
            case 8:
                syc sycVar4 = (syc) obj;
                sycVar4.i((MessageIdType) this.a);
                return sycVar4;
            case 9:
                syc sycVar5 = (syc) obj;
                int i5 = nav.c;
                sycVar5.i(((ssi) this.a).k());
                return sycVar5;
            case 10:
                syc sycVar6 = (syc) obj;
                ?? r02 = this.a;
                ArrayList arrayList2 = new ArrayList(aqjn.J(r02, 10));
                Iterator it2 = r02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ssi) it2.next()).k());
                }
                sycVar6.m(aqjn.aE(arrayList2));
                return sycVar6;
            case 11:
                Object obj3 = this.a;
                suq suqVar = (suq) obj;
                if (obj3 instanceof mvb) {
                    MessageIdType c = ((mvb) obj3).c();
                    c.getClass();
                    suqVar.U(new agmd("message_edits.latest_message_id", 1, Long.valueOf(rvc.a(c))));
                    return suqVar;
                }
                throw new IllegalStateException("Unsupported message id type.");
            case 12:
                syc sycVar7 = (syc) obj;
                ?? r03 = this.a;
                ArrayList arrayList3 = new ArrayList(aqjn.J(r03, 10));
                Iterator it3 = r03.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((tes) it3.next()).l());
                }
                sycVar7.m(aqjn.aE(arrayList3));
                return sycVar7;
            case 13:
                syc sycVar8 = (syc) obj;
                int i6 = nbo.c;
                sycVar8.i(((tes) this.a).l());
                return sycVar8;
            case 14:
                return this.a.a(obj);
            case 15:
                return this.a.a(obj);
            case 16:
                tbd tbdVar = (tbd) obj;
                tbdVar.h(((ndq) this.a).a);
                return tbdVar;
            case 17:
                return ((ndi) this.a).f((ParticipantsTable.BindData) obj);
            case 18:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.q(-2);
                smm smmVar = new smm(smp.a);
                smmVar.d(new ncy(12));
                smmVar.e(new ndf(this.a, i2));
                tbdVar2.i(smmVar.b());
                return tbdVar2;
            case 19:
                tbd tbdVar3 = (tbd) obj;
                tbdVar3.q(-2);
                sla a = sld.a();
                a.d(new ncy(8));
                a.f(new ndf(this.a, 7));
                tbdVar3.i(a.b());
                return tbdVar3;
            default:
                tbd tbdVar4 = (tbd) obj;
                Stream filter = Collection.EL.stream(this.a).map(new ncy(5)).filter(new nfp(i));
                int i7 = alog.d;
                tbdVar4.m((Iterable) filter.collect(alls.a));
                return tbdVar4;
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
