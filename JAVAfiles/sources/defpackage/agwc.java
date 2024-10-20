package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwc {
    public final agvh a;
    public final alog b;
    public final Optional c;
    public final boolean d;
    public final agva e;
    public final anen f;
    public final boolean g;
    public final Optional h;

    public agwc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        alog alogVar;
        agva agvaVar;
        anen anenVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agwc) {
            agwc agwcVar = (agwc) obj;
            if (this.a.equals(agwcVar.a) && ((alogVar = this.b) != null ? alzz.at(alogVar, agwcVar.b) : agwcVar.b == null) && this.c.equals(agwcVar.c) && this.d == agwcVar.d && ((agvaVar = this.e) != null ? agvaVar.equals(agwcVar.e) : agwcVar.e == null) && ((anenVar = this.f) != null ? anenVar.equals(agwcVar.f) : agwcVar.f == null) && this.g == agwcVar.g && this.h.equals(agwcVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        alog alogVar = this.b;
        int i2 = 0;
        if (alogVar == null) {
            hashCode = 0;
        } else {
            hashCode = alogVar.hashCode();
        }
        int hashCode3 = ((hashCode ^ (-139483682)) * 1000003) ^ this.c.hashCode();
        int i3 = 1237;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = ((hashCode3 * (-721379959)) ^ i) * 1000003;
        agva agvaVar = this.e;
        if (agvaVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = agvaVar.hashCode();
        }
        int i5 = (i4 ^ hashCode2) * 1000003;
        anen anenVar = this.f;
        if (anenVar != null) {
            i2 = anenVar.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        if (true == this.g) {
            i3 = 1231;
        }
        return ((i6 ^ i3) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        Optional optional = this.h;
        anen anenVar = this.f;
        agva agvaVar = this.e;
        Optional optional2 = this.c;
        alog alogVar = this.b;
        return "EmojiPickerDataOptions{emojiPickerCoreDataOptions=" + String.valueOf(this.a) + ", recentEmojiProviders=" + String.valueOf(alogVar) + ", pageableItemProvider=" + String.valueOf(optional2) + ", imageLoader=null, stickyVariantsEnabled=" + this.d + ", emojiVariantsController=" + String.valueOf(agvaVar) + ", backgroundExecutor=" + String.valueOf(anenVar) + ", saveToRecentAfterCommit=" + this.g + ", availableEmojis=" + String.valueOf(optional) + "}";
    }

    public agwc(agvh agvhVar, alog alogVar, Optional optional, agva agvaVar, anen anenVar, Optional optional2) {
        this.a = agvhVar;
        this.b = alogVar;
        this.c = optional;
        this.d = true;
        this.e = agvaVar;
        this.f = anenVar;
        this.g = true;
        this.h = optional2;
    }
}
