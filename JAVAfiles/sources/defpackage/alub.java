package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alub extends almz {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ aluc b;

    public alub(aluc alucVar, Map.Entry entry) {
        this.a = entry;
        this.b = alucVar;
    }

    @Override // defpackage.almz
    protected final Map.Entry b() {
        return this.a;
    }

    @Override // defpackage.alna
    protected final /* synthetic */ Object gV() {
        return this.a;
    }

    @Override // defpackage.almz, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return alzz.A((Collection) this.a.getValue(), this.b.a.g);
    }
}
