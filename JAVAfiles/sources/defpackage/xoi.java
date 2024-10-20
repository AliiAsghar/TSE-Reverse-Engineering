package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xoi implements xoj {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final agnq b;
    public final xpi c;
    private final anen d;
    private final anen e;
    private final ConcurrentMap f;

    public xoi(agnq agnqVar, xpi xpiVar, anen anenVar, anen anenVar2, ConcurrentMap concurrentMap) {
        this.b = agnqVar;
        this.c = xpiVar;
        this.d = anenVar;
        this.e = anenVar2;
        this.f = concurrentMap;
    }

    @Override // defpackage.xoj
    public final akul a(pzn pznVar, xog xogVar) {
        String str = pznVar.a;
        if (str == null) {
            pyz pyzVar = pznVar.b;
            pyzVar.getClass();
            pyy pyyVar = (pyy) this.f.get(pyzVar);
            if (pyyVar == null) {
                alwl alwlVar = (alwl) a.i();
                alwlVar.X(xod.j, pyzVar);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 101, "FileTransferProgressCallbackHandler.java")).q("Upload progress update is called but the file transfer entry is not present in the inProgressFileTransferMap.");
                return aktp.ag(null);
            }
            MessageCoreData i = pyyVar.c.i();
            if (i == null) {
                alwl alwlVar2 = (alwl) a.i();
                alwlVar2.X(xod.j, pyzVar);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 111, "FileTransferProgressCallbackHandler.java")).q("Upload progress update is called but the pipeline context has no MessageCoreData.");
                return aktp.ag(null);
            }
            MessageIdType B = i.B();
            alvw n = a.n();
            n.X(xod.j, pyzVar);
            n.X(ydl.b, B);
            ((alwl) n.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 121, "FileTransferProgressCallbackHandler.java")).q("Transfer progress is being updated.");
            return this.c.a(B, xogVar);
        }
        return b(str, xogVar);
    }

    @Override // defpackage.xoj
    public final akul b(String str, xog xogVar) {
        return aktp.ai(new xfb(this, str, 5, null), this.e).i(new vwx(this, str, xogVar, 18, (char[]) null), this.d);
    }
}
