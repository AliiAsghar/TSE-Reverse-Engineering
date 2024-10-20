package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class std extends agmb {
    public String a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public std(byte[] bArr) {
        super(a.bp());
        this.c = null;
        this.d = null;
    }

    public final stc a() {
        int i = ssv.a;
        stc stcVar = new stc();
        stcVar.ar(az());
        stcVar.a = this.a;
        stcVar.b = (ConversationIdType) this.c;
        stcVar.c = (MessageIdType) this.d;
        stcVar.d = this.b;
        stcVar.e = (aqby) this.e;
        stcVar.cF = aA();
        return stcVar;
    }

    public final void b(aqby aqbyVar) {
        aC(4);
        this.e = aqbyVar;
    }

    public final void c(int i) {
        aC(3);
        this.b = i;
    }

    public final void d(ConversationIdType conversationIdType) {
        aC(1);
        this.c = conversationIdType;
    }

    public final void e(MessageIdType messageIdType) {
        int i = this.az;
        if (i < 20040) {
            agnc.t("message_id", i);
        }
        aC(2);
        this.d = messageIdType;
    }

    public final qwo f() {
        Object obj;
        int i = qqe.a;
        try {
            if (oes.a() && (obj = this.c) != null) {
                h((qwe) obj);
            }
            qwo qwoVar = new qwo();
            qwoVar.ar(az());
            qwoVar.a = this.b;
            qwoVar.b = (String) this.e;
            qwoVar.c = this.a;
            qwoVar.d = (qwe) this.c;
            qwoVar.e = (qwe) this.d;
            qwoVar.cF = aA();
            return qwoVar;
        } catch (Throwable th) {
            throw new aglw(th);
        }
    }

    public final void g(qwe qweVar) {
        int i = this.az;
        if (i < 59450) {
            agnc.t("my_identity_token", i);
        }
        aC(3);
        this.c = qweVar;
    }

    public final void h(qwe qweVar) {
        if (this.az < 60160) {
            return;
        }
        aC(4);
        this.d = qweVar;
    }

    public final void i(String str) {
        aC(1);
        this.e = str;
    }

    public final void j(int i) {
        aC(0);
        this.b = i;
    }

    public final void k(String str) {
        aC(2);
        this.a = str;
    }

    public std() {
        super(a.bp());
        this.c = ruy.a;
        this.d = rvc.a;
        this.b = 0;
    }
}
