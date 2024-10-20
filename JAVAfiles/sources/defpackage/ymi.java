package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymi {
    public final boolean a;
    public final ConversationIdType b;
    public final String c;
    public final ypi d;
    public final boolean e;
    public final boolean f;
    public final amfe g;
    public final yni h;
    public final amzu i;
    public final boolean j;
    public final tqc k;
    public final ypj l;
    public final int m;
    public final int n;
    public final int o;

    public ymi(boolean z, ConversationIdType conversationIdType, String str, ypi ypiVar, boolean z2, boolean z3, amfe amfeVar, yni yniVar, amzu amzuVar, int i, int i2, int i3, boolean z4, tqc tqcVar, ypj ypjVar) {
        this.a = z;
        this.b = conversationIdType;
        this.c = str;
        this.d = ypiVar;
        this.e = z2;
        this.f = z3;
        this.g = amfeVar;
        this.h = yniVar;
        this.i = amzuVar;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.j = z4;
        this.k = tqcVar;
        this.l = ypjVar;
        if (conversationIdType != null) {
            if (conversationIdType.b()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (z2) {
            throw new IllegalArgumentException("This API currently does not support external reporting without a conversation. It's reasonable to implement this, but it's not currently implemented.");
        }
        if (str != null && str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (conversationIdType == null && str == null) {
            throw new IllegalArgumentException("If we have neither a conversation nor a participant to update, then calling SpamReporter is invalid, as there's no work to do.");
        }
        if (z4) {
            if (ypiVar == null) {
                if (ypjVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (ypiVar != null) {
            if (ypjVar == null) {
                return;
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymi)) {
            return false;
        }
        ymi ymiVar = (ymi) obj;
        if (this.a == ymiVar.a && d.F(this.b, ymiVar.b) && d.F(this.c, ymiVar.c) && this.d == ymiVar.d && this.e == ymiVar.e && this.f == ymiVar.f && this.g == ymiVar.g && d.F(this.h, ymiVar.h) && this.i == ymiVar.i && this.m == ymiVar.m && this.n == ymiVar.n && this.o == ymiVar.o && this.j == ymiVar.j && this.k == ymiVar.k && d.F(this.l, ymiVar.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        ConversationIdType conversationIdType = this.b;
        int i = 0;
        if (conversationIdType == null) {
            hashCode = 0;
        } else {
            hashCode = conversationIdType.hashCode();
        }
        boolean z = this.a;
        String str = this.c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int v = (a.v(z) * 31) + hashCode;
        ypi ypiVar = this.d;
        if (ypiVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ypiVar.hashCode();
        }
        int v2 = ((((((((((v * 31) + hashCode2) * 31) + hashCode3) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 31) + this.g.hashCode()) * 31;
        yni yniVar = this.h;
        if (yniVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = yniVar.hashCode();
        }
        int i2 = (v2 + hashCode4) * 31;
        amzu amzuVar = this.i;
        if (amzuVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = amzuVar.hashCode();
        }
        int i3 = (i2 + hashCode5) * 31;
        int i4 = this.m;
        a.bm(i4);
        int i5 = (i3 + i4) * 31;
        int i6 = this.n;
        a.bm(i6);
        int i7 = (i5 + i6) * 31;
        int i8 = this.o;
        a.bm(i8);
        int v3 = (((i7 + i8) * 31) + a.v(this.j)) * 31;
        tqc tqcVar = this.k;
        if (tqcVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = tqcVar.hashCode();
        }
        int i9 = (v3 + hashCode6) * 31;
        ypj ypjVar = this.l;
        if (ypjVar != null) {
            i = ypjVar.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        return "SpamRequest(spamStatus=" + this.a + ", conversationId=" + this.b + ", targetParticipantId=" + this.c + ", classificationSource=" + this.d + ", allowExternalReporting=" + this.e + ", allowConversationArchiving=" + this.f + ", bugleConversationOrigin=" + this.g + ", metadata=" + this.h + ", userActionType=" + this.i + ", scope=" + ((Object) aktp.au(this.m)) + ", entryPoint=" + ((Object) aktp.av(this.n)) + ", dialog=" + ((Object) aktp.aw(this.o)) + ", isUndo=" + this.j + ", archiveStatusForUndo=" + this.k + ", classificationSourcesForUndo=" + this.l + ")";
    }
}
