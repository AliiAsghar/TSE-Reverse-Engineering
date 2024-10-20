package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vua implements Consumer {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vua(Object obj, Object obj2, long j, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        if (this.d != 0) {
            rtw rtwVar = (rtw) obj;
            long j = this.a;
            alvi alviVar = ujv.a;
            ((alob) this.b).h(rtwVar);
            ujv.i(this.c.B(), rtwVar.a, j);
            return;
        }
        if (((smr) obj).l() == 2) {
            long j2 = this.a;
            Object obj2 = this.c;
            vub vubVar = (vub) this.b;
            ((ujv) vubVar.f.b()).g(vubVar.j.g(), vubVar.h.f().toEpochMilli(), (ConversationIdType) obj2, j2, BasePaymentResult.ERROR_REQUEST_FAILED);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        if (this.d != 0) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
