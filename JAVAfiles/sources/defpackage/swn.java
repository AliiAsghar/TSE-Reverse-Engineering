package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swn extends agmb {
    public long a;
    public MessageIdType b;
    public ConversationIdType c;
    public int d;
    public float e;
    public amzp f;
    public String g;
    public long h;
    public amzf i;
    public apzk j;
    public int k;
    public amzq l;
    public int m;

    public swn() {
        super(a.bp());
        this.b = rvc.a;
        this.c = ruy.a;
        this.d = 0;
        this.e = brg.a;
        this.f = amzp.SPAM;
        this.g = "";
        this.h = 0L;
        this.i = amzf.UNKNOWN_DETECTION_TRIGGER_TYPE;
        this.j = apzk.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION;
        this.k = 0;
        this.l = amzq.UNKNOWN_SPAM_ERROR;
        this.m = 0;
    }

    public final swl a() {
        int i = swm.a;
        swl swlVar = new swl();
        swlVar.ar(az());
        swlVar.a = this.a;
        swlVar.b = this.b;
        swlVar.c = this.c;
        swlVar.d = this.d;
        swlVar.e = this.e;
        swlVar.f = this.f;
        swlVar.g = this.g;
        swlVar.h = this.h;
        swlVar.i = this.i;
        swlVar.j = this.j;
        swlVar.k = this.k;
        swlVar.l = this.l;
        swlVar.m = this.m;
        swlVar.cF = aA();
        return swlVar;
    }

    public final void b(int i) {
        int i2 = this.az;
        if (i2 < 59460) {
            agnc.t("action_contributors", i2);
        }
        aC(10);
        this.k = i;
    }

    public final void c(apzk apzkVar) {
        int i = this.az;
        if (i < 59460) {
            agnc.t("action_type", i);
        }
        aC(9);
        this.j = apzkVar;
    }

    public final void d(String str) {
        int i = this.az;
        if (i < 58100) {
            agnc.t("ares_initiated_by", i);
        }
        aC(6);
        this.g = str;
    }

    public final void e(long j) {
        int i = this.az;
        if (i < 59190) {
            agnc.t("classification_timestamp", i);
        }
        aC(7);
        this.h = j;
    }

    public final void f(ConversationIdType conversationIdType) {
        int i = this.az;
        if (i < 59460) {
            agnc.t("conversation_id", i);
        }
        aC(2);
        this.c = conversationIdType;
    }

    public final void g(amzq amzqVar) {
        int i = this.az;
        if (i < 59460) {
            agnc.t("error_code", i);
        }
        aC(11);
        this.l = amzqVar;
    }

    public final void h(MessageIdType messageIdType) {
        aC(1);
        this.b = messageIdType;
    }

    public final void i(amzp amzpVar) {
        int i = this.az;
        if (i < 58030) {
            agnc.t("outcome", i);
        }
        aC(5);
        this.f = amzpVar;
    }

    public final void j(int i) {
        int i2 = this.az;
        if (i2 < 59460) {
            agnc.t("reclassification_index", i2);
        }
        aC(12);
        this.m = i;
    }

    public final void k(float f) {
        int i = this.az;
        if (i < 45040) {
            agnc.t("score", i);
        }
        aC(4);
        this.e = f;
    }

    public final void l(int i) {
        aC(3);
        this.d = i;
    }

    public final void m(amzf amzfVar) {
        int i = this.az;
        if (i < 59460) {
            agnc.t("trigger", i);
        }
        aC(8);
        this.i = amzfVar;
    }
}
