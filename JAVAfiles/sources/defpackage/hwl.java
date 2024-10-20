package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hwl implements hvt {
    final /* synthetic */ hwo a;

    public hwl(hwo hwoVar) {
        this.a = hwoVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.hvt
    public final void a(boolean z) {
        ArrayList arrayList;
        hyv.i();
        synchronized (this.a) {
            arrayList = new ArrayList((Collection) this.a.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((hvt) arrayList.get(i)).a(z);
        }
    }
}
