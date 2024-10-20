package defpackage;

import android.telephony.TelephonyManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yko extends ul {
    final /* synthetic */ ykp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yko(ykp ykpVar) {
        super(Integer.MAX_VALUE);
        this.c = ykpVar;
    }

    @Override // defpackage.ul
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        TelephonyManager createForSubscriptionId;
        Integer num = (Integer) obj;
        createForSubscriptionId = this.c.b().createForSubscriptionId(num.intValue());
        if (createForSubscriptionId != null) {
            xyo c = ykp.a.c();
            c.H("Returning per-subscription TelephonyManager (>= N)");
            c.l(num.intValue());
            c.q();
            return createForSubscriptionId;
        }
        xyo c2 = ykp.a.c();
        c2.H("Returning default TelephonyManager (>= N)");
        c2.l(num.intValue());
        c2.q();
        return this.c.b();
    }
}
