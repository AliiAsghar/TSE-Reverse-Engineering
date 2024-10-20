package defpackage;

import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adki {
    public static final alwo a = alwo.o(advo.a);
    public final adnk b;
    private final vau c;

    public adki(adnk adnkVar, vau vauVar) {
        this.b = adnkVar;
        this.c = vauVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wgi a(wgi wgiVar, wgf wgfVar, Optional optional) {
        aozy createBuilder = wgg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wgg wggVar = (wgg) createBuilder.b;
        wggVar.e = wgfVar.a();
        wggVar.b |= 4;
        apct b = apds.b(agkx.W().longValue());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wgg wggVar2 = (wgg) createBuilder.b;
        b.getClass();
        wggVar2.c = b;
        wggVar2.b |= 1;
        if (optional.isPresent()) {
            Object obj = optional.get();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wgg wggVar3 = (wgg) createBuilder.b;
            wggVar3.d = (apct) obj;
            wggVar3.b |= 2;
        }
        apax apaxVar = wgiVar.d;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < apaxVar.size(); i++) {
            if (i == apaxVar.size() - 1) {
                aozy createBuilder2 = wgh.a.createBuilder((wgh) apaxVar.get(i));
                wgg wggVar4 = (wgg) createBuilder.s();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                wgh wghVar = (wgh) createBuilder2.b;
                wggVar4.getClass();
                wghVar.d = wggVar4;
                wghVar.b |= 2;
                arrayList.add((wgh) createBuilder2.s());
            } else {
                arrayList.add((wgh) apaxVar.get(i));
            }
        }
        aozy createBuilder3 = wgi.a.createBuilder(wgiVar);
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        ((wgi) createBuilder3.b).d = wgi.emptyProtobufList();
        createBuilder3.Z(arrayList);
        return (wgi) createBuilder3.s();
    }

    public final Optional b(wgi wgiVar) {
        apax apaxVar = wgiVar.d;
        if (apaxVar.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of((wgh) alzz.aO(apaxVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str) {
        wgi b = this.b.b(str);
        Optional b2 = b(b);
        if (b2.isPresent() && (((wgh) b2.get()).b & 2) == 0) {
            this.b.r(str, a(b, wgf.OTP_REQUEST_WITH_ADDITIONAL_QUOTA_COMPLETE, Optional.empty()));
            ((alwl) ((alwl) a.g()).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "handleIfVerificationRequestSuccessful", 120, "ForcePhoneNumberVerificationUtil.java")).q("Force verification request successful. Storing record.");
        }
    }

    public final boolean d(String str) {
        boolean z;
        boolean z2;
        int aT;
        Optional b = b(this.b.b(str));
        if (b.isEmpty()) {
            return false;
        }
        if ((((wgh) b.get()).b & 1) != 0 && (((wgh) b.get()).b & 2) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (aczv.x() && aczv.X()) {
            z2 = this.c.c(str).x;
        } else {
            z2 = aczf.z();
        }
        if (z2) {
            if (!z || (aT = a.aT(((wgh) b.get()).e)) == 0 || aT != 4) {
                return false;
            }
            return true;
        }
        return z;
    }
}
