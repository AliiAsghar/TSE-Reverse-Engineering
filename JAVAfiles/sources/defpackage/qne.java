package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qne extends aker {
    public static final alwo a = alwo.o("BugleContacts");
    public final armf b;
    public final armf c;
    public final armf d;
    private final arwe e;
    private final qnu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qne(Executor executor, aksr aksrVar, arwe arweVar, armf armfVar, qnu qnuVar, armf armfVar2, armf armfVar3) {
        super(aksrVar, "ContactChangeObserver", executor);
        executor.getClass();
        aksrVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        qnuVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.e = arweVar;
        this.b = armfVar;
        this.f = qnuVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    @Override // defpackage.aker
    public final void a(boolean z, Uri uri) {
        int i = qlq.a;
        if (!qlq.a()) {
            b();
        }
        ((alwl) a.e()).q("Contacts change observer triggered");
        ((AtomicBoolean) this.f.a).set(true);
        qjh.l(this.e, null, new mwv(this, (arpe) null, 17), 3);
    }

    public final void b() {
        ((atsg) this.b.b()).k(this);
    }
}
