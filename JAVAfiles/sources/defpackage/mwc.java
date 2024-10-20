package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwc {
    public final AtomicReference a = new AtomicReference(null);
    public final ConversationId b;
    public final mjq c;
    public final alpt d;
    public final mis e;
    public final long f;
    public final boolean g;
    public final int h;
    public final int i;
    public final nfw j;
    public final alog k;
    public final amjk l;
    public final mod m;
    public final mit n;
    public final boolean o;
    public final int p;

    public mwc(ConversationId conversationId, mjq mjqVar, alpt alptVar, mis misVar, long j, int i, boolean z, int i2, int i3, nfw nfwVar, alog alogVar, amjk amjkVar, mod modVar, mit mitVar, boolean z2) {
        this.b = conversationId;
        this.c = mjqVar;
        this.d = alptVar;
        this.e = misVar;
        this.f = j;
        this.p = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = nfwVar;
        this.k = alogVar;
        this.l = amjkVar;
        this.m = modVar;
        this.n = mitVar;
        this.o = z2;
    }

    public final mwj a() {
        return (mwj) this.a.get();
    }

    public final boolean equals(Object obj) {
        nfw nfwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwc) {
            mwc mwcVar = (mwc) obj;
            if (this.b.equals(mwcVar.b) && this.c.equals(mwcVar.c) && this.d.equals(mwcVar.d) && this.e.equals(mwcVar.e) && this.f == mwcVar.f) {
                int i = this.p;
                int i2 = mwcVar.p;
                if (i != 0) {
                    if (i == i2 && this.g == mwcVar.g && this.h == mwcVar.h && this.i == mwcVar.i && ((nfwVar = this.j) != null ? nfwVar.equals(mwcVar.j) : mwcVar.j == null) && alzz.at(this.k, mwcVar.k) && this.l.equals(mwcVar.l) && this.m.equals(mwcVar.m) && this.n.equals(mwcVar.n) && this.o == mwcVar.o) {
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
        int hashCode;
        int i;
        int hashCode2 = ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        int i2 = this.p;
        a.aS(i2);
        nfw nfwVar = this.j;
        if (nfwVar == null) {
            hashCode = 0;
        } else {
            hashCode = nfwVar.hashCode();
        }
        long j = this.f;
        int i3 = ((((hashCode2 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2) * 1000003;
        int i4 = 1237;
        if (true != this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode3 = (((((((((((((((i3 ^ i) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ hashCode) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003;
        if (true == this.o) {
            i4 = 1231;
        }
        return hashCode3 ^ i4;
    }

    public final String toString() {
        mit mitVar = this.n;
        mod modVar = this.m;
        amjk amjkVar = this.l;
        alog alogVar = this.k;
        nfw nfwVar = this.j;
        mis misVar = this.e;
        alpt alptVar = this.d;
        mjq mjqVar = this.c;
        return "BugleComposeConstraints{conversationId=" + String.valueOf(this.b) + ", bestAvailableTransportFeatureSet=" + String.valueOf(mjqVar) + ", supportedTransportFeatureSets=" + String.valueOf(alptVar) + ", composeDisabledReason=" + String.valueOf(misVar) + ", maxMessageSizeBytes=" + this.f + ", attachmentMode=" + lgc.L(this.p) + ", locationSharingSupported=" + this.g + ", attachmentCountLimit=" + this.h + ", textLengthLimit=" + this.i + ", selfIdentity=" + String.valueOf(nfwVar) + ", recipients=" + String.valueOf(alogVar) + ", conversationProtocolConditions=" + String.valueOf(amjkVar) + ", palMode=" + String.valueOf(modVar) + ", conversationKind=" + String.valueOf(mitVar) + ", wasRcsConversation=" + this.o + "}";
    }

    public mwc() {
    }
}
