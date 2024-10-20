package androidx.room;

import androidx.room.IMultiInstanceInvalidationCallback;
import defpackage.arpe;
import defpackage.arrn;
import defpackage.emz;
import defpackage.ghw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationClient$invalidationCallback$1 extends IMultiInstanceInvalidationCallback.Stub {
    final /* synthetic */ ghw this$0;

    public MultiInstanceInvalidationClient$invalidationCallback$1(ghw ghwVar) {
        this.this$0 = ghwVar;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void onInvalidation(String[] strArr) {
        strArr.getClass();
        ghw ghwVar = this.this$0;
        Object obj = ghwVar.a;
        arrn.J(null, null, null, new emz(ghwVar, strArr, (arpe) null, 3), 3);
    }
}
