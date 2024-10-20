package defpackage;

import android.os.Looper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxc implements fvb {
    final /* synthetic */ fxf a;
    private final fvb b;

    public fxc(fxf fxfVar, fvb fvbVar) {
        this.a = fxfVar;
        this.b = fvbVar;
    }

    @Override // defpackage.fvb
    public final fvd a(fvz fvzVar, Looper looper, fvc fvcVar, ita itaVar) {
        if (fvzVar.b()) {
            return new fxd(this.a, fvzVar.e);
        }
        fvb fvbVar = this.b;
        ere ereVar = fvzVar.a;
        fvn fvnVar = (fvn) fvbVar;
        String a = fwv.a(fvnVar.a, ereVar);
        if (a != null && erl.h(a)) {
            erb erbVar = ereVar.b;
            dzg.g(erbVar);
            if (erbVar.i == -9223372036854775807L) {
                eub.f("DefaultAssetLoaderFact", "The imageDurationMs field must be set on image MediaItems.");
            }
            if (fvnVar.e == null) {
                fvnVar.e = new fwu(fvnVar.a, fvnVar.d);
            }
            fwu fwuVar = (fwu) fvnVar.e;
            return new fwv(fwuVar.a, fvzVar, fvcVar, fwuVar.b, itaVar.a);
        }
        if (fvnVar.f == null) {
            fvnVar.f = new fwj(fvnVar.a, fvnVar.b, fvnVar.c);
        }
        fvb fvbVar2 = fvnVar.f;
        flq flqVar = new flq();
        boolean z = fvzVar.d;
        fwj fwjVar = (fwj) fvbVar2;
        return new fwm(fwjVar.a, fvzVar, new fgj(fwjVar.a, flqVar), fwjVar.b, itaVar.b, looper, fvcVar, fwjVar.c);
    }
}
