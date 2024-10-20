package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryo {
    public static final alwo a = alwo.o("BugleShareRecentImage");
    public final Context b;
    public final armf c;
    public final ryq d;
    private final anen g;
    private final andr h = new andr();
    public final Object e = new Object();
    public boolean f = false;

    public ryo(Context context, armf armfVar, anen anenVar, ryq ryqVar) {
        this.b = context;
        this.c = armfVar;
        this.g = anenVar;
        this.d = ryqVar;
    }

    public final void a(final ConversationIdType conversationIdType, final String str, final long j, final Set set) {
        boolean z;
        if (!conversationIdType.b()) {
            synchronized (this.e) {
                if (!this.f) {
                    z = true;
                    this.f = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                akul.g(this.h.a(akto.k(new Callable() { // from class: ryn
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:107:0x0569  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0571 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r13v24 */
                    /* JADX WARN: Type inference failed for: r13v25 */
                    /* JADX WARN: Type inference failed for: r13v26 */
                    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
                    /* JADX WARN: Type inference failed for: r1v0, types: [ryn] */
                    /* JADX WARN: Type inference failed for: r1v1 */
                    /* JADX WARN: Type inference failed for: r1v10 */
                    /* JADX WARN: Type inference failed for: r1v11 */
                    /* JADX WARN: Type inference failed for: r1v15 */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v3 */
                    /* JADX WARN: Type inference failed for: r1v30 */
                    /* JADX WARN: Type inference failed for: r1v31 */
                    /* JADX WARN: Type inference failed for: r1v32 */
                    /* JADX WARN: Type inference failed for: r1v34, types: [ryo] */
                    /* JADX WARN: Type inference failed for: r1v48 */
                    /* JADX WARN: Type inference failed for: r1v56 */
                    /* JADX WARN: Type inference failed for: r1v59 */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    /* JADX WARN: Type inference failed for: r1v60 */
                    /* JADX WARN: Type inference failed for: r1v7 */
                    /* JADX WARN: Type inference failed for: r1v8 */
                    /* JADX WARN: Type inference failed for: r1v9 */
                    /* JADX WARN: Type inference failed for: r9v0, types: [ryo] */
                    /* JADX WARN: Type inference failed for: r9v1 */
                    /* JADX WARN: Type inference failed for: r9v14 */
                    /* JADX WARN: Type inference failed for: r9v15 */
                    /* JADX WARN: Type inference failed for: r9v2 */
                    /* JADX WARN: Type inference failed for: r9v24 */
                    /* JADX WARN: Type inference failed for: r9v25, types: [android.database.Cursor] */
                    /* JADX WARN: Type inference failed for: r9v26 */
                    /* JADX WARN: Type inference failed for: r9v3 */
                    /* JADX WARN: Type inference failed for: r9v43 */
                    /* JADX WARN: Type inference failed for: r9v45 */
                    /* JADX WARN: Type inference failed for: r9v46 */
                    /* JADX WARN: Type inference failed for: r9v5 */
                    /* JADX WARN: Type inference failed for: r9v9 */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 1400
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryn.call():java.lang.Object");
                    }
                }), this.g)).k(qiu.b(), andi.a);
            }
        }
    }
}
