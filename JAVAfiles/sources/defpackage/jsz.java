package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.LruCache;
import android.view.View;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicConversationDataView;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicMessageDataView;
import com.google.android.apps.messaging.home.list.ConversationListItemView;
import com.google.android.apps.messaging.label.ui.StillSortingNoticeView;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsz implements apxw {
    public static aflb a(jto jtoVar) {
        jtoVar.getClass();
        aflb aflbVar = jtoVar.l;
        aflbVar.getClass();
        return aflbVar;
    }

    public static afwa c() {
        Object e = yig.ac.e();
        e.getClass();
        return new afwa(true, true, true, true, ((Number) e).floatValue(), 31);
    }

    public static aghf d(jvo jvoVar, ipj ipjVar, armf armfVar, jvw jvwVar) {
        armfVar.getClass();
        jvwVar.getClass();
        return new aghf(ipjVar, jvoVar, jvwVar, albo.cd(1));
    }

    public static DataDonationActivity e(Activity activity) {
        if (activity instanceof DataDonationActivity) {
            DataDonationActivity dataDonationActivity = (DataDonationActivity) activity;
            dataDonationActivity.getClass();
            return dataDonationActivity;
        }
        throw new IllegalStateException(hht.d(activity, kls.class, "Attempt to inject a Activity wrapper of type "));
    }

    public static klu f(cg cgVar) {
        if (cgVar instanceof klu) {
            return (klu) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, kma.class));
    }

    public static ProblematicConversationDataView g(View view) {
        if (view instanceof ProblematicConversationDataView) {
            ProblematicConversationDataView problematicConversationDataView = (ProblematicConversationDataView) view;
            problematicConversationDataView.getClass();
            return problematicConversationDataView;
        }
        throw new IllegalStateException(hht.d(view, kuc.class, "Attempt to inject a View wrapper of type "));
    }

    public static ProblematicMessageDataView h(View view) {
        if (view instanceof ProblematicMessageDataView) {
            ProblematicMessageDataView problematicMessageDataView = (ProblematicMessageDataView) view;
            problematicMessageDataView.getClass();
            return problematicMessageDataView;
        }
        throw new IllegalStateException(hht.d(view, kuf.class, "Attempt to inject a View wrapper of type "));
    }

    public static ConversationListItemView i(View view) {
        if (view instanceof ConversationListItemView) {
            ConversationListItemView conversationListItemView = (ConversationListItemView) view;
            conversationListItemView.getClass();
            return conversationListItemView;
        }
        throw new IllegalStateException(hht.d(view, kxy.class, "Attempt to inject a View wrapper of type "));
    }

    public static StillSortingNoticeView j(View view) {
        if (view instanceof StillSortingNoticeView) {
            StillSortingNoticeView stillSortingNoticeView = (StillSortingNoticeView) view;
            stillSortingNoticeView.getClass();
            return stillSortingNoticeView;
        }
        throw new IllegalStateException(hht.d(view, ldo.class, "Attempt to inject a View wrapper of type "));
    }

    public static MessageId k(eog eogVar) {
        eogVar.getClass();
        Object a = eogVar.a("MESSAGE_ID");
        a.getClass();
        return (MessageId) a;
    }

    public static amwf l(eog eogVar) {
        eogVar.getClass();
        Object a = eogVar.a("intent_source");
        a.getClass();
        amwf b = amwf.b(((Number) a).intValue());
        b.getClass();
        return b;
    }

    public static lqo m(cg cgVar) {
        if (cgVar instanceof lqo) {
            return (lqo) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, lqq.class));
    }

    public static LruCache n() {
        return new LruCache(((Integer) lsg.a.e()).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [lva] */
    /* JADX WARN: Type inference failed for: r8v4, types: [lva] */
    public static lva o(Map map, long j, lvu lvuVar, pht phtVar, armf armfVar) {
        lvu lvuVar2;
        armfVar.getClass();
        if (((ansy) ((phi) phtVar).a.b()).e("bugle.enable_restore_anytime_v1")) {
            Object b = armfVar.b();
            alvw g = lwj.a.g();
            g.X(alwp.a, "BugleBackup");
            alvg alvgVar = (alvg) g;
            alvgVar.V(10, TimeUnit.SECONDS);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/restore/impl/StableRestoreWorkflowStepsModule", "providesStableRestoreWorkflowSteps", 47, "StableRestoreWorkflowStepsModule.kt")).q("Returning restoreAnytimeCompatibleRestoreWorkflowSteps");
            lvuVar2 = (lva) b;
        } else {
            ?? r5 = (lva) map.get(Integer.valueOf((int) j));
            if (r5 == null) {
                alvw i = lwj.a.i();
                i.X(alwp.a, "BugleBackup");
                alvg alvgVar2 = (alvg) i;
                alvgVar2.V(10, TimeUnit.SECONDS);
                alvgVar2.X(lur.a, Long.valueOf(j));
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/restore/impl/StableRestoreWorkflowStepsModule", "providesStableRestoreWorkflowSteps", 56, "StableRestoreWorkflowStepsModule.kt")).s("RestoreWorkflowSteps not found for stable version [%d]. Using BasicRestoreWorkflowSteps", j);
                lvuVar2 = lvuVar;
            } else {
                lvuVar2 = r5;
            }
        }
        lvuVar2.getClass();
        return lvuVar2;
    }

    public static mbl p(armf armfVar, armf armfVar2, armf armfVar3) {
        int i = mbe.a;
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        return new mbk(armfVar, armfVar2);
    }

    public static akcy q(armf armfVar, ahiy ahiyVar) {
        return new akdf(new lpn(armfVar, 0), ahiyVar);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public static via r(ghw ghwVar) {
        vid vidVar = (vid) ghwVar.a;
        Context context = (Context) vidVar.a.b();
        context.getClass();
        ?? b = vidVar.b.b();
        b.getClass();
        anen anenVar = (anen) vidVar.i.b();
        anenVar.getClass();
        Optional optional = (Optional) ((apxx) vidVar.k).a;
        Optional optional2 = (Optional) ((apxx) vidVar.l).a;
        ?? b2 = vidVar.n.b();
        b2.getClass();
        return new vic(context, b, vidVar.c, vidVar.d, vidVar.e, vidVar.f, vidVar.g, vidVar.h, anenVar, vidVar.j, optional, optional2, vidVar.m, b2);
    }

    public static mbb s(Object obj, Context context, alhr alhrVar, xnv xnvVar, armf armfVar, lfl lflVar, Executor executor, oup oupVar) {
        context.getClass();
        alhrVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        lflVar.getClass();
        executor.getClass();
        return new mbb((kor) obj, context, true, alhrVar, armfVar, lflVar, executor, 1, oupVar.a());
    }

    public static mbb t(Object obj, Context context, alhr alhrVar, xnv xnvVar, armf armfVar, lfl lflVar, Executor executor, oup oupVar) {
        context.getClass();
        alhrVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        lflVar.getClass();
        executor.getClass();
        return new mbb((kor) obj, context, false, alhrVar, armfVar, lflVar, executor, 2, oupVar.a());
    }

    public static aghy u(qdq qdqVar, arwe arweVar, ygv ygvVar) {
        qdqVar.getClass();
        arweVar.getClass();
        ygvVar.getClass();
        kqt kqtVar = ((ksb) qdqVar.a).c;
        return new aghy(new aghp(new aghe((arwe) kqtVar.a.bQ.b(), (arwe) kqtVar.a.dO.b(), (aghf) kqtVar.s.b(), (qdq) kqtVar.y.b(), Optional.empty(), new adwp((aghf) kqtVar.s.b())), (arwe) kqtVar.a.bQ.b(), (arwe) kqtVar.a.dO.b(), (arpi) kqtVar.t.b(), (anca) kqtVar.a.yA.b(), (aghf) kqtVar.s.b(), new agfr((arwe) kqtVar.a.dO.b()), (afku) kqtVar.o.b(), kqtVar.a.a.bk()), (aghf) ((ksb) qdqVar.a).c.s.b(), arweVar, ygvVar);
    }

    public static jsm v(qdq qdqVar, owv owvVar) {
        qdqVar.getClass();
        jhn jhnVar = jhn.c;
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
