package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class argx extends araw {
    final /* synthetic */ aqsf a;
    final /* synthetic */ String b;
    final /* synthetic */ arhd c;
    final /* synthetic */ argt d;
    final /* synthetic */ SettableFuture e;
    final /* synthetic */ arhn f;
    final /* synthetic */ aqut g;
    final /* synthetic */ argy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public argx(argy argyVar, aqsf aqsfVar, String str, arhd arhdVar, argt argtVar, SettableFuture settableFuture, arhn arhnVar, aqut aqutVar) {
        super(aqsfVar);
        this.a = aqsfVar;
        this.b = str;
        this.c = arhdVar;
        this.d = argtVar;
        this.e = settableFuture;
        this.f = arhnVar;
        this.g = aqutVar;
        this.h = argyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.araw
    public final void a() {
        int i = armc.a;
        try {
            asmb a = this.h.b.e.a(this.b);
            asmb asmbVar = a;
            if (a == null) {
                aqsx aqsxVar = this.h.b.f;
                String str = this.b;
                this.c.k();
                asmbVar = aqsxVar.a(str);
            }
            if (asmbVar == null) {
                Status withDescription = Status.l.withDescription("Method not found: " + this.b);
                this.d.g(argz.c);
                this.c.e(withDescription, new aqut());
                this.a.j(null);
                this.e.cancel(false);
                return;
            }
            argy argyVar = this.h;
            arhd arhdVar = this.c;
            arhn arhnVar = this.f;
            arhdVar.k();
            aqae[] aqaeVarArr = arhnVar.b;
            if (aqaeVarArr.length <= 0) {
                Object obj = asmbVar.b;
                aqvt[] aqvtVarArr = argyVar.b.h;
                int length = aqvtVarArr.length;
                int i2 = 0;
                aqvu aqvuVar = obj;
                while (i2 < length) {
                    aqvu aqvuVar2 = new aqvu(aqvtVarArr[i2], aqvuVar);
                    i2++;
                    aqvuVar = aqvuVar2;
                }
                asmb y = asmbVar.y(aqvuVar);
                arhd arhdVar2 = this.c;
                aqut aqutVar = this.g;
                aqsf aqsfVar = this.a;
                Object obj2 = y.a;
                argz argzVar = this.h.b;
                this.e.set(new asmb(new argo(arhdVar2, (aqux) obj2, aqutVar, aqsfVar, argzVar.p, argzVar.r), y.b, null));
                return;
            }
            aqae aqaeVar = aqaeVarArr[0];
            throw null;
        } catch (Throwable th) {
            this.d.g(argz.c);
            this.c.e(Status.c(th), new aqut());
            this.a.j(null);
            this.e.cancel(false);
            throw th;
        }
    }
}
