package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akia {
    public byte a;
    public int b;
    public Object c;

    public akia() {
    }

    public final void a(aozb aozbVar) {
        if (aozbVar != null) {
            this.c = aozbVar;
            return;
        }
        throw new NullPointerException("Null data");
    }

    public final GetMessagesRequest b() {
        if (this.a == 1 && this.c != null) {
            return new AutoValue_GetMessagesRequest(this.b, (TraceId) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" limit");
        }
        if (this.c == null) {
            sb.append(" traceId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(int i) {
        this.b = i;
        this.a = (byte) 1;
    }

    public final void d(TraceId traceId) {
        if (traceId != null) {
            this.c = traceId;
            return;
        }
        throw new NullPointerException("Null traceId");
    }

    public final ahqj e() {
        int i;
        if (this.a == 1 && (i = this.b) != 0) {
            return new ahqj(i, (algw) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [ahmb, java.lang.Object] */
    public final ahma f() {
        int i;
        ?? r1;
        if (this.a == 1 && (i = this.b) != 0 && (r1 = this.c) != 0) {
            return new ahma(i, r1);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" chargeCounterEnabled");
        }
        if (this.c == null) {
            sb.append(" metricExtensionProvider");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(ahmb ahmbVar) {
        if (ahmbVar != null) {
            this.c = ahmbVar;
            return;
        }
        throw new NullPointerException("Null metricExtensionProvider");
    }

    public final void h(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.b = i;
    }

    public final acrt i() {
        if (this.a == 1 && this.c != null) {
            return new acrt(this.b, (Duration) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" retryAfter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(Duration duration) {
        if (duration != null) {
            this.c = duration;
            return;
        }
        throw new NullPointerException("Null retryAfter");
    }

    public final void k(int i) {
        this.b = i;
        this.a = (byte) 1;
    }

    public final qdk l() {
        Object obj;
        boolean z = true;
        if (this.a == 1 && (obj = this.c) != null) {
            qdk qdkVar = new qdk((qfo) obj, this.b);
            albo.U(true, "Invalid negative content part index");
            if (qdkVar.b >= qdkVar.a.j.size()) {
                z = false;
            }
            albo.U(z, "Content part index larger than content count");
            return qdkVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" incomingChatMessageRequest");
        }
        if (this.a == 0) {
            sb.append(" contentPartIndex");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void m(int i) {
        this.b = i;
        this.a = (byte) 1;
    }

    public final void n(qfo qfoVar) {
        if (qfoVar != null) {
            this.c = qfoVar;
            return;
        }
        throw new NullPointerException("Null incomingChatMessageRequest");
    }

    public akia(byte[] bArr, byte[] bArr2) {
        this.c = alfd.a;
    }
}
