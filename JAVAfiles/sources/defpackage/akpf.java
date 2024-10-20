package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akpf implements akpe {
    final /* synthetic */ ancs a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public akpf(ancs ancsVar, Object obj, int i) {
        this.c = i;
        this.a = ancsVar;
        this.b = obj;
    }

    @Override // defpackage.akpe
    public final ListenableFuture a() {
        if (this.c != 0) {
            return this.a.a(this.b);
        }
        return this.a.a(this.b);
    }

    @Override // defpackage.akpe
    public final ListenableFuture b() {
        if (this.c != 0) {
            return aneh.a;
        }
        return aneh.a;
    }
}
