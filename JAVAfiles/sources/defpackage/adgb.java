package defpackage;

import android.telephony.ims.ImsReasonInfo;
import android.telephony.ims.ImsRegistrationAttributes;
import android.telephony.ims.RegistrationManager$RegistrationCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgb extends RegistrationManager$RegistrationCallback {
    private final adfr a;

    public adgb(adfr adfrVar) {
        this.a = adfrVar;
    }

    public final void onRegistered(ImsRegistrationAttributes imsRegistrationAttributes) {
        this.a.b(imsRegistrationAttributes, true);
    }

    public final void onRegistering(ImsRegistrationAttributes imsRegistrationAttributes) {
        this.a.b(imsRegistrationAttributes, false);
    }

    public final void onTechnologyChangeFailed(int i, ImsReasonInfo imsReasonInfo) {
        int code;
        int extraCode;
        aozy createBuilder = apgu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        adfr adfrVar = this.a;
        apgu apguVar = (apgu) createBuilder.b;
        apguVar.c = 4;
        apguVar.b |= 1;
        aozy createBuilder2 = apgk.a.createBuilder();
        int c = adfr.c(i);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apgk apgkVar = (apgk) createBuilder2.b;
        apgkVar.d = c - 1;
        apgkVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apgu apguVar2 = (apgu) createBuilder.b;
        apgk apgkVar2 = (apgk) createBuilder2.s();
        apgkVar2.getClass();
        apguVar2.d = apgkVar2;
        apguVar2.b |= 2;
        aozy createBuilder3 = apgj.a.createBuilder();
        code = imsReasonInfo.getCode();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apgj apgjVar = (apgj) createBuilder3.b;
        apgjVar.b |= 1;
        apgjVar.c = code;
        extraCode = imsReasonInfo.getExtraCode();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apgj apgjVar2 = (apgj) createBuilder3.b;
        apgjVar2.b |= 2;
        apgjVar2.d = extraCode;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apgu apguVar3 = (apgu) createBuilder.b;
        apgj apgjVar3 = (apgj) createBuilder3.s();
        apgjVar3.getClass();
        apguVar3.e = apgjVar3;
        apguVar3.b |= 4;
        adfrVar.a((apgu) createBuilder.s());
    }

    public final void onUnregistered(ImsReasonInfo imsReasonInfo) {
        int code;
        int extraCode;
        aozy createBuilder = apgu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apgu apguVar = (apgu) createBuilder.b;
        apguVar.c = 3;
        apguVar.b |= 1;
        aozy createBuilder2 = apgj.a.createBuilder();
        code = imsReasonInfo.getCode();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apgj apgjVar = (apgj) createBuilder2.b;
        apgjVar.b |= 1;
        apgjVar.c = code;
        extraCode = imsReasonInfo.getExtraCode();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apgj apgjVar2 = (apgj) createBuilder2.b;
        apgjVar2.b |= 2;
        apgjVar2.d = extraCode;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        adfr adfrVar = this.a;
        apgu apguVar2 = (apgu) createBuilder.b;
        apgj apgjVar3 = (apgj) createBuilder2.s();
        apgjVar3.getClass();
        apguVar2.e = apgjVar3;
        apguVar2.b |= 4;
        adfrVar.a((apgu) createBuilder.s());
    }
}
