package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibf {
    public boolean a;
    public byte b;
    public Object c;

    public aibf() {
    }

    public final aibg a() {
        Object obj;
        if (this.b == 1 && (obj = this.c) != null) {
            return new ahzx((aiaj) obj, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" date");
        }
        if (this.b == 0) {
            sb.append(" exceptional");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final ahio c() {
        if (this.c == null) {
            this.c = altg.a;
        }
        if (this.b == 1) {
            return new ahio(this.a, (alpt) this.c);
        }
        throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
    }

    public final void d(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void e(Set set) {
        this.c = alpt.o(set);
    }

    public final void f(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final vse g() {
        if (this.b == 1) {
            return new vse((Optional) this.c, this.a);
        }
        throw new IllegalStateException("Missing required properties: conversationExistsByThreadId");
    }

    public final void h(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final rut i() {
        Object obj;
        if (this.b == 1 && (obj = this.c) != null) {
            return new rut((ConversationIdType) obj, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" conversationId");
        }
        if (this.b == 0) {
            sb.append(" newlyCreated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(ConversationIdType conversationIdType) {
        if (conversationIdType != null) {
            this.c = conversationIdType;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    public final void k(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public aibf(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = Optional.empty();
    }
}
