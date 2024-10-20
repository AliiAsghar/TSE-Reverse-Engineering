package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akuc implements akua {
    final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(akue.class, akub.class, "currentMetadata");

    @Override // defpackage.akua
    public final akub a(akue akueVar) {
        return (akub) this.a.get(akueVar);
    }

    @Override // defpackage.akua
    public final boolean b(akue akueVar, akub akubVar, akub akubVar2) {
        return d.o(this.a, akueVar, akubVar, akubVar2);
    }
}
