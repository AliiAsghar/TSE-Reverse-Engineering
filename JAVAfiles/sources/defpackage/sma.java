package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sma extends agmb {
    public long a;
    public long b;
    public long c;
    public Object d;
    public Object e;
    public Enum f;
    public Object g;

    public sma(byte[] bArr, byte[] bArr2) {
        super(a.bp());
        this.f = anic.CMS_DATA_PROVIDER_UNSPECIFIED;
    }

    public final sjn a() {
        int i = shg.a;
        sjn sjnVar = new sjn();
        sjnVar.ar(az());
        sjnVar.a = this.a;
        sjnVar.b = (ConversationIdType) this.g;
        sjnVar.c = (qhy) this.e;
        sjnVar.d = (qhx) this.f;
        sjnVar.e = (String) this.d;
        sjnVar.f = this.c;
        sjnVar.g = this.b;
        sjnVar.cF = aA();
        return sjnVar;
    }

    public final void b(qhx qhxVar) {
        int i = this.az;
        if (i < 58690) {
            agnc.t("classification_state", i);
        }
        aC(3);
        this.f = qhxVar;
    }

    public final void c(qhy qhyVar) {
        aC(2);
        this.e = qhyVar;
    }

    public final void d(ConversationIdType conversationIdType) {
        aC(1);
        this.g = conversationIdType;
    }

    public final void e(String str) {
        aC(4);
        this.d = str;
    }

    public sma(byte[] bArr) {
        super(a.bp());
        this.g = ruy.a;
        this.e = qhy.CONVERSATION_CLASSIFICATION_TYPE_UNSPECIFIED;
        this.f = qhx.CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED;
        this.c = 0L;
        this.b = 0L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sma() {
        /*
            r1 = this;
            agnw r0 = defpackage.d.P()
            agcp r0 = r0.W()
            r1.<init>(r0)
            j$.time.Instant r0 = j$.time.Instant.EPOCH
            r1.d = r0
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = defpackage.ruy.a
            r1.e = r0
            qfe r0 = defpackage.qfe.UNKNOWN_STATE
            r1.f = r0
            rxg r0 = defpackage.rxg.a
            r1.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sma.<init>():void");
    }
}
