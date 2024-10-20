package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class slo extends agmb {
    public long a;
    public MessageIdType b;
    public int c;
    public String d;
    public String e;
    public String f;
    public rve g;
    public rve h;
    public boolean i;
    public long j;

    public slo() {
        super(a.bp());
        this.b = rvc.a;
        this.c = 0;
        rve rveVar = rve.a;
        this.g = rveVar;
        this.h = rveVar;
        this.i = false;
        this.j = 0L;
    }

    public final sln a() {
        int i = ske.a;
        sln slnVar = new sln();
        slnVar.ar(az());
        slnVar.a = this.a;
        slnVar.b = this.b;
        slnVar.c = this.c;
        slnVar.d = this.d;
        slnVar.e = this.e;
        slnVar.f = this.f;
        slnVar.g = this.g;
        slnVar.h = this.h;
        slnVar.i = this.i;
        slnVar.j = this.j;
        slnVar.cF = aA();
        return slnVar;
    }

    public final void b(int i) {
        aC(2);
        this.c = i;
    }

    public final void c(String str) {
        aC(4);
        this.e = str;
    }

    public final void d(String str) {
        aC(5);
        this.f = str;
    }

    public final void e(String str) {
        aC(3);
        this.d = str;
    }

    public final void f(rve rveVar) {
        int i = this.az;
        if (i < 11001) {
            agnc.t("rcs_message_id", i);
        }
        aC(6);
        this.g = rveVar;
    }

    public final void g(boolean z) {
        int i = this.az;
        if (i < 12000) {
            agnc.t("read", i);
        }
        aC(8);
        this.i = z;
    }

    public final void h(long j) {
        int i = this.az;
        if (i < 12000) {
            agnc.t("received_timestamp", i);
        }
        aC(9);
        this.j = j;
    }

    public final void i(MessageIdType messageIdType) {
        aC(1);
        this.b = messageIdType;
    }

    public final void j(rve rveVar) {
        int i = this.az;
        if (i < 12000) {
            agnc.t("target_rcs_message_id", i);
        }
        aC(7);
        this.h = rveVar;
    }
}
