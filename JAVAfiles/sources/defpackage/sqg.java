package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sqg extends agmb {
    public long a;
    public MessageIdType b;
    public tqg c;
    public long d;
    public boolean e;

    public sqg() {
        super(a.bp());
        this.b = rvc.a;
        this.e = false;
    }

    public final sqf a() {
        int i = spk.a;
        sqf sqfVar = new sqf();
        sqfVar.ar(az());
        sqfVar.a = this.a;
        sqfVar.b = this.b;
        sqfVar.c = this.c;
        sqfVar.d = this.d;
        sqfVar.e = this.e;
        sqfVar.cF = aA();
        return sqfVar;
    }

    public final void b(MessageIdType messageIdType) {
        aC(1);
        this.b = messageIdType;
    }

    public final void c(long j) {
        int i = this.az;
        if (i < 39030) {
            agnc.t("flagged_message_timestamp", i);
        }
        aC(3);
        this.d = j;
    }

    public final void d(tqg tqgVar) {
        aC(2);
        this.c = tqgVar;
    }
}
