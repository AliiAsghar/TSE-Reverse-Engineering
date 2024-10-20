package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GroupMember;
import com.google.android.rcs.client.messaging.AutoValue_MessagingOperationResult;
import com.google.android.rcs.client.messaging.GroupMember;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyt {
    public boolean a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;

    public ajyt() {
    }

    public final ajyu a() {
        Object obj = this.c;
        if (obj != null) {
            this.d = ((alob) obj).g();
        } else if (this.d == null) {
            int i = alog.d;
            this.d = alsx.a;
        }
        if (this.b == 1) {
            return new ajyu(this.a, (alog) this.d, (alog) this.e);
        }
        throw new IllegalStateException("Missing required properties: canSwitchAccounts");
    }

    public final void b(Class cls) {
        if (this.c == null) {
            this.c = new alob();
        }
        ((alob) this.c).h(cls);
    }

    public final void c(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final MessagingOperationResult d() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.b == 1 && (obj = this.c) != null && (obj2 = this.e) != null && (obj3 = this.d) != null) {
            return new AutoValue_MessagingOperationResult((MessagingResult) obj, (String) obj2, (Conversation) obj3, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" result");
        }
        if (this.e == null) {
            sb.append(" messageId");
        }
        if (this.d == null) {
            sb.append(" conversation");
        }
        if (this.b == 0) {
            sb.append(" isRevocationSupported");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(Conversation conversation) {
        if (conversation != null) {
            this.d = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public final void f(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void g(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    public final void h(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.c = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final GroupMember i() {
        Object obj;
        Object obj2;
        if (this.b == 1 && (obj = this.d) != null && (obj2 = this.c) != null) {
            return new AutoValue_GroupMember((String) obj, (ajpu) obj2, (Optional) this.e, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" displayName");
        }
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.b == 0) {
            sb.append(" isOwnUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null displayName");
    }

    public final void k(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final aibi l() {
        Object obj;
        Object obj2;
        if (this.b == 1 && (obj = this.c) != null && (obj2 = this.d) != null) {
            return new ahzz((aiaj) this.e, (aiac) obj, (aiak) obj2, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" day");
        }
        if (this.d == null) {
            sb.append(" time");
        }
        if (this.b == 0) {
            sb.append(" truncated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void m(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final agny n() {
        Object obj;
        Object obj2;
        if (this.b == 1 && (obj = this.e) != null && (obj2 = this.d) != null) {
            return new agny((String) obj, this.a, (agni) obj2, (String) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" tableName");
        }
        if (this.b == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if (this.d == null) {
            sb.append(" loggingTag");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void o(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void p(alog alogVar) {
        if (alogVar != null) {
            this.d = alogVar;
            return;
        }
        throw new NullPointerException("Null annotations");
    }

    public ajyt(byte[] bArr, byte[] bArr2) {
        this.e = Optional.empty();
    }
}
