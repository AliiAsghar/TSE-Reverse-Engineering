package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgm {
    public final String a;
    public final MessageIdType b;
    public final apdz c;
    public final String d;

    public kgm() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgm)) {
            return false;
        }
        kgm kgmVar = (kgm) obj;
        if (d.F(this.a, kgmVar.a) && d.F(this.b, kgmVar.b) && d.F(this.c, kgmVar.c) && d.F(this.d, kgmVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        MessageIdType messageIdType = this.b;
        if (messageIdType == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = messageIdType.hashCode();
        }
        int i2 = hashCode * 31;
        apdz apdzVar = this.c;
        if (apdzVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = apdzVar.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + hashCode3) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "EffectInfo(suggestionId=" + this.a + ", messageId=" + this.b + ", effect=" + this.c + ", effectLabel=" + this.d + ")";
    }

    public kgm(String str, MessageIdType messageIdType, apdz apdzVar, String str2) {
        this.a = str;
        this.b = messageIdType;
        this.c = apdzVar;
        this.d = str2;
    }

    public /* synthetic */ kgm(byte[] bArr) {
        this(null, null, null, null);
    }
}
