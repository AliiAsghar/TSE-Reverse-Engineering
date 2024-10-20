package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtb implements miz, mvt {
    public final MessageId a;
    public final ConversationId b;
    public final mje c;
    public final mym d;
    public final alog e;
    public final armf f;
    public Instant g;
    private final armf h;
    private final Context i;
    private final armf j;
    private final armf k;
    private final ofl l;
    private final MessagesTable.BindData m;
    private final mzx n;
    private final boolean o;
    private final nbv p;
    private final lgc q;

    public mtb(armf armfVar, Context context, lgc lgcVar, armf armfVar2, armf armfVar3, ofl oflVar, MessageId messageId, ConversationId conversationId, MessagesTable.BindData bindData, mje mjeVar, mym mymVar, mzx mzxVar, nbv nbvVar, boolean z, alog alogVar, armf armfVar4) {
        armfVar.getClass();
        context.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        conversationId.getClass();
        bindData.getClass();
        mzxVar.getClass();
        alogVar.getClass();
        this.h = armfVar;
        this.i = context;
        this.q = lgcVar;
        this.j = armfVar2;
        this.k = armfVar3;
        this.l = oflVar;
        this.a = messageId;
        this.b = conversationId;
        this.m = bindData;
        this.c = mjeVar;
        this.d = mymVar;
        this.n = mzxVar;
        this.p = nbvVar;
        this.o = z;
        this.e = alogVar;
        this.f = armfVar4;
        Instant ofEpochMilli = Instant.ofEpochMilli(bindData.t());
        ofEpochMilli.getClass();
        this.g = ofEpochMilli;
    }

    @Override // defpackage.miz
    public final miy a() {
        miy ay = lga.ay(this.m.k());
        ay.getClass();
        return ay;
    }

    @Override // defpackage.miz
    public final /* synthetic */ MessageId b() {
        return this.a;
    }

    @Override // defpackage.miz
    public final mje c() {
        return this.c;
    }

    @Override // defpackage.miz
    public final ConversationId d() {
        return this.b;
    }

    @Override // defpackage.miz
    public final /* synthetic */ mym e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mtb) {
            mtb mtbVar = (mtb) obj;
            if (d.F(this.a, mtbVar.a) && d.F(this.b, mtbVar.b) && this.o == mtbVar.o && d.F(this.g, mtbVar.g) && d.F(i(), mtbVar.i()) && d.F(this.m, mtbVar.m) && d.F(this.n, mtbVar.n) && d.F(this.c, mtbVar.c) && d.F(this.d, mtbVar.d) && d.F(this.p, mtbVar.p) && d.F(this.e, mtbVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.miz
    public final nbe f() {
        if (this.o) {
            return null;
        }
        return this.n.b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [arwe, java.lang.Object] */
    @Override // defpackage.miz
    public final akul g() {
        akul c;
        lhm lhmVar = (lhm) this.h.b();
        c = qjh.c(lhmVar.i, arpj.a, arwf.a, new mtf(lhmVar, this, null));
        return c;
    }

    @Override // defpackage.miz
    public final Instant h() {
        return this.g;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.miz
    public final Instant i() {
        Instant ofEpochMilli = Instant.ofEpochMilli(this.m.v());
        ofEpochMilli.getClass();
        return ofEpochMilli;
    }

    @Override // defpackage.miz
    public final Long j() {
        Long valueOf = Long.valueOf(this.m.x());
        if (valueOf.longValue() == 0) {
            return null;
        }
        return valueOf;
    }

    @Override // defpackage.miz
    public final String k() {
        return this.n.c;
    }

    @Override // defpackage.miz
    public final String l() {
        if (this.m.G() == tqf.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE) {
            Context context = this.i;
            MessagesTable.BindData bindData = this.m;
            Resources resources = context.getResources();
            if (bindData.k() == 0) {
                String string = resources.getString(R.string.protocol_label_sms_auto_fallback_sent);
                string.getClass();
                return string;
            }
            if (this.m.k() == 1) {
                String string2 = resources.getString(R.string.protocol_label_mms_auto_fallback_sent);
                string2.getClass();
                return string2;
            }
        }
        Context context2 = this.i;
        switch (this.m.k()) {
            case 0:
                return "SMS";
            case 1:
                return "MMS";
            case 2:
                return "MMS Push Notification";
            case 3:
                return "RCS";
            case 4:
                return "Cloud Sync";
            case 5:
                return "Tombstone";
            case 6:
                return "EMP";
            case 7:
                String string3 = context2.getResources().getString(R.string.protocol_satellite);
                string3.getClass();
                return string3;
            default:
                return "Unknown";
        }
    }

    @Override // defpackage.miz
    public final boolean m() {
        return lgc.B(this);
    }

    @Override // defpackage.miz
    public final boolean n() {
        if (this.m.m() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.miz
    public final boolean o() {
        Map unmodifiableMap;
        apws apwsVar;
        Map unmodifiableMap2;
        apwq K = this.m.K();
        String str = null;
        if (K != null && (unmodifiableMap = DesugarCollections.unmodifiableMap(K.b)) != null && (apwsVar = (apws) unmodifiableMap.get(vxt.RCS_PENPAL_NAMESPACE.m)) != null && (unmodifiableMap2 = DesugarCollections.unmodifiableMap(apwsVar.b)) != null) {
            str = (String) unmodifiableMap2.get("jakgvfknopmmo");
        }
        return d.F(str, "true");
    }

    @Override // defpackage.miz
    public final boolean p() {
        return this.m.U();
    }

    @Override // defpackage.miz
    public final nbv q() {
        return this.p;
    }

    @Override // defpackage.miz
    public final int r() {
        boolean z;
        int q = this.m.q();
        if (a() == miy.b && !w().k()) {
            z = false;
        } else {
            z = true;
        }
        if ((q != 2 && q != 1 && q != 11 && q != 100) || !z) {
            return 2;
        }
        return 3;
    }

    @Override // defpackage.miz
    public final int s() {
        int i = this.n.h;
        if (i != 0) {
            return i;
        }
        throw null;
    }

    @Override // defpackage.miz
    public final ndk t() {
        return this.n.i;
    }

    public final String toString() {
        return "BugleMessage(messageDetailsFactory=" + this.h + ", context=" + this.i + ", canForwardMessageUtil=" + this.q + ", replyIdsObservableSupplierFactoryProvider=" + this.j + ", replyCountObservableSupplierFactoryProvider=" + this.k + ", enableSwipeToShowTimestamps=" + this.l + ", id=" + this.a + ", conversationId=" + this.b + ", messageRow=" + this.m + ", provenance=" + this.c + ", content=" + this.d + ", extensionState=" + this.n + ", status=" + this.p + ", ignoreReactions=" + this.o + ", recipients=" + this.e + ", editHistoryLoaderProvider=" + this.f + ")";
    }

    @Override // defpackage.miz
    public final qdq u() {
        return null;
    }

    @Override // defpackage.mvt
    public final int v() {
        return this.m.k();
    }

    public final rve w() {
        rve D = this.m.D();
        D.getClass();
        return D;
    }

    @Override // defpackage.mvt
    public final atok x() {
        return this.m.S();
    }
}
