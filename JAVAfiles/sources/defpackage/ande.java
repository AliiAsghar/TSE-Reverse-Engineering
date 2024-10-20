package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ande extends andg {
    final /* synthetic */ andh a;
    private final ancr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ande(andh andhVar, ancr ancrVar, Executor executor) {
        super(andhVar, executor);
        this.a = andhVar;
        this.c = ancrVar;
    }

    @Override // defpackage.anej
    public final /* bridge */ /* synthetic */ Object a() {
        ListenableFuture a = this.c.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.anej
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.andg
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.m((ListenableFuture) obj);
    }
}
