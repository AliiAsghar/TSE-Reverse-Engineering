package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclb extends ackq {
    final /* synthetic */ Asset a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aclb(abrg abrgVar, Asset asset) {
        super(abrgVar);
        this.a = asset;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ abrm a(Status status) {
        return new acld(status, null);
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        ((IWearableService) ((aclw) abquVar).w()).getFdForAsset(new acls(this), this.a);
    }
}
