package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atae implements Serializable {
    private static final long serialVersionUID = -3464451825208522308L;
    public final Map a = new TreeMap();
    public transient long b;

    public atae(long j) {
        this.b = j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j;
        objectInputStream.defaultReadObject();
        if (objectInputStream.available() != 0) {
            j = objectInputStream.readLong();
        } else {
            j = 0;
        }
        this.b = j;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.b);
    }

    final void a(int i, byte[] bArr, byte[] bArr2, atao ataoVar) {
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
    }

    public atae(atae ataeVar, long j) {
        for (Integer num : ataeVar.a.keySet()) {
            this.a.put(num, new atad((atad) ataeVar.a.get(num)));
        }
        this.b = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if ((r9 % ((long) java.lang.Math.pow(r13, r6))) == 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public atae(defpackage.ataw r25, long r26, byte[] r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atae.<init>(ataw, long, byte[], byte[]):void");
    }
}
