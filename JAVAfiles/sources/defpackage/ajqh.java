package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupMember;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqh {
    public Object a;
    public Object b;
    public Object c;
    private boolean d;
    private byte e;
    private Object f;

    public ajqh() {
        throw null;
    }

    public final GroupMember a() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.e == 1 && (obj = this.a) != null && (obj2 = this.f) != null && (obj3 = this.c) != null) {
            return new AutoValue_GroupMember((String) obj, (RcsDestinationId) obj2, (Optional) this.b, this.d, (ajqi) obj3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" displayName");
        }
        if (this.f == null) {
            sb.append(" id");
        }
        if (this.e == 0) {
            sb.append(" isOwnUser");
        }
        if (this.c == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null displayName");
    }

    public final void c(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId != null) {
            this.f = rcsDestinationId;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void d(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }

    public final void e(RcsDestinationId rcsDestinationId) {
        this.b = Optional.of(rcsDestinationId);
    }

    public final void f(ajqi ajqiVar) {
        if (ajqiVar != null) {
            this.c = ajqiVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [advb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.function.Function] */
    public final advc g() {
        ?? r3;
        ?? r4;
        Object obj;
        if (this.e == 1 && (r3 = this.c) != 0 && (r4 = this.b) != 0 && (obj = this.f) != null) {
            return new advc(r3, r4, this.d, obj, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" observer");
        }
        if (this.b == null) {
            sb.append(" executor");
        }
        if (this.e == 0) {
            sb.append(" notifyOnAdd");
        }
        if (this.f == null) {
            sb.append(" identifier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(Object obj) {
        if (obj != null) {
            this.f = obj;
            return;
        }
        throw new NullPointerException("Null identifier");
    }

    public final void i(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }

    public ajqh(char[] cArr) {
    }

    public ajqh(byte[] bArr) {
        this.b = Optional.empty();
    }
}
