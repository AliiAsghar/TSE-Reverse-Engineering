package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ugx implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ ugx(uek uekVar, long j, long j2, Thread thread, StackTraceElement[] stackTraceElementArr, Optional optional, int i) {
        this.g = i;
        this.f = uekVar;
        this.a = j;
        this.b = j2;
        this.c = thread;
        this.e = stackTraceElementArr;
        this.d = optional;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        agnw d;
        agnw d2;
        if (this.g != 0) {
            Object obj = this.d;
            Object obj2 = this.e;
            Object obj3 = this.c;
            long j = this.b;
            long j2 = this.a;
            Object obj4 = this.f;
            synchronized (uek.c) {
                if (!((uek) obj4).g) {
                    return;
                }
                long a = ((uek) obj4).d.a() - j2;
                long millis = ((uek) obj4).d.d().toMillis() - j;
                uej uejVar = new uej();
                try {
                    uejVar.setStackTrace(((Thread) obj3).getStackTrace());
                } catch (RuntimeException e) {
                    alvw h = uek.a.h();
                    h.X(alwp.a, "BugleDatabasePerf");
                    ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/TransactionWatchDogPlugin", "open", (char) 132, "TransactionWatchDogPlugin.java")).q("unable to acquire stack trace from thread holding transaction");
                }
                uej uejVar2 = new uej(uejVar);
                uejVar2.setStackTrace((StackTraceElement[]) obj2);
                alvw i = uek.a.i();
                i.X(alwp.a, "BugleDatabasePerf");
                ((alvg) ((alvg) ((alvg) i).g(uejVar2)).h("com/google/android/apps/messaging/shared/datamodel/layer/TransactionWatchDogPlugin", "open", 140, "TransactionWatchDogPlugin.java")).z("transaction taking excessive time (%d total; %d in thread)", a, millis);
                ((ucl) ((Optional) obj).get()).a();
                return;
            }
        }
        Object obj5 = this.d;
        Object obj6 = this.e;
        akrh e2 = aktp.e("ReportOperations#getReportTimesForParticipant");
        try {
            tex b = tfa.b();
            b.w("getReportTimesForParticipant");
            b.d(new tux(obj5, obj6, 6));
            tes tesVar = (tes) ((tev) b.b().n()).cO();
            if (tesVar == null) {
                tesVar = tfa.a().a();
            }
            e2.close();
            long j3 = this.a;
            tet m = tesVar.m();
            MessageIdType messageIdType = (MessageIdType) obj5;
            m.c(messageIdType);
            m.d(Long.parseLong((String) obj6));
            if (j3 != 0) {
                m.f(j3);
            }
            long j4 = this.b;
            if (j4 != 0) {
                m.e(j4);
                if (m.c == 0) {
                    m.f(j4);
                }
            }
            Object obj7 = this.f;
            Object obj8 = this.c;
            m.b(Optional.empty());
            tes a2 = m.a();
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            agnc.a(d2, "read_reports", a2, new tbe(d, 12), new ter(a2, 0));
            ((uhj) ((wpp) obj8).c.b()).j((ConversationIdType) obj7, messageIdType, "read_reports");
        } finally {
        }
    }

    public /* synthetic */ ugx(wpp wppVar, MessageIdType messageIdType, String str, long j, long j2, ConversationIdType conversationIdType, int i) {
        this.g = i;
        this.c = wppVar;
        this.d = messageIdType;
        this.e = str;
        this.a = j;
        this.b = j2;
        this.f = conversationIdType;
    }
}
