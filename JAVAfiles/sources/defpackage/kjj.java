package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjj implements kjf {
    static final /* synthetic */ artm[] a;
    public final Optional b;
    public final ascd c;
    public final ascd d;
    public final AtomicInteger e;
    public final kke f;
    public final kor g;
    private final arwe h;
    private final armf i;
    private final arsn j;
    private final asai k;

    static {
        arrr arrrVar = new arrr(kjj.class, "timerState", "getTimerState()Lcom/google/android/apps/messaging/conversation2/search/ConversationSearchResultsImpl$TimerState;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    public kjj(arwe arweVar, ConversationId conversationId, armf armfVar, Optional optional, kke kkeVar, kor korVar) {
        arweVar.getClass();
        conversationId.getClass();
        armfVar.getClass();
        optional.getClass();
        korVar.getClass();
        this.h = arweVar;
        this.i = armfVar;
        this.b = optional;
        this.f = kkeVar;
        this.g = korVar;
        ascd a2 = ascy.a(null);
        this.c = a2;
        ascd a3 = ascy.a(-1);
        this.d = a3;
        this.e = new AtomicInteger();
        this.j = new kji(kjg.b, this);
        qkc qkcVar = new qkc("ConversationSearchResults::SearchResults", a2);
        qkc qkcVar2 = new qkc("ConversationSearchResults::CurrentResult", a3);
        long j = arut.a;
        Object b = armfVar.b();
        b.getClass();
        this.k = qkq.d(qkcVar, qkcVar2, arweVar, arsd.p(((Number) b).longValue(), aruv.c), new kjh(null));
    }

    @Override // defpackage.kjf
    public final asai a() {
        return this.k;
    }

    @Override // defpackage.kjf
    public final /* synthetic */ asai b() {
        return this.c;
    }

    @Override // defpackage.kjf
    public final void c() {
        int intValue;
        kjk kjkVar = (kjk) this.c.c();
        if (kjkVar != null) {
            ascd ascdVar = this.d;
            if (((Number) ascdVar.c()).intValue() == 0) {
                intValue = aqjn.z(kjkVar.b);
            } else {
                intValue = ((Number) this.d.c()).intValue() - 1;
            }
            ascdVar.f(Integer.valueOf(intValue));
        }
    }

    @Override // defpackage.kjf
    public final void d() {
        int intValue;
        kjk kjkVar = (kjk) this.c.c();
        if (kjkVar != null) {
            ascd ascdVar = this.d;
            if (((Number) ascdVar.c()).intValue() == aqjn.z(kjkVar.b)) {
                intValue = 0;
            } else {
                intValue = ((Number) this.d.c()).intValue() + 1;
            }
            ascdVar.f(Integer.valueOf(intValue));
        }
    }

    @Override // defpackage.kjf
    public final void e() {
        qjh.l(this.h, null, new kbl(this, (arpe) null, 10), 3);
    }

    public final void f(kjg kjgVar) {
        this.j.d(a[0], kjgVar);
    }

    public final void g(String str, alog alogVar) {
        int i;
        this.c.f(new kjk(str, alogVar));
        if (true != alogVar.isEmpty()) {
            i = 0;
        } else {
            i = -1;
        }
        this.d.f(Integer.valueOf(i));
    }
}
