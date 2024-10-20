package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpg {
    public final Object a;

    public lpg(Object obj) {
        this.a = obj;
    }

    private final Optional H(String str) {
        long e = ((ykw) this.a).e(str, -1L);
        if (e == -1) {
            return Optional.empty();
        }
        return Optional.of(Long.valueOf(e));
    }

    private static String I(String str, alpt alptVar) {
        if (alptVar.contains(str)) {
            return str;
        }
        return VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER;
    }

    public static final void k(ConversationId conversationId, BaseBundle baseBundle) {
        if (conversationId != InvalidConversationId.a) {
            baseBundle.putString("conversation_id", conversationId.b());
            baseBundle.putInt("mapi_conversation_kind", conversationId.a().a());
        }
    }

    public static final void l(ConversationId conversationId, Bundle bundle) {
        if (conversationId != InvalidConversationId.a) {
            k(conversationId, bundle);
            bundle.putParcelable("mapi_conversation_id", conversationId);
        }
    }

    public static final void m(ConversationId conversationId, Intent intent, boolean z) {
        Bundle bundle = new Bundle();
        if (z) {
            k(conversationId, bundle);
        } else {
            l(conversationId, bundle);
        }
        intent.putExtras(bundle);
    }

    public static final String p() {
        Optional ofNullable = Optional.ofNullable(Build.MANUFACTURER);
        if (ofNullable.isEmpty()) {
            return "UNKNOWN";
        }
        String str = (String) ofNullable.get();
        if (!assd.a(str)) {
            int length = str.length();
            char[] cArr = new char[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (!Character.isWhitespace(str.charAt(i2))) {
                    cArr[i] = str.charAt(i2);
                    i++;
                }
            }
            if (i != length) {
                str = i == 0 ? "" : new String(cArr, 0, i);
            }
        }
        return I(str.toUpperCase(Locale.US), alpt.o(((aplg) mik.h.e()).b));
    }

    public static final boolean w(ConversationIdType conversationIdType) {
        aiut.b();
        taa taaVar = new taa(tac.a);
        taaVar.w("ParentDisallowedConversationDatabaseOperations#isConversationMarkedAsAllowed");
        tab tabVar = new tab();
        tabVar.b(conversationIdType);
        taaVar.k(new agpw(tabVar));
        return taaVar.b().M();
    }

    public static final void x(ConversationIdType conversationIdType) {
        aiut.b();
        szy szyVar = new szy();
        szyVar.f("ParentDisallowedConversationDatabaseOperations#markConversationAsAllowed");
        tab tabVar = new tab();
        tabVar.b(conversationIdType);
        szyVar.b(tabVar);
        szyVar.d();
    }

    public static final void y(ConversationIdType conversationIdType) {
        agnw d;
        agnw d2;
        conversationIdType.getClass();
        aiut.b();
        String[] strArr = tac.a;
        int i = sym.a;
        top topVar = new top(null);
        topVar.d(conversationIdType);
        szv c = topVar.c();
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "parent_disallowed_conversations", c, new spl(d, 19), new swb(2));
    }

    public final List A() {
        return (List) Collection.EL.stream(((alor) this.a).keySet()).filter(new trt(13)).sorted().map(new uuy(this, 3)).collect(Collectors.toCollection(new tyr(19)));
    }

    public final String B() {
        return C(false);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map, java.lang.Object] */
    public final String C(boolean z) {
        ArrayList arrayList;
        char c;
        StringBuilder sb = new StringBuilder();
        ahtn ahtnVar = uuh.a;
        utz utzVar = utw.a;
        synchronized (uuh.d) {
            arrayList = new ArrayList(uuh.e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (arrayList.isEmpty()) {
            sb2.append("No phenotype keys/values");
        } else {
            Collections.sort(arrayList, new mm(11));
            for (int i = 0; i < arrayList.size(); i++) {
                uuf uufVar = (uuf) arrayList.get(i);
                Object e = uufVar.e();
                boolean equals = Objects.equals(e, uufVar.f());
                String j = uufVar.j();
                if (z && j != null && j.startsWith("bugle_phenotype__")) {
                    j = j.substring(17);
                }
                if (true != equals) {
                    c = '*';
                } else {
                    c = ' ';
                }
                uuh.A(sb2, z, c + j, e);
            }
        }
        String sb3 = sb2.toString();
        if (sb3.endsWith("\n")) {
            sb.append(sb3);
        }
        Object obj = this.a;
        alok alokVar = new alok();
        asqe asqeVar = (asqe) obj;
        for (String str : asqeVar.b.values()) {
            if (!str.isEmpty()) {
                alokVar.h(str, Boolean.valueOf(((ansy) asqeVar.a).e(str)));
            }
        }
        Map.EL.forEach(asqeVar.c, new lui(alokVar, 15));
        Collection.EL.stream(alokVar.b().entrySet()).sorted(new mm(10)).forEach(new ive(sb, z, 3));
        String sb4 = sb.toString();
        if (sb4.isEmpty()) {
            return "No phenotype keys/values";
        }
        return sb4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void D(umw umwVar, uta utaVar) {
        ((uof) this.a.b()).b(upk.b("update_unread_counter", umwVar, utaVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final akul E(umk umkVar, uta utaVar) {
        return ((uof) this.a.b()).b(upk.b("rbm_business_info_retrieval", umkVar, utaVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void F(umk umkVar, uta utaVar) {
        ((uof) this.a.b()).b(upk.b("rbm_business_info_retrieval", umkVar, utaVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void G() {
        ((uof) this.a.b()).b(upk.a("expire_wap_push_si_message", und.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final Iterable a(Iterable iterable) {
        Optional l = ((adje) this.a.b()).l();
        Iterable iterable2 = iterable;
        if (!l.isEmpty()) {
            iterable2 = iterable;
            if (((Boolean) aczf.o().a.T.a()).booleanValue()) {
                HashSet J = alzz.J(iterable);
                Configuration configuration = (Configuration) l.get();
                if (J.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im") && !configuration.mServicesConfiguration.mChatAuth) {
                    J.remove("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
                }
                if (J.contains(adsg.a()) && J.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp") && !configuration.mServicesConfiguration.mGroupChatAuth) {
                    J.remove(adsg.a());
                }
                boolean contains = J.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
                iterable2 = J;
                if (contains) {
                    iterable2 = J;
                    if (!configuration.mServicesConfiguration.mFtAuth) {
                        J.remove("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
                        iterable2 = J;
                    }
                }
            }
        }
        return iterable2;
    }

    public final Optional b() {
        int d = ((ykw) this.a).d("first_provisioning_ui_event_ui_type", -1);
        if (d == -1) {
            return Optional.empty();
        }
        return Optional.of(amlx.b(d));
    }

    public final Optional c() {
        return H("first_time_rcs_accepted_millis");
    }

    public final Optional d() {
        return H("first_time_rcs_declined_millis");
    }

    public final Optional e() {
        return H("first_time_rcs_provisioned_millis");
    }

    public final Optional f() {
        return H("first_rcs_provisioning_ui_event_time");
    }

    public final Optional g() {
        return H("first_rcs_eligibility_time");
    }

    public final void h(Runnable runnable, String str, Executor executor) {
        qjb.a(new itl(this, str, runnable, 7, (char[]) null), executor);
    }

    public final PendingIntent i(Intent intent, lzx lzxVar) {
        intent.setType(lzxVar.c);
        intent.putExtra("com.google.android.apps.messaging.shared.alarm.task", lzxVar.d);
        PendingIntent b = aipr.b((Context) this.a, 0, intent, yhy.a(0));
        b.getClass();
        return b;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    public final ConversationId j(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        extras.getClass();
        ConversationId conversationId = (ConversationId) extras.getParcelable("mapi_conversation_id");
        if (conversationId != null) {
            return conversationId;
        }
        String string = extras.getString("conversation_id");
        if (string == null) {
            return null;
        }
        ConversationIdType b = ruy.b(string);
        if (b.b()) {
            return null;
        }
        aozy createBuilder = mpi.a.createBuilder();
        String a = b.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        mpi mpiVar = (mpi) createBuilder.b;
        a.getClass();
        mpiVar.c = a;
        int i = extras.getInt("mapi_conversation_kind", mph.UNKNOWN.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((mpi) createBuilder.b).b = i;
        mpi mpiVar2 = (mpi) createBuilder.s();
        mph b2 = mph.b(mpiVar2.b);
        if (b2 == null) {
            b2 = mph.UNRECOGNIZED;
        }
        if (b2 != mph.UNKNOWN) {
            return ((miw) this.a.b()).b(mpiVar2);
        }
        return new BugleConversationId(b);
    }

    public final mjv n(int i, int i2) {
        Resources resources = ((Context) this.a).getResources();
        String string = resources.getString(i);
        resources.getBoolean(i2);
        return new mjv(string);
    }

    public final String o() {
        Optional ofNullable = Optional.ofNullable(((yjr) this.a).t());
        if (ofNullable.isEmpty()) {
            return "UNKNOWN";
        }
        return I((String) ofNullable.get(), alpt.o(((aplg) mik.g.e()).b));
    }

    public final void q(long j, List list) {
        ((alvg) ((alvg) aidx.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltLoggerImpl", "logOccurrence", 35, "MobaltLoggerImpl.java")).q("Mobalt: schedule recording occurrence metric");
        aidx aidxVar = (aidx) this.a;
        akul aj = aktp.aj(new aidw(aidxVar, j, list, 0), aidxVar.b);
        aj.c(akto.j(new ahnu(aj, new Object[0], 12, null)), andi.a);
    }

    public final uxj r() {
        return (uxj) uxj.d.get(((AtomicInteger) this.a).get());
    }

    public final void s(uxj uxjVar) {
        uxjVar.getClass();
        ((AtomicInteger) this.a).set(uxjVar.ordinal());
    }

    public final boolean t() {
        if (r() != uxj.a) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (r() == uxj.c && t()) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if (t()) {
            if (r() == uxj.b) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("TrustedContactsInMemory cache is not initialized. Cannot be used to determine the supervision status.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final boolean z() {
        Boolean bool = (Boolean) this.a.a();
        bool.getClass();
        return bool.booleanValue();
    }

    public lpg(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public lpg(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public lpg(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public lpg(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public lpg(armf armfVar, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public lpg(Context context) {
        context.getClass();
        this.a = context;
    }

    public lpg(byte[] bArr) {
        this.a = armd.a(tzt.f);
    }

    public lpg(armf armfVar, byte[] bArr, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public lpg() {
        this.a = new AtomicInteger(uxj.a.ordinal());
    }
}
