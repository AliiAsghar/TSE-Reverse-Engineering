package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llw implements lju {
    private final Activity a;
    private final armf b;
    private final armf c;
    private final mbl d;
    private final obo e;

    public llw(Activity activity, armf armfVar, armf armfVar2, mbl mblVar, obo oboVar) {
        armfVar.getClass();
        armfVar2.getClass();
        mblVar.getClass();
        oboVar.getClass();
        this.a = activity;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = mblVar;
        this.e = oboVar;
    }

    public static final ConversationIdType c(miu miuVar) {
        if (miuVar.c() instanceof EmergencySosConversationId) {
            ConversationId c = miuVar.c();
            c.getClass();
            return ((EmergencySosConversationId) c).a;
        }
        ConversationId c2 = miuVar.c();
        c2.getClass();
        return ((BugleConversationId) c2).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01e9, code lost:
    
        if (((defpackage.mll) r1.a).p() != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [armf, java.lang.Object] */
    @Override // defpackage.lju
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.llu r22, defpackage.arpe r23) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llw.a(llu, arpe):java.lang.Object");
    }
}
