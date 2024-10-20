package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import j$.util.Collection;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class rtj {
    public final alog a;
    public final alog b;
    public final rti c;
    private final armf d;

    public rtj(armf armfVar, alog alogVar, rti rtiVar, alog alogVar2) {
        this.d = armfVar;
        this.b = alogVar;
        this.c = rtiVar;
        this.a = alogVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rti a(SelfIdentityId selfIdentityId, ryg rygVar) {
        if (ody.a()) {
            if (Math.max(this.a.size(), ((alsx) this.b).c) <= 1) {
                return null;
            }
            return (rti) Collection.EL.stream(this.b).filter(new qxp(selfIdentityId, 11)).findFirst().orElse(null);
        }
        if (rygVar.a() <= 1) {
            return null;
        }
        rti rtiVar = this.c;
        int i = 0;
        if (rtiVar != null && d.B(rtiVar.b, selfIdentityId)) {
            int c = ((yjy) this.d.b()).c();
            alog alogVar = this.b;
            int i2 = 0;
            while (i2 < ((alsx) alogVar).c) {
                rti rtiVar2 = (rti) alogVar.get(i2);
                i2++;
                if (rtiVar2.a == c) {
                    return rtiVar2;
                }
            }
        }
        alog alogVar2 = this.b;
        while (i < ((alsx) alogVar2).c) {
            rti rtiVar3 = (rti) alogVar2.get(i);
            i++;
            if (TextUtils.equals(((SelfIdentityIdImpl) rtiVar3.b).a, lga.Y(selfIdentityId))) {
                return rtiVar3;
            }
        }
        if (!yhx.c) {
            return null;
        }
        return this.c;
    }
}
