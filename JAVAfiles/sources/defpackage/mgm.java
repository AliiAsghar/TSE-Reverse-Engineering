package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgm {
    public Optional a;
    public Optional b;
    public Optional c;
    public int d;
    private MessageCoreData e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Optional k;
    private byte l;

    public mgm() {
        throw null;
    }

    public final mgn a() {
        MessageCoreData messageCoreData;
        int i;
        if (this.l == 31 && (messageCoreData = this.e) != null && (i = this.d) != 0) {
            return new mgn(messageCoreData, this.f, this.g, this.h, this.i, this.a, i, this.j, this.b, this.c, this.k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" messageSnapshot");
        }
        if ((this.l & 1) == 0) {
            sb.append(" subId");
        }
        if ((this.l & 2) == 0) {
            sb.append(" resultCode");
        }
        if ((this.l & 4) == 0) {
            sb.append(" httpStatusCode");
        }
        if ((this.l & 8) == 0) {
            sb.append(" errorCode");
        }
        if (this.d == 0) {
            sb.append(" mmsApi");
        }
        if ((this.l & 16) == 0) {
            sb.append(" lastConnectionFailureCauseCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.i = i;
        this.l = (byte) (this.l | 8);
    }

    public final void c(int i) {
        this.h = i;
        this.l = (byte) (this.l | 4);
    }

    public final void d(int i) {
        this.j = i;
        this.l = (byte) (this.l | 16);
    }

    public final void e(MessageCoreData messageCoreData) {
        if (messageCoreData != null) {
            this.e = messageCoreData;
            return;
        }
        throw new NullPointerException("Null messageSnapshot");
    }

    public final void f(int i) {
        this.g = i;
        this.l = (byte) (this.l | 2);
    }

    public final void g(amgs amgsVar) {
        this.k = Optional.of(amgsVar);
    }

    public final void h(int i) {
        this.f = i;
        this.l = (byte) (this.l | 1);
    }

    public mgm(byte[] bArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.k = Optional.empty();
    }
}
