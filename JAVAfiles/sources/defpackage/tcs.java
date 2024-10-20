package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tcs extends agmb {
    public long a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tcs(byte[] r1, byte[] r2, byte[] r3) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            r1 = 0
            ymx r2 = defpackage.ymx.b(r1)
            r0.b = r2
            ymw r1 = defpackage.ymw.b(r1)
            r0.c = r1
            j$.time.Instant r1 = j$.time.Instant.EPOCH
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcs.<init>(byte[], byte[], byte[]):void");
    }

    public final tcr a() {
        int i = tdb.a;
        tcr tcrVar = new tcr();
        tcrVar.ar(az());
        tcrVar.a = this.a;
        tcrVar.b = (Instant) this.b;
        tcrVar.c = (String) this.c;
        tcrVar.d = (String) this.d;
        tcrVar.cF = aA();
        return tcrVar;
    }

    public final void b(String str) {
        aC(3);
        this.d = str;
    }

    public final void c(String str) {
        aC(2);
        this.c = str;
    }

    public final suc d(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        suc sucVar = (suc) obj;
        sucVar.ar(az());
        sucVar.a = this.a;
        sucVar.b = (UUID) this.c;
        sucVar.c = (tqk) this.b;
        sucVar.d = (String) this.d;
        sucVar.cF = aA();
        return sucVar;
    }

    public final void e(String str) {
        aC(3);
        this.d = str;
    }

    public final void f(tqk tqkVar) {
        aC(2);
        this.b = tqkVar;
    }

    public final void g(UUID uuid) {
        aC(1);
        this.c = uuid;
    }

    public final smh h() {
        return i(new ske(17));
    }

    public final smh i(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        smh smhVar = (smh) obj;
        smhVar.ar(az());
        smhVar.a = (ConversationIdType) this.b;
        smhVar.b = this.a;
        smhVar.c = (qfe) this.d;
        smhVar.d = (rxg) this.c;
        smhVar.cF = aA();
        return smhVar;
    }

    public final void j() {
        agnw d;
        agnw d2;
        smh i = i(new ske(18));
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "conversation_to_participants", i, new skt(d, 5), new rbc(13));
    }

    public final void k(ConversationIdType conversationIdType) {
        aC(0);
        this.b = conversationIdType;
    }

    public final void l(rxg rxgVar) {
        aC(3);
        this.c = rxgVar;
    }

    public final void m(long j) {
        aC(1);
        this.a = j;
    }

    public final void n(qfe qfeVar) {
        aC(2);
        this.d = qfeVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tcs(char[] r1, byte[] r2) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcs.<init>(char[], byte[]):void");
    }

    public tcs(byte[] bArr, byte[] bArr2) {
        super(a.bp());
        this.b = ruy.a;
        this.d = qfe.UNKNOWN_STATE;
        this.c = vcp.m();
    }

    public tcs(char[] cArr) {
        super(a.bp());
        this.d = rvc.a;
        this.b = aqaz.UNKNOWN_CLASSIFICATION_TYPE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tcs(byte[] r1) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            java.util.UUID r1 = defpackage.uzz.i()
            r0.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcs.<init>(byte[]):void");
    }

    public tcs() {
        super(a.bp());
        this.b = uzz.l(0L);
    }
}
