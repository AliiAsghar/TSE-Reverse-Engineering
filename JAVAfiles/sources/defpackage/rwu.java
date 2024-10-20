package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwu extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwu(jvf jvfVar, efu efuVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.i = i;
        this.h = "Location";
        this.f = jvfVar;
        this.g = efuVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.i != 0) {
            return ((rwu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((rwu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0206, code lost:
    
        if (r15 != r0) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f2 A[Catch: all -> 0x015a, TryCatch #4 {all -> 0x015a, blocks: (B:43:0x0155, B:44:0x0208, B:45:0x01ec, B:47:0x01f2), top: B:42:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:64:0x01b2, B:65:0x0196, B:67:0x019c, B:70:0x01b5, B:72:0x01c9, B:76:0x01df, B:86:0x0185), top: B:85:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5 A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:64:0x01b2, B:65:0x0196, B:67:0x019c, B:70:0x01b5, B:72:0x01c9, B:76:0x01df, B:86:0x0185), top: B:85:0x0185 }] */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [rwt] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0206 -> B:40:0x0208). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01af -> B:60:0x01b2). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwu.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.i != 0) {
            return new rwu((jvf) this.f, (efu) this.g, arpeVar, 1);
        }
        return new rwu((rwv) this.f, this.g, this.h, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwu(rwv rwvVar, MessageCoreData messageCoreData, List list, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.i = i;
        this.f = rwvVar;
        this.g = messageCoreData;
        this.h = list;
    }
}
