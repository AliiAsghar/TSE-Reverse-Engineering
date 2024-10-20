package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swe extends agmb {
    public UUID a;
    public MessageIdType b;
    public long c;
    public long d;
    public tqs e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public swe() {
        /*
            r1 = this;
            agnw r0 = defpackage.d.P()
            agcp r0 = r0.W()
            r1.<init>(r0)
            java.util.UUID r0 = defpackage.uzz.i()
            r1.a = r0
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r0 = defpackage.rvc.a
            r1.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swe.<init>():void");
    }

    public final swd a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        swd swdVar = (swd) obj;
        swdVar.ar(az());
        swdVar.a = this.a;
        swdVar.b = this.b;
        swdVar.c = this.c;
        swdVar.d = this.d;
        swdVar.e = this.e;
        swdVar.f = this.f;
        swdVar.g = this.g;
        swdVar.h = this.h;
        swdVar.i = this.i;
        swdVar.j = this.j;
        swdVar.k = this.k;
        swdVar.l = this.l;
        swdVar.m = this.m;
        swdVar.cF = aA();
        return swdVar;
    }

    public final void b(String str) {
        aC(7);
        this.h = str;
    }

    public final void c(String str) {
        aC(6);
        this.g = str;
    }

    public final void d(String str) {
        aC(5);
        this.f = str;
    }

    public final void e(String str) {
        aC(12);
        this.m = str;
    }

    public final void f(String str) {
        aC(9);
        this.j = str;
    }

    public final void g(String str) {
        aC(11);
        this.l = str;
    }

    public final void h(UUID uuid) {
        aC(0);
        this.a = uuid;
    }

    public final void i(String str) {
        aC(10);
        this.k = str;
    }

    public final void j(MessageIdType messageIdType) {
        aC(1);
        this.b = messageIdType;
    }

    public final void k(long j) {
        aC(3);
        this.d = j;
    }

    public final void l(String str) {
        aC(8);
        this.i = str;
    }

    public final void m(long j) {
        aC(2);
        this.c = j;
    }

    public final void n(tqs tqsVar) {
        aC(4);
        this.e = tqsVar;
    }
}
