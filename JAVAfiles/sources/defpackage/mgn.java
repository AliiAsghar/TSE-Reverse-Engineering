package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgn {
    public final MessageCoreData a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Optional f;
    public final int g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final int k;

    public mgn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgn) {
            mgn mgnVar = (mgn) obj;
            if (this.a.equals(mgnVar.a) && this.b == mgnVar.b && this.c == mgnVar.c && this.d == mgnVar.d && this.e == mgnVar.e && this.f.equals(mgnVar.f)) {
                int i = this.k;
                int i2 = mgnVar.k;
                if (i != 0) {
                    if (i == i2 && this.g == mgnVar.g && this.h.equals(mgnVar.h) && this.i.equals(mgnVar.i) && this.j.equals(mgnVar.j)) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        int i = this.k;
        a.bm(i);
        return (((((((((hashCode * 1000003) ^ i) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final String toString() {
        String str;
        Optional optional = this.f;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(optional);
        int i = this.k;
        if (i != 0) {
            str = akec.aI(i);
        } else {
            str = "null";
        }
        Optional optional2 = this.h;
        Optional optional3 = this.i;
        Optional optional4 = this.j;
        return "MessageFailureParameters{messageSnapshot=" + valueOf + ", subId=" + this.b + ", resultCode=" + this.c + ", httpStatusCode=" + this.d + ", errorCode=" + this.e + ", rcsDiagnostics=" + valueOf2 + ", mmsApi=" + str + ", lastConnectionFailureCauseCode=" + this.g + ", formatType=" + String.valueOf(optional2) + ", outgoingFailureReason=" + String.valueOf(optional3) + ", satelliteMessageSubType=" + String.valueOf(optional4) + "}";
    }

    public mgn(MessageCoreData messageCoreData, int i, int i2, int i3, int i4, Optional optional, int i5, int i6, Optional optional2, Optional optional3, Optional optional4) {
        this.a = messageCoreData;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = optional;
        this.k = i5;
        this.g = i6;
        this.h = optional2;
        this.i = optional3;
        this.j = optional4;
    }
}
