package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dva extends duv implements Iterable {
    public dva(char[] cArr) {
        super(cArr);
    }

    @Override // defpackage.duv, defpackage.duw
    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final dva g() {
        return (dva) super.clone();
    }

    @Override // java.lang.Iterable
    public final Iterator<dux> iterator() {
        return new duz(this);
    }
}
