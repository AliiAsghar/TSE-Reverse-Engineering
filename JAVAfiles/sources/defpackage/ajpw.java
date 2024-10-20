package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajpw implements ajpe {
    public final Conversation a;
    public final ajqg b;
    public final TraceId c;
    public final aozb d;

    public ajpw() {
        throw null;
    }

    @Override // defpackage.ajpe
    public final Conversation b() {
        return this.a;
    }

    @Override // defpackage.ajpe
    public final /* synthetic */ boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpw) {
            ajpw ajpwVar = (ajpw) obj;
            if (this.a.equals(ajpwVar.a) && this.b.equals(ajpwVar.b) && this.c.equals(ajpwVar.c) && this.d.equals(ajpwVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajpe
    public final /* synthetic */ boolean f() {
        return true;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        aozb aozbVar = this.d;
        TraceId traceId = this.c;
        ajqg ajqgVar = this.b;
        return "SendFileOverMsrpRequest{conversation=" + String.valueOf(this.a) + ", message=" + String.valueOf(ajqgVar) + ", traceId=" + String.valueOf(traceId) + ", opaqueData=" + String.valueOf(aozbVar) + "}";
    }

    public ajpw(Conversation conversation, ajqg ajqgVar, TraceId traceId, aozb aozbVar) {
        this.a = conversation;
        this.b = ajqgVar;
        this.c = traceId;
        this.d = aozbVar;
    }
}
