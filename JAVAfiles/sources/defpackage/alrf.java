package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alrf extends allf {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ alrs b;

    public alrf(Map.Entry entry, alrs alrsVar) {
        this.a = entry;
        this.b = alrsVar;
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.a(entry.getKey(), entry.getValue());
    }
}
