package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.wearable.Asset;
import j$.util.Optional;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvx implements rtm {
    public final ackf a;

    public yvx(ackf ackfVar) {
        this.a = ackfVar;
        new HashMap();
    }

    @Override // defpackage.rtm
    public final boolean A() {
        throw null;
    }

    @Override // defpackage.rtm
    public final boolean C() {
        throw null;
    }

    public final void a(String str, Asset asset) {
        this.a.g("27".concat(String.valueOf(str)), asset);
    }

    @Override // defpackage.rtm
    public final int b() {
        throw null;
    }

    public final void c(ConversationIdType conversationIdType) {
        this.a.n("1", conversationIdType.a());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yvx) {
            return this.a.equals(((yvx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.rtm
    public final Optional n() {
        throw null;
    }

    @Override // defpackage.rtm
    public final String r() {
        throw null;
    }

    @Override // defpackage.rtm
    public final String s() {
        throw null;
    }
}
