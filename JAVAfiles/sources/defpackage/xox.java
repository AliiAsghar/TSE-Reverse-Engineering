package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xox extends agmb {
    public MessageIdType a;
    public String b;
    public xpg c;
    public qeq d;
    public qep e;
    public qep f;
    public String g;
    public byte[] h;

    public xox() {
        super(a.bp());
        this.a = rvc.a;
    }

    public final xow a() {
        int i = wso.a;
        xow xowVar = new xow();
        xowVar.ar(az());
        xowVar.a = this.a;
        xowVar.b = this.b;
        xowVar.c = this.c;
        xowVar.d = this.d;
        xowVar.e = this.e;
        xowVar.f = this.f;
        xowVar.g = this.g;
        xowVar.h = this.h;
        xowVar.cF = aA();
        return xowVar;
    }

    public final void b(qep qepVar) {
        int i = this.az;
        if (i < 55030) {
            agnc.t("file_information", i);
        }
        aC(4);
        this.e = qepVar;
    }

    public final void c(MessageIdType messageIdType) {
        aC(0);
        this.a = messageIdType;
    }

    public final void d(byte[] bArr) {
        int i = this.az;
        if (i < 56040) {
            agnc.t("opaque_data", i);
        }
        aC(7);
        this.h = bArr;
    }

    public final void e(String str) {
        aC(1);
        this.b = str;
    }

    public final void f(xpg xpgVar) {
        aC(2);
        this.c = xpgVar;
    }
}
