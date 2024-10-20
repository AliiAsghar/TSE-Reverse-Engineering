package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class rto implements rtm {
    private final armf a;
    protected final rtp b;
    public san c;
    public sac d;
    public final armf e;
    public final armf f;
    private alhr g = albo.D(new msu(20));

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        armf LK();

        armf LL();

        armf LM();

        rtp dj();
    }

    public rto() {
        a aVar = (a) yyb.aL(a.class);
        this.a = aVar.LL();
        this.f = aVar.LK();
        this.e = aVar.LM();
        this.b = aVar.dj();
        this.c = sav.a().a();
        this.d = saj.b().b();
    }

    public abstract boolean E();

    public final int G() {
        if (((okf) this.e.b()).a()) {
            return this.d.f();
        }
        return this.c.f();
    }

    public final int H() {
        if (((okf) this.e.b()).a()) {
            return this.d.j();
        }
        return this.c.j();
    }

    public final long I() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(15, "sort_timestamp");
            return sacVar.p;
        }
        san sanVar = this.c;
        sanVar.ao(15, "sort_timestamp");
        return sanVar.p;
    }

    public final ConversationId J() {
        boolean z;
        ConversationId conversationId = (ConversationId) this.g.get();
        if (conversationId != InvalidConversationId.a) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return conversationId;
    }

    public final mmy K() {
        ConversationIdType conversationIdType;
        if (!uzz.g()) {
            return mmy.b;
        }
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(73, "conversation_id");
            conversationIdType = sacVar.av;
        } else {
            san sanVar = this.c;
            sanVar.ao(73, "conversation_id");
            conversationIdType = sanVar.av;
        }
        if (conversationIdType.b()) {
            return mmy.b;
        }
        return mmy.c;
    }

    public final ConversationIdType L() {
        if (((okf) this.e.b()).a()) {
            return this.d.l();
        }
        return this.c.l();
    }

    public final tqc M() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(14, "archive_status");
            return sacVar.o;
        }
        san sanVar = this.c;
        sanVar.ao(14, "archive_status");
        return sanVar.o;
    }

    public final void N(sac sacVar) {
        this.d = sacVar;
        if (!sacVar.l().b()) {
            this.g = albo.D(new ndb(this, sacVar, 17, null));
        }
    }

    public final void O(san sanVar) {
        this.c = sanVar;
        if (!sanVar.l().b()) {
            this.g = albo.D(new ndb(this, sanVar, 16, null));
        }
    }

    public final boolean P() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(43, "has_been_e2ee");
            return sacVar.R;
        }
        san sanVar = this.c;
        sanVar.ao(43, "has_been_e2ee");
        return sanVar.R;
    }

    public final boolean Q() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(26, "include_email_addr");
            return sacVar.A;
        }
        san sanVar = this.c;
        sanVar.ao(26, "include_email_addr");
        return sanVar.A;
    }

    public final boolean R() {
        if (((okf) this.e.b()).a()) {
            return this.d.q();
        }
        return this.c.q();
    }

    public final boolean S() {
        return tvu.c(G());
    }

    public final boolean T() {
        if (((okf) this.e.b()).a()) {
            sac sacVar = this.d;
            sacVar.ao(44, "marked_as_unread");
            return sacVar.S;
        }
        san sanVar = this.c;
        sanVar.ao(44, "marked_as_unread");
        return sanVar.S;
    }

    public final void U(saf safVar) {
        N((sac) safVar.cK());
    }

    public final void V(sar sarVar) {
        O((san) sarVar.cK());
    }

    public abstract int a();

    public abstract int d();

    public abstract long e();

    public abstract SelfIdentityId f();

    public abstract MessageUsageStatisticsData g(amgj amgjVar, DeviceData deviceData, long j);

    public abstract xhv h();

    public abstract String q();

    public abstract String t();

    public abstract String u();

    public abstract String w(String str);

    public abstract boolean z();
}
