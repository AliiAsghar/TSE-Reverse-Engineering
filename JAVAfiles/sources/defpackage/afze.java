package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class afze extends ekf implements apxr {
    private apxm a;
    private boolean b;

    public afze(Context context) {
        super(context);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            afzd afzdVar = (afzd) this;
            kqs kqsVar = (kqs) aS();
            afzdVar.p = (aiim) kqsVar.I.b();
            afzdVar.c = (agak) kqsVar.J.aF.b();
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }
}
