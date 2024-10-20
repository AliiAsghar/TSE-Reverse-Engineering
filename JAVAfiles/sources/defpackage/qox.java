package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qox {
    public long a;
    public boolean b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;

    public final qoy a() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.c == 3 && (obj = this.d) != null && (obj2 = this.e) != null && (obj3 = this.f) != null) {
            return new qoy((ConversationIdType) obj, this.a, (amfe) obj2, (SuperSortLabel) obj3, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" conversationId");
        }
        if ((this.c & 1) == 0) {
            sb.append(" deleteTimestamp");
        }
        if (this.e == null) {
            sb.append(" origin");
        }
        if (this.f == null) {
            sb.append(" filter");
        }
        if ((this.c & 2) == 0) {
            sb.append(" onlyIfEmpty");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ConversationIdType conversationIdType) {
        if (conversationIdType != null) {
            this.d = conversationIdType;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    public final void c(long j) {
        this.a = j;
        this.c = (byte) (this.c | 1);
    }

    public final void d(SuperSortLabel superSortLabel) {
        if (superSortLabel != null) {
            this.f = superSortLabel;
            return;
        }
        throw new NullPointerException("Null filter");
    }

    public final void e(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void f(amfe amfeVar) {
        if (amfeVar != null) {
            this.e = amfeVar;
            return;
        }
        throw new NullPointerException("Null origin");
    }

    public final void g(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }
}
