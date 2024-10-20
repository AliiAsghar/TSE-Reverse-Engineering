package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzq extends aiwj {
    private static final alvi b = alvi.m("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler");
    public final ansy a;
    private final algw c;
    private final armf d;
    private final Executor e;

    public ajzq(ansy ansyVar, algw algwVar, armf armfVar, Executor executor) {
        this.a = ansyVar;
        this.c = algwVar;
        this.d = armfVar;
        this.e = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiwj
    public final ListenableFuture a(IOException iOException, ahmn ahmnVar) {
        if (!((Boolean) ((alha) this.c).a).booleanValue()) {
            return albo.bH(iOException);
        }
        if ((iOException instanceof FileNotFoundException) || (iOException.getCause() instanceof FileNotFoundException) || (iOException instanceof apba) || (iOException.getCause() instanceof apba)) {
            ((alvg) ((alvg) ((alvg) b.h()).g(iOException)).h("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler", "handleReadException", (char) 127, "AccountDataStoreIOExceptionHandler.java")).q("AccountDataStore read failed. Trying to recover by resetting the store and wiping out all the account data.");
            alog t = this.a.t(false);
            int i = ((alsx) t).c;
            int i2 = -1;
            for (int i3 = 0; i3 < i; i3++) {
                int parseInt = Integer.parseInt(((File) t.get(i3)).getName());
                if (parseInt > i2) {
                    i2 = parseInt;
                }
            }
            Set<zfj> set = (Set) this.d.b();
            ArrayList arrayList = new ArrayList(set.size());
            for (zfj zfjVar : set) {
                zfjVar.getClass();
                arrayList.add(albo.bN(akto.c(new aarj(zfjVar, 17)), andi.a));
            }
            return ancd.g(ancj.g(ancj.g(anee.o(albo.bV(arrayList).a(new aidu(null, 18), this.e)), akto.d(new ajzp(this, 1)), this.e), akto.d(new mhp(ahmnVar, i2, 6)), this.e), IOException.class, akto.d(new ajzp(iOException, 0)), andi.a);
        }
        return albo.bH(iOException);
    }
}
