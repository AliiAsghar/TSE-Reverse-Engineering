package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srq extends agmb {
    public long a;
    public ConversationIdType b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public uyf g;
    public long h;
    public long i;

    public srq() {
        super(a.bp());
        this.b = ruy.a;
        this.e = true;
        this.h = 0L;
        this.i = 0L;
    }

    public final srp a() {
        int i = srr.a;
        srp srpVar = new srp();
        srpVar.ar(az());
        srpVar.a = this.a;
        srpVar.b = this.b;
        srpVar.c = this.c;
        srpVar.d = this.d;
        srpVar.e = this.e;
        srpVar.f = this.f;
        srpVar.g = this.g;
        srpVar.h = this.h;
        srpVar.i = this.i;
        srpVar.cF = aA();
        return srpVar;
    }

    public final void b(String str) {
        aC(2);
        this.c = str;
    }

    public final void c(ConversationIdType conversationIdType) {
        aC(1);
        this.b = conversationIdType;
    }

    public final void d(boolean z) {
        int i = this.az;
        if (i < 58810) {
            agnc.t("is_last_message_outgoing", i);
        }
        aC(5);
        this.f = z;
    }

    public final void e(String str) {
        aC(3);
        this.d = str;
    }

    public final void f(boolean z) {
        int i = this.az;
        if (i < 58700) {
            agnc.t("read", i);
        }
        aC(4);
        this.e = z;
    }

    public final void g(long j) {
        int i = this.az;
        if (i < 59100) {
            agnc.t("sync_timestamp_ms", i);
        }
        aC(8);
        this.i = j;
    }
}
