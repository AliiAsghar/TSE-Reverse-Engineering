package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alrg implements algk {
    final /* synthetic */ alrs a;
    private final /* synthetic */ int b;

    public alrg(alrs alrsVar, int i) {
        this.b = i;
        this.a = alrsVar;
    }

    @Override // defpackage.algk
    public final /* synthetic */ Object apply(Object obj) {
        if (this.b != 0) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.a(entry.getKey(), entry.getValue());
        }
        Map.Entry entry2 = (Map.Entry) obj;
        entry2.getClass();
        return new alrf(entry2, this.a);
    }
}
