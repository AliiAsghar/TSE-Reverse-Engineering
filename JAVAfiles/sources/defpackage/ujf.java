package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ujf extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujf(asgm asgmVar, ujg ujgVar, MessageId messageId, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.h = i;
        this.g = asgmVar;
        this.e = ujgVar;
        this.f = messageId;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.h != 0) {
            return ((ujf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((ujf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004c -> B:8:0x004e). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.h
            r1 = 1
            if (r0 == 0) goto L5e
            arpl r0 = defpackage.arpl.a
            int r2 = r6.d
            if (r2 == 0) goto L17
            java.lang.Object r2 = r6.c
            java.lang.Object r3 = r6.b
            java.lang.Object r4 = r6.a
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L15
            goto L4e
        L15:
            r7 = move-exception
            goto L56
        L17:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.e
            java.lang.Object r2 = r6.f
            java.lang.Object r3 = r6.g
            lru r7 = (defpackage.lru) r7
            java.lang.Object r7 = r7.c
            apxx r7 = (defpackage.apxx) r7
            java.lang.Object r7 = r7.a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r4 = r3
            r3 = r7
        L30:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r3.next()
            rwq r7 = (defpackage.rwq) r7
            akrh r2 = r7.a()
            r6.a = r4     // Catch: java.lang.Throwable -> L15
            r6.b = r3     // Catch: java.lang.Throwable -> L15
            r6.c = r2     // Catch: java.lang.Throwable -> L15
            r6.d = r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> L15
            if (r7 == r0) goto L5d
        L4e:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r7     // Catch: java.lang.Throwable -> L15
            r5 = 0
            defpackage.armd.i(r2, r5)
            r2 = r7
            goto L30
        L56:
            throw r7     // Catch: java.lang.Throwable -> L57
        L57:
            r0 = move-exception
            defpackage.armd.i(r2, r7)
            throw r0
        L5c:
            r0 = r2
        L5d:
            return r0
        L5e:
            arpl r0 = defpackage.arpl.a
            int r2 = r6.d
            if (r2 == 0) goto L6e
            java.lang.Object r0 = r6.c
            java.lang.Object r1 = r6.b
            java.lang.Object r2 = r6.a
            defpackage.aqil.P(r7)
            goto L8b
        L6e:
            defpackage.aqil.P(r7)
            java.lang.Object r2 = r6.g
            java.lang.Object r7 = r6.e
            java.lang.Object r3 = r6.f
            r6.a = r2
            r6.b = r7
            r6.c = r3
            r6.d = r1
            r1 = r2
            asgm r1 = (defpackage.asgm) r1
            java.lang.Object r1 = r1.b(r6)
            if (r1 != r0) goto L89
            goto L9d
        L89:
            r1 = r7
            r0 = r3
        L8b:
            j$.time.Duration r7 = defpackage.ujg.a     // Catch: java.lang.Throwable -> L9e
            ujg r1 = (defpackage.ujg) r1     // Catch: java.lang.Throwable -> L9e
            j$.util.concurrent.ConcurrentHashMap r7 = r1.c     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Throwable -> L9e
            r0 = r7
            xog r0 = (defpackage.xog) r0     // Catch: java.lang.Throwable -> L9e
            asgm r2 = (defpackage.asgm) r2
            r2.d()
        L9d:
            return r0
        L9e:
            r7 = move-exception
            asgm r2 = (defpackage.asgm) r2
            r2.d()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujf.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.h != 0) {
            return new ujf((lru) this.e, (MessageCoreData) this.f, (List) this.g, arpeVar, 1);
        }
        Object obj2 = this.g;
        return new ujf((asgm) obj2, (ujg) this.e, (MessageId) this.f, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujf(lru lruVar, MessageCoreData messageCoreData, List list, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.h = i;
        this.e = lruVar;
        this.f = messageCoreData;
        this.g = list;
    }
}
