package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akfk implements akfb {
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public akfk(akfb akfbVar, Object obj, Executor executor, int i) {
        this.d = i;
        this.a = akfbVar;
        this.b = obj;
        this.c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [ancu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, akfb] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, akfb] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.akfb
    public final andc a() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return andc.c(this.b, andi.a).d(akto.g(new lpx(this, 13)), andi.a);
            }
            return this.a.a().d(akto.g(new lpx(this.b, 12)), this.c);
        }
        return this.a.a().e(akto.e(new ygl(this.b, this.c, 2)), this.c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, akfb] */
    @Override // defpackage.akfb
    public final ListenableFuture b() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return aneh.a;
            }
            return this.a.b();
        }
        return aneh.a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, akfb] */
    @Override // defpackage.akfb
    public final Object c() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return this.c;
            }
            return this.a.c();
        }
        return ((akfk) this.a).c;
    }

    public final String toString() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return "LocalDataSource[" + this.b.toString() + "]";
            }
            Object obj = this.a;
            Object obj2 = this.b;
            return "DataSources.transform(" + obj.toString() + ", " + obj2.toString() + ")";
        }
        Object obj3 = this.a;
        Object obj4 = this.b;
        return "DataSources.transform(" + obj3.toString() + ", " + obj4.toString() + ")";
    }

    public akfk(ansy ansyVar, ancu ancuVar, Object obj, int i) {
        this.d = i;
        this.b = ancuVar;
        this.c = obj;
        this.a = ansyVar;
    }
}
