package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbu {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final qbo b;
    public final qbp c;
    public final qci d;
    public final qcm e;
    public final qck f;
    public final anen g;
    public final qbq h;
    public final qcn i;
    public final armf j;

    public qbu(armf armfVar, qbo qboVar, qbp qbpVar, qci qciVar, qcm qcmVar, qck qckVar, anen anenVar, qbq qbqVar, qcn qcnVar) {
        this.j = armfVar;
        this.b = qboVar;
        this.c = qbpVar;
        this.d = qciVar;
        this.e = qcmVar;
        this.f = qckVar;
        this.g = anenVar;
        this.h = qbqVar;
        this.i = qcnVar;
    }

    public static akul a(qbv qbvVar, ConversationIdType conversationIdType, qfl qflVar, upm upmVar) {
        if (upmVar.a) {
            return qbvVar.a(conversationIdType, qflVar);
        }
        return aktp.ag(upmVar);
    }
}
