package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqj {
    private boolean a;
    private Optional b;
    private Optional c;
    private byte d;

    public ajqj() {
        throw null;
    }

    public final GroupRemoteCapabilities a() {
        if (this.d == 1) {
            return new AutoValue_GroupRemoteCapabilities(this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: supportsSubjectManagement");
    }

    public final void b(Boolean bool) {
        this.c = Optional.of(bool);
    }

    public final void c(Boolean bool) {
        this.b = Optional.of(bool);
    }

    public final void d(boolean z) {
        this.a = z;
        this.d = (byte) 1;
    }

    public ajqj(byte[] bArr) {
        this.b = Optional.empty();
        this.c = Optional.empty();
    }

    public ajqj(GroupRemoteCapabilities groupRemoteCapabilities) {
        this.b = Optional.empty();
        this.c = Optional.empty();
        AutoValue_GroupRemoteCapabilities autoValue_GroupRemoteCapabilities = (AutoValue_GroupRemoteCapabilities) groupRemoteCapabilities;
        this.a = autoValue_GroupRemoteCapabilities.a;
        this.b = autoValue_GroupRemoteCapabilities.b;
        this.c = autoValue_GroupRemoteCapabilities.c;
        this.d = (byte) 1;
    }
}
