package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynu extends agmb {
    public String a;
    public long b;
    public Object c;
    public Object d;
    public Object e;

    public ynu(byte[] bArr, byte[] bArr2) {
        super(a.bp());
        this.c = rvc.a;
        this.d = ruy.a;
        this.b = 0L;
        this.e = tqo.SET;
    }

    public final ynt a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        ynt yntVar = (ynt) obj;
        yntVar.ar(az());
        yntVar.a = (MessageIdType) this.c;
        yntVar.b = this.a;
        yntVar.c = (ConversationIdType) this.d;
        yntVar.d = (String) this.e;
        yntVar.e = this.b;
        yntVar.cF = aA();
        return yntVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aC(2);
        this.d = conversationIdType;
    }

    public final void c(String str) {
        aC(3);
        this.e = str;
    }

    public final void d(long j) {
        aC(4);
        this.b = j;
    }

    public final void e(MessageIdType messageIdType) {
        aC(0);
        this.c = messageIdType;
    }

    public final void f(String str) {
        aC(1);
        this.a = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ynu(char[] r1) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynu.<init>(char[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ynu(byte[] r1) {
        /*
            r0 = this;
            agnw r1 = defpackage.d.P()
            agcp r1 = r1.W()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynu.<init>(byte[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ynu() {
        /*
            r1 = this;
            agnw r0 = defpackage.d.P()
            agcp r0 = r0.W()
            r1.<init>(r0)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r0 = defpackage.rvc.a
            r1.c = r0
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = defpackage.ruy.a
            r1.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynu.<init>():void");
    }
}
