package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tpu extends agmb {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tpu(byte[] r1, byte[] r2, byte[] r3) {
        /*
            r0 = this;
            agcp r1 = defpackage.a.bq()
            r0.<init>(r1)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r1 = defpackage.rvc.a
            r0.c = r1
            r0.d = r1
            r1 = 0
            ltm r1 = defpackage.ltm.b(r1)
            r0.b = r1
            rve r1 = defpackage.rve.a
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpu.<init>(byte[], byte[], byte[]):void");
    }

    public final VmtTable.BindData a() {
        int i = toe.a;
        tpt tptVar = new tpt();
        tptVar.ar(az());
        Object obj = this.a;
        if (obj != null) {
            tptVar.a = (String) obj;
            tptVar.b = (nht) this.b;
            tptVar.c = (String) this.c;
            tptVar.d = (String) this.d;
            tptVar.cF = aA();
            return tptVar;
        }
        throw new IllegalStateException("field part_id cannot be null");
    }

    public final void b(String str) {
        aC(3);
        this.d = str;
    }

    public final void c(String str) {
        aC(0);
        this.a = str;
    }

    public final void d(String str) {
        aC(2);
        this.c = str;
    }

    public final void e(nht nhtVar) {
        aC(1);
        this.b = nhtVar;
    }

    public final tei f() {
        int i = tdb.a;
        tei teiVar = new tei();
        teiVar.ar(az());
        teiVar.a = (String) this.b;
        teiVar.b = (String) this.c;
        teiVar.c = (String) this.a;
        teiVar.d = (String) this.d;
        teiVar.cF = aA();
        return teiVar;
    }

    public final void g(String str) {
        aC(0);
        this.b = str;
    }

    public final void h(String str) {
        aC(3);
        this.d = str;
    }

    public final void i(String str) {
        aC(2);
        this.a = str;
    }

    public final void j(String str) {
        aC(1);
        this.c = str;
    }

    public final svr k(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        svr svrVar = (svr) obj;
        svrVar.ar(az());
        svrVar.a = (MessageIdType) this.d;
        svrVar.b = (MessageIdType) this.a;
        svrVar.c = (ltm) this.b;
        svrVar.d = (rve) this.c;
        svrVar.cF = aA();
        return svrVar;
    }

    public final void l(MessageIdType messageIdType) {
        aC(0);
        this.d = messageIdType;
    }

    public final void m(MessageIdType messageIdType) {
        aC(1);
        this.a = messageIdType;
    }

    public final void n(ltm ltmVar) {
        aC(2);
        this.b = ltmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpu(char[] cArr) {
        super(agnc.d("backup").W());
        String[] strArr = roq.a;
        this.c = null;
    }

    public tpu(byte[] bArr, byte[] bArr2) {
        super(a.bp());
        MessageIdType messageIdType = rvc.a;
        this.d = messageIdType;
        this.a = messageIdType;
        this.b = ltm.b(0);
        this.c = rve.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tpu(byte[] r1) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpu.<init>(byte[]):void");
    }

    public tpu() {
        super(a.bp());
        this.b = nht.VMT_STATUS_UNKNOWN;
    }
}
