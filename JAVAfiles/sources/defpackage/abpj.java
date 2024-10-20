package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abpj extends abph {
    public abpj(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // defpackage.abph
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(GroupManagementRequest.DATA_TAG);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // defpackage.abph
    public final boolean b() {
        return false;
    }
}
