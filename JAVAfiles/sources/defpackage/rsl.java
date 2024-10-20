package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rsl extends ArrayList implements rsm {
    @Override // defpackage.rsm
    public final void ah() {
        albo.T(aiut.g());
        int size = size();
        for (int i = 0; i < size; i++) {
            ((rsm) get(i)).ah();
        }
    }

    @Override // defpackage.rsm
    public final void ai(rsr rsrVar, int i) {
        albo.T(aiut.g());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            rsm rsmVar = (rsm) get(i2);
            akrh e = aktp.e("DraftMessageDataEventDispatcher#onDraftChanged");
            try {
                rsmVar.ai(rsrVar, i);
                e.close();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.rsm
    public final void al(rsr rsrVar) {
        albo.T(aiut.g());
        int size = size();
        for (int i = 0; i < size; i++) {
            ((rsm) get(i)).al(rsrVar);
        }
    }

    @Override // defpackage.rsm
    public final void bp(rsr rsrVar) {
        albo.T(aiut.g());
        int size = size();
        for (int i = 0; i < size; i++) {
            ((rsm) get(i)).bp(rsrVar);
        }
    }
}
