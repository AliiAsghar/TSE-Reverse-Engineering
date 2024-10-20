package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmq implements xmp {
    public static final arml a = armd.a(tzt.g);

    /* JADX WARN: Removed duplicated region for block: B:44:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a7  */
    @Override // defpackage.xmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xmn a(defpackage.xku r22, java.util.Collection r23) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmq.a(xku, java.util.Collection):xmn");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, arqv] */
    @Override // defpackage.xmp
    public final xmo b(xlb xlbVar, Collection collection) {
        Object obj;
        xlbVar.getClass();
        Iterator it = ((Set) a.a()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Boolean) ((znj) obj).b.a(xlbVar, collection)).booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        znj znjVar = (znj) obj;
        if (znjVar == null) {
            return null;
        }
        if (((Boolean) znjVar.b.a(xlbVar, collection)).booleanValue()) {
            return (xmo) znjVar.a.a(xlbVar, collection);
        }
        Class<?> cls = znjVar.getClass();
        int i = arsc.a;
        throw new IllegalStateException("MergeCase " + new arrh(cls).c() + " is not applicable fornewRequest: " + xlbVar + " and queuedSyncs " + collection);
    }
}
