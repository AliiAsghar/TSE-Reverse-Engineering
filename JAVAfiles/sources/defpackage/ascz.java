package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ascz extends asdi {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.asdi
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        if (this.a.get() != null) {
            return false;
        }
        this.a.set(ascy.a);
        return true;
    }

    @Override // defpackage.asdi
    public final /* bridge */ /* synthetic */ arpe[] b(Object obj) {
        this.a.set(null);
        return asdh.a;
    }
}
