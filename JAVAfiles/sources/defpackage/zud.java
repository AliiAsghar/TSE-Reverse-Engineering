package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zud {
    public final rsa a;
    public final boolean b;
    public final boolean c;
    public final byte[] d;

    public zud() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zud) {
            zud zudVar = (zud) obj;
            if (this.a.equals(zudVar.a) && this.b == zudVar.b && this.c == zudVar.c) {
                boolean z = zudVar instanceof zud;
                if (Arrays.equals(this.d, zudVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i2 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true == this.c) {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ Arrays.hashCode(this.d);
    }

    public final String toString() {
        byte[] bArr = this.d;
        return "AddContactLoadedData{getConversationParticipantData=" + this.a.toString() + ", isBannerEligible=" + this.b + ", isAddContactEligible=" + this.c + ", profilePictureBytes=" + Arrays.toString(bArr) + "}";
    }

    public zud(rsa rsaVar, boolean z, boolean z2, byte[] bArr) {
        if (rsaVar == null) {
            throw new NullPointerException("Null getConversationParticipantData");
        }
        this.a = rsaVar;
        this.b = z;
        this.c = z2;
        this.d = bArr;
    }
}
