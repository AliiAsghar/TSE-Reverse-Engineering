package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acky extends ackq {
    public acky(abrg abrgVar) {
        super(abrgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ abrm a(Status status) {
        return new acke(new DataHolder(DataHolder.j, status.f), 0);
    }

    @Override // defpackage.abry
    protected final /* synthetic */ void b(abqu abquVar) {
        ((IWearableService) ((aclw) abquVar).w()).getDataItems(new aclr(this));
    }
}
