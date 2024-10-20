package defpackage;

import android.util.LruCache;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiye implements aiyp {
    public final aiyp a;
    private final LruCache b = new aiyd(this);

    public aiye(aiyp aiypVar) {
        this.a = aiypVar;
    }

    @Override // defpackage.aiyp
    public final long a(Set set) {
        Long l = (Long) this.b.get(set);
        l.getClass();
        return l.longValue();
    }
}
