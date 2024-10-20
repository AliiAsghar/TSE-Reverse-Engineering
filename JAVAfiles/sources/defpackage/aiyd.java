package defpackage;

import android.provider.Telephony;
import android.util.LruCache;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiyd extends LruCache {
    final /* synthetic */ aiye a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiyd(aiye aiyeVar) {
        super(1024);
        this.a = aiyeVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        long j;
        Set set = (Set) obj;
        boolean isEmpty = set.isEmpty();
        aiyp aiypVar = this.a.a;
        if (isEmpty) {
            set = Collections.singleton("ʼUNKNOWN_SENDER!ʼ");
        }
        try {
            j = Telephony.Threads.getOrCreateThreadId(((aiyn) aiypVar).a, (Set<String>) set);
        } catch (RuntimeException unused) {
            j = ((aiyn) aiypVar).b;
        }
        return Long.valueOf(j);
    }
}
