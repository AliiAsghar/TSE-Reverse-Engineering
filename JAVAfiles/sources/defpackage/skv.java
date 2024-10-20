package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class skv extends agmb {
    public String a;
    public ConversationIdType b;
    public long c;
    public boolean d;
    public qfe e;
    public rxg f;

    public skv() {
        super(a.bp());
        this.b = ruy.a;
        this.d = false;
        this.e = qfe.UNKNOWN_STATE;
        this.f = vcp.m();
    }

    public final sku a() {
        return b(new ske(8));
    }

    public final sku b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        sku skuVar = (sku) obj;
        skuVar.ar(az());
        skuVar.a = this.a;
        skuVar.b = this.b;
        skuVar.c = this.c;
        skuVar.d = this.d;
        skuVar.e = this.e;
        skuVar.f = this.f;
        skuVar.cF = aA();
        return skuVar;
    }

    public final void c(ConversationIdType conversationIdType) {
        aC(1);
        this.b = conversationIdType;
    }

    public final void d(long j) {
        aC(2);
        this.c = j;
    }

    public final void e(qfe qfeVar) {
        int i = this.az;
        if (i < 58570) {
            agnc.t("rcs_group_join_status", i);
        }
        aC(4);
        this.e = qfeVar;
    }
}
