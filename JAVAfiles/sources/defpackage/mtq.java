package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.net.VerifyTachyonOtpWorker;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mtq implements algk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mtq(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [mjb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v38, types: [apwt, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        CoreBuglePartialMessageId coreBuglePartialMessageId;
        mts mtsVar;
        boolean z;
        boolean z2 = true;
        switch (this.d) {
            case 0:
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    z2 = false;
                }
                mtr.f(z2, "underlying data changed between queries");
                int i = -num.intValue();
                return ((mtr) this.b).a((alog) this.c, i, this.a + i);
            case 1:
                xyo e = ikf.a.e();
                ikf ikfVar = (ikf) this.b;
                e.b(ikfVar.j);
                int i2 = this.a;
                e.l(i2);
                e.H("Error fetching RCS capabilities.");
                e.r((psx) obj);
                ikfVar.g(Optional.of(ikfVar.f.c(i2, (Optional) this.c)));
                return null;
            case 2:
                nae naeVar = (nae) obj;
                alog alogVar = naeVar.a;
                mtr mtrVar = ((mui) ((mzs) this.c).a).g;
                boolean b = mtrVar.b(alogVar);
                int i3 = this.a;
                if (!b) {
                    mtrVar.c(naeVar, i3);
                    return naeVar;
                }
                alog alogVar2 = naeVar.a;
                if (!(((miz) alogVar2.get(0)).b() instanceof CoreBuglePartialMessageId)) {
                    nae naeVar2 = new nae(mtrVar.a(alogVar2, 0, i3), naeVar.b, naeVar.c + Math.max(0, naeVar.a.size() - i3), mtrVar.b);
                    mtrVar.c(naeVar2, i3);
                    return naeVar2;
                }
                for (int i4 = 0; i4 < alogVar2.size(); i4++) {
                    Object obj2 = this.b;
                    miz mizVar = (miz) alogVar2.get(i4);
                    albo.T(mizVar.b() instanceof CoreBuglePartialMessageId);
                    CoreBuglePartialMessageId coreBuglePartialMessageId2 = (CoreBuglePartialMessageId) mizVar.b();
                    albo.T(obj2 instanceof mts);
                    mts mtsVar2 = (mts) obj2;
                    if (coreBuglePartialMessageId2.b <= mtsVar2.c) {
                        if (coreBuglePartialMessageId2.a.a > mtsVar2.b) {
                            z2 = false;
                        }
                        albo.T(z2);
                        nae naeVar3 = new nae(mtrVar.a(alogVar2, i4, i3 + i4), naeVar.b, naeVar.c + (alogVar2.size() - r8.size()), mtrVar.b);
                        mtrVar.c(naeVar3, i3);
                        return naeVar3;
                    }
                }
                throw new IllegalStateException("Expected to find a valid target for the paging key in the results");
            case 3:
                nae naeVar4 = (nae) obj;
                alog alogVar3 = naeVar4.a;
                mtr mtrVar2 = ((mui) ((mzs) this.c).a).g;
                boolean b2 = mtrVar2.b(alogVar3);
                int i5 = this.a;
                if (!b2) {
                    mtrVar2.c(naeVar4, i5);
                    alvw d = mtr.a.d();
                    d.X(alwp.a, "BugleMapi");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "clipInitial", 150, "BuglePagingClipToBounds.java")).u("returning message list without clipping, limit %d, list's size: %d", i5, naeVar4.a.size());
                    return naeVar4;
                }
                if (naeVar4.a.size() <= i5) {
                    mtrVar2.c(naeVar4, i5);
                    alvw g = mtr.a.g();
                    g.X(alwp.a, "BugleMapi");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "clipInitial", 159, "BuglePagingClipToBounds.java")).u("Skip clipping despite multi-part messages at boundary, limit %d, list's size: %d", i5, naeVar4.a.size());
                    return naeVar4;
                }
                ?? r0 = this.b;
                alog alogVar4 = naeVar4.a;
                int a = naeVar4.a(r0);
                int i6 = i5 / 2;
                int max = Math.max(0, a - i6);
                int min = Math.min(a + i6 + (i5 % 2), alogVar4.size());
                nae naeVar5 = new nae(mtrVar2.a(alogVar4, max, min), naeVar4.b + max, (naeVar4.c + alogVar4.size()) - min, mtrVar2.b);
                mtrVar2.c(naeVar5, i5);
                return naeVar5;
            case 4:
                nae naeVar6 = (nae) obj;
                alog alogVar5 = naeVar6.a;
                mtr mtrVar3 = ((mui) ((mzs) this.c).a).g;
                boolean b3 = mtrVar3.b(alogVar5);
                int i7 = this.a;
                if (!b3) {
                    mtrVar3.c(naeVar6, i7);
                    return naeVar6;
                }
                alog alogVar6 = naeVar6.a;
                if (!(((miz) alzz.aO(alogVar6)).b() instanceof CoreBuglePartialMessageId)) {
                    int max2 = Math.max(0, naeVar6.a.size() - i7);
                    nae naeVar7 = new nae(mtrVar3.a(alogVar6, max2, naeVar6.a.size()), naeVar6.b + max2, naeVar6.c, mtrVar3.b);
                    mtrVar3.c(naeVar7, i7);
                    return naeVar7;
                }
                int size = naeVar6.a.size();
                int size2 = alogVar6.size();
                do {
                    size2--;
                    if (size2 >= 0) {
                        Object obj3 = this.b;
                        miz mizVar2 = (miz) alogVar6.get(size2);
                        albo.T(mizVar2.b() instanceof CoreBuglePartialMessageId);
                        coreBuglePartialMessageId = (CoreBuglePartialMessageId) mizVar2.b();
                        albo.T(obj3 instanceof mts);
                        mtsVar = (mts) obj3;
                    } else {
                        throw new IllegalStateException("Expected to find a valid target for the paging key in the results");
                    }
                } while (coreBuglePartialMessageId.b < mtsVar.c);
                if (coreBuglePartialMessageId.a.a >= mtsVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                albo.T(z);
                int min2 = Math.min(size, size2 + 1);
                nae naeVar8 = new nae(mtrVar3.a(alogVar6, Math.max(0, min2 - i7), min2), naeVar6.b + (alogVar6.size() - r7.size()), naeVar6.c, mtrVar3.b);
                mtrVar3.c(naeVar8, i7);
                return naeVar8;
            case 5:
                upm upmVar = (upm) obj;
                xyo d2 = urr.a.d();
                d2.H("completion");
                d2.z("queue", this.c);
                d2.z("result", upmVar);
                d2.q();
                if (!upmVar.a && upmVar.b) {
                    return urn.RETRY;
                }
                if (((alsx) this.b).c == this.a) {
                    return urn.CONTINUE;
                }
                return urn.NO_RETRY;
            case 6:
                if (!((Boolean) obj).booleanValue()) {
                    vci.a.l("Skip unnecessary tachyon otp processing.");
                    return false;
                }
                int i8 = this.a;
                Object obj4 = this.c;
                Object obj5 = this.b;
                vci.a.l("Scheduling otp verification");
                hgi hgiVar = new hgi((char[]) null);
                hgiVar.n("otpCode", obj4);
                vci vciVar = (vci) obj5;
                hgiVar.n("msisdn", ((vbu) vciVar.c.b()).l(i8));
                gsz gszVar = new gsz(VerifyTachyonOtpWorker.class);
                gszVar.c("tachyon_otp_worker");
                gszVar.i(hgiVar.j());
                gvf.ar(vciVar.b).i(gszVar.j());
                return true;
            case 7:
                amhb amhbVar = (amhb) obj;
                aozy createBuilder = amfv.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                int i9 = this.a;
                apag apagVar = createBuilder.b;
                amfv amfvVar = (amfv) apagVar;
                amfvVar.c = i9 - 1;
                amfvVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                Object obj6 = this.b;
                amfv amfvVar2 = (amfv) createBuilder.b;
                amhbVar.getClass();
                amfvVar2.e = amhbVar;
                amfvVar2.b |= 4;
                amwt d3 = ((vrn) ((xyt) ((zap) obj6).b.b()).a()).d();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                amfv amfvVar3 = (amfv) apagVar2;
                amfvVar3.f = d3.E;
                amfvVar3.b |= 8;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                Object obj7 = this.c;
                amfv amfvVar4 = (amfv) createBuilder.b;
                obj7.getClass();
                amfvVar4.b |= 32;
                amfvVar4.h = (String) obj7;
                return createBuilder;
            default:
                Object obj8 = this.c;
                adnt adntVar = (adnt) this.b;
                return adntVar.n((apkc) obj, this.a, adntVar.e((Optional) obj8));
        }
    }

    public /* synthetic */ mtq(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    public /* synthetic */ mtq(Object obj, Object obj2, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
