package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.data.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbe extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;

    public adbe(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4) {
        super(armfVar2, new apyv(adbe.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Queue] */
    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        wcu wcuVar;
        List list = (List) obj;
        addl addlVar = (addl) list.get(0);
        Context context = (Context) list.get(1);
        addp addpVar = (addp) list.get(2);
        wcs wcsVar = (wcs) list.get(3);
        if (((Boolean) adbc.a.a()).booleanValue()) {
            String b = ((AutoValue_GroupNotification) addlVar.a).a.b();
            if (wcsVar.c == 3) {
                wcuVar = (wcu) wcsVar.d;
            } else {
                wcuVar = wcu.a;
            }
            wdf b2 = wdf.b(wcuVar.c);
            if (b2 == null) {
                b2 = wdf.RESPONSE_STATUS_UNKNOWN;
            }
            advr.k("[%s] Group notification completed, result: %s", b, b2);
        } else {
            GroupNotification groupNotification = addlVar.a;
            synchronized (addpVar.a) {
                addpVar.b.add(groupNotification);
                advr.c("Group notifications queue: push operation, conversationId:{%s}, queueSize:{%s}.", ((AutoValue_GroupNotification) groupNotification).a.b(), Integer.valueOf(addpVar.b.size()));
            }
            advz.b(context, new Intent("com.google.android.apps.messaging.shared.messaging.incoming_group_notification_action"), "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", advy.RECEIVE_GROUP_NOTIFY_PRODUCER_MODULE);
        }
        return albo.bI(addlVar.a);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.e;
        apyi apyiVar2 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar2.d(), apyiVar.d());
    }
}
