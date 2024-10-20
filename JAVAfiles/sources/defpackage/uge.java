package defpackage;

import android.content.Context;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uge extends ufv {
    public static final alwo b = alwo.o("BugleImage");
    public static final int c = (int) TimeUnit.SECONDS.toMillis(5);
    public final ugf d;
    public final xnv e;
    public final xwg f;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        xwg Oj();

        xnv fN();
    }

    public uge(int i, String str, Context context) {
        super(i, str);
        this.d = new ugf(this);
        a aVar = (a) akec.w(context, a.class);
        this.f = aVar.Oj();
        this.e = aVar.fN();
    }

    @Override // defpackage.ufv
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized ufu a(String str, ufu ufuVar) {
        boolean z;
        if (ugf.e(ufuVar) != 0) {
            ugf ugfVar = this.d;
            synchronized (ugfVar.b) {
                int e = ugf.e(ufuVar);
                if (e != 0) {
                    z = true;
                } else {
                    z = false;
                }
                xyl.k(z);
                LinkedList linkedList = (LinkedList) ugfVar.a.get(e);
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    ugfVar.a.put(e, linkedList);
                }
                linkedList.addLast(ufuVar);
            }
        }
        return (ufu) super.a(str, ufuVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ufv, android.util.LruCache
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final synchronized void entryRemoved(boolean z, String str, ufu ufuVar, ufu ufuVar2) {
        boolean z2;
        if (ugf.e(ufuVar) != 0) {
            ugf ugfVar = this.d;
            synchronized (ugfVar.b) {
                int e = ugf.e(ufuVar);
                if (e != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xyl.k(z2);
                LinkedList linkedList = (LinkedList) ugfVar.a.get(e);
                if (linkedList != null) {
                    linkedList.remove(ufuVar);
                }
            }
        }
        super.entryRemoved(z, str, ufuVar, ufuVar2);
    }

    public uge(String str, Context context) {
        this(5120, str, context);
    }
}
