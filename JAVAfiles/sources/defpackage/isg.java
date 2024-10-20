package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.conversation.messagelist.tombstone.ConversationTombstoneView;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class isg implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ isg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            case 4:
                return Predicate$CC.$default$and(this, predicate);
            case 5:
                return Predicate$CC.$default$and(this, predicate);
            case 6:
                return Predicate$CC.$default$and(this, predicate);
            case 7:
                return Predicate$CC.$default$and(this, predicate);
            case 8:
                return Predicate$CC.$default$and(this, predicate);
            case 9:
                return Predicate$CC.$default$and(this, predicate);
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            case 13:
                return Predicate$CC.$default$and(this, predicate);
            case 14:
                return Predicate$CC.$default$and(this, predicate);
            case 15:
                return Predicate$CC.$default$and(this, predicate);
            case 16:
                return Predicate$CC.$default$and(this, predicate);
            case 17:
                return Predicate$CC.$default$and(this, predicate);
            case 18:
                return Predicate$CC.$default$and(this, predicate);
            case 19:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            case 7:
                return Predicate$CC.$default$negate(this);
            case 8:
                return Predicate$CC.$default$negate(this);
            case 9:
                return Predicate$CC.$default$negate(this);
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            case 13:
                return Predicate$CC.$default$negate(this);
            case 14:
                return Predicate$CC.$default$negate(this);
            case 15:
                return Predicate$CC.$default$negate(this);
            case 16:
                return Predicate$CC.$default$negate(this);
            case 17:
                return Predicate$CC.$default$negate(this);
            case 18:
                return Predicate$CC.$default$negate(this);
            case 19:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            case 4:
                return Predicate$CC.$default$or(this, predicate);
            case 5:
                return Predicate$CC.$default$or(this, predicate);
            case 6:
                return Predicate$CC.$default$or(this, predicate);
            case 7:
                return Predicate$CC.$default$or(this, predicate);
            case 8:
                return Predicate$CC.$default$or(this, predicate);
            case 9:
                return Predicate$CC.$default$or(this, predicate);
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            case 13:
                return Predicate$CC.$default$or(this, predicate);
            case 14:
                return Predicate$CC.$default$or(this, predicate);
            case 15:
                return Predicate$CC.$default$or(this, predicate);
            case 16:
                return Predicate$CC.$default$or(this, predicate);
            case 17:
                return Predicate$CC.$default$or(this, predicate);
            case 18:
                return Predicate$CC.$default$or(this, predicate);
            case 19:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean booleanValue;
        Boolean bool;
        boolean booleanValue2;
        boolean booleanValue3;
        boolean booleanValue4;
        boolean booleanValue5;
        boolean booleanValue6;
        boolean booleanValue7;
        boolean booleanValue8;
        boolean booleanValue9;
        qei qeiVar = null;
        int i = 2;
        boolean z = true;
        switch (this.b) {
            case 0:
                utz utzVar = itb.a;
                return ((alpt) this.a).contains(((ParticipantsTable.BindData) obj).O());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                String str = ((qei) entry.getKey()).d;
                qei qeiVar2 = (qei) entry.getKey();
                Instant instant = (Instant) entry.getValue();
                itb itbVar = (itb) this.a;
                if (instant.isAfter(itbVar.o.f())) {
                    boolean booleanValue10 = ((Boolean) new mss(11).get()).booleanValue();
                    if (str != null && (!booleanValue10 || (qeiVar2 != null && (2 & qeiVar2.b) != 0))) {
                        rrl rrlVar = (rrl) itbVar.ay.a();
                        if (!rrlVar.d) {
                            if (booleanValue10) {
                                str = qeiVar2.d;
                            }
                            xzb.o("BugleTyping", "%s is typing in this conversation, but participants are not loaded.", yyb.bh(str));
                        } else {
                            rsa rsaVar = rrlVar.e;
                            if (true == booleanValue10) {
                                qeiVar = qeiVar2;
                            }
                            ParticipantsTable.BindData c = rsaVar.c(str, qeiVar);
                            if (c == null) {
                                if (booleanValue10) {
                                    str = qeiVar2.d;
                                }
                                xzb.o("BugleTyping", "%s is typing in this conversation, but they aren't a participant.", yyb.bh(str));
                            } else {
                                c.O().getClass();
                                return true;
                            }
                        }
                    } else {
                        xzb.n("BugleTyping", "Received a ChatSessionEvent with a null user id");
                    }
                }
                return false;
            case 2:
                return ((ujs) obj).c(((ConversationTombstoneView) this.a).a);
            case 3:
                return ((ujs) obj).c(((ConversationTombstoneView) this.a).a);
            case 4:
                booleanValue = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue;
            case 5:
                agmh agmhVar = (agmh) obj;
                int i2 = agmhVar.a.h;
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 5) {
                        return false;
                    }
                    if (!odv.a()) {
                        return true;
                    }
                    kmz kmzVar = ((DumpDatabaseAction) this.a).a;
                    int ordinal = kmzVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            alog alogVar = (alog) kmzVar.d.get(agmhVar.e());
                            if (alogVar != null && alogVar.contains(agmhVar.d())) {
                                z = false;
                            }
                            bool = Boolean.valueOf(z);
                        } else {
                            bool = false;
                        }
                    } else {
                        bool = true;
                    }
                    return bool.booleanValue();
                }
                throw null;
            case 6:
                kzx kzxVar = (kzx) obj;
                int i4 = kxm.d;
                if (kzxVar != null && ((String) this.a).equals(kzxVar.a.l.a())) {
                    return true;
                }
                return false;
            case 7:
                return ((String) this.a).equals(((nfw) obj).i().map(new mlm(i)).orElse(null));
            case 8:
                return ((nfw) obj).f().equals(this.a);
            case 9:
                booleanValue2 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue2;
            case 10:
                booleanValue3 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue3;
            case 11:
                booleanValue4 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue4;
            case 12:
                booleanValue5 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue5;
            case 13:
                booleanValue6 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue6;
            case 14:
                booleanValue7 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue7;
            case 15:
                booleanValue8 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue8;
            case 16:
                return ((miz) obj).b().equals(this.a);
            case 17:
                mzi mziVar = (mzi) obj;
                int i5 = mux.b;
                MessageId messageId = mziVar.b;
                mzi mziVar2 = (mzi) this.a;
                if (messageId.equals(mziVar2.b) && !mziVar.c.equals(mziVar2.c)) {
                    return true;
                }
                return false;
            case 18:
                return TextUtils.equals(((ResolvedRecipient) obj).z().a, ((ParticipantsTable.BindData) this.a).M());
            case 19:
                return TextUtils.equals(((ResolvedRecipient) obj).z().a, ((ParticipantsTable.BindData) this.a).M());
            default:
                booleanValue9 = ((Boolean) this.a.a(obj)).booleanValue();
                return booleanValue9;
        }
    }
}
