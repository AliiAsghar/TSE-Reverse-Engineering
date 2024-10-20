package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class argm implements aqsg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public argm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [arhd, java.lang.Object] */
    @Override // defpackage.aqsg
    public final void a(aqsm aqsmVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                Status E = arrj.E(aqsmVar);
                if (Status.f.getCode().equals(E.getCode())) {
                    this.a.c(E);
                    return;
                }
                return;
            }
            ((aqsf) this.a).j(aqsmVar.c());
            return;
        }
        if (aqsmVar.c() != null) {
            argo.h(((argn) this.a).a);
        }
    }
}
