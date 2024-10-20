package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twu {
    public static final xze a = xze.g("BugleEtouffee", "EncryptedMessageRetryHandler");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;

    public twu(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
    }

    public static Optional b(apwq apwqVar) {
        return wam.i(apwqVar, vxt.ETOUFFEE_NAMESPACE, "recipient");
    }

    public final Optional a(apwq apwqVar) {
        return wam.i(apwqVar, vxt.ETOUFFEE_NAMESPACE, "original-message-id").map(new tvq(3));
    }

    public final boolean c(MessageCoreData messageCoreData) {
        String ak = messageCoreData.ak();
        apwq V = messageCoreData.V();
        if (tte.f()) {
            if (V == null || !b(V).isPresent()) {
                return false;
            }
        } else if (V == null || !a(V).isPresent()) {
            return false;
        }
        if (messageCoreData.cI() && messageCoreData.cn() && messageCoreData.cs() && !TextUtils.isEmpty(ak)) {
            return true;
        }
        return false;
    }
}
