package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfx implements apxw {
    public static asai a(asai asaiVar) {
        asaiVar.getClass();
        return new asdn(new jcw((arpe) null, 3, (short[]) null), asaiVar);
    }

    public static asai c(Conversation conversation, arwe arweVar) {
        conversation.getClass();
        arweVar.getClass();
        ncq e = conversation.e();
        e.getClass();
        asai a = lga.at(e, arweVar).a();
        a.getClass();
        return a;
    }

    public static asai d(Conversation conversation, arwe arweVar) {
        conversation.getClass();
        arweVar.getClass();
        ncq f = conversation.f();
        f.getClass();
        asai a = lga.at(f, arweVar).a();
        a.getClass();
        return a;
    }

    public static mjg e(Conversation conversation) {
        conversation.getClass();
        mjg b = conversation.b();
        b.getClass();
        return b;
    }

    public static OpenConversation2Arguments f(eog eogVar) {
        eogVar.getClass();
        OpenConversation2Arguments openConversation2Arguments = (OpenConversation2Arguments) eogVar.a("open_conversation2_arguments");
        if (openConversation2Arguments != null) {
            return openConversation2Arguments;
        }
        Object a = eogVar.a("mapi_conversation_id");
        a.getClass();
        return new OpenConversation2Arguments((ConversationId) a, null, null, null, false, false, null, 126, null);
    }

    public static miv g(OpenConversation2Arguments openConversation2Arguments) {
        openConversation2Arguments.getClass();
        return openConversation2Arguments.f;
    }

    public static asai h(arwe arweVar, asai asaiVar, asai asaiVar2) {
        arweVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
            jdn jdnVar = new jdn(asaiVar, asaiVar2, new jdy((arpe) null, 2, (char[]) null), 17, null);
            int i = ascp.a;
            return arrn.T(jdnVar, arweVar, asco.a(0L, 3), false);
        }
        return ascy.a(false);
    }

    public static Optional i(apwt apwtVar, oyb oybVar) {
        if (oybVar.a()) {
            return Optional.of((jfy) apwtVar.b());
        }
        return Optional.empty();
    }

    public static jhq j(eog eogVar) {
        jhq jhqVar;
        eogVar.getClass();
        Integer num = (Integer) eogVar.a("COMPOSE_ROW_MODE");
        if (num != null) {
            jhqVar = jhq.values()[num.intValue()];
        } else {
            jhqVar = null;
        }
        if (jhqVar != null) {
            alvw d = jhr.a.d();
            d.X(alwp.a, "BugleComposeRow2");
            ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/mode/ComposeRowModeModule", "provideComposeRowMode", 25, "ComposeRowModeModule.kt")).t("Using compose row mode %s", jhqVar);
            return jhqVar;
        }
        throw new IllegalStateException("Screen did not set ComposeRowMode");
    }

    public static ascg k(arwe arweVar, jiu jiuVar) {
        arweVar.getClass();
        jiuVar.getClass();
        int i = ascp.a;
        return arrn.S(jiuVar.r, arweVar, asco.a(0L, 3), 1);
    }

    public static afsp l() {
        return new afsp(new afrw(2), 6);
    }

    public static Duration m() {
        return albo.cd(3);
    }

    public static afkx n(jlw jlwVar) {
        jlwVar.getClass();
        afkx afkxVar = jlwVar.n;
        afkxVar.getClass();
        return afkxVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alhr, java.lang.Object] */
    public static asai o(lfx lfxVar, arwe arweVar) {
        lfxVar.getClass();
        arweVar.getClass();
        ncq ncqVar = (ncq) lfxVar.b.get();
        ncqVar.getClass();
        asai a = lga.at(ncqVar, arweVar).a();
        a.getClass();
        return a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [alhr, java.lang.Object] */
    public static asai p(lfx lfxVar, arwe arweVar) {
        lfxVar.getClass();
        arweVar.getClass();
        asai a = lga.at(new mrb((lqn) lfxVar.d.get(), 1), arweVar).a();
        a.getClass();
        return a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [alhr, java.lang.Object] */
    public static asai q(lfx lfxVar, arwe arweVar) {
        lfxVar.getClass();
        arweVar.getClass();
        asai a = lga.at(new mrb((lqn) lfxVar.d.get(), 0), arweVar).a();
        a.getClass();
        return a;
    }

    public static jrv r(qdq qdqVar, armf armfVar) {
        qdqVar.getClass();
        armfVar.getClass();
        return qdqVar.h(armfVar);
    }

    public static jrv s(qdq qdqVar, armf armfVar) {
        qdqVar.getClass();
        armfVar.getClass();
        return qdqVar.h(armfVar);
    }

    public static jsm t(qdq qdqVar, owv owvVar) {
        qdqVar.getClass();
        jhn jhnVar = jhn.a;
        if (true != owvVar.a()) {
            jhnVar = null;
        }
        return qdqVar.k(jhnVar);
    }

    public static jsm u(qdq qdqVar, owv owvVar) {
        qdqVar.getClass();
        jhn jhnVar = jhn.b;
        if (true != owvVar.a()) {
            jhnVar = null;
        }
        return qdqVar.k(jhnVar);
    }

    public static jsm v(qdq qdqVar, owv owvVar) {
        qdqVar.getClass();
        jhn jhnVar = jhn.d;
        if (true != owvVar.a()) {
            jhnVar = null;
        }
        return qdqVar.k(jhnVar);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
