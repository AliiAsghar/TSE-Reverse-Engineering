package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muw implements wzq, qyi {
    public static final /* synthetic */ int f = 0;
    private static final alog g;
    public final mux a;
    public final anen b;
    public final sxx c;
    public final List d;
    public final Object e = new Object();

    static {
        int i = alog.d;
        g = alsx.a;
    }

    public muw(agnq agnqVar, anen anenVar, pna pnaVar) {
        this.b = anenVar;
        sxy d = MessagesTable.d();
        d.w("MessageChangeObserver");
        d.d(new mtl(pnaVar, 8));
        d.g(new mtm(9));
        this.c = d.b();
        this.d = new ArrayList();
        this.a = new mux(agnqVar, new mpv(this, 9), pnaVar);
    }

    @Override // defpackage.wzq
    public final void a(boolean z) {
        alog n;
        synchronized (this.e) {
            if (this.d.isEmpty()) {
                n = g;
            } else {
                this.c.E(this.a);
                n = alog.n(this.d);
            }
        }
        Stream map = Collection.EL.stream(n).map(new mtm(10));
        int i = alog.d;
        alog alogVar = (alog) map.collect(alls.a);
        if (!alogVar.isEmpty()) {
            qiu.h(aktp.aj(new ikm(alogVar, 7), this.b));
        }
    }

    @Override // defpackage.wzq
    public final void b(boolean z) {
        synchronized (this.e) {
            if (this.d.isEmpty()) {
                return;
            }
            this.c.G(this.a);
        }
    }

    @Override // defpackage.qyi
    public final void c(String str, String str2, long j) {
        alog n;
        synchronized (this.e) {
            n = alog.n(this.d);
        }
        alog alogVar = (alog) Collection.EL.stream(n).map(new mtl(new mzi(miq.INSERT, new CoreBugleMessageId(rvc.b(str), -1L), new BugleConversationId(str2), Instant.ofEpochMilli(j), 0), 9)).collect(alls.a);
        if (!alogVar.isEmpty()) {
            qiu.h(aktp.aj(new ikm(alogVar, 8), this.b));
        }
    }
}
