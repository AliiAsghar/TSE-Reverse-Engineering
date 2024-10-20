package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class toy extends agmb {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public toy(byte[] bArr, byte[] bArr2) {
        super(a.bp());
        MessageIdType messageIdType = rvc.a;
        this.f = messageIdType;
        this.g = messageIdType;
        this.d = wky.b(0);
    }

    public final tox a() {
        int i = toe.a;
        tox toxVar = new tox();
        toxVar.ar(az());
        toxVar.a = this.a;
        toxVar.b = (String) this.b;
        toxVar.c = (String) this.c;
        toxVar.d = (String) this.d;
        toxVar.e = (String) this.e;
        toxVar.f = (Uri) this.f;
        toxVar.g = (String) this.g;
        toxVar.cF = aA();
        return toxVar;
    }

    public final void b(String str) {
        aC(1);
        this.b = str;
    }

    public final void c(String str) {
        aC(3);
        this.d = str;
    }

    public final void d(long j) {
        aC(0);
        this.a = j;
    }

    public final void e(Uri uri) {
        aC(5);
        this.f = uri;
    }

    public final void f(String str) {
        aC(4);
        this.e = str;
    }

    public final void g(String str) {
        aC(2);
        this.c = str;
    }

    public final void h(String str) {
        aC(6);
        this.g = str;
    }

    public final szn i(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        szn sznVar = (szn) obj;
        sznVar.ar(az());
        Object obj2 = this.b;
        if (obj2 != null) {
            sznVar.a = (String) this.d;
            sznVar.b = (MessageIdType) this.f;
            sznVar.c = this.a;
            sznVar.d = (aqcz) obj2;
            sznVar.e = (aqbc) this.c;
            sznVar.f = (aqba) this.g;
            sznVar.g = (aqbb) this.e;
            sznVar.cF = aA();
            return sznVar;
        }
        throw new IllegalStateException("field suggestion cannot be null");
    }

    public final void j(aqcz aqczVar) {
        aC(3);
        this.b = aqczVar;
    }

    public final void k(MessageIdType messageIdType) {
        aC(1);
        this.f = messageIdType;
    }

    public final svj l(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        svj svjVar = (svj) obj;
        svjVar.ar(az());
        svjVar.a = this.a;
        svjVar.b = (MessageIdType) this.f;
        svjVar.c = (wks) this.e;
        svjVar.d = (MessageIdType) this.g;
        svjVar.e = (wky) this.d;
        svjVar.f = (wku) this.b;
        svjVar.g = (wku) this.c;
        svjVar.cF = aA();
        return svjVar;
    }

    public final void m(MessageIdType messageIdType) {
        aC(1);
        this.f = messageIdType;
    }

    public final void n(wky wkyVar) {
        int i = this.az;
        if (i < 48000) {
            agnc.t("reaction", i);
        }
        aC(4);
        this.d = wkyVar;
    }

    public final void o(wks wksVar) {
        aC(2);
        this.e = wksVar;
    }

    public toy(byte[] bArr) {
        super(a.bp());
        this.f = rvc.a;
        this.a = 0L;
        this.c = aqbc.UNKNOWN_SUGGESTION_TYPE;
        this.g = aqba.UNKNOWN_STATUS;
        this.e = aqbb.UNCONSUMED;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public toy() {
        /*
            r1 = this;
            agnw r0 = defpackage.d.P()
            agcp r0 = r0.W()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toy.<init>():void");
    }
}
