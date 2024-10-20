package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcp {
    private long a;
    private ConversationIdType b;
    private boolean c;
    private boolean d;
    private int e;
    private yiy f;
    private byte g;

    public lcp() {
    }

    public final lcq a() {
        ConversationIdType conversationIdType;
        yiy yiyVar;
        if (this.g == 15 && (conversationIdType = this.b) != null && (yiyVar = this.f) != null) {
            return new lcq(this.a, conversationIdType, this.c, this.d, this.e, yiyVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" sortTimestamp");
        }
        if (this.b == null) {
            sb.append(" conversationId");
        }
        if ((this.g & 2) == 0) {
            sb.append(" conversationIsPinned");
        }
        if ((this.g & 4) == 0) {
            sb.append(" isWear");
        }
        if ((this.g & 8) == 0) {
            sb.append(" limit");
        }
        if (this.f == null) {
            sb.append(" nudgeSettingsData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ConversationIdType conversationIdType) {
        if (conversationIdType != null) {
            this.b = conversationIdType;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    public final void c(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 2);
    }

    public final void d(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 4);
    }

    public final void e(int i) {
        this.e = i;
        this.g = (byte) (this.g | 8);
    }

    public final void f(yiy yiyVar) {
        if (yiyVar != null) {
            this.f = yiyVar;
            return;
        }
        throw new NullPointerException("Null nudgeSettingsData");
    }

    public final void g(long j) {
        this.a = j;
        this.g = (byte) (this.g | 1);
    }

    public lcp(lcq lcqVar) {
        this.a = lcqVar.a;
        this.b = lcqVar.b;
        this.c = lcqVar.c;
        this.d = lcqVar.d;
        this.e = lcqVar.e;
        this.f = lcqVar.f;
        this.g = (byte) 15;
    }
}
