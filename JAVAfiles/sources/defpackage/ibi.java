package defpackage;

import android.view.View;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.material.snackbar.Snackbar;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibi {
    public final Object a;

    public ibi(Object obj) {
        this.a = obj;
    }

    public static final alog k(ConversationIdType conversationIdType, qhy qhyVar) {
        conversationIdType.getClass();
        qhyVar.getClass();
        sjs a = sjv.a();
        a.w("getConversationClassifications");
        sju sjuVar = new sju();
        sjuVar.d(conversationIdType);
        sjuVar.c(qhyVar);
        a.k(new agpw(sjuVar));
        alog t = a.b().t();
        t.getClass();
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Set, java.lang.Object] */
    private final Optional t(String str, int i) {
        while (i < str.length() && this.a.contains(Character.valueOf(str.charAt(i)))) {
            i++;
        }
        if (i < str.length()) {
            int i2 = i;
            while (i2 < str.length() && !this.a.contains(Character.valueOf(str.charAt(i2)))) {
                i2++;
            }
            return Optional.of(new kkz(str, i, i2));
        }
        return Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [armf, java.lang.Object] */
    public final void a(int i) {
        if (!((Boolean) ibn.b.e()).booleanValue()) {
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_APP_CONTROL_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amof.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amof amofVar = (amof) createBuilder.b;
        amofVar.c = i - 1;
        amofVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amof amofVar2 = (amof) createBuilder.s();
        amofVar2.getClass();
        amfrVar2.bb = amofVar2;
        amfrVar2.f |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        ((maq) this.a.b()).n(amfqVar);
    }

    public final void b(int i) {
        if (i != 0) {
            ((iil) this.a).b(new iim(i, 1));
            return;
        }
        throw null;
    }

    public final String c(String str, Optional optional, Optional optional2, boolean z) {
        int i;
        boolean z2;
        if (!z && optional.isPresent() && optional2.isPresent()) {
            if (((Boolean) optional.get()).booleanValue() == ((Boolean) optional2.get()).booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            albo.Q(z2, "Both block & spam statuses were set, but the updated values were inconsistent. Values were block: %s spam: %s", optional.get(), optional2.get());
        }
        if (optional.isPresent() && optional2.isPresent()) {
            if (((Boolean) optional.get()).booleanValue()) {
                i = R.string.blocked_and_reported_toast_message;
            } else {
                i = R.string.unblock_and_report_not_spam_snackbar_message;
            }
        } else if (optional.isPresent()) {
            if (((Boolean) optional.get()).booleanValue()) {
                i = R.string.blocked_toast_message;
            } else {
                i = R.string.unblock_snackbar_message;
            }
        } else {
            albo.T(optional2.isPresent());
            if (((Boolean) optional2.get()).booleanValue()) {
                i = R.string.report_spam_snackbar_message;
            } else {
                i = R.string.report_not_spam_snackbar_message;
            }
        }
        return ((cj) this.a).getString(i, new Object[]{str});
    }

    public final void d(ifz ifzVar) {
        e(ifzVar, false);
    }

    public final void e(ifz ifzVar, boolean z) {
        if (((cj) this.a).isFinishing()) {
            return;
        }
        String c = c(ifzVar.a, ifzVar.b, ifzVar.c, z);
        View rootView = ((cj) this.a).getWindow().getDecorView().getRootView();
        Object obj = this.a;
        int i = ifzVar.f;
        Optional optional = ifzVar.d;
        View findViewById = ((cj) obj).findViewById(i);
        if (optional.isPresent()) {
            Snackbar q = Snackbar.q(rootView, c, 0);
            q.t(R.string.snack_bar_undo, new jh(ifzVar, 10, null));
            q.m(findViewById);
            q.i();
            return;
        }
        Snackbar q2 = Snackbar.q(rootView, c, 0);
        q2.m(findViewById);
        q2.i();
    }

    public final alog f(String str) {
        alob alobVar = new alob();
        if (str.isEmpty()) {
            return alobVar.g();
        }
        Optional t = t(str, 0);
        while (t.isPresent()) {
            alobVar.h(t.get());
            t = t(str, ((kkz) t.get()).a + 1);
        }
        return alobVar.g();
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [armf, java.lang.Object] */
    public final rut g(long j, tqc tqcVar, ParticipantsTable.BindData bindData, long j2) {
        rut ap;
        akrh e = aktp.e("GetOrCreateConversationDatabaseOperations#getOrCreateConversationFromParticipant");
        try {
            xyl.h();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(bindData);
            if (((Boolean) qpf.a.e()).booleanValue()) {
                rtz rtzVar = (rtz) this.a.b();
                ruu a = ruv.a();
                a.j(arrayList);
                a.b(tqcVar);
                a.h(true);
                a.g(0);
                a.o(j2);
                a.i(true);
                a.f(false);
                a.s(new xhv(j));
                a.e(false);
                ap = rtzVar.i(a.a());
            } else {
                ap = ((rtz) this.a.b()).ap(wym.a, j, tqcVar, arrayList, j2);
            }
            e.close();
            return ap;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final rut h(xaz xazVar, tqc tqcVar, int i) {
        return i(wym.a, xazVar, tqcVar, i);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final rut i(wxs wxsVar, xaz xazVar, tqc tqcVar, int i) {
        akrh e = aktp.e("GetOrCreateConversationDatabaseOperations#getOrCreateConversationFromThreadData");
        try {
            xyl.h();
            ArrayList J = ((rtz) this.a.b()).J(xazVar, i);
            rut ap = ((rtz) this.a.b()).ap(wxsVar, xazVar.a, tqcVar, J, -1L);
            e.close();
            return ap;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ConversationIdType j(long j, tqc tqcVar, ParticipantsTable.BindData bindData) {
        return g(j, tqcVar, bindData, -1L).a;
    }

    public final sbe l(MessageIdType messageIdType) {
        sbf a = ((say) this.a).a();
        a.w("+getMessageByIdQuery");
        a.e(new rpf(messageIdType, 13));
        a.t((agmh) sbi.c.m);
        a.f(new atkn(sbi.c.j, false));
        return a.b();
    }

    public final sbf m(boolean z, scz sczVar) {
        return ((say) this.a).b(z, false, ruy.a, sczVar);
    }

    public final sbf n(ConversationIdType conversationIdType, int i, int i2) {
        return o(conversationIdType, i, i2, false);
    }

    public final sbf o(ConversationIdType conversationIdType, int i, int i2, boolean z) {
        agoz b;
        if (z) {
            String str = scq.a;
            sdg sdgVar = new sdg(sdi.a);
            sdgVar.w("getLatestMessageIdsWithReactions");
            sdgVar.o(scq.h, "messages.received_timestamp");
            sdgVar.o(scq.b, "DESC");
            sdgVar.o(scq.e, "<");
            sdgVar.o(scq.a, conversationIdType.toString());
            sdgVar.o(scq.c, "messages.message_status <> 3");
            sdgVar.c(new sal(14));
            sdgVar.u(i);
            sdgVar.c(new rrv(4));
            sdgVar.z((String) DesugarArrays.stream(new atkn[]{new atkn(sdi.b.a, false)}).map(new sal(18)).collect(Collectors.joining(", ")));
            sdgVar.u(i);
            sdgVar.x(i2);
            b = sdgVar.b();
        } else {
            sda a = scq.a(conversationIdType, i);
            a.c(new rrv(5));
            a.d(new atkn((agmh) sdc.b.a));
            a.u(i);
            a.x(i2);
            b = a.b();
        }
        return ((say) this.a).b(true, z, conversationIdType, b);
    }

    public final sbe p(MessageIdType[] messageIdTypeArr) {
        sbf c = ((say) this.a).c(true, false, ruy.a);
        sbh sbhVar = new sbh();
        sbhVar.U(new agmf("messages._id", 3, sbh.X((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new sal(8)).collect(Collectors.toCollection(new sbg(0)))), true));
        c.d(sbhVar);
        c.q();
        return c.b();
    }

    public final sbf q(ConversationIdType conversationIdType, int i) {
        return o(conversationIdType, i, 0, true);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final void r(MessageCoreData messageCoreData, int i, int i2, int i3, int i4, amxb amxbVar, int i5, int i6) {
        mho mhoVar = (mho) this.a.b();
        if (!mhoVar.al()) {
            mhoVar.r();
        } else {
            mhoVar.aH(messageCoreData, i, i2, i3, i4, 22, amxbVar, i5, i6, Optional.empty(), Optional.empty(), Optional.empty());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final rgz s() {
        wfe wfeVar = (wfe) this.a.b();
        wfeVar.getClass();
        return new rgz(wfeVar);
    }

    public ibi(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ibi(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ibi(armf armfVar, Executor executor, byte[] bArr) {
        armfVar.getClass();
        executor.getClass();
        this.a = new iil(armfVar, new iij(amfp.BUGLE_ADD_CONTACT), executor);
    }

    public ibi(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ibi(armf armfVar, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ibi(armf armfVar, Executor executor) {
        armfVar.getClass();
        executor.getClass();
        this.a = new iil(armfVar, new iij(amfp.BUGLE_EDIT_CONTACT), executor);
    }

    public ibi() {
        this.a = ascy.a(false);
    }

    public ibi(armf armfVar, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ibi(ascg ascgVar, asai asaiVar, oja ojaVar) {
        ascgVar.getClass();
        asaiVar.getClass();
        this.a = ojaVar;
    }

    public ibi(qyh qyhVar) {
        qyhVar.getClass();
        this.a = qyhVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set, java.lang.Object] */
    public ibi(String str) {
        d.t(!str.isEmpty(), "separators must not be empty");
        this.a = new HashSet();
        for (char c : str.toCharArray()) {
            this.a.add(Character.valueOf(c));
        }
    }

    public ibi(Executor executor) {
        this.a = new anew(executor);
    }

    public ibi(armf armfVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ibi(armf armfVar, short[] sArr, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ibi(armf armfVar, char[] cArr, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ibi(armf armfVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ibi(armf armfVar, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ibi(arpi arpiVar, agnq agnqVar) {
        arpiVar.getClass();
        agnqVar.getClass();
        this.a = arpiVar;
        alwo.o("BugleDataModel");
    }

    public ibi(apwt apwtVar, char[] cArr) {
        apwtVar.getClass();
        this.a = apwtVar;
    }
}
