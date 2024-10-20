package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclm extends ackq {
    final /* synthetic */ String a;
    final /* synthetic */ String e;
    final /* synthetic */ byte[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aclm(abrg abrgVar, String str, String str2, byte[] bArr) {
        super(abrgVar);
        this.a = str;
        this.e = str2;
        this.f = bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ abrm a(Status status) {
        return new acln(status, -1, 0);
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        ((IWearableService) ((aclw) abquVar).w()).sendMessage(new aclv(this), this.a, this.e, this.f);
    }
}
