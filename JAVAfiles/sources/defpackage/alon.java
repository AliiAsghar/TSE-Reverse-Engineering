package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alon extends allf {
    final /* synthetic */ Map.Entry a;

    public alon(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.allf, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new altx(this.a.getValue());
    }
}
