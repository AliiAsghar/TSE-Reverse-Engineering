package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahso extends ContentObserver {
    final /* synthetic */ ahsp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahso(ahsp ahspVar) {
        super(null);
        this.a = ahspVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ahsp ahspVar = this.a;
        synchronized (ahspVar.e) {
            ahspVar.f = null;
            ahtp.e();
        }
        synchronized (ahspVar) {
            Iterator it = ahspVar.g.iterator();
            while (it.hasNext()) {
                ((ahsq) it.next()).a();
            }
        }
    }
}
