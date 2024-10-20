package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sfg extends agmb {
    public long a;
    public ConversationIdType b;
    public int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sfg() {
        /*
            r1 = this;
            agnw r0 = defpackage.d.P()
            agcp r0 = r0.W()
            r1.<init>(r0)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = defpackage.ruy.a
            r1.b = r0
            r0 = 0
            r1.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfg.<init>():void");
    }

    public final sff a() {
        int i = seo.a;
        sff sffVar = new sff();
        sffVar.ar(az());
        sffVar.a = this.a;
        sffVar.b = this.b;
        sffVar.c = this.c;
        sffVar.cF = aA();
        return sffVar;
    }

    public final void b(int i) {
        aC(2);
        this.c = i;
    }

    public final void c(ConversationIdType conversationIdType) {
        aC(1);
        this.b = conversationIdType;
    }
}
