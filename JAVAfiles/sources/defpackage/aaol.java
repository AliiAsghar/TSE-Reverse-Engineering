package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaol implements akgr {
    final /* synthetic */ int a;
    final /* synthetic */ zlz b;

    public aaol(zlz zlzVar, int i) {
        this.a = i;
        this.b = zlzVar;
    }

    @Override // defpackage.akgr
    public final akfd a() {
        return new akgc("debug_tachyon_state_data_source");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.akgr
    public final ListenableFuture b() {
        zlz zlzVar = this.b;
        return zlzVar.a(this.a).i(new aang(zlzVar, 5), zlzVar.c);
    }
}
