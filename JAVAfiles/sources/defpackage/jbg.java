package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@armg
/* loaded from: classes2.dex */
public final class jbg {
    private static final alvi e = alvi.m("com/google/android/apps/messaging/conversation/simpicker/dataservice/MultiSimDialogPickerDataService");
    public final aneo a;
    public final ryg b;
    public final armf c;
    public final eoy d;

    public jbg(aneo aneoVar, eoy eoyVar, ryg rygVar, armf armfVar) {
        aneoVar.getClass();
        rygVar.getClass();
        armfVar.getClass();
        this.a = aneoVar;
        this.d = eoyVar;
        this.b = rygVar;
        this.c = armfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jbf a(SelfIdentityId selfIdentityId, boolean z) {
        Integer num;
        ryg rygVar = this.b;
        qwm c = rygVar.c(selfIdentityId);
        List h = rygVar.h();
        h.getClass();
        ArrayList arrayList = new ArrayList();
        alur it = ((alog) h).iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (!((qwm) next).j()) {
                arrayList.add(next);
            }
        }
        if (c != null && c.i() && c.e() >= 0) {
            if (z) {
                alvw g = e.g();
                g.X(alwp.a, "BugleConversation");
                ((alvg) g.h("com/google/android/apps/messaging/conversation/simpicker/dataservice/MultiSimDialogPickerDataService", "multiSimDialogDataFromSelfParticipantId", 107, "MultiSimDialogPickerDataService.kt")).D("Should not display SIM picker dialog: there is an active subscription (%d) for conversation's self participant (%s).", Integer.valueOf(c.e()), selfIdentityId);
            }
            return jbe.a;
        }
        Integer num2 = null;
        if (arrayList.isEmpty()) {
            if (z) {
                alvw g2 = e.g();
                g2.X(alwp.a, "BugleConversation");
                alvg alvgVar = (alvg) g2.h("com/google/android/apps/messaging/conversation/simpicker/dataservice/MultiSimDialogPickerDataService", "multiSimDialogDataFromSelfParticipantId", 119, "MultiSimDialogPickerDataService.kt");
                if (c != null) {
                    num2 = Integer.valueOf(c.e());
                }
                alvgVar.D("Should not display SIM picker dialog: the conversation's self participant (%s) subscription (%d) is inactive but there are no other active subscriptions.", selfIdentityId, num2);
            }
            return jbe.a;
        }
        if (arrayList.size() == 1) {
            qwm qwmVar = (qwm) aqjn.X(arrayList);
            SelfIdentityId g3 = qwmVar.g();
            int e2 = qwmVar.e();
            if (z) {
                alvw g4 = e.g();
                g4.X(alwp.a, "BugleConversation");
                alvg alvgVar2 = (alvg) g4.h("com/google/android/apps/messaging/conversation/simpicker/dataservice/MultiSimDialogPickerDataService", "multiSimDialogDataFromSelfParticipantId", 134, "MultiSimDialogPickerDataService.kt");
                if (c != null) {
                    num = Integer.valueOf(c.e());
                } else {
                    num = null;
                }
                alvgVar2.K("Should automatically switch to only available SIM: the conversation's self participant (%s) subscription (%d) is inactive and there is only a single active subscription (subId: %d, selfParticipantId: %s).", selfIdentityId, num, Integer.valueOf(e2), g3);
            }
            return new jbc(g3, e2);
        }
        if (z) {
            alvw g5 = e.g();
            g5.X(alwp.a, "BugleConversation");
            alvg alvgVar3 = (alvg) g5.h("com/google/android/apps/messaging/conversation/simpicker/dataservice/MultiSimDialogPickerDataService", "multiSimDialogDataFromSelfParticipantId", 148, "MultiSimDialogPickerDataService.kt");
            if (c != null) {
                num2 = Integer.valueOf(c.e());
            }
            alvgVar3.J("Should display multi SIM picker dialog: the conversation's self participant (%s) subscription (%d) is inactive and there are %d active subscriptions.", selfIdentityId, num2, Integer.valueOf(arrayList.size()));
        }
        return new jbd(arrayList);
    }
}
