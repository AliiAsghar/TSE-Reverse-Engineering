package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aafr {
    private final armf a;
    private final armf b;
    public final armf n;
    public final qdq o;

    public aafr(qdq qdqVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.o = qdqVar;
        this.a = armfVar;
        this.n = armfVar2;
        this.b = armfVar3;
    }

    public final void b(SuggestionData suggestionData) {
        this.o.y(suggestionData);
    }

    public final void c() {
        if (((yjf) this.a.b()).g()) {
            this.o.z();
        } else {
            ((yjl) this.b.b()).c(new aafq(this, 0));
        }
    }
}
