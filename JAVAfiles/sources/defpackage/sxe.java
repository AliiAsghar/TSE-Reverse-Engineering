package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxe extends agmb {
    public long a;
    public long b;
    public int c;
    public Object d;
    public Enum e;
    public Object f;

    public sxe(byte[] bArr) {
        super(a.bp());
        this.d = ruy.a;
        this.e = pqz.b(0);
        this.f = psk.b(0);
    }

    public final sxd a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        sxd sxdVar = (sxd) obj;
        sxdVar.ar(az());
        sxdVar.a = this.a;
        sxdVar.b = (String) this.d;
        sxdVar.c = this.b;
        sxdVar.d = this.c;
        sxdVar.e = (mem) this.e;
        sxdVar.f = (String) this.f;
        sxdVar.cF = aA();
        return sxdVar;
    }

    @Deprecated
    public final void b() {
        agnw d;
        agnw d2;
        sxd a = a(new swm(10));
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "message_status", a, new spl(d, 16), new smq(a, 12));
    }

    public final void c(mem memVar) {
        aC(4);
        this.e = memVar;
    }

    public final void d(String str) {
        aC(5);
        this.f = str;
    }

    public final void e(String str) {
        aC(1);
        this.d = str;
    }

    public final void f(int i) {
        aC(3);
        this.c = i;
    }

    public final void g(long j) {
        aC(2);
        this.b = j;
    }

    public final sga h() {
        int i = seo.a;
        sga sgaVar = new sga();
        sgaVar.ar(az());
        sgaVar.a = this.a;
        sgaVar.b = (ConversationIdType) this.d;
        sgaVar.c = (pqz) this.e;
        sgaVar.d = this.c;
        sgaVar.e = (psk) this.f;
        sgaVar.f = this.b;
        sgaVar.cF = aA();
        return sgaVar;
    }

    public final void i(pqz pqzVar) {
        aC(2);
        this.e = pqzVar;
    }

    public final void j(ConversationIdType conversationIdType) {
        aC(1);
        this.d = conversationIdType;
    }

    public final void k(psk pskVar) {
        int i = this.az;
        if (i < 59050) {
            agnc.t("conversation_toolstone_state", i);
        }
        aC(4);
        this.f = pskVar;
    }

    public final void l(long j) {
        int i = this.az;
        if (i < 59050) {
            agnc.t("conversation_toolstone_timestamp_ms", i);
        }
        aC(5);
        this.b = j;
    }

    public sxe() {
        super(a.bp());
        this.b = 0L;
        this.c = 0;
    }
}
