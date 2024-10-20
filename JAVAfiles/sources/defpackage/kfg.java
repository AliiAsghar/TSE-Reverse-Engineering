package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfg implements jzj {
    public final aahr a;
    public final arqg b;
    public final arqg c;
    private final MessageId d;
    private final String e;

    public kfg(MessageId messageId, aahr aahrVar, arqg arqgVar, arqg arqgVar2) {
        this.d = messageId;
        this.a = aahrVar;
        this.b = arqgVar;
        this.c = arqgVar2;
        String a = messageId.a();
        a.getClass();
        this.e = a;
    }

    @Override // defpackage.jzj
    public final MessageId a() {
        return this.d;
    }

    @Override // defpackage.aetq
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfg)) {
            return false;
        }
        kfg kfgVar = (kfg) obj;
        if (d.F(this.d, kfgVar.d) && d.F(this.a, kfgVar.a) && d.F(this.b, kfgVar.b) && d.F(this.c, kfgVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.d.hashCode() * 31;
        aahr aahrVar = this.a;
        if (aahrVar == null) {
            hashCode = 0;
        } else {
            hashCode = aahrVar.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BugleToolstoneUiData(messageId=" + this.d + ", contentUiData=" + this.a + ", onCloseClick=" + this.b + ", onLinkClick=" + this.c + ")";
    }
}
