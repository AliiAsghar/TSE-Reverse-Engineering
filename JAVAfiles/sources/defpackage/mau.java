package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mau implements Supplier {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mau(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.function.Supplier] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.function.Supplier] */
    /* JADX WARN: Type inference failed for: r1v53, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [alhr, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        Object obj;
        Object obj2;
        int i = 9;
        int i2 = 8;
        switch (this.c) {
            case 0:
                mbb mbbVar = (mbb) this.a;
                alor alorVar = mbbVar.c;
                mbt mbtVar = ((mas) this.b).b;
                if (!alorVar.containsKey(mbtVar)) {
                    return Optional.empty();
                }
                mca mcaVar = ((mbu) mbbVar.c.get(mbtVar)).d;
                if (mcaVar == null) {
                    mcaVar = mca.a;
                }
                if (((Random) mbbVar.d.get()).nextDouble() >= mcaVar.b) {
                    return Optional.empty();
                }
                try {
                    Stream map = DesugarArrays.stream(Thread.currentThread().getStackTrace()).skip(Math.max(mcaVar.c, 0)).limit(Math.max(mcaVar.d, 0)).map(new lvo(14));
                    int i3 = alog.d;
                    return Optional.of((List) map.collect(alls.a));
                } catch (RuntimeException e) {
                    mbb.b.r("Failed to generate stacktrace", e);
                    return Optional.of(alog.r("Failed to extract stacktrace"));
                }
            case 1:
                return aajv.r(((ixd) this.b).ap, ((rsr) this.a).u);
            case 2:
                obj = this.a.get();
                return ((mdy) this.b).l((apbt) obj);
            case 3:
                obj2 = this.a.get();
                return ((mdy) this.b).l((apbt) obj2);
            case 4:
                aozy createBuilder = amru.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj3 = this.a;
                apag apagVar = createBuilder.b;
                amru amruVar = (amru) apagVar;
                obj3.getClass();
                amruVar.c = (amsg) obj3;
                amruVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                Object obj4 = this.b;
                apag apagVar2 = createBuilder.b;
                amru amruVar2 = (amru) apagVar2;
                obj4.getClass();
                amruVar2.d = (amsb) obj4;
                amruVar2.b |= 2;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                amru amruVar3 = (amru) createBuilder.b;
                amruVar3.e = 3;
                amruVar3.b |= 4;
                return (amru) createBuilder.s();
            case 5:
                aozy createBuilder2 = amsd.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                Object obj5 = this.a;
                apag apagVar3 = createBuilder2.b;
                amsd amsdVar = (amsd) apagVar3;
                obj5.getClass();
                amsdVar.c = (amsg) obj5;
                amsdVar.b |= 1;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                Object obj6 = this.b;
                apag apagVar4 = createBuilder2.b;
                amsd amsdVar2 = (amsd) apagVar4;
                obj6.getClass();
                amsdVar2.d = (amsb) obj6;
                amsdVar2.b |= 2;
                if (!apagVar4.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar5 = createBuilder2.b;
                amsd amsdVar3 = (amsd) apagVar5;
                amsdVar3.b |= 4;
                amsdVar3.e = 0;
                if (!apagVar5.isMutable()) {
                    createBuilder2.u();
                }
                amsd amsdVar4 = (amsd) createBuilder2.b;
                amsdVar4.b = 8 | amsdVar4.b;
                amsdVar4.f = true;
                return (amsd) createBuilder2.s();
            case 6:
                return Optional.of(((yjr) ((mrk) this.b).g.b()).a((String) this.a.get()));
            case 7:
                return Optional.of(((yjr) ((mrq) this.b).g.b()).a((String) this.a.get()));
            case 8:
                Object obj7 = this.b;
                if (obj7 != null) {
                    Uri uri = (Uri) obj7;
                    if (uri.getPathSegments().size() == upb.p(((ndi) this.a).a).getPathSegments().size() + 1) {
                        return Optional.ofNullable(ruy.b(uri.getLastPathSegment())).map(new ncy(13));
                    }
                }
                return Optional.empty();
            case 9:
                return ((nfy) this.b).a.r((String) this.a);
            case 10:
                alwl alwlVar = (alwl) pul.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilitiesFromDelegate", 76, "CachedCapabilitiesProvider.java");
                Object obj8 = this.a;
                qei qeiVar = (qei) obj8;
                alwlVar.t("CachedCapabilitiesProvider: start getCapabilitiesFromDelegate for chatEndpoint %s", yyb.bh(qeiVar.d));
                Object obj9 = this.b;
                pul pulVar = (pul) obj9;
                return pulVar.c.b(qeiVar).i(new pri(obj9, obj8, i2), pulVar.e).h(new psf(i), pulVar.e);
            case 11:
                alvw i4 = qcb.a.i();
                i4.X(alwp.a, "BugleGroupManagement");
                alvg alvgVar = (alvg) i4;
                smr smrVar = (smr) this.a;
                alvgVar.X(ydl.p, smrVar.x());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getConversationSubscription", 699, "IncomingRcsGroupNotificationConversationGetter.java")).q("Cannot find subscription for group notification self identity, falling back to existing subscription");
                String K = smrVar.K();
                K.getClass();
                qwm e2 = ((qcb) this.b).l.e(lga.V(K));
                e2.getClass();
                return e2;
            case 12:
                return ((qzw) this.b).L.o((String) this.a);
            case 13:
                return Optional.ofNullable((ActionParameters) rik.a((String) this.b, ActionParameters.class, (String) this.a));
            case 14:
                Optional filter = ((ruv) this.a).r.filter(new rsi(i));
                psq psqVar = (psq) ((rul) this.b).m.b();
                psqVar.getClass();
                return filter.map(new ruf(psqVar, 17));
            default:
                return Integer.valueOf(((rul) this.b).c((ConversationIdType) this.a));
        }
    }

    public /* synthetic */ mau(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
