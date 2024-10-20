package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxr implements AutoCloseable {
    public static final agxr a;
    public final agxq b;
    private final ListenableFuture c;
    private final agym d;

    static {
        agxq agxqVar = agxq.a;
        ListenableFuture bG = albo.bG();
        airh airhVar = new airh();
        airhVar.c = andi.a;
        a = b(agxqVar, bG, airhVar.f());
    }

    public agxr() {
        throw null;
    }

    public static agxr b(agxq agxqVar, ListenableFuture listenableFuture, agym agymVar) {
        albo.bR(listenableFuture, agymVar, agymVar.a);
        return new agxr(agxqVar, listenableFuture, agymVar);
    }

    public final boolean a() {
        if (!this.c.isDone()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c.cancel(true);
        this.d.close();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agxr) {
            agxr agxrVar = (agxr) obj;
            if (this.b.equals(agxrVar.b) && this.c.equals(agxrVar.c) && this.d.equals(agxrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        agym agymVar = this.d;
        ListenableFuture listenableFuture = this.c;
        return "DrawRequest{drawParams=" + this.b.toString() + ", future=" + listenableFuture.toString() + ", callback=" + agymVar.toString() + "}";
    }

    public agxr(agxq agxqVar, ListenableFuture listenableFuture, agym agymVar) {
        if (agxqVar == null) {
            throw new NullPointerException("Null drawParams");
        }
        this.b = agxqVar;
        this.c = listenableFuture;
        this.d = agymVar;
    }
}
