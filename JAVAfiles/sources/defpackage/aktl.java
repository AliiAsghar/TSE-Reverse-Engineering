package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktl implements Callable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aktl(akry akryVar, Callable callable, int i) {
        this.c = i;
        this.a = akryVar;
        this.b = callable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ancx] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return this.b.a(((ancw) this.a).a);
            }
            akry h = akqj.h(akqj.b(), this.a);
            try {
                return this.b.call();
            } finally {
            }
        } else {
            akry i2 = akqj.i(akqj.b(), this.a);
            try {
                return this.b.call();
            } finally {
            }
        }
    }

    public final String toString() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return this.b.toString();
            }
            return "propagating=[" + this.b + "]";
        }
        return "propagating=[" + this.b + "]";
    }

    public aktl(ancx ancxVar, ancw ancwVar, int i) {
        this.c = i;
        this.b = ancxVar;
        this.a = ancwVar;
    }
}
