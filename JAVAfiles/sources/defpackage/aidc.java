package defpackage;

import j$.time.Instant;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aidc implements aixt {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aidc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.aixt
    public final void a(agrk agrkVar) {
        if (this.b != 0) {
            agrkVar.w("GlobalValues", ahxe.c("start_disabled_time", ((Instant) this.a).toString()), 4);
            return;
        }
        alvi alviVar = aidd.a;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("observation_store_id IN(?");
        ?? r2 = this.a;
        arrayList.add(String.valueOf(r2.get(0)));
        for (int i = 1; i < r2.size(); i++) {
            sb.append(", ?");
            arrayList.add(String.valueOf(r2.get(i)));
        }
        sb.append(")");
        agrkVar.G(ahmc.am("ObservationStore", sb, arrayList));
    }
}
