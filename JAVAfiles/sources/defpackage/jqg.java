package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqg implements jpv {
    private final arpi a;

    public jqg(arpi arpiVar) {
        arpiVar.getClass();
        this.a = arpiVar;
    }

    @Override // defpackage.jpv
    public final Object a(jhb jhbVar, spa spaVar, arpe arpeVar) {
        Object q = arro.q(this.a, new jli(jhbVar, spaVar, (arpe) null, 6), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    @Override // defpackage.jpv
    public final void c(spb spbVar, jhc jhcVar) {
        String str;
        jhcVar.getClass();
        MessageId messageId = jhcVar.e;
        if (messageId != null) {
            str = messageId.a();
        } else {
            str = null;
        }
        spbVar.f(str);
    }

    @Override // defpackage.jpv
    public final void d(sph sphVar, jhc jhcVar) {
        String str;
        Integer valueOf;
        Integer valueOf2;
        MessageId messageId = jhcVar.e;
        if (messageId != null) {
            str = messageId.a();
        } else {
            str = null;
        }
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59540) {
            agnc.t("replied_to_message_id", intValue2);
        }
        if (intValue >= 59540) {
            agnc.r(sphVar.a, "replied_to_message_id", str);
        }
    }

    @Override // defpackage.jpv
    public final boolean e(jpp jppVar) {
        return jppVar.a(jld.k);
    }
}
