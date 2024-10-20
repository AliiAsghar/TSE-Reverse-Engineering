package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aljf<K, V> extends aljg<K, V> implements alij<K, V> {
    private static final long serialVersionUID = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aljf(alig aligVar, asqc asqcVar) {
        super(new alkd(aligVar, asqcVar));
        asqcVar.getClass();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x022f, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021c, code lost:
    
        if (r9.d() != r6) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021e, code lost:
    
        r6.f();
        r5.set(r7, r4.e(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0228, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b A[Catch: all -> 0x01d5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01d5, blocks: (B:48:0x012b, B:68:0x0188, B:72:0x01a0, B:77:0x01c2, B:79:0x01ce, B:80:0x01d4, B:81:0x01d8, B:82:0x01e5, B:50:0x0131, B:52:0x0144, B:53:0x014a, B:55:0x015c, B:58:0x0168, B:61:0x0172, B:64:0x017e, B:67:0x0183, B:71:0x018f, B:74:0x01a8, B:76:0x01ad), top: B:46:0x0129, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d8 A[Catch: all -> 0x01d5, TryCatch #2 {all -> 0x01d5, blocks: (B:48:0x012b, B:68:0x0188, B:72:0x01a0, B:77:0x01c2, B:79:0x01ce, B:80:0x01d4, B:81:0x01d8, B:82:0x01e5, B:50:0x0131, B:52:0x0144, B:53:0x014a, B:55:0x015c, B:58:0x0168, B:61:0x0172, B:64:0x017e, B:67:0x0183, B:71:0x018f, B:74:0x01a8, B:76:0x01ad), top: B:46:0x0129, inners: #9 }] */
    @Override // defpackage.alij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljf.a(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.algk
    public final V apply(K k) {
        return (V) b(k);
    }

    public final Object b(Object obj) {
        try {
            return a(obj);
        } catch (ExecutionException e) {
            throw new anfe(e.getCause());
        }
    }

    @Override // defpackage.aljg
    Object writeReplace() {
        return new aljd(this.a);
    }
}
