package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anct implements ancs {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public anct(akry akryVar, ancs ancsVar, int i) {
        this.c = i;
        this.a = akryVar;
        this.b = ancsVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ancy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, ancv] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ancs, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        ancw ancwVar;
        ancw ancwVar2;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ancwVar = new ancw();
                ?? r1 = this.a;
                ancwVar2 = ((andc) this.b).b;
                try {
                    andc a = r1.a(ancwVar.a, obj);
                    a.g(ancwVar);
                    return a.c;
                } finally {
                }
            }
            akry h = akqj.h(akqj.b(), this.a);
            try {
                ListenableFuture a2 = this.b.a(obj);
                if (a2 != null) {
                    return a2;
                }
                throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            } finally {
            }
        } else {
            ancwVar = new ancw();
            ?? r12 = this.a;
            ancwVar2 = ((andc) this.b).b;
            try {
                return albo.bI(r12.a(ancwVar.a, obj));
            } finally {
            }
        }
    }

    public final String toString() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return this.a.toString();
            }
            return "propagating=[" + this.b + "]";
        }
        return this.a.toString();
    }

    public anct(andc andcVar, Object obj, int i) {
        this.c = i;
        this.a = obj;
        this.b = andcVar;
    }
}
