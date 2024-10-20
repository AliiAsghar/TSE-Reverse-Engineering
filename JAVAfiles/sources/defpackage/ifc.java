package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.block.ui.list.BlockedParticipantsActivity;
import com.google.android.apps.messaging.cloudstore.media.CmsBrokenMediaAttachmentView;
import com.google.android.apps.messaging.cloudstore.media.CmsMediaAttachmentView;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerItemView;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerView;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifc implements apxw {
    public static iez a(cg cgVar) {
        if (cgVar instanceof iez) {
            return (iez) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, ifb.class));
    }

    public static BlockedParticipantsActivity c(Activity activity) {
        if (activity instanceof BlockedParticipantsActivity) {
            BlockedParticipantsActivity blockedParticipantsActivity = (BlockedParticipantsActivity) activity;
            blockedParticipantsActivity.getClass();
            return blockedParticipantsActivity;
        }
        throw new IllegalStateException(hht.d(activity, iew.class, "Attempt to inject a Activity wrapper of type "));
    }

    public static CmsBrokenMediaAttachmentView d(View view) {
        if (view instanceof CmsBrokenMediaAttachmentView) {
            CmsBrokenMediaAttachmentView cmsBrokenMediaAttachmentView = (CmsBrokenMediaAttachmentView) view;
            cmsBrokenMediaAttachmentView.getClass();
            return cmsBrokenMediaAttachmentView;
        }
        throw new IllegalStateException(hht.d(view, ihw.class, "Attempt to inject a View wrapper of type "));
    }

    public static CmsMediaAttachmentView e(View view) {
        if (view instanceof CmsMediaAttachmentView) {
            CmsMediaAttachmentView cmsMediaAttachmentView = (CmsMediaAttachmentView) view;
            cmsMediaAttachmentView.getClass();
            return cmsMediaAttachmentView;
        }
        throw new IllegalStateException(hht.d(view, ihz.class, "Attempt to inject a View wrapper of type "));
    }

    public static BadgesRecyclerView f(View view) {
        if (view instanceof BadgesRecyclerView) {
            BadgesRecyclerView badgesRecyclerView = (BadgesRecyclerView) view;
            badgesRecyclerView.getClass();
            return badgesRecyclerView;
        }
        throw new IllegalStateException(hht.d(view, ija.class, "Attempt to inject a View wrapper of type "));
    }

    public static ijg g(cg cgVar) {
        if (cgVar instanceof ijg) {
            return (ijg) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, iji.class));
    }

    public static afkf h() {
        Object e = ipe.m.e();
        e.getClass();
        return new afkf(((Boolean) e).booleanValue());
    }

    public static ConversationScrollToBottomButton i(View view) {
        if (view instanceof ConversationScrollToBottomButton) {
            ConversationScrollToBottomButton conversationScrollToBottomButton = (ConversationScrollToBottomButton) view;
            conversationScrollToBottomButton.getClass();
            return conversationScrollToBottomButton;
        }
        throw new IllegalStateException(hht.d(view, iyc.class, "Attempt to inject a View wrapper of type "));
    }

    public static izx j(cg cgVar) {
        if (cgVar instanceof izx) {
            return (izx) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, izz.class));
    }

    public static SimPickerItemView k(View view) {
        if (view instanceof SimPickerItemView) {
            SimPickerItemView simPickerItemView = (SimPickerItemView) view;
            simPickerItemView.getClass();
            return simPickerItemView;
        }
        throw new IllegalStateException(hht.d(view, jat.class, "Attempt to inject a View wrapper of type "));
    }

    public static SimPickerView l(View view) {
        if (view instanceof SimPickerView) {
            SimPickerView simPickerView = (SimPickerView) view;
            simPickerView.getClass();
            return simPickerView;
        }
        throw new IllegalStateException(hht.d(view, jaw.class, "Attempt to inject a View wrapper of type "));
    }

    public static eoy m(cg cgVar) {
        for (cg cgVar2 = cgVar; cgVar2 != null; cgVar2 = cgVar2.E) {
            if (hlc.T(cgVar2)) {
                return new eoy(cgVar2);
            }
        }
        cj fe = cgVar.fe();
        if (fe != null && hlc.T(fe)) {
            return new eoy(fe);
        }
        throw new abcn();
    }

    public static asai n(nfx nfxVar, miw miwVar, arwe arweVar, asai asaiVar, arpi arpiVar, Conversation conversation, ConversationId conversationId, asai asaiVar2, armf armfVar, armf armfVar2, oyg oygVar) {
        ncq d;
        nfxVar.getClass();
        miwVar.getClass();
        arweVar.getClass();
        asaiVar.getClass();
        arpiVar.getClass();
        conversation.getClass();
        conversationId.getClass();
        asaiVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        if (!((okf) armfVar.b()).a()) {
            d = nfxVar.a();
            d.getClass();
        } else {
            d = conversation.d();
            d.getClass();
        }
        asai P = arrn.P(lga.at(d, arweVar).a(), asaiVar, asaiVar2, new jfu(armfVar2, arpiVar, miwVar, conversationId, null));
        if (((ansy) ((oxw) oygVar).a.b()).e("bugle.share_conversation_self_identities_flow")) {
            int i = ascp.a;
            return arrn.S(P, arweVar, asco.a, 1);
        }
        return P;
    }

    public static mja o(Conversation conversation) {
        conversation.getClass();
        mja a = conversation.a();
        a.getClass();
        return a;
    }

    public static ConversationId p(OpenConversation2Arguments openConversation2Arguments) {
        openConversation2Arguments.getClass();
        return openConversation2Arguments.a;
    }

    public static asai q(mjg mjgVar, arwe arweVar) {
        mjgVar.getClass();
        arweVar.getClass();
        ncq e = mjgVar.e();
        e.getClass();
        asai a = lga.at(e, arweVar).a();
        a.getClass();
        return a;
    }

    public static kkl r(Conversation conversation) {
        conversation.getClass();
        return new kao(conversation, 1);
    }

    public static Conversation s(ConversationId conversationId, miv mivVar, miw miwVar, khn khnVar) {
        conversationId.getClass();
        mivVar.getClass();
        miwVar.getClass();
        khnVar.getClass();
        if (khnVar.b(conversationId).booleanValue()) {
            aiut.c();
            albo.T(khnVar.b(conversationId).booleanValue());
            ((alvg) ((alvg) khn.a.g()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "getPreloadedConversationAndClearCache", 75, "ConversationCachedLoaderImpl.java")).t("Returning conversation load future for conversation %s", conversationId.b());
            return khnVar.a();
        }
        return miwVar.a(conversationId, mivVar);
    }

    public static asai t(lfx lfxVar, arwe arweVar) {
        lfxVar.getClass();
        arweVar.getClass();
        ncq c = lfxVar.c();
        c.getClass();
        asai a = lga.at(c, arweVar).a();
        a.getClass();
        return a;
    }

    public static lfx u(Conversation conversation) {
        conversation.getClass();
        lfx i = conversation.i();
        i.getClass();
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    public static afhw v(Context context, arpi arpiVar, eoz eozVar, Optional optional, afxz afxzVar, ibs ibsVar, ahiy ahiyVar, Optional optional2, Optional optional3, armf armfVar) {
        Object obj;
        arml armlVar;
        context.getClass();
        arpiVar.getClass();
        eozVar.getClass();
        ibsVar.getClass();
        ahiyVar.getClass();
        afgo afgoVar = null;
        if (optional.isEmpty()) {
            obj = null;
        } else if (((Boolean) ipe.i.e()).booleanValue()) {
            obj = afgm.a;
        } else {
            obj = optional.get();
        }
        optional3.isPresent();
        ior iorVar = new ior();
        optional2.isPresent();
        ios iosVar = new ios(arpiVar, ibsVar, ahiyVar);
        long intValue = ((Number) ipe.r.e()).intValue();
        ?? r7 = afxzVar.d;
        Duration ofSeconds = Duration.ofSeconds(intValue);
        Activity activity = (Activity) r7.b();
        activity.getClass();
        arwe arweVar = (arwe) afxzVar.b.b();
        arweVar.getClass();
        arwe arweVar2 = (arwe) afxzVar.f.b();
        arweVar2.getClass();
        afdl afdlVar = (afdl) afxzVar.c.b();
        afdlVar.getClass();
        aful afulVar = (aful) afxzVar.e.b();
        afulVar.getClass();
        afgo afgoVar2 = new afgo((aeke) obj, iorVar, new afgv(activity, arweVar, arweVar2, afdlVar, afulVar, (Optional) afxzVar.a.b(), iosVar, ofSeconds), ((oug) armfVar.b()).a());
        if ((((Boolean) ipe.h.e()).booleanValue() || qrl.a()) && !ipq.g(eozVar) && context.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            afgoVar = afgoVar2;
        }
        Object e = ipe.k.e();
        e.getClass();
        afip afipVar = new afip(true, ((Boolean) e).booleanValue(), 1);
        if (ipq.g(eozVar)) {
            armlVar = armd.a(gqj.m);
        } else {
            armlVar = afhw.a;
        }
        Object e2 = ipe.j.e();
        e2.getClass();
        return new afhw(afipVar, afgoVar, armlVar, ((Boolean) e2).booleanValue(), true, true, true, 3);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
