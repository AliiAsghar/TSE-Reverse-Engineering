package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hal extends arpw implements arqv {
    Object a;
    Object b;
    int c;
    final /* synthetic */ gsx d;
    final /* synthetic */ gys e;
    final /* synthetic */ hgi f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hal(gsx gsxVar, hgi hgiVar, gys gysVar, arpe arpeVar) {
        super(2, arpeVar);
        this.d = gsxVar;
        this.f = hgiVar;
        this.e = gysVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hal) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [arpl, java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Throwable th;
        AtomicInteger atomicInteger;
        ?? r1;
        CancellationException e;
        arxm arxmVar;
        ?? r0 = arpl.a;
        try {
            if (this.c != 0) {
                ?? r02 = this.b;
                r1 = this.a;
                atomicInteger = (AtomicInteger) this.g;
                try {
                    aqil.P(obj);
                    arxmVar = r02;
                    r1 = r1;
                } catch (CancellationException e2) {
                    e = e2;
                    String str = hap.a;
                    gsx gsxVar = this.d;
                    gsy.a().d(str, "Delegated worker " + gsxVar.getClass() + " was cancelled", e);
                    int i = atomicInteger.get();
                    if (!r1.isCancelled() && i != -256) {
                        throw new hai(atomicInteger.get());
                    }
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    String str2 = hap.a;
                    gsx gsxVar2 = this.d;
                    gsy.a().d(str2, "Delegated worker " + gsxVar2.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            } else {
                aqil.P(obj);
                arwe arweVar = (arwe) this.g;
                AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                ListenableFuture b = this.d.b();
                b.getClass();
                arxm J = arrn.J(arweVar, null, null, new hak(this.f, this.e, atomicInteger2, b, (arpe) null, 0), 3);
                try {
                    this.g = atomicInteger2;
                    this.a = b;
                    this.b = J;
                    this.c = 1;
                    Object k = d.k(b, this);
                    if (k != r0) {
                        arxmVar = J;
                        obj = k;
                        atomicInteger = atomicInteger2;
                        r1 = b;
                    } else {
                        return r0;
                    }
                } catch (CancellationException e3) {
                    atomicInteger = atomicInteger2;
                    r1 = b;
                    e = e3;
                    String str3 = hap.a;
                    gsx gsxVar3 = this.d;
                    gsy.a().d(str3, "Delegated worker " + gsxVar3.getClass() + " was cancelled", e);
                    int i2 = atomicInteger.get();
                    if (!r1.isCancelled()) {
                    }
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    String str22 = hap.a;
                    gsx gsxVar22 = this.d;
                    gsy.a().d(str22, "Delegated worker " + gsxVar22.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            }
            gvf gvfVar = (gvf) obj;
            arxmVar.v(null);
            return gvfVar;
        } catch (Throwable th4) {
            r0.v(null);
            throw th4;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        hal halVar = new hal(this.d, this.f, this.e, arpeVar);
        halVar.g = obj;
        return halVar;
    }
}
