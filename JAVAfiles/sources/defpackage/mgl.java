package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/analytics/statistics/DuplicateMessageChecker");
    public static final Set b = aqil.r(new Integer[]{3, 0, 1});
    public final armf c;
    public final armf d;
    private final arwe e;

    public mgl(arwe arweVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.e = arweVar;
        this.c = armfVar;
        this.d = armfVar2;
    }

    public final akul a(MessageCoreData messageCoreData) {
        akul c;
        c = qjh.c(this.e, arpj.a, arwf.a, new kca(this, messageCoreData, (arpe) null, 17));
        return c;
    }
}
