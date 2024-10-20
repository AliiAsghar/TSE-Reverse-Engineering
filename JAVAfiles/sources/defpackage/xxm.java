package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxm {
    private final Boolean a;
    private final Boolean b;
    private final ypi c;
    private final ConversationIdType d;
    private final String e;
    private final boolean f;
    private final amfe g;
    private final int h;
    private final int i;
    private final int j;

    public xxm() {
        throw null;
    }

    public static final xxl b() {
        xxl xxlVar = new xxl();
        xxlVar.a = null;
        xxlVar.b = null;
        xxlVar.c = ypi.b;
        xxlVar.d = null;
        xxlVar.e = null;
        xxlVar.f = true;
        xxlVar.h = (byte) 1;
        xxlVar.g = null;
        xxlVar.i = 2;
        return xxlVar;
    }

    public final xxk a() {
        return yyb.bo(this.a, this.b, this.c, this.d, this.e, null, this.f, this.g, this.h, this.i, this.j, null);
    }

    public final boolean equals(Object obj) {
        amfe amfeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xxm) {
            xxm xxmVar = (xxm) obj;
            Boolean bool = this.a;
            if (bool != null ? bool.equals(xxmVar.a) : xxmVar.a == null) {
                Boolean bool2 = this.b;
                if (bool2 != null ? bool2.equals(xxmVar.b) : xxmVar.b == null) {
                    ypi ypiVar = this.c;
                    if (ypiVar != null ? ypiVar.equals(xxmVar.c) : xxmVar.c == null) {
                        ConversationIdType conversationIdType = this.d;
                        if (conversationIdType != null ? conversationIdType.equals(xxmVar.d) : xxmVar.d == null) {
                            String str = this.e;
                            if (str != null ? str.equals(xxmVar.e) : xxmVar.e == null) {
                                if (this.f == xxmVar.f && ((amfeVar = this.g) != null ? amfeVar.equals(xxmVar.g) : xxmVar.g == null)) {
                                    int i = this.h;
                                    int i2 = xxmVar.h;
                                    if (i != 0) {
                                        if (i == i2) {
                                            int i3 = this.i;
                                            int i4 = xxmVar.i;
                                            if (i3 != 0) {
                                                if (i3 == i4) {
                                                    int i5 = this.j;
                                                    int i6 = xxmVar.j;
                                                    if (i5 != 0) {
                                                        if (i5 == i6) {
                                                            return true;
                                                        }
                                                    } else {
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                throw null;
                                            }
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i;
        Boolean bool = this.a;
        int i2 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003;
        ypi ypiVar = this.c;
        if (ypiVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ypiVar.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        ConversationIdType conversationIdType = this.d;
        if (conversationIdType == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = conversationIdType.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i6 = i5 ^ hashCode5;
        if (true != this.f) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i7 = ((i6 * (-721379959)) ^ i) * 1000003;
        amfe amfeVar = this.g;
        if (amfeVar != null) {
            i2 = amfeVar.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        int i9 = this.h;
        a.bm(i9);
        int i10 = (i8 ^ i9) * 1000003;
        int i11 = this.i;
        a.bm(i11);
        int i12 = (i10 ^ i11) * 1000003;
        int i13 = this.j;
        a.bm(i13);
        return (i12 ^ i13) * 1000003;
    }

    public final String toString() {
        String str;
        String str2;
        amfe amfeVar = this.g;
        ConversationIdType conversationIdType = this.d;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(conversationIdType);
        String valueOf3 = String.valueOf(amfeVar);
        int i = this.h;
        String str3 = "null";
        if (i == 0) {
            str = "null";
        } else {
            str = aktp.au(i);
        }
        int i2 = this.i;
        if (i2 == 0) {
            str2 = "null";
        } else {
            str2 = aktp.av(i2);
        }
        int i3 = this.j;
        if (i3 != 0) {
            str3 = aktp.aw(i3);
        }
        return "BlockAndReportSpamRequestJava{blockStatus=" + this.a + ", spamStatus=" + this.b + ", classificationSource=" + valueOf + ", conversationId=" + valueOf2 + ", targetParticipantId=" + this.e + ", targetRecipient=null, allowExternalReporting=" + this.f + ", bugleConversationOrigin=" + valueOf3 + ", scope=" + str + ", entryPoint=" + str2 + ", dialog=" + str3 + ", spamUserActionType=null}";
    }

    public xxm(Boolean bool, Boolean bool2, ypi ypiVar, ConversationIdType conversationIdType, String str, boolean z, amfe amfeVar, int i, int i2, int i3) {
        this.a = bool;
        this.b = bool2;
        this.c = ypiVar;
        this.d = conversationIdType;
        this.e = str;
        this.f = z;
        this.g = amfeVar;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }
}
