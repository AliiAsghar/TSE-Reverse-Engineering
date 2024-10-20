package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpr extends atqh {
    final /* synthetic */ atqh a;

    public atpr(atqh atqhVar) {
        this.a = atqhVar;
    }

    @Override // defpackage.atqh
    public final void a(atql atqlVar, Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.a.a(atqlVar, Array.get(obj, i));
            }
        }
    }
}
