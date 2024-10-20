package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvg extends nq {
    final /* synthetic */ kvw a;

    public kvg(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.nq
    public final void dC(int i, int i2) {
        boolean z;
        kvw kvwVar = this.a;
        if (kvwVar.aM) {
            if (kvwVar.u.b() == 0) {
                z = true;
            } else {
                z = false;
            }
            kvwVar.aM = z;
            kvw kvwVar2 = this.a;
            kvwVar2.y(kvwVar2.aM);
        }
    }

    @Override // defpackage.nq
    public final void dD(int i, int i2) {
        kxx kxxVar;
        akrh e = aktp.e("ConcatAdapterObserver#onItemRangeRemoved");
        try {
            kvw kvwVar = this.a;
            if (!kvwVar.aM && kvwVar.u.b() == 0 && (kxxVar = this.a.D().f) != null && kxxVar.u == kxw.FINISHED) {
                kvw kvwVar2 = this.a;
                kvwVar2.aM = true;
                kvwVar2.y(true);
            }
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
