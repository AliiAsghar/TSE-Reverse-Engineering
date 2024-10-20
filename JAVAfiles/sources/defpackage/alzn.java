package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alzn {
    public final int a;
    public final alws b;

    /* JADX INFO: Access modifiers changed from: protected */
    public alzn(alws alwsVar, int i) {
        if (alwsVar != null) {
            if (i >= 0) {
                this.a = i;
                this.b = alwsVar;
                return;
            }
            throw new IllegalArgumentException(a.bV(i, "invalid index: "));
        }
        throw new IllegalArgumentException("format options cannot be null");
    }

    public abstract void a(alzr alzrVar, Object obj);
}
