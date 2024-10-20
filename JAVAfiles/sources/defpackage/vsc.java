package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vsc implements apwt {
    public final /* synthetic */ Optional a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vsc(Object obj, Optional optional, int i) {
        this.c = i;
        this.b = obj;
        this.a = optional;
    }

    @Override // defpackage.apwt
    public final Object b() {
        if (this.c != 0) {
            return ((vsb) this.b).b((ConversationIdType) this.a.get());
        }
        Optional optional = this.a;
        return ((vsd) this.b).a.b((ConversationIdType) optional.get());
    }
}
