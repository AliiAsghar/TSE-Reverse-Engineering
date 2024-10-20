package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwb {
    public mwj a;
    public ConversationId b;
    public nfw c;
    public int d;
    private mjq e;
    private alpr f;
    private alpt g;
    private mis h;
    private long i;
    private boolean j;
    private int k;
    private int l;
    private alog m;
    private amjk n;
    private mod o;
    private mit p;
    private boolean q;
    private byte r;

    public final mwc a() {
        ConversationId conversationId;
        mjq mjqVar;
        mis misVar;
        int i;
        alog alogVar;
        amjk amjkVar;
        mod modVar;
        mit mitVar;
        alpr alprVar = this.f;
        if (alprVar != null) {
            this.g = alprVar.g();
        } else if (this.g == null) {
            this.g = altg.a;
        }
        if (this.r == 31 && (conversationId = this.b) != null && (mjqVar = this.e) != null && (misVar = this.h) != null && (i = this.d) != 0 && (alogVar = this.m) != null && (amjkVar = this.n) != null && (modVar = this.o) != null && (mitVar = this.p) != null) {
            mwc mwcVar = new mwc(conversationId, mjqVar, this.g, misVar, this.i, i, this.j, this.k, this.l, this.c, alogVar, amjkVar, modVar, mitVar, this.q);
            mwcVar.a.set(this.a);
            return mwcVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" conversationId");
        }
        if (this.e == null) {
            sb.append(" bestAvailableTransportFeatureSet");
        }
        if (this.h == null) {
            sb.append(" composeDisabledReason");
        }
        if ((this.r & 1) == 0) {
            sb.append(" maxMessageSizeBytes");
        }
        if (this.d == 0) {
            sb.append(" attachmentMode");
        }
        if ((this.r & 2) == 0) {
            sb.append(" locationSharingSupported");
        }
        if ((this.r & 4) == 0) {
            sb.append(" attachmentCountLimit");
        }
        if ((this.r & 8) == 0) {
            sb.append(" textLengthLimit");
        }
        if (this.m == null) {
            sb.append(" recipients");
        }
        if (this.n == null) {
            sb.append(" conversationProtocolConditions");
        }
        if (this.o == null) {
            sb.append(" palMode");
        }
        if (this.p == null) {
            sb.append(" conversationKind");
        }
        if ((this.r & 16) == 0) {
            sb.append(" wasRcsConversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final alpr b() {
        if (this.f == null) {
            if (this.g == null) {
                this.f = new alpr();
            } else {
                alpr alprVar = new alpr();
                this.f = alprVar;
                alprVar.j(this.g);
                this.g = null;
            }
        }
        return this.f;
    }

    public final int c() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Property \"attachmentMode\" has not been set");
    }

    public final void d(int i) {
        this.k = i;
        this.r = (byte) (this.r | 4);
    }

    public final void e(mjq mjqVar) {
        if (mjqVar != null) {
            this.e = mjqVar;
            return;
        }
        throw new NullPointerException("Null bestAvailableTransportFeatureSet");
    }

    public final void f(mis misVar) {
        if (misVar != null) {
            this.h = misVar;
            return;
        }
        throw new NullPointerException("Null composeDisabledReason");
    }

    public final void g(mit mitVar) {
        if (mitVar != null) {
            this.p = mitVar;
            return;
        }
        throw new NullPointerException("Null conversationKind");
    }

    public final void h(amjk amjkVar) {
        if (amjkVar != null) {
            this.n = amjkVar;
            return;
        }
        throw new NullPointerException("Null conversationProtocolConditions");
    }

    public final void i(boolean z) {
        this.j = z;
        this.r = (byte) (this.r | 2);
    }

    public final void j(long j) {
        this.i = j;
        this.r = (byte) (this.r | 1);
    }

    public final void k(mod modVar) {
        if (modVar != null) {
            this.o = modVar;
            return;
        }
        throw new NullPointerException("Null palMode");
    }

    public final void l(alog alogVar) {
        if (alogVar != null) {
            this.m = alogVar;
            return;
        }
        throw new NullPointerException("Null recipients");
    }

    public final void m(int i) {
        this.l = i;
        this.r = (byte) (this.r | 8);
    }

    public final void n(boolean z) {
        this.q = z;
        this.r = (byte) (this.r | 16);
    }
}
