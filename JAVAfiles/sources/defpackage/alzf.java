package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alzf {
    public static void b(alze alzeVar, boolean z) {
        try {
            alzeVar.close();
        } catch (RuntimeException e) {
            if (!z) {
                if (e instanceof alzd) {
                    throw ((alzd) e);
                }
                throw new alzd(e);
            }
        }
    }

    public abstract alzc a();
}
