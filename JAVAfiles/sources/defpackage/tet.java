package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tet extends agmb {
    public String a;
    public long b;
    public long c;
    public long d;
    public Object e;
    public Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tet(byte[] r1) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tet.<init>(byte[]):void");
    }

    public final tes a() {
        int i = tdb.a;
        tes tesVar = new tes();
        tesVar.ar(az());
        tesVar.a = this.a;
        tesVar.b = (MessageIdType) this.e;
        tesVar.c = this.b;
        tesVar.d = this.c;
        tesVar.e = this.d;
        tesVar.f = (Optional) this.f;
        tesVar.cF = aA();
        return tesVar;
    }

    public final void b(Optional optional) {
        int i = this.az;
        if (i < 58880) {
            agnc.t("ftd_time", i);
        }
        aC(5);
        this.f = optional;
    }

    public final void c(MessageIdType messageIdType) {
        aC(1);
        this.e = messageIdType;
    }

    public final void d(long j) {
        aC(2);
        this.b = j;
    }

    public final void e(long j) {
        aC(4);
        this.d = j;
    }

    public final void f(long j) {
        aC(3);
        this.c = j;
    }

    public tet() {
        super(a.bp());
        this.e = rvc.a;
        this.c = 0L;
        this.d = 0L;
        this.f = uxi.g(-1L);
    }
}
