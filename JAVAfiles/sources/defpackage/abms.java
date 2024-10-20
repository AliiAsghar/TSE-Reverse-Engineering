package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abms implements aqrn {
    public /* synthetic */ void f(abna abnaVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void g(abni abniVar, arlq arlqVar) {
        throw null;
    }

    @Override // defpackage.aqrn
    public final asmb n() {
        aqvw aqvwVar = abmt.a;
        if (aqvwVar == null) {
            synchronized (abmt.class) {
                aqvwVar = abmt.a;
                if (aqvwVar == null) {
                    asmb asmbVar = new asmb("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService", (byte[]) null);
                    asmbVar.o(abmt.a());
                    asmbVar.o(abmt.b());
                    aqvwVar = new aqvw(asmbVar);
                    abmt.a = aqvwVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        aqux a = abmt.a();
        arlp arlpVar = new arlp(new wcl(this, 0, 3));
        String str = aqvwVar.a;
        aqae.t(a, arlpVar, str, aqvwVar, hashMap);
        aqae.t(abmt.b(), new arlp(new wcl(this, 1, 3)), str, aqvwVar, hashMap);
        return aqae.u(str, aqvwVar, hashMap);
    }
}
