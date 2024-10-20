package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zas {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public zas(Context context, armf armfVar, armf armfVar2, armf armfVar3, xnv xnvVar, ExecutorService executorService, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = context;
        this.f = armfVar;
        this.j = armfVar2;
        this.a = armfVar3;
        this.g = xnvVar;
        this.e = executorService;
        this.c = armfVar4;
        this.i = armfVar5;
        this.d = armfVar6;
        this.h = armfVar7;
    }

    public static void f(Activity activity) {
        ajgi ajgiVar = new ajgi(activity);
        ajgiVar.m(R.string.bad_custom_theme);
        ajgiVar.j(false);
        ajgiVar.o(R.string.bad_custom_theme_close_button, new iws(6));
        ajgiVar.a();
    }

    public final akul a() {
        if (((Boolean) yfe.r.e()).booleanValue()) {
            return aktp.ag(0);
        }
        return akul.g(((akbj) this.d).c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Deprecated
    public final akul b(akul akulVar) {
        return akulVar.h(new yez(this, 2), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul c() {
        return a().h(new yeb(11), this.a);
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [qoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [qoq, java.lang.Object] */
    public final void d(Intent intent, ConversationIdType conversationIdType, boolean z, boolean z2, boolean z3, boolean z4) {
        String S;
        boolean z5;
        ConversationId bugleConversationId = new BugleConversationId(conversationIdType);
        if (((oru) this.a.b()).a()) {
            smr q = ((rtz) this.j.b()).q(conversationIdType);
            lrf lrfVar = (lrf) this.c.b();
            if (q == null) {
                S = null;
            } else {
                S = q.S();
            }
            if (q != null && q.ac()) {
                z5 = true;
            } else {
                z5 = false;
            }
            bugleConversationId = lrfVar.l(conversationIdType, S, z5);
        }
        ConversationId conversationId = bugleConversationId;
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.putExtra("mapi_conversation_id", conversationId);
        intent.setAction("android.intent.action.SENDTO");
        if (z3) {
            try {
                ArrayList arrayList = new ArrayList();
                if (intent.getBooleanExtra("SEND_MULTIPLE", false)) {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    arrayList = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                } else {
                    Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                    if (uri != null) {
                        arrayList.add(uri);
                    }
                }
                intent.putParcelableArrayListExtra("message_parts", ((rvq) this.d).b(arrayList, intent.getType()));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Internal error. Failed to extract data from intent.", e);
            }
        }
        if (z2) {
            MessageCoreData a = ((rvq) this.d).a(intent);
            if (a == null && !z4) {
                throw new RuntimeException("Internal error. Failed to extract data from intent.");
            }
            this.g.t((Context) this.b, conversationId, a, z4, intent.getExtras());
            return;
        }
        Action b = ((rjb) this.e).b();
        rjb.a.p("sendMessageFromAssistantIntent.");
        String scheme = intent.getScheme();
        if (scheme != null && scheme.startsWith("mms")) {
            intent.putExtra("requires_mms", true);
        }
        b.u.t("notification_intent", intent);
        b.u.r("bugle_message_source", 9);
        b.r(null);
        if (z) {
            this.g.t((Context) this.b, conversationId, null, z4, intent.getExtras());
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void e(long j) {
        qjb.a(new eyq(this, j, 3), this.e);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    public final boolean g(Activity activity) {
        if (h()) {
            ((lzv) this.j.b()).a(activity);
            activity.finish();
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [armf, java.lang.Object] */
    public final boolean h() {
        if (!((yjf) this.f.b()).h() && yhx.h((Context) this.b) && ((yjr) this.i.b()).y()) {
            return true;
        }
        return false;
    }

    public zas(Context context, rvq rvqVar, qoq qoqVar, ibi ibiVar, armf armfVar, armf armfVar2, armf armfVar3, rjb rjbVar, abbu abbuVar) {
        this.i = new rrb();
        this.b = context;
        this.d = rvqVar;
        this.g = qoqVar;
        this.h = ibiVar;
        this.e = rjbVar;
        this.a = armfVar;
        this.c = armfVar3;
        this.j = armfVar2;
        this.f = abbuVar;
    }

    public zas(armf armfVar, Context context, xnv xnvVar, abqa abqaVar, ykw ykwVar, anen anenVar, anen anenVar2) {
        this.g = new Random();
        this.h = armfVar;
        this.f = context;
        this.i = xnvVar;
        this.j = abqaVar;
        this.b = ykwVar;
        this.a = anenVar;
        this.e = albo.D(new yim(this, 1));
        this.c = new akbj(new vbo(this, 11), anenVar2);
        this.d = new akbj(new vbo(this, 12), anenVar2);
    }

    public zas(Context context, arwe arweVar, yyz yyzVar, zen zenVar, ifq ifqVar, ahqr ahqrVar, armf armfVar, armf armfVar2) {
        context.getClass();
        arweVar.getClass();
        yyzVar.getClass();
        zenVar.getClass();
        ifqVar.getClass();
        ahqrVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = arweVar;
        this.b = yyzVar;
        this.j = zenVar;
        this.i = ifqVar;
        this.c = ahqrVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = context.getResources();
        asaa asaaVar = new asaa(new fzo(this, (arpe) null, 4));
        this.g = asaaVar;
        jdn jdnVar = new jdn(asaaVar, zenVar.e, new liz((Object) this, 3, (short[]) null), 17, null);
        int i = ascp.a;
        this.h = arrn.T(jdnVar, arweVar, asco.a(0L, 3), new zat(null));
    }
}
