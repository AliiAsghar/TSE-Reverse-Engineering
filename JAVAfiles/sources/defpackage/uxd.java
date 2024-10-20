package defpackage;

import android.content.Context;
import android.content.RestrictionsManager;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxd implements apxw {
    public static uwp a(cg cgVar) {
        if (cgVar instanceof uwp) {
            return (uwp) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, uwq.class));
    }

    public static enh c(cg cgVar) {
        enh N = cgVar.N();
        N.getClass();
        return N;
    }

    public static aknt d() {
        akns a = aknt.a();
        a.a = "TachyonData";
        a.c(vdw.a);
        return a.a();
    }

    public static vsh e(armf armfVar, armf armfVar2) {
        vsh vshVar;
        if (((Boolean) ((utz) yig.U.get()).e()).booleanValue()) {
            vshVar = (vsh) armfVar.b();
        } else {
            vshVar = (vsh) armfVar2.b();
        }
        vshVar.getClass();
        return vshVar;
    }

    public static Bundle f(Context context) {
        Bundle applicationRestrictions;
        RestrictionsManager restrictionsManager = (RestrictionsManager) context.getSystemService("restrictions");
        if (restrictionsManager == null) {
            applicationRestrictions = new Bundle();
        } else {
            applicationRestrictions = restrictionsManager.getApplicationRestrictions();
        }
        applicationRestrictions.getClass();
        return applicationRestrictions;
    }

    public static vyy g(Context context, anen anenVar, Object obj, waw wawVar) {
        return new vyy(context, anenVar, (vyx) obj, wawVar);
    }

    public static voi h(vol volVar, vol volVar2, vol volVar3) {
        return new voj(aqjn.B(new voj(aqjn.B(volVar, volVar2)), new voj(aqjn.y(volVar3))));
    }

    public static vom i(armf armfVar) {
        armfVar.getClass();
        return new vom((byte[]) null);
    }

    public static akcy j(armf armfVar, ahiy ahiyVar) {
        return new akdf(new lpn(armfVar, 19), ahiyVar);
    }

    public static agcp k(Context context) {
        return new agcp(Arrays.asList(new aiuy(new aohs(context, (byte[]) null)), new aivb()));
    }

    public static aiwu l(aknt akntVar, alhm alhmVar, agcp agcpVar) {
        return alhmVar.e(akntVar, agcpVar);
    }

    public static aiwu m(aknt akntVar, alhm alhmVar, agcp agcpVar) {
        return alhmVar.e(akntVar, agcpVar);
    }

    public static aqad n(armf armfVar, aknj aknjVar, akux akuxVar, atii atiiVar, algw algwVar) {
        return (aqad) ((aqad) aqad.g(new wci(8), aktp.bI(armfVar, aknjVar, atiiVar, algwVar))).i(akuxVar);
    }

    public static aqak o(armf armfVar, aknj aknjVar, akux akuxVar, atii atiiVar, algw algwVar) {
        return (aqak) new aqak(aktp.bI(armfVar, aknjVar, atiiVar, algwVar)).i(akuxVar);
    }

    public static arky p(armf armfVar, aknj aknjVar, akux akuxVar, atii atiiVar, algw algwVar) {
        return (arky) aqam.c(aktp.bI(armfVar, aknjVar, atiiVar, algwVar)).i(akuxVar);
    }

    public static aqal q(armf armfVar, aknj aknjVar, akux akuxVar, atii atiiVar, algw algwVar) {
        return (aqal) aqam.a(aktp.bI(armfVar, aknjVar, atiiVar, algwVar)).i(akuxVar);
    }

    public static aqaq r(armf armfVar, aknj aknjVar, akux akuxVar, atii atiiVar, algw algwVar) {
        return (aqaq) new aqaq(aktp.bI(armfVar, aknjVar, atiiVar, algwVar)).i(akuxVar);
    }

    public static aqar s(armf armfVar, aknj aknjVar, akux akuxVar, atii atiiVar, algw algwVar) {
        return (aqar) aqas.a(aktp.bI(armfVar, aknjVar, atiiVar, algwVar)).i(akuxVar);
    }

    public static aqau t(armf armfVar, aknj aknjVar, akux akuxVar, atii atiiVar, algw algwVar) {
        return (aqau) new aqau(aktp.bI(armfVar, aknjVar, atiiVar, algwVar)).i(akuxVar);
    }

    public static aqik u(armf armfVar, aknj aknjVar, akux akuxVar, atii atiiVar, algw algwVar) {
        return (aqik) ((aqik) aqik.g(new wci(12), aktp.bI(armfVar, aknjVar, atiiVar, algwVar))).i(akuxVar);
    }

    public static aqio v(armf armfVar, aknj aknjVar, akux akuxVar, atii atiiVar, algw algwVar) {
        return (aqio) new aqio(aktp.bI(armfVar, aknjVar, atiiVar, algwVar)).i(akuxVar);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
