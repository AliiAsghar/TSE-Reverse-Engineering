package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfc implements jzj {
    public final afaj a;
    public final aevq b;
    private final MessageId c;
    private final String d;

    public kfc(MessageId messageId, afaj afajVar, aevq aevqVar) {
        this.c = messageId;
        this.a = afajVar;
        this.b = aevqVar;
        String a = messageId.a();
        a.getClass();
        this.d = a;
    }

    @Override // defpackage.jzj
    public final MessageId a() {
        return this.c;
    }

    @Override // defpackage.aetq
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfc)) {
            return false;
        }
        kfc kfcVar = (kfc) obj;
        if (d.F(this.c, kfcVar.c) && d.F(this.a, kfcVar.a) && d.F(this.b, kfcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() * 31) + this.a.hashCode();
        aevq aevqVar = this.b;
        if (aevqVar == null) {
            hashCode = 0;
        } else {
            hashCode = aevqVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "BugleTombstoneUiData(messageId=" + this.c + ", contentUiData=" + this.a + ", separators=" + this.b + ")";
    }
}
