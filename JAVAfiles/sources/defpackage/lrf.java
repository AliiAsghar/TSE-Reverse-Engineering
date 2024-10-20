package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.privacy.etouffeetoggle.EtouffeeToggleActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrf {
    public final Object a;
    public final Object b;
    public final Object c;

    public lrf(Context context, xvc xvcVar, armf armfVar) {
        this.a = context;
        this.b = xvcVar;
        this.c = armfVar;
    }

    public static /* synthetic */ void p(sfy sfyVar) {
        sfyVar.f(rpk.b.a);
        sfyVar.d(2, 1);
    }

    public final long a() {
        return ((zxy) this.b).i();
    }

    public final boolean b() {
        zxy zxyVar = (zxy) this.b;
        boolean z = ((Resources) zxyVar.c).getBoolean(R.bool.link_preview_tombstone_seen_pref_default);
        if (((ykw) zxyVar.b).q(((Resources) zxyVar.c).getString(R.string.link_preview_tombstone_seen_pref_key), z) && a() > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (d() && b()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [xyt, java.lang.Object] */
    public final boolean d() {
        if (e() && f()) {
            if (!((odl) this.c.b()).a() || !((yaq) this.a.a()).o()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e() {
        return ((zxy) this.b).o();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [xyt, java.lang.Object] */
    public final boolean f() {
        if (((zxy) this.b).r()) {
            return ((yaq) this.a.a()).q();
        }
        return true;
    }

    public final void g() {
        ((zxy) this.b).v();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [mbn, java.lang.Object] */
    public final synchronized aboj h(String str) {
        Object obj;
        ?? r0 = this.b;
        obj = r0.get(str);
        if (obj == null) {
            aboj abojVar = new aboj((abnr) this.a, "BUGLE_COUNTERS", Integer.MAX_VALUE);
            abojVar.i(this.c.b(str));
            r0.put(str, abojVar);
            obj = abojVar;
        }
        return (aboj) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final mvn i() {
        arwe arweVar = (arwe) this.a.b();
        arweVar.getClass();
        uqg uqgVar = (uqg) this.c.b();
        uqgVar.getClass();
        lgg lggVar = (lgg) this.b.b();
        lggVar.getClass();
        return new mvn(arweVar, uqgVar, lggVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    public final PenpalBotConversation j(BugleConversation bugleConversation, miw miwVar) {
        kor korVar = (kor) this.a.b();
        korVar.getClass();
        lqn lqnVar = (lqn) this.c.b();
        lqnVar.getClass();
        lqn lqnVar2 = (lqn) this.b.b();
        lqnVar2.getClass();
        bugleConversation.getClass();
        miwVar.getClass();
        return new PenpalBotConversation(korVar, lqnVar, lqnVar2, bugleConversation, miwVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final EmergencySosConversation k(BugleConversation bugleConversation) {
        kor korVar = (kor) this.b.b();
        korVar.getClass();
        lpg lpgVar = (lpg) this.a.b();
        lpgVar.getClass();
        bugleConversation.getClass();
        return new EmergencySosConversation(korVar, lpgVar, this.c, bugleConversation);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [armf, java.lang.Object] */
    public final ConversationId l(ConversationIdType conversationIdType, String str, boolean z) {
        msh n;
        conversationIdType.getClass();
        if (str == null) {
            return new BugleConversationId(conversationIdType);
        }
        if (z && qrl.a() && ((obm) this.a.b()).a()) {
            n = ((msk) this.c.b()).a(str);
        } else {
            n = ((msk) this.c.b()).n(str);
        }
        if (n.B()) {
            return new EmergencySosConversationId(conversationIdType);
        }
        if (((obm) this.a.b()).a() && n.A()) {
            return new RbmConversationId(conversationIdType);
        }
        return new BugleConversationId(conversationIdType);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void m(ConversationIdType conversationIdType, int i) {
        conversationIdType.getClass();
        if (i != 0) {
            ((agnq) this.c.b()).i(new mla(17), null, new qq(this, conversationIdType, i, 14, (char[]) null), agnt.NO_TXN_EXCLUDING_SCOPE);
            return;
        }
        throw null;
    }

    public final void n(Bundle bundle) {
        Object obj = this.a;
        if (obj != null) {
            bundle.putString("other_participant_msisdn", (String) obj);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            bundle.putString("conversation_name", (String) obj2);
        }
        Object obj3 = this.b;
        if (obj3 != null) {
            bundle.putInt("theme_color", ((Integer) obj3).intValue());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public final Uri o(ufb ufbVar) {
        xyl.l(ufbVar);
        String bB = yyb.bB((Context) this.a);
        Uri uri = ufbVar.c;
        if (bB.equals(uri.getAuthority())) {
            return uri;
        }
        String str = ufbVar.d;
        return ((xvc) this.b).w(uri, str, ((msk) this.c.b()).f(), null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final rgy q() {
        arwe arweVar = (arwe) this.a.b();
        arweVar.getClass();
        wfe wfeVar = (wfe) this.b.b();
        wfeVar.getClass();
        return new rgy(arweVar, wfeVar, (Optional) ((apxx) this.c).a);
    }

    public lrf(EtouffeeToggleActivity etouffeeToggleActivity, armf armfVar, armf armfVar2) {
        this.a = etouffeeToggleActivity;
        this.b = armfVar;
        this.c = armfVar2;
    }

    public lrf(Integer num, String str, String str2) {
        this.b = num;
        this.c = str;
        this.a = str2;
    }

    public lrf(zxy zxyVar, xyt xytVar, armf armfVar) {
        this.b = zxyVar;
        this.a = xytVar;
        this.c = armfVar;
    }

    public lrf(Bundle bundle) {
        if (bundle == null) {
            this.a = null;
            this.c = null;
            this.b = null;
        } else {
            this.a = bundle.getString("other_participant_msisdn");
            this.c = bundle.getString("conversation_name");
            Object obj = bundle.get("theme_color");
            this.b = obj instanceof Integer ? (Integer) obj : null;
        }
    }

    public lrf(armf armfVar, armf armfVar2, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.b = armfVar2;
        this.a = arweVar;
    }

    public lrf(lzj lzjVar, alog alogVar) {
        this.b = lzjVar.getContext().getPackageName();
        this.c = new MatrixCursor(ajub.a);
        this.a = alogVar;
    }

    public lrf(mbn mbnVar, abnr abnrVar) {
        this.c = mbnVar;
        this.a = abnrVar;
        this.b = new LinkedHashMap();
    }

    public lrf(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.c = armfVar;
        this.b = armfVar2;
        this.a = armfVar3;
    }

    public lrf(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public lrf(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
    }

    public lrf(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
    }

    public lrf(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public lrf(rjz rjzVar, arwe arweVar, arpi arpiVar) {
        arweVar.getClass();
        arpiVar.getClass();
        this.b = rjzVar;
        this.c = arweVar;
        this.a = arpiVar;
    }

    public lrf() {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "message_star_backup._id";
        a.c = new wsy();
        rmu rmuVar = new rmu(a.a());
        this.b = rmuVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new rlm(10);
        a2.a = "message_star_backup.message_id";
        a2.c = new wsy();
        rmu rmuVar2 = new rmu(a2.a());
        this.a = rmuVar2;
        this.c = new rmu[]{rmuVar, rmuVar2};
    }

    public lrf(armf armfVar, armf armfVar2, armf armfVar3, short[] sArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    public lrf(armf armfVar, qya qyaVar, rpl rplVar) {
        this.b = rplVar;
        String str = rpk.b.a;
        arwe arweVar = (arwe) qyaVar.a.b();
        arweVar.getClass();
        ?? r4 = qyaVar.b;
        rpj rpjVar = (rpj) qyaVar.c.b();
        rpjVar.getClass();
        this.a = new rph(str, armfVar, new rqh(arweVar, r4, rpjVar, rplVar, qyaVar.d));
        this.c = alvi.m("com/google/android/apps/messaging/shared/datamodel/backup/restore/messages/BatchedMessageRestoreTableWriter");
    }
}
