package defpackage;

import android.app.Activity;
import android.location.Location;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnn extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnn(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [mtn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, utz] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                kqd kqdVar = (kqd) obj;
                kqdVar.getClass();
                ((Activity) ((llq) this.a).a).getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", 6);
                kqdVar.a();
                return arnb.a;
            case 1:
                ahlp ahlpVar = (ahlp) obj;
                ahlpVar.getClass();
                Object obj2 = ahlpVar.a;
                aozy aozyVar = (aozy) obj2;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                Object obj3 = this.a;
                amwg amwgVar = (amwg) ((amwc) obj2).b;
                amwg amwgVar2 = amwg.a;
                amwgVar.c = obj3;
                amwgVar.b = 2;
                return arnb.a;
            case 2:
                if (((Location) obj) != null) {
                    ((vno) ((lpc) this.a).a.get()).i();
                }
                return arnb.a;
            case 3:
                ((lrc) obj).getClass();
                return this.a;
            case 4:
                ((lrc) obj).getClass();
                return this.a;
            case 5:
                lsd lsdVar = (lsd) obj;
                psv psvVar = lsdVar.a;
                Instant instant = lsdVar.b;
                lru lruVar = (lru) this.a;
                ?? r2 = lruVar.b;
                Instant f = ((xnv) lruVar.c).f();
                Object e = r2.e();
                e.getClass();
                return new lsc(psvVar, f.isAfter(instant.plusSeconds(((Number) e).longValue())));
            case 6:
                BugleConversationId bugleConversationId = (BugleConversationId) obj;
                bugleConversationId.getClass();
                return Boolean.valueOf(d.F(bugleConversationId, this.a));
            case 7:
                BugleConversationId bugleConversationId2 = (BugleConversationId) obj;
                bugleConversationId2.getClass();
                return ((moz) this.a).b.A(bugleConversationId2, false);
            case 8:
                return Boolean.valueOf(((adjc) ((moz) this.a).c.b()).v(((qei) obj).d));
            case 9:
                miz mizVar = (miz) obj;
                mizVar.getClass();
                return ((adlx) this.a).d.A(mizVar.b(), mizVar.h());
            case 10:
                alog alogVar = (alog) obj;
                alogVar.getClass();
                this.a.q(alogVar);
                return arnb.a;
            case 11:
                Long l = (Long) obj;
                l.getClass();
                ((rtc) this.a).c(l.longValue());
                return arnb.a;
            case 12:
                miz mizVar2 = (miz) obj;
                mizVar2.getClass();
                return ((nad) this.a).c.A(mizVar2.b(), mizVar2.h());
            case 13:
                miz mizVar3 = (miz) obj;
                mizVar3.getClass();
                if (mizVar3.h().compareTo((Instant) this.a) <= 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                alog alogVar2 = (alog) obj;
                alogVar2.getClass();
                this.a.q(alogVar2);
                return arnb.a;
            case 15:
                alog alogVar3 = (alog) obj;
                alogVar3.getClass();
                this.a.q(alogVar3);
                return arnb.a;
            case 16:
                alog alogVar4 = (alog) obj;
                alogVar4.getClass();
                this.a.q(alogVar4);
                return arnb.a;
            case 17:
                return Boolean.valueOf(((qry) this.a).c((String) obj));
            case 18:
                return Boolean.valueOf(((qry) this.a).c((String) obj));
            case 19:
                armf armfVar = (armf) obj;
                armfVar.getClass();
                ((yve) armfVar.b()).c(this.a);
                return arnb.a;
            default:
                armf armfVar2 = (armf) obj;
                armfVar2.getClass();
                ((yvs) armfVar2.b()).d(this.a);
                return arnb.a;
        }
    }
}
