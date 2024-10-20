package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrj extends BasePendingResult {
    private final abrm a;

    public abrj(abrm abrmVar) {
        super(null);
        this.a = abrmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final abrm a(Status status) {
        return this.a;
    }
}
