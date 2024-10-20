package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyg extends alyt {
    public static final alyg a = new alyg(alzb.a);
    public final AtomicReference b;

    public alyg(alyt alytVar) {
        this.b = new AtomicReference(alytVar);
    }

    @Override // defpackage.alyt
    public final alxa b() {
        return ((alyt) this.b.get()).b();
    }

    @Override // defpackage.alyt
    public final alzf c() {
        return ((alyt) this.b.get()).c();
    }

    @Override // defpackage.alyt
    public final alzk d() {
        return ((alyt) this.b.get()).d();
    }

    @Override // defpackage.alyt
    public final void e(String str, Level level, boolean z) {
        ((alyt) this.b.get()).e(str, level, z);
    }
}
