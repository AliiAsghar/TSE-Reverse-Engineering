package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wsx extends agmb {
    public String a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public wsx(byte[] bArr) {
        super(a.bp());
    }

    public final ScheduledSendTable.BindData a() {
        int i = wso.a;
        wsw wswVar = new wsw();
        wswVar.ar(az());
        wswVar.a = this.a;
        wswVar.b = (MessageIdType) this.b;
        wswVar.c = (ConversationIdType) this.c;
        wswVar.d = (Instant) this.d;
        wswVar.e = (wtf) this.e;
        wswVar.f = (Instant) this.f;
        wswVar.cF = aA();
        return wswVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aC(2);
        this.c = conversationIdType;
    }

    public final void c(Instant instant) {
        int i = this.az;
        if (i < 58020) {
            agnc.t("creation_time", i);
        }
        aC(5);
        this.f = instant;
    }

    public final void d(String str) {
        aC(0);
        this.a = str;
    }

    public final void e(MessageIdType messageIdType) {
        aC(1);
        this.b = messageIdType;
    }

    public final void f(Instant instant) {
        aC(3);
        this.d = instant;
    }

    public final void g(wtf wtfVar) {
        aC(4);
        this.e = wtfVar;
    }

    public final tdo h() {
        int i = tdb.a;
        tdo tdoVar = new tdo();
        tdoVar.ar(az());
        tdoVar.a = (String) this.b;
        tdoVar.b = (String) this.d;
        tdoVar.c = (qku) this.c;
        tdoVar.d = (String) this.e;
        tdoVar.e = this.a;
        tdoVar.f = (String) this.f;
        tdoVar.cF = aA();
        return tdoVar;
    }

    public final void i(String str) {
        aC(3);
        this.e = str;
    }

    public final void j(String str) {
        aC(5);
        this.f = str;
    }

    public final void k(String str) {
        int i = this.az;
        if (i < 51020) {
            agnc.t("rbm_bot_id", i);
        }
        aC(1);
        this.d = str;
    }

    public final void l(String str) {
        aC(4);
        this.a = str;
    }

    public final void m(qku qkuVar) {
        aC(2);
        this.c = qkuVar;
    }

    public wsx() {
        super(a.bp());
        this.b = rvc.a;
        this.c = ruy.a;
        this.d = uzz.l(0L);
        this.e = wtf.SCHEDULED;
        this.f = uzz.l(0L);
    }
}
