package defpackage;

import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aclp extends aclo {
    public aclp(abrz abrzVar) {
        super(abrzVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onDeleteDataItem(DeleteDataItemsResponse deleteDataItemsResponse) {
        a(new acln(actx.o(deleteDataItemsResponse.a), deleteDataItemsResponse.b, 1));
    }
}
