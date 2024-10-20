package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.FallbackToXmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ResendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lsx implements algk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ lsx(ResendMessageAction resendMessageAction, MessageCoreData messageCoreData, Integer num, int i, int i2) {
        this.e = i2;
        this.b = resendMessageAction;
        this.d = messageCoreData;
        this.c = num;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (((qry) obj).d()) {
                                rsv.a.l("msg Rcs: both sender/receiver ready for rcs.");
                                return 3;
                            }
                            ?? r8 = this.c;
                            return Integer.valueOf(((rsv) this.b).b((String) this.d, this.a, r8, "Receiver not RCS capable"));
                        }
                        ResendMessageAction resendMessageAction = (ResendMessageAction) this.b;
                        amgc e = qop.e((qic) obj);
                        resendMessageAction.c.set((asho) resendMessageAction.d.m().fu(e));
                        resendMessageAction.a.H(this.d, (Integer) this.c, this.a, e);
                        return Optional.empty();
                    }
                    Optional optional = (Optional) obj;
                    boolean isEmpty = optional.isEmpty();
                    ?? r2 = this.d;
                    if (isEmpty) {
                        alvw i2 = FallbackToXmsAction.b.i();
                        i2.X(alwp.a, "BugleDataModel");
                        ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/datamodel/action/FallbackToXmsAction", "logNfsFallbackToClearCut", 207, "FallbackToXmsAction.java")).t("Missing self identity for message %s", r2.E());
                        return null;
                    }
                    Object obj2 = this.c;
                    int i3 = this.a;
                    Object obj3 = this.b;
                    ((FallbackToXmsAction) obj3).g.aO(r2, FallbackToXmsAction.g(i3), (amxo) obj2, ((nfw) optional.get()).b(), 4);
                    return null;
                }
                ylp ylpVar = (ylp) obj;
                aphf aphfVar = aphf.FAILURE_REASON_RCS_SERVICE_CONNECTION_EXCEPTION;
                String message = ylpVar.getMessage();
                int i4 = this.a;
                Object obj4 = this.d;
                ((lsz) this.b).b.j((aphh) this.c, (aphg) obj4, aphfVar, message, i4);
                return lsz.b(ylpVar);
            }
            SecurityException securityException = (SecurityException) obj;
            aphf aphfVar2 = aphf.FAILURE_REASON_SECURITY_EXCEPTION;
            String message2 = securityException.getMessage();
            int i5 = this.a;
            Object obj5 = this.d;
            ((lsz) this.b).b.j((aphh) this.c, (aphg) obj5, aphfVar2, message2, i5);
            return lsz.b(securityException);
        }
        TimeoutException timeoutException = (TimeoutException) obj;
        aphf aphfVar3 = aphf.FAILURE_REASON_TIMEOUT_EXCEPTION;
        String message3 = timeoutException.getMessage();
        int i6 = this.a;
        Object obj6 = this.d;
        ((lsz) this.b).b.j((aphh) this.c, (aphg) obj6, aphfVar3, message3, i6);
        return lsz.b(timeoutException);
    }

    public /* synthetic */ lsx(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.e = i2;
        this.b = obj;
        this.d = obj2;
        this.a = i;
        this.c = obj3;
    }

    public /* synthetic */ lsx(lsz lszVar, aphh aphhVar, aphg aphgVar, int i, int i2) {
        this.e = i2;
        this.b = lszVar;
        this.c = aphhVar;
        this.d = aphgVar;
        this.a = i;
    }
}
