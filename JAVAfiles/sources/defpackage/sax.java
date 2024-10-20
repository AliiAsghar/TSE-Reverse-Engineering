package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sax {
    private final Boolean a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Boolean e;
    private final Boolean f;
    private final boolean g;
    private final ConversationIdType h;
    private final alog i;
    private final Integer j;

    public sax() {
        throw null;
    }

    public static saw c() {
        saw sawVar = new saw();
        sawVar.f = ruy.a;
        sawVar.b(false);
        int i = alog.d;
        alog alogVar = alsx.a;
        if (alogVar != null) {
            sawVar.g = alogVar;
            return sawVar;
        }
        throw new NullPointerException("Null conversationIds");
    }

    public final sas a() {
        return b().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sat b() {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        int i;
        sat n = vom.n();
        sau sauVar = new sau();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 29020) {
            agnc.t("delete_timestamp", intValue);
        }
        sauVar.U(new agoi("conversations.delete_timestamp", 1, 0L));
        if (d.af(this.a)) {
            sauVar.b(tqc.ARCHIVED, tqc.KEEP_ARCHIVED);
        }
        if (d.af(this.b)) {
            tqc tqcVar = tqc.UNARCHIVED;
            if (tqcVar == null) {
                i = 0;
            } else {
                i = tqcVar.h;
            }
            sauVar.U(new agoi("conversations.archive_status", 1, Integer.valueOf(i)));
        }
        int i2 = 3;
        if (d.af(this.c)) {
            if (yqt.a().booleanValue()) {
                sauVar.U(new agmf("conversations.archive_status", 3, sau.X((Iterable) alzz.C(tqc.g).map(new sal(i2)).collect(Collectors.toCollection(new sap(19)))), true));
            } else {
                sauVar.b(tqc.SPAM_FOLDER, tqc.BLOCKED_FOLDER);
            }
        }
        if (d.af(null)) {
            valueOf4 = Integer.valueOf(a.bp().c());
            int intValue2 = valueOf4.intValue();
            if (intValue2 < 8500) {
                agnc.t("source_type", intValue2);
            }
            sauVar.U(new agoi("conversations.source_type", 1, 1));
        }
        if (d.af(this.e)) {
            valueOf3 = Integer.valueOf(a.bp().c());
            int intValue3 = valueOf3.intValue();
            if (intValue3 < 8500) {
                agnc.t("source_type", intValue3);
            }
            sauVar.U(new agoi("conversations.source_type", 2, 1));
        }
        if (d.af(this.f)) {
            int[] iArr = {0, 1};
            valueOf2 = Integer.valueOf(a.bp().c());
            int intValue4 = valueOf2.intValue();
            if (intValue4 < 10006) {
                agnc.t("join_state", intValue4);
            }
            sauVar.U(new agmf("conversations.join_state", 3, sau.Y(iArr), true));
        }
        if (d.af(Boolean.valueOf(this.g))) {
            sauVar.U(new agmg("parent_disallowed_conversations.conversation_id", 5));
        }
        ConversationIdType conversationIdType = this.h;
        if (!conversationIdType.b()) {
            sauVar.c(conversationIdType);
        }
        alog alogVar = this.i;
        if (!alogVar.isEmpty()) {
            alob alobVar = new alob();
            alur it = alogVar.iterator();
            while (it.hasNext()) {
                alobVar.h(String.valueOf(ruy.a((ConversationIdType) it.next())));
            }
            sauVar.U(new agmf("conversations._id", 3, sau.X(alobVar.g()), true));
        }
        sat n2 = vom.n();
        n2.c(sauVar);
        Integer num = this.j;
        if (num != null) {
            num.intValue();
            n2.u(20);
        }
        if (((Boolean) ((utz) trf.j.get()).e()).booleanValue()) {
            uie uieVar = sav.b;
            n2.e(new atkn(uieVar.a, false), new atkn(uieVar.b, true));
        } else {
            n2.e(new atkn(sav.b.a, false));
        }
        n.c(sauVar);
        Integer num2 = this.j;
        if (num2 != null) {
            num2.intValue();
            n.u(20);
        }
        n.e(new atkn(sav.b.a, false));
        return n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sax) {
            sax saxVar = (sax) obj;
            Boolean bool = this.a;
            if (bool != null ? bool.equals(saxVar.a) : saxVar.a == null) {
                Boolean bool2 = this.b;
                if (bool2 != null ? bool2.equals(saxVar.b) : saxVar.b == null) {
                    Boolean bool3 = this.c;
                    if (bool3 != null ? bool3.equals(saxVar.c) : saxVar.c == null) {
                        Boolean bool4 = saxVar.d;
                        Boolean bool5 = this.e;
                        if (bool5 != null ? bool5.equals(saxVar.e) : saxVar.e == null) {
                            Boolean bool6 = this.f;
                            if (bool6 != null ? bool6.equals(saxVar.f) : saxVar.f == null) {
                                if (this.g == saxVar.g && this.h.equals(saxVar.h) && alzz.at(this.i, saxVar.i)) {
                                    Integer num = this.j;
                                    Integer num2 = saxVar.j;
                                    if (num != null ? num.equals(num2) : num2 == null) {
                                        return true;
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
        Boolean bool3 = this.c;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i4 = i3 ^ hashCode3;
        Boolean bool4 = this.e;
        if (bool4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool4.hashCode();
        }
        int i5 = ((i4 * (-721379959)) ^ hashCode4) * 1000003;
        Boolean bool5 = this.f;
        if (bool5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool5.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        if (true != this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode6 = (((((i6 ^ i) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        Integer num = this.j;
        if (num != null) {
            i2 = num.hashCode();
        }
        return (hashCode6 ^ i2) * 1000003;
    }

    public final String toString() {
        alog alogVar = this.i;
        return "ConversationListQueryBuilder{whereArchived=" + this.a + ", whereNotArchived=" + this.b + ", whereSpam=" + this.c + ", whereCloudSync=null, whereNotCloudSync=" + this.e + ", whereActiveRcsGroup=" + this.f + ", whereApprovedByParent=" + this.g + ", conversationId=" + String.valueOf(this.h) + ", conversationIds=" + String.valueOf(alogVar) + ", limit=" + this.j + ", additionalPredicate=null}";
    }

    public sax(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, ConversationIdType conversationIdType, alog alogVar, Integer num) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = null;
        this.e = bool4;
        this.f = bool5;
        this.g = z;
        this.h = conversationIdType;
        this.i = alogVar;
        this.j = num;
    }
}
