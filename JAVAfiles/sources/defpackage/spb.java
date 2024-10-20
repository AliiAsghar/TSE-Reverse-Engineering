package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spb extends agmb {
    public ConversationIdType a;
    public String b;
    public jpo c;
    public String d;
    public boolean e;
    public String f;
    public boolean g;

    public spb() {
        super(a.bp());
        this.a = ruy.a;
        this.e = false;
        this.g = false;
    }

    public final spa a() {
        int i = sms.a;
        spa spaVar = new spa();
        spaVar.ar(az());
        spaVar.a = this.a;
        spaVar.b = this.b;
        spaVar.c = this.c;
        spaVar.d = this.d;
        spaVar.e = this.e;
        spaVar.f = this.f;
        spaVar.g = this.g;
        spaVar.cF = aA();
        return spaVar;
    }

    public final void b(jpo jpoVar) {
        int i = this.az;
        if (i < 59420) {
            agnc.t("attachments", i);
        }
        aC(2);
        this.c = jpoVar;
    }

    public final void c(ConversationIdType conversationIdType) {
        aC(0);
        this.a = conversationIdType;
    }

    public final void d(boolean z) {
        int i = this.az;
        if (i < 59720) {
            agnc.t("is_encrypted", i);
        }
        aC(6);
        this.g = z;
    }

    public final void e(boolean z) {
        int i = this.az;
        if (i < 59170) {
            agnc.t("is_urgent", i);
        }
        aC(4);
        this.e = z;
    }

    public final void f(String str) {
        int i = this.az;
        if (i < 59540) {
            agnc.t("replied_to_message_id", i);
        }
        aC(5);
        this.f = str;
    }

    public final void g(String str) {
        int i = this.az;
        if (i < 59170) {
            agnc.t("subject", i);
        }
        aC(3);
        this.d = str;
    }

    public final void h(String str) {
        aC(1);
        this.b = str;
    }
}
