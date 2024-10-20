package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tof extends agmb {
    public String a;
    public long b;
    public long c;
    public Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tof(byte[] r1, byte[] r2) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.ruy.a
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tof.<init>(byte[], byte[]):void");
    }

    public final tod a() {
        int i = toe.a;
        tod todVar = new tod();
        todVar.ar(az());
        todVar.a = this.a;
        todVar.b = (MessageIdType) this.d;
        todVar.c = this.b;
        todVar.d = this.c;
        todVar.cF = aA();
        return todVar;
    }

    public final void b(MessageIdType messageIdType) {
        aC(1);
        this.d = messageIdType;
    }

    public final void c(long j) {
        aC(2);
        this.b = j;
    }

    public final void d(long j) {
        aC(3);
        this.c = j;
    }

    public final spw e(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        spw spwVar = (spw) obj;
        spwVar.ar(az());
        spwVar.a = this.c;
        spwVar.b = this.b;
        spwVar.c = (mej) this.d;
        spwVar.d = this.a;
        spwVar.cF = aA();
        return spwVar;
    }

    public final void f(String str) {
        aC(3);
        this.a = str;
    }

    public final void g(mej mejVar) {
        aC(2);
        this.d = mejVar;
    }

    public final void h(long j) {
        aC(1);
        this.b = j;
    }

    public final qpp i() {
        int i = qaa.a;
        qpp qppVar = new qpp();
        qppVar.ar(az());
        qppVar.a = this.c;
        qppVar.b = this.b;
        qppVar.c = this.a;
        qppVar.d = (ConversationIdType) this.d;
        qppVar.cF = aA();
        return qppVar;
    }

    public final void j(ConversationIdType conversationIdType) {
        aC(3);
        this.d = conversationIdType;
    }

    public final void k(String str) {
        aC(2);
        this.a = str;
    }

    public final void l(long j) {
        aC(1);
        this.b = j;
    }

    public tof(char[] cArr) {
        super(a.bp());
        this.b = 0L;
        this.d = mej.b(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tof(byte[] r1) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tof.<init>(byte[]):void");
    }

    public tof() {
        super(a.bp());
        this.d = rvc.a;
    }
}
