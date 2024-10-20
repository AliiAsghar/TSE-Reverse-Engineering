package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qzl implements uko {
    public final /* synthetic */ GenericWorkerQueueAction a;
    private final /* synthetic */ int b;

    public /* synthetic */ qzl(GenericWorkerQueueAction genericWorkerQueueAction, int i) {
        this.b = i;
        this.a = genericWorkerQueueAction;
    }

    @Override // defpackage.uko
    public final alog a() {
        int i = this.b;
        return this.a.o;
    }
}
